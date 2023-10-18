package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it3_livello3 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array12 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array12.clear();
    byte[] byte_array18 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array19 = bytearrayhashmap_byte_array12.remove(byte_array18);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array20 = bytearrayhashmap_byte_array2.get(byte_array19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array19);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array2.duplicate();
    bytearrayhashmap_byte_array10.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array6 = new byte[] { (byte)100, (byte)0 };
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array9 = bytearrayhashmap_byte_array2.get(byte_array6, (int)(short)-1, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 10.0f);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array5 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array5.clear();
    byte[] byte_array11 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array12 = bytearrayhashmap_byte_array5.remove(byte_array11);
    byte[] byte_array15 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array16 = bytearrayhashmap_byte_array5.remove(byte_array15);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array17 = bytearrayhashmap_byte_array2.get(byte_array16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array16);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array15 = bytearrayhashmap_byte_array2.get(byte_array12, 0, (int)(short)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array18 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array18.clear();
    byte[] byte_array24 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array25 = bytearrayhashmap_byte_array18.remove(byte_array24);
    // The following exception was thrown during execution in test generation
    try {
    boolean b26 = bytearrayhashmap_byte_array2.containsKey(byte_array25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array25);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 10.0f);
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_byte_array2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array2.duplicate();
    java.util.List<byte[]> list_byte_array11 = bytearrayhashmap_byte_array10.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array14.clear();
    byte[] byte_array20 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array21 = bytearrayhashmap_byte_array14.remove(byte_array20);
    byte[] byte_array24 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array25 = bytearrayhashmap_byte_array14.remove(byte_array24);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array26 = bytearrayhashmap_byte_array10.get(byte_array25);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array25);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    java.util.List<byte[]> list_byte_array10 = bytearrayhashmap_byte_array2.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array11 = bytearrayhashmap_byte_array2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array11);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array15 = bytearrayhashmap_byte_array2.get(byte_array12, 0, (int)(short)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = bytearrayhashmap_byte_array2.duplicate();
    bytearrayhashmap_byte_array16.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array16);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array2.duplicate();
    java.util.List<byte[]> list_byte_array11 = bytearrayhashmap_byte_array2.keys();
    int i12 = bytearrayhashmap_byte_array2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array15 = bytearrayhashmap_byte_array2.get(byte_array12, 0, (int)(short)1);
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_byte_array2.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array19 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array19.clear();
    byte[] byte_array25 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array26 = bytearrayhashmap_byte_array19.remove(byte_array25);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array27 = bytearrayhashmap_byte_array19.duplicate();
    java.util.List<byte[]> list_byte_array28 = bytearrayhashmap_byte_array27.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array31 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array31.clear();
    byte[] byte_array37 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array38 = bytearrayhashmap_byte_array31.remove(byte_array37);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array39 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array42 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array42.clear();
    byte[] byte_array48 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array49 = bytearrayhashmap_byte_array42.remove(byte_array48);
    byte[] byte_array52 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array53 = bytearrayhashmap_byte_array42.remove(byte_array52);
    byte[] byte_array54 = bytearrayhashmap_byte_array39.get(byte_array52);
    byte[] byte_array55 = bytearrayhashmap_byte_array27.put(byte_array37, byte_array52);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array58 = bytearrayhashmap_byte_array2.get(byte_array37, 0, (int)'4');
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
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array55);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    byte[] byte_array12 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array13 = bytearrayhashmap_byte_array2.remove(byte_array12);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array16.clear();
    byte[] byte_array22 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array23 = bytearrayhashmap_byte_array16.remove(byte_array22);
    byte[] byte_array26 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array29 = bytearrayhashmap_byte_array16.get(byte_array26, 0, (int)(short)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array32 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array32.clear();
    byte[] byte_array38 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array39 = bytearrayhashmap_byte_array32.remove(byte_array38);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array42 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array42.clear();
    byte[] byte_array48 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array49 = bytearrayhashmap_byte_array42.remove(byte_array48);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array50 = bytearrayhashmap_byte_array42.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array53 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array53.clear();
    byte[] byte_array59 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array60 = bytearrayhashmap_byte_array53.remove(byte_array59);
    byte[] byte_array63 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array66 = bytearrayhashmap_byte_array53.get(byte_array63, 0, (int)(short)1);
    int i67 = bytearrayhashmap_byte_array53.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array68 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array71 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array71.clear();
    byte[] byte_array77 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array78 = bytearrayhashmap_byte_array71.remove(byte_array77);
    byte[] byte_array81 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array82 = bytearrayhashmap_byte_array71.remove(byte_array81);
    byte[] byte_array83 = bytearrayhashmap_byte_array68.get(byte_array81);
    byte[] byte_array84 = bytearrayhashmap_byte_array53.remove(byte_array81);
    byte[] byte_array85 = bytearrayhashmap_byte_array42.get(byte_array81);
    byte[] byte_array86 = bytearrayhashmap_byte_array32.remove(byte_array81);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array87 = bytearrayhashmap_byte_array2.put(byte_array29, byte_array81);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array86);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array15 = bytearrayhashmap_byte_array2.get(byte_array12, 0, (int)(short)1);
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_byte_array2.values();
    java.util.List<byte[]> list_byte_array17 = bytearrayhashmap_byte_array2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array17);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    bytearrayhashmap_byte_array2.clear();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array7 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array7.clear();
    byte[] byte_array13 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array14 = bytearrayhashmap_byte_array7.remove(byte_array13);
    byte[] byte_array17 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array18 = bytearrayhashmap_byte_array7.remove(byte_array17);
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = bytearrayhashmap_byte_array2.containsKey(byte_array18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array18);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array2.duplicate();
    int i11 = bytearrayhashmap_byte_array2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array1 = new ByteArrayHashMap<byte[]>((int)'a');

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    bytearrayhashmap_byte_array2.clear();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array7 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array7.clear();
    byte[] byte_array13 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array14 = bytearrayhashmap_byte_array7.remove(byte_array13);
    byte[] byte_array17 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array20 = bytearrayhashmap_byte_array7.get(byte_array17, 0, (int)(short)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array21 = bytearrayhashmap_byte_array7.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array24.clear();
    byte[] byte_array30 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array31 = bytearrayhashmap_byte_array24.remove(byte_array30);
    byte[] byte_array34 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array37 = bytearrayhashmap_byte_array24.get(byte_array34, 0, (int)(short)1);
    boolean b38 = bytearrayhashmap_byte_array21.containsKey(byte_array34);
    boolean b39 = bytearrayhashmap_byte_array2.containsKey(byte_array34);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array42 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array42.clear();
    byte[] byte_array48 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array49 = bytearrayhashmap_byte_array42.remove(byte_array48);
    byte[] byte_array52 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array53 = bytearrayhashmap_byte_array42.remove(byte_array52);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array56 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array56.clear();
    byte[] byte_array62 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array63 = bytearrayhashmap_byte_array56.remove(byte_array62);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array64 = bytearrayhashmap_byte_array2.put(byte_array53, byte_array62);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array63);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array2.duplicate();
    java.util.List<byte[]> list_byte_array11 = bytearrayhashmap_byte_array10.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array14.clear();
    byte[] byte_array20 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array21 = bytearrayhashmap_byte_array14.remove(byte_array20);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array22 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array25 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array25.clear();
    byte[] byte_array31 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array32 = bytearrayhashmap_byte_array25.remove(byte_array31);
    byte[] byte_array35 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array36 = bytearrayhashmap_byte_array25.remove(byte_array35);
    byte[] byte_array37 = bytearrayhashmap_byte_array22.get(byte_array35);
    byte[] byte_array38 = bytearrayhashmap_byte_array10.put(byte_array20, byte_array35);
    java.util.List<byte[]> list_byte_array39 = bytearrayhashmap_byte_array10.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array39);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array15 = bytearrayhashmap_byte_array2.get(byte_array12, 0, (int)(short)1);
    int i16 = bytearrayhashmap_byte_array2.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array17 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array20 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array20.clear();
    byte[] byte_array26 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array27 = bytearrayhashmap_byte_array20.remove(byte_array26);
    byte[] byte_array30 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array31 = bytearrayhashmap_byte_array20.remove(byte_array30);
    byte[] byte_array32 = bytearrayhashmap_byte_array17.get(byte_array30);
    byte[] byte_array33 = bytearrayhashmap_byte_array2.remove(byte_array30);
    java.util.List<byte[]> list_byte_array34 = bytearrayhashmap_byte_array2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array34);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    bytearrayhashmap_byte_array2.clear();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array7 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array7.clear();
    byte[] byte_array13 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array14 = bytearrayhashmap_byte_array7.remove(byte_array13);
    byte[] byte_array17 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array20 = bytearrayhashmap_byte_array7.get(byte_array17, 0, (int)(short)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array21 = bytearrayhashmap_byte_array7.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array24.clear();
    byte[] byte_array30 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array31 = bytearrayhashmap_byte_array24.remove(byte_array30);
    byte[] byte_array34 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array37 = bytearrayhashmap_byte_array24.get(byte_array34, 0, (int)(short)1);
    boolean b38 = bytearrayhashmap_byte_array21.containsKey(byte_array34);
    boolean b39 = bytearrayhashmap_byte_array2.containsKey(byte_array34);
    bytearrayhashmap_byte_array2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 10.0f);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = bytearrayhashmap_byte_array2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array3);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array2.duplicate();
    java.util.List<byte[]> list_byte_array11 = bytearrayhashmap_byte_array10.values();
    boolean b12 = bytearrayhashmap_byte_array10.isEmpty();
    java.util.List<byte[]> list_byte_array13 = bytearrayhashmap_byte_array10.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array13);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    bytearrayhashmap_byte_array2.clear();
    bytearrayhashmap_byte_array2.clear();

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    java.util.List<byte[]> list_byte_array1 = bytearrayhashmap_byte_array0.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array4.clear();
    byte[] byte_array10 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array11 = bytearrayhashmap_byte_array4.remove(byte_array10);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array14.clear();
    byte[] byte_array20 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array21 = bytearrayhashmap_byte_array14.remove(byte_array20);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array22 = bytearrayhashmap_byte_array14.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array25 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array25.clear();
    byte[] byte_array31 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array32 = bytearrayhashmap_byte_array25.remove(byte_array31);
    byte[] byte_array35 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array38 = bytearrayhashmap_byte_array25.get(byte_array35, 0, (int)(short)1);
    int i39 = bytearrayhashmap_byte_array25.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array40 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array43 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array43.clear();
    byte[] byte_array49 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array50 = bytearrayhashmap_byte_array43.remove(byte_array49);
    byte[] byte_array53 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array54 = bytearrayhashmap_byte_array43.remove(byte_array53);
    byte[] byte_array55 = bytearrayhashmap_byte_array40.get(byte_array53);
    byte[] byte_array56 = bytearrayhashmap_byte_array25.remove(byte_array53);
    byte[] byte_array57 = bytearrayhashmap_byte_array14.get(byte_array53);
    byte[] byte_array58 = bytearrayhashmap_byte_array4.remove(byte_array53);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array61 = bytearrayhashmap_byte_array0.get(byte_array58, 0, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array58);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array2.duplicate();
    java.util.List<byte[]> list_byte_array11 = bytearrayhashmap_byte_array2.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array14 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array14.clear();
    byte[] byte_array20 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array21 = bytearrayhashmap_byte_array14.remove(byte_array20);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array22 = bytearrayhashmap_byte_array14.duplicate();
    java.util.List<byte[]> list_byte_array23 = bytearrayhashmap_byte_array22.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array26 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array26.clear();
    byte[] byte_array32 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array33 = bytearrayhashmap_byte_array26.remove(byte_array32);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array34 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array37 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array37.clear();
    byte[] byte_array43 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array44 = bytearrayhashmap_byte_array37.remove(byte_array43);
    byte[] byte_array47 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array48 = bytearrayhashmap_byte_array37.remove(byte_array47);
    byte[] byte_array49 = bytearrayhashmap_byte_array34.get(byte_array47);
    byte[] byte_array50 = bytearrayhashmap_byte_array22.put(byte_array32, byte_array47);
    byte[] byte_array51 = bytearrayhashmap_byte_array2.remove(byte_array47);
    java.util.List<byte[]> list_byte_array52 = bytearrayhashmap_byte_array2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array52);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 10.0f);
    boolean b3 = bytearrayhashmap_byte_array2.isEmpty();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = bytearrayhashmap_byte_array2.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array7 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array7.clear();
    byte[] byte_array13 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array14 = bytearrayhashmap_byte_array7.remove(byte_array13);
    byte[] byte_array17 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array20 = bytearrayhashmap_byte_array7.get(byte_array17, 0, (int)(short)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array21 = bytearrayhashmap_byte_array7.duplicate();
    java.util.List<byte[]> list_byte_array22 = bytearrayhashmap_byte_array7.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array25 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array25.clear();
    byte[] byte_array31 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array32 = bytearrayhashmap_byte_array25.remove(byte_array31);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array33 = bytearrayhashmap_byte_array25.duplicate();
    java.util.List<byte[]> list_byte_array34 = bytearrayhashmap_byte_array33.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array37 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array37.clear();
    byte[] byte_array43 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array44 = bytearrayhashmap_byte_array37.remove(byte_array43);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array45 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array48 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array48.clear();
    byte[] byte_array54 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array55 = bytearrayhashmap_byte_array48.remove(byte_array54);
    byte[] byte_array58 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array59 = bytearrayhashmap_byte_array48.remove(byte_array58);
    byte[] byte_array60 = bytearrayhashmap_byte_array45.get(byte_array58);
    byte[] byte_array61 = bytearrayhashmap_byte_array33.put(byte_array43, byte_array58);
    byte[] byte_array62 = bytearrayhashmap_byte_array7.remove(byte_array43);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array65 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array65.clear();
    byte[] byte_array71 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array72 = bytearrayhashmap_byte_array65.remove(byte_array71);
    byte[] byte_array75 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array78 = bytearrayhashmap_byte_array65.get(byte_array75, 0, (int)(short)1);
    int i79 = bytearrayhashmap_byte_array65.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array80 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array83 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array83.clear();
    byte[] byte_array89 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array90 = bytearrayhashmap_byte_array83.remove(byte_array89);
    byte[] byte_array93 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array94 = bytearrayhashmap_byte_array83.remove(byte_array93);
    byte[] byte_array95 = bytearrayhashmap_byte_array80.get(byte_array93);
    byte[] byte_array96 = bytearrayhashmap_byte_array65.remove(byte_array93);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array97 = bytearrayhashmap_byte_array4.put(byte_array62, byte_array96);
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
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array96);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array2.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array13 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array13.clear();
    byte[] byte_array19 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array20 = bytearrayhashmap_byte_array13.remove(byte_array19);
    byte[] byte_array23 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array26 = bytearrayhashmap_byte_array13.get(byte_array23, 0, (int)(short)1);
    int i27 = bytearrayhashmap_byte_array13.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array28 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array31 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array31.clear();
    byte[] byte_array37 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array38 = bytearrayhashmap_byte_array31.remove(byte_array37);
    byte[] byte_array41 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array42 = bytearrayhashmap_byte_array31.remove(byte_array41);
    byte[] byte_array43 = bytearrayhashmap_byte_array28.get(byte_array41);
    byte[] byte_array44 = bytearrayhashmap_byte_array13.remove(byte_array41);
    byte[] byte_array45 = bytearrayhashmap_byte_array2.get(byte_array41);
    java.util.List<byte[]> list_byte_array46 = bytearrayhashmap_byte_array2.values();
    java.util.List<byte[]> list_byte_array47 = bytearrayhashmap_byte_array2.keys();
    byte[] byte_array50 = new byte[] { (byte)1, (byte)0 };
    byte[] byte_array51 = bytearrayhashmap_byte_array2.remove(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array51);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(short)-1, (float)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array6.clear();
    bytearrayhashmap_byte_array6.clear();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array11 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array11.clear();
    byte[] byte_array17 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array18 = bytearrayhashmap_byte_array11.remove(byte_array17);
    byte[] byte_array21 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array24 = bytearrayhashmap_byte_array11.get(byte_array21, 0, (int)(short)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array25 = bytearrayhashmap_byte_array11.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array28 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array28.clear();
    byte[] byte_array34 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array35 = bytearrayhashmap_byte_array28.remove(byte_array34);
    byte[] byte_array38 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array41 = bytearrayhashmap_byte_array28.get(byte_array38, 0, (int)(short)1);
    boolean b42 = bytearrayhashmap_byte_array25.containsKey(byte_array38);
    boolean b43 = bytearrayhashmap_byte_array6.containsKey(byte_array38);
    byte[] byte_array44 = bytearrayhashmap_byte_array2.get(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array44);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array3 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array6 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array6.clear();
    byte[] byte_array12 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array13 = bytearrayhashmap_byte_array6.remove(byte_array12);
    byte[] byte_array16 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array17 = bytearrayhashmap_byte_array6.remove(byte_array16);
    byte[] byte_array18 = bytearrayhashmap_byte_array3.get(byte_array16);
    byte[] byte_array19 = bytearrayhashmap_byte_array2.remove(byte_array16);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array22 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array22.clear();
    byte[] byte_array28 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array29 = bytearrayhashmap_byte_array22.remove(byte_array28);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array30 = bytearrayhashmap_byte_array22.duplicate();
    java.util.List<byte[]> list_byte_array31 = bytearrayhashmap_byte_array30.values();
    int i32 = bytearrayhashmap_byte_array30.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array33 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array36 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array36.clear();
    byte[] byte_array42 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array43 = bytearrayhashmap_byte_array36.remove(byte_array42);
    byte[] byte_array46 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array47 = bytearrayhashmap_byte_array36.remove(byte_array46);
    byte[] byte_array48 = bytearrayhashmap_byte_array33.get(byte_array46);
    byte[] byte_array49 = bytearrayhashmap_byte_array30.get(byte_array46);
    // The following exception was thrown during execution in test generation
    try {
    boolean b50 = bytearrayhashmap_byte_array2.containsKey(byte_array49);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array49);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array2.duplicate();
    java.util.List<byte[]> list_byte_array11 = bytearrayhashmap_byte_array10.values();
    int i12 = bytearrayhashmap_byte_array10.size();
    int i13 = bytearrayhashmap_byte_array10.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array2.duplicate();
    java.util.List<byte[]> list_byte_array11 = bytearrayhashmap_byte_array10.values();
    int i12 = bytearrayhashmap_byte_array10.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array13 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array16.clear();
    byte[] byte_array22 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array23 = bytearrayhashmap_byte_array16.remove(byte_array22);
    byte[] byte_array26 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array27 = bytearrayhashmap_byte_array16.remove(byte_array26);
    byte[] byte_array28 = bytearrayhashmap_byte_array13.get(byte_array26);
    byte[] byte_array29 = bytearrayhashmap_byte_array10.get(byte_array26);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array32 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array32.clear();
    byte[] byte_array38 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array39 = bytearrayhashmap_byte_array32.remove(byte_array38);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array40 = bytearrayhashmap_byte_array32.duplicate();
    java.util.List<byte[]> list_byte_array41 = bytearrayhashmap_byte_array32.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array44 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array44.clear();
    byte[] byte_array50 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array51 = bytearrayhashmap_byte_array44.remove(byte_array50);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array52 = bytearrayhashmap_byte_array44.duplicate();
    java.util.List<byte[]> list_byte_array53 = bytearrayhashmap_byte_array52.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array56 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array56.clear();
    byte[] byte_array62 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array63 = bytearrayhashmap_byte_array56.remove(byte_array62);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array64 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array67 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array67.clear();
    byte[] byte_array73 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array74 = bytearrayhashmap_byte_array67.remove(byte_array73);
    byte[] byte_array77 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array78 = bytearrayhashmap_byte_array67.remove(byte_array77);
    byte[] byte_array79 = bytearrayhashmap_byte_array64.get(byte_array77);
    byte[] byte_array80 = bytearrayhashmap_byte_array52.put(byte_array62, byte_array77);
    byte[] byte_array81 = bytearrayhashmap_byte_array32.remove(byte_array77);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array84 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array84.clear();
    byte[] byte_array90 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array91 = bytearrayhashmap_byte_array84.remove(byte_array90);
    byte[] byte_array94 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array97 = bytearrayhashmap_byte_array84.get(byte_array94, 0, (int)(short)1);
    byte[] byte_array98 = bytearrayhashmap_byte_array32.remove(byte_array94);
    boolean b99 = bytearrayhashmap_byte_array10.containsKey(byte_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b99 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    java.util.List<byte[]> list_byte_array10 = bytearrayhashmap_byte_array2.values();
    byte[] byte_array12 = new byte[] { (byte)100 };
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array15 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array15.clear();
    byte[] byte_array21 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array22 = bytearrayhashmap_byte_array15.remove(byte_array21);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array23 = bytearrayhashmap_byte_array15.duplicate();
    java.util.List<byte[]> list_byte_array24 = bytearrayhashmap_byte_array23.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array27 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array27.clear();
    byte[] byte_array33 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array34 = bytearrayhashmap_byte_array27.remove(byte_array33);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array35 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array38 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array38.clear();
    byte[] byte_array44 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array45 = bytearrayhashmap_byte_array38.remove(byte_array44);
    byte[] byte_array48 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array49 = bytearrayhashmap_byte_array38.remove(byte_array48);
    byte[] byte_array50 = bytearrayhashmap_byte_array35.get(byte_array48);
    byte[] byte_array51 = bytearrayhashmap_byte_array23.put(byte_array33, byte_array48);
    byte[] byte_array52 = bytearrayhashmap_byte_array2.put(byte_array12, byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array52);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array0 = new ByteArrayHashMap<byte[]>();
    java.util.List<byte[]> list_byte_array1 = bytearrayhashmap_byte_array0.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array4 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array4.clear();
    byte[] byte_array10 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array11 = bytearrayhashmap_byte_array4.remove(byte_array10);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array12 = bytearrayhashmap_byte_array4.duplicate();
    java.util.List<byte[]> list_byte_array13 = bytearrayhashmap_byte_array4.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array16.clear();
    byte[] byte_array22 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array23 = bytearrayhashmap_byte_array16.remove(byte_array22);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array24 = bytearrayhashmap_byte_array16.duplicate();
    java.util.List<byte[]> list_byte_array25 = bytearrayhashmap_byte_array24.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array28 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array28.clear();
    byte[] byte_array34 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array35 = bytearrayhashmap_byte_array28.remove(byte_array34);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array36 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array39 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array39.clear();
    byte[] byte_array45 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array46 = bytearrayhashmap_byte_array39.remove(byte_array45);
    byte[] byte_array49 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array50 = bytearrayhashmap_byte_array39.remove(byte_array49);
    byte[] byte_array51 = bytearrayhashmap_byte_array36.get(byte_array49);
    byte[] byte_array52 = bytearrayhashmap_byte_array24.put(byte_array34, byte_array49);
    byte[] byte_array53 = bytearrayhashmap_byte_array4.remove(byte_array49);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array56 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array56.clear();
    byte[] byte_array62 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array63 = bytearrayhashmap_byte_array56.remove(byte_array62);
    byte[] byte_array66 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array69 = bytearrayhashmap_byte_array56.get(byte_array66, 0, (int)(short)1);
    byte[] byte_array70 = bytearrayhashmap_byte_array4.remove(byte_array66);
    byte[] byte_array71 = bytearrayhashmap_byte_array0.remove(byte_array66);
    int i72 = bytearrayhashmap_byte_array0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array15 = bytearrayhashmap_byte_array2.get(byte_array12, 0, (int)(short)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = bytearrayhashmap_byte_array2.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array19 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array19.clear();
    byte[] byte_array25 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array26 = bytearrayhashmap_byte_array19.remove(byte_array25);
    byte[] byte_array29 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array32 = bytearrayhashmap_byte_array19.get(byte_array29, 0, (int)(short)1);
    boolean b33 = bytearrayhashmap_byte_array16.containsKey(byte_array29);
    java.util.List<byte[]> list_byte_array34 = bytearrayhashmap_byte_array16.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array34);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array15 = bytearrayhashmap_byte_array2.get(byte_array12, 0, (int)(short)1);
    int i16 = bytearrayhashmap_byte_array2.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array19 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array19.clear();
    byte[] byte_array25 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array26 = bytearrayhashmap_byte_array19.remove(byte_array25);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array27 = bytearrayhashmap_byte_array19.duplicate();
    java.util.List<byte[]> list_byte_array28 = bytearrayhashmap_byte_array27.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array31 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array31.clear();
    byte[] byte_array37 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array38 = bytearrayhashmap_byte_array31.remove(byte_array37);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array39 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array42 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array42.clear();
    byte[] byte_array48 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array49 = bytearrayhashmap_byte_array42.remove(byte_array48);
    byte[] byte_array52 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array53 = bytearrayhashmap_byte_array42.remove(byte_array52);
    byte[] byte_array54 = bytearrayhashmap_byte_array39.get(byte_array52);
    byte[] byte_array55 = bytearrayhashmap_byte_array27.put(byte_array37, byte_array52);
    byte[] byte_array58 = bytearrayhashmap_byte_array2.get(byte_array52, 1, (int)(short)0);
    java.util.List<byte[]> list_byte_array59 = bytearrayhashmap_byte_array2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array59);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array15 = bytearrayhashmap_byte_array2.get(byte_array12, 0, (int)(short)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = bytearrayhashmap_byte_array2.duplicate();
    int i17 = bytearrayhashmap_byte_array16.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)(short)0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array10 = bytearrayhashmap_byte_array2.duplicate();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array13 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array13.clear();
    byte[] byte_array19 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array20 = bytearrayhashmap_byte_array13.remove(byte_array19);
    byte[] byte_array23 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array26 = bytearrayhashmap_byte_array13.get(byte_array23, 0, (int)(short)1);
    int i27 = bytearrayhashmap_byte_array13.size();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array28 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array31 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array31.clear();
    byte[] byte_array37 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array38 = bytearrayhashmap_byte_array31.remove(byte_array37);
    byte[] byte_array41 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array42 = bytearrayhashmap_byte_array31.remove(byte_array41);
    byte[] byte_array43 = bytearrayhashmap_byte_array28.get(byte_array41);
    byte[] byte_array44 = bytearrayhashmap_byte_array13.remove(byte_array41);
    byte[] byte_array45 = bytearrayhashmap_byte_array2.get(byte_array41);
    java.util.List<byte[]> list_byte_array46 = bytearrayhashmap_byte_array2.values();
    boolean b47 = bytearrayhashmap_byte_array2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array2 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array2.clear();
    byte[] byte_array8 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array9 = bytearrayhashmap_byte_array2.remove(byte_array8);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1 };
    byte[] byte_array15 = bytearrayhashmap_byte_array2.get(byte_array12, 0, (int)(short)1);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array16 = bytearrayhashmap_byte_array2.duplicate();
    java.util.List<byte[]> list_byte_array17 = bytearrayhashmap_byte_array2.keys();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array20 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array20.clear();
    byte[] byte_array26 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array27 = bytearrayhashmap_byte_array20.remove(byte_array26);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array28 = bytearrayhashmap_byte_array20.duplicate();
    java.util.List<byte[]> list_byte_array29 = bytearrayhashmap_byte_array28.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array32 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array32.clear();
    byte[] byte_array38 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array39 = bytearrayhashmap_byte_array32.remove(byte_array38);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array40 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array43 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array43.clear();
    byte[] byte_array49 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array50 = bytearrayhashmap_byte_array43.remove(byte_array49);
    byte[] byte_array53 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array54 = bytearrayhashmap_byte_array43.remove(byte_array53);
    byte[] byte_array55 = bytearrayhashmap_byte_array40.get(byte_array53);
    byte[] byte_array56 = bytearrayhashmap_byte_array28.put(byte_array38, byte_array53);
    byte[] byte_array57 = bytearrayhashmap_byte_array2.remove(byte_array38);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array60 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array60.clear();
    byte[] byte_array66 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array67 = bytearrayhashmap_byte_array60.remove(byte_array66);
    java.util.List<byte[]> list_byte_array68 = bytearrayhashmap_byte_array60.values();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array71 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array72 = new ByteArrayHashMap<byte[]>();
    ByteArrayHashMap<byte[]> bytearrayhashmap_byte_array75 = new ByteArrayHashMap<byte[]>((int)'#', 1.0f);
    bytearrayhashmap_byte_array75.clear();
    byte[] byte_array81 = new byte[] { (byte)100, (byte)0, (byte)10, (byte)10 };
    byte[] byte_array82 = bytearrayhashmap_byte_array75.remove(byte_array81);
    byte[] byte_array85 = new byte[] { (byte)-1, (byte)0 };
    byte[] byte_array86 = bytearrayhashmap_byte_array75.remove(byte_array85);
    byte[] byte_array87 = bytearrayhashmap_byte_array72.get(byte_array85);
    byte[] byte_array88 = bytearrayhashmap_byte_array71.remove(byte_array85);
    boolean b89 = bytearrayhashmap_byte_array60.containsKey(byte_array85);
    byte[] byte_array90 = bytearrayhashmap_byte_array2.get(byte_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array90);

  }

}
