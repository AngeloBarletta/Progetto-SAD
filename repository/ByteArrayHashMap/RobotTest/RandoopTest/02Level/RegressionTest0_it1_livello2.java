
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((-1), (float)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'a', (float)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    int i2 = bytearrayhashmap_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>(100, (float)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(byte)1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str2.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str2.duplicate();
    byte[] byte_array6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = bytearrayhashmap_str2.put(byte_array6, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    int i4 = bytearrayhashmap_str2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str3.clear();
    java.util.List<java.lang.String> list_str5 = bytearrayhashmap_str3.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str4.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str7.duplicate();
    byte[] byte_array10 = new byte[] { (byte)1 };
    java.lang.String str11 = bytearrayhashmap_str7.get(byte_array10);
    java.lang.String str12 = bytearrayhashmap_str4.remove(byte_array10);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = bytearrayhashmap_str2.get(byte_array10, (int)'4', (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str2.clear();
    byte[] byte_array5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = bytearrayhashmap_str2.get(byte_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>(10, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str5.duplicate();
    byte[] byte_array8 = new byte[] { (byte)1 };
    java.lang.String str9 = bytearrayhashmap_str5.get(byte_array8);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = bytearrayhashmap_str3.get(byte_array8, (int)'4', (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>(10, (float)1);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str2.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str7.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = bytearrayhashmap_str10.duplicate();
    byte[] byte_array13 = new byte[] { (byte)1 };
    java.lang.String str14 = bytearrayhashmap_str10.get(byte_array13);
    java.lang.String str15 = bytearrayhashmap_str7.remove(byte_array13);
    boolean b16 = bytearrayhashmap_str5.containsKey(byte_array13);
    java.util.List<java.lang.String> list_str17 = bytearrayhashmap_str5.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str2.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>((int)(byte)0, 100.0f);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = bytearrayhashmap_str10.duplicate();
    byte[] byte_array13 = new byte[] { (byte)1 };
    java.lang.String str14 = bytearrayhashmap_str10.get(byte_array13);
    java.lang.String str16 = bytearrayhashmap_str8.put(byte_array13, "");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>((int)(byte)0, 100.0f);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str21 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str22 = bytearrayhashmap_str21.duplicate();
    byte[] byte_array24 = new byte[] { (byte)1 };
    java.lang.String str25 = bytearrayhashmap_str21.get(byte_array24);
    java.lang.String str27 = bytearrayhashmap_str19.put(byte_array24, "");
    java.lang.String str28 = bytearrayhashmap_str8.get(byte_array24);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str31 = bytearrayhashmap_str5.get(byte_array24, (int)(byte)10, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((-1), (-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)' ', (float)'a');

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str2.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str7.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = bytearrayhashmap_str10.duplicate();
    byte[] byte_array13 = new byte[] { (byte)1 };
    java.lang.String str14 = bytearrayhashmap_str10.get(byte_array13);
    java.lang.String str15 = bytearrayhashmap_str7.remove(byte_array13);
    boolean b16 = bytearrayhashmap_str5.containsKey(byte_array13);
    int i17 = bytearrayhashmap_str5.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((-1), (float)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str3.clear();
    boolean b5 = bytearrayhashmap_str3.isEmpty();
    int i6 = bytearrayhashmap_str3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str2.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str7.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = bytearrayhashmap_str11.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str14 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = bytearrayhashmap_str14.duplicate();
    byte[] byte_array17 = new byte[] { (byte)1 };
    java.lang.String str18 = bytearrayhashmap_str14.get(byte_array17);
    java.lang.String str19 = bytearrayhashmap_str11.remove(byte_array17);
    java.lang.String str21 = bytearrayhashmap_str9.put(byte_array17, "");
    java.lang.String str22 = bytearrayhashmap_str2.get(byte_array17);
    java.util.List<java.lang.String> list_str23 = bytearrayhashmap_str2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((-1), (float)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(byte)10, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((-1), 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b7 = bytearrayhashmap_str6.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str6.duplicate();
    java.util.List<java.lang.String> list_str9 = bytearrayhashmap_str8.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b13 = bytearrayhashmap_str12.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = bytearrayhashmap_str15.duplicate();
    byte[] byte_array18 = new byte[] { (byte)1 };
    java.lang.String str19 = bytearrayhashmap_str15.get(byte_array18);
    java.lang.String str20 = bytearrayhashmap_str12.get(byte_array18);
    boolean b21 = bytearrayhashmap_str8.containsKey(byte_array18);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = bytearrayhashmap_str2.get(byte_array18, 0, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str2.duplicate();
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_str4.keys();
    bytearrayhashmap_str4.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)' ');

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str0 = new ByteArrayHashMap<java.lang.String>();
    int i1 = bytearrayhashmap_str0.size();
    boolean b2 = bytearrayhashmap_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str2.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str2.duplicate();
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_str5.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = bytearrayhashmap_str5.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str7);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    byte[] byte_array4 = new byte[] { (byte)1 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str1.duplicate();
    java.util.List<java.lang.String> list_str7 = bytearrayhashmap_str1.values();
    java.util.List<java.lang.String> list_str8 = bytearrayhashmap_str1.values();
    byte[] byte_array9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = bytearrayhashmap_str1.put(byte_array9, "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str8);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str2.duplicate();
    boolean b6 = bytearrayhashmap_str2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, 10.0f);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b7 = bytearrayhashmap_str6.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str6.duplicate();
    java.util.List<java.lang.String> list_str9 = bytearrayhashmap_str8.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b13 = bytearrayhashmap_str12.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = bytearrayhashmap_str15.duplicate();
    byte[] byte_array18 = new byte[] { (byte)1 };
    java.lang.String str19 = bytearrayhashmap_str15.get(byte_array18);
    java.lang.String str20 = bytearrayhashmap_str12.get(byte_array18);
    boolean b21 = bytearrayhashmap_str8.containsKey(byte_array18);
    java.lang.String str23 = bytearrayhashmap_str2.put(byte_array18, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str26 = new ByteArrayHashMap<java.lang.String>((int)(byte)0, 100.0f);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str28 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str29 = bytearrayhashmap_str28.duplicate();
    byte[] byte_array31 = new byte[] { (byte)1 };
    java.lang.String str32 = bytearrayhashmap_str28.get(byte_array31);
    java.lang.String str34 = bytearrayhashmap_str26.put(byte_array31, "");
    java.lang.String str35 = bytearrayhashmap_str2.get(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_str3.keys();
    boolean b5 = bytearrayhashmap_str3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str2.duplicate();
    java.util.List<java.lang.String> list_str5 = bytearrayhashmap_str4.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b9 = bytearrayhashmap_str8.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = bytearrayhashmap_str11.duplicate();
    byte[] byte_array14 = new byte[] { (byte)1 };
    java.lang.String str15 = bytearrayhashmap_str11.get(byte_array14);
    java.lang.String str16 = bytearrayhashmap_str8.get(byte_array14);
    boolean b17 = bytearrayhashmap_str4.containsKey(byte_array14);
    int i18 = bytearrayhashmap_str4.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b7 = bytearrayhashmap_str6.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str6.duplicate();
    java.util.List<java.lang.String> list_str9 = bytearrayhashmap_str8.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b13 = bytearrayhashmap_str12.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = bytearrayhashmap_str15.duplicate();
    byte[] byte_array18 = new byte[] { (byte)1 };
    java.lang.String str19 = bytearrayhashmap_str15.get(byte_array18);
    java.lang.String str20 = bytearrayhashmap_str12.get(byte_array18);
    boolean b21 = bytearrayhashmap_str8.containsKey(byte_array18);
    java.lang.String str23 = bytearrayhashmap_str2.put(byte_array18, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str25 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str26 = bytearrayhashmap_str25.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str28 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str29 = bytearrayhashmap_str28.duplicate();
    byte[] byte_array31 = new byte[] { (byte)1 };
    java.lang.String str32 = bytearrayhashmap_str28.get(byte_array31);
    java.lang.String str33 = bytearrayhashmap_str25.remove(byte_array31);
    java.lang.String str34 = bytearrayhashmap_str2.remove(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(byte)100);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_str1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    byte[] byte_array4 = new byte[] { (byte)1 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str1.duplicate();
    java.util.List<java.lang.String> list_str7 = bytearrayhashmap_str1.values();
    int i8 = bytearrayhashmap_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str2.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b9 = bytearrayhashmap_str8.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = bytearrayhashmap_str11.duplicate();
    byte[] byte_array14 = new byte[] { (byte)1 };
    java.lang.String str15 = bytearrayhashmap_str11.get(byte_array14);
    java.lang.String str16 = bytearrayhashmap_str8.get(byte_array14);
    java.lang.String str17 = bytearrayhashmap_str2.get(byte_array14);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str18 = bytearrayhashmap_str2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str18);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str5.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array11 = new byte[] { (byte)1 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.lang.String str13 = bytearrayhashmap_str5.remove(byte_array11);
    java.lang.String str15 = bytearrayhashmap_str3.put(byte_array11, "");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str18 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b19 = bytearrayhashmap_str18.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str22 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b23 = bytearrayhashmap_str22.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str24 = bytearrayhashmap_str22.duplicate();
    java.util.List<java.lang.String> list_str25 = bytearrayhashmap_str24.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str28 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b29 = bytearrayhashmap_str28.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str31 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str32 = bytearrayhashmap_str31.duplicate();
    byte[] byte_array34 = new byte[] { (byte)1 };
    java.lang.String str35 = bytearrayhashmap_str31.get(byte_array34);
    java.lang.String str36 = bytearrayhashmap_str28.get(byte_array34);
    boolean b37 = bytearrayhashmap_str24.containsKey(byte_array34);
    java.lang.String str39 = bytearrayhashmap_str18.put(byte_array34, "hi!");
    boolean b40 = bytearrayhashmap_str3.containsKey(byte_array34);
    java.util.List<byte[]> list_byte_array41 = bytearrayhashmap_str3.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array41);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)(short)10);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    byte[] byte_array3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = bytearrayhashmap_str2.remove(byte_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str3.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str3.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str7.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = bytearrayhashmap_str11.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str14 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = bytearrayhashmap_str14.duplicate();
    byte[] byte_array17 = new byte[] { (byte)1 };
    java.lang.String str18 = bytearrayhashmap_str14.get(byte_array17);
    java.lang.String str19 = bytearrayhashmap_str11.remove(byte_array17);
    java.lang.String str21 = bytearrayhashmap_str9.put(byte_array17, "");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str24 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b25 = bytearrayhashmap_str24.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str28 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b29 = bytearrayhashmap_str28.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str30 = bytearrayhashmap_str28.duplicate();
    java.util.List<java.lang.String> list_str31 = bytearrayhashmap_str30.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str34 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b35 = bytearrayhashmap_str34.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str37 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str38 = bytearrayhashmap_str37.duplicate();
    byte[] byte_array40 = new byte[] { (byte)1 };
    java.lang.String str41 = bytearrayhashmap_str37.get(byte_array40);
    java.lang.String str42 = bytearrayhashmap_str34.get(byte_array40);
    boolean b43 = bytearrayhashmap_str30.containsKey(byte_array40);
    java.lang.String str45 = bytearrayhashmap_str24.put(byte_array40, "hi!");
    boolean b46 = bytearrayhashmap_str9.containsKey(byte_array40);
    boolean b47 = bytearrayhashmap_str5.containsKey(byte_array40);
    bytearrayhashmap_str5.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>(1, (float)(short)100);
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_str2.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str5.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = bytearrayhashmap_str6.duplicate();
    bytearrayhashmap_str6.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str6.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = bytearrayhashmap_str11.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str14 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = bytearrayhashmap_str14.duplicate();
    byte[] byte_array17 = new byte[] { (byte)1 };
    java.lang.String str18 = bytearrayhashmap_str14.get(byte_array17);
    java.lang.String str19 = bytearrayhashmap_str11.remove(byte_array17);
    boolean b20 = bytearrayhashmap_str9.containsKey(byte_array17);
    java.lang.String str23 = bytearrayhashmap_str2.get(byte_array17, (int)(byte)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)'4');
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str3.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str4.duplicate();
    bytearrayhashmap_str4.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = bytearrayhashmap_str4.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = bytearrayhashmap_str9.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str13 = bytearrayhashmap_str12.duplicate();
    byte[] byte_array15 = new byte[] { (byte)1 };
    java.lang.String str16 = bytearrayhashmap_str12.get(byte_array15);
    java.lang.String str17 = bytearrayhashmap_str9.remove(byte_array15);
    boolean b18 = bytearrayhashmap_str7.containsKey(byte_array15);
    java.lang.String str20 = bytearrayhashmap_str1.put(byte_array15, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)'#');
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str2.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b8 = bytearrayhashmap_str7.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = bytearrayhashmap_str10.duplicate();
    byte[] byte_array13 = new byte[] { (byte)1 };
    java.lang.String str14 = bytearrayhashmap_str10.get(byte_array13);
    java.lang.String str15 = bytearrayhashmap_str7.get(byte_array13);
    java.lang.String str16 = bytearrayhashmap_str2.get(byte_array13);
    boolean b17 = bytearrayhashmap_str2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)100);
    byte[] byte_array6 = new byte[] { (byte)0, (byte)-1, (byte)10 };
    boolean b7 = bytearrayhashmap_str2.containsKey(byte_array6);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)100, (float)100);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((-1), (float)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b6 = bytearrayhashmap_str5.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array11 = new byte[] { (byte)1 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.lang.String str13 = bytearrayhashmap_str5.get(byte_array11);
    java.lang.String str15 = bytearrayhashmap_str2.put(byte_array11, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str18 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b19 = bytearrayhashmap_str18.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str21 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str22 = bytearrayhashmap_str21.duplicate();
    byte[] byte_array24 = new byte[] { (byte)1 };
    java.lang.String str25 = bytearrayhashmap_str21.get(byte_array24);
    java.lang.String str26 = bytearrayhashmap_str18.get(byte_array24);
    java.lang.String str27 = bytearrayhashmap_str2.get(byte_array24);
    boolean b28 = bytearrayhashmap_str2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str0 = new ByteArrayHashMap<java.lang.String>();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(byte)100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b6 = bytearrayhashmap_str5.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array11 = new byte[] { (byte)1 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.lang.String str13 = bytearrayhashmap_str5.get(byte_array11);
    java.lang.String str14 = bytearrayhashmap_str2.remove(byte_array11);
    java.lang.String str15 = bytearrayhashmap_str0.get(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    byte[] byte_array3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = bytearrayhashmap_str1.get(byte_array3, (int)(short)1, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(byte)-1, (-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(short)0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(byte)100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b5 = bytearrayhashmap_str4.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str4.duplicate();
    java.util.List<java.lang.String> list_str7 = bytearrayhashmap_str6.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b11 = bytearrayhashmap_str10.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str13 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str14 = bytearrayhashmap_str13.duplicate();
    byte[] byte_array16 = new byte[] { (byte)1 };
    java.lang.String str17 = bytearrayhashmap_str13.get(byte_array16);
    java.lang.String str18 = bytearrayhashmap_str10.get(byte_array16);
    boolean b19 = bytearrayhashmap_str6.containsKey(byte_array16);
    java.lang.String str20 = bytearrayhashmap_str1.get(byte_array16);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str21 = bytearrayhashmap_str1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str21);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    int i3 = bytearrayhashmap_str2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)'a');
    bytearrayhashmap_str1.clear();
    byte[] byte_array3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = bytearrayhashmap_str1.put(byte_array3, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    byte[] byte_array4 = new byte[] {  };
    java.lang.String str5 = bytearrayhashmap_str3.get(byte_array4);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str7.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    bytearrayhashmap_str8.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str13 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b14 = bytearrayhashmap_str13.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str17 = bytearrayhashmap_str16.duplicate();
    byte[] byte_array19 = new byte[] { (byte)1 };
    java.lang.String str20 = bytearrayhashmap_str16.get(byte_array19);
    java.lang.String str21 = bytearrayhashmap_str13.get(byte_array19);
    java.lang.String str22 = bytearrayhashmap_str8.get(byte_array19);
    java.lang.String str23 = bytearrayhashmap_str3.get(byte_array19);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str26 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b27 = bytearrayhashmap_str26.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str28 = bytearrayhashmap_str26.duplicate();
    bytearrayhashmap_str26.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str32 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str34 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str35 = bytearrayhashmap_str34.duplicate();
    byte[] byte_array37 = new byte[] { (byte)1 };
    java.lang.String str38 = bytearrayhashmap_str34.get(byte_array37);
    java.lang.String str39 = bytearrayhashmap_str32.get(byte_array37);
    java.lang.String str41 = bytearrayhashmap_str26.put(byte_array37, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str44 = bytearrayhashmap_str3.get(byte_array37, 0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str4.duplicate();
    byte[] byte_array7 = new byte[] { (byte)1 };
    java.lang.String str8 = bytearrayhashmap_str4.get(byte_array7);
    java.lang.String str9 = bytearrayhashmap_str2.get(byte_array7);
    java.util.List<byte[]> list_byte_array10 = bytearrayhashmap_str2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array10);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)100, (float)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    boolean b4 = bytearrayhashmap_str3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b6 = bytearrayhashmap_str5.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array11 = new byte[] { (byte)1 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.lang.String str13 = bytearrayhashmap_str5.get(byte_array11);
    java.lang.String str15 = bytearrayhashmap_str2.put(byte_array11, "hi!");
    int i16 = bytearrayhashmap_str2.size();
    java.util.List<java.lang.String> list_str17 = bytearrayhashmap_str2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str3.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str3.duplicate();
    boolean b6 = bytearrayhashmap_str3.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(byte)100, (float)' ');
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(byte)-1, (float)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b6 = bytearrayhashmap_str5.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array11 = new byte[] { (byte)1 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.lang.String str13 = bytearrayhashmap_str5.get(byte_array11);
    java.lang.String str15 = bytearrayhashmap_str2.put(byte_array11, "hi!");
    java.util.List<java.lang.String> list_str16 = bytearrayhashmap_str2.values();
    boolean b17 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str20 = bytearrayhashmap_str19.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str21 = bytearrayhashmap_str20.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str23 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str24 = bytearrayhashmap_str23.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str26 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str27 = bytearrayhashmap_str26.duplicate();
    byte[] byte_array29 = new byte[] { (byte)1 };
    java.lang.String str30 = bytearrayhashmap_str26.get(byte_array29);
    java.lang.String str31 = bytearrayhashmap_str23.remove(byte_array29);
    java.lang.String str33 = bytearrayhashmap_str21.put(byte_array29, "");
    java.lang.String str34 = bytearrayhashmap_str2.get(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>((int)(byte)100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b8 = bytearrayhashmap_str7.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str7.duplicate();
    java.util.List<java.lang.String> list_str10 = bytearrayhashmap_str9.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str13 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b14 = bytearrayhashmap_str13.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str17 = bytearrayhashmap_str16.duplicate();
    byte[] byte_array19 = new byte[] { (byte)1 };
    java.lang.String str20 = bytearrayhashmap_str16.get(byte_array19);
    java.lang.String str21 = bytearrayhashmap_str13.get(byte_array19);
    boolean b22 = bytearrayhashmap_str9.containsKey(byte_array19);
    java.lang.String str23 = bytearrayhashmap_str4.get(byte_array19);
    boolean b24 = bytearrayhashmap_str1.containsKey(byte_array19);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str27 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str28 = bytearrayhashmap_str27.duplicate();
    java.util.List<byte[]> list_byte_array29 = bytearrayhashmap_str28.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str30 = bytearrayhashmap_str28.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str32 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str33 = bytearrayhashmap_str32.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str35 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str36 = bytearrayhashmap_str35.duplicate();
    byte[] byte_array38 = new byte[] { (byte)1 };
    java.lang.String str39 = bytearrayhashmap_str35.get(byte_array38);
    java.lang.String str40 = bytearrayhashmap_str32.remove(byte_array38);
    boolean b41 = bytearrayhashmap_str28.containsKey(byte_array38);
    boolean b42 = bytearrayhashmap_str1.containsKey(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b6 = bytearrayhashmap_str5.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array11 = new byte[] { (byte)1 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.lang.String str13 = bytearrayhashmap_str5.get(byte_array11);
    java.lang.String str15 = bytearrayhashmap_str2.put(byte_array11, "hi!");
    int i16 = bytearrayhashmap_str2.size();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str20 = bytearrayhashmap_str19.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str23 = new ByteArrayHashMap<java.lang.String>((int)(byte)0, 100.0f);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str25 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str26 = bytearrayhashmap_str25.duplicate();
    byte[] byte_array28 = new byte[] { (byte)1 };
    java.lang.String str29 = bytearrayhashmap_str25.get(byte_array28);
    java.lang.String str31 = bytearrayhashmap_str23.put(byte_array28, "");
    java.lang.String str33 = bytearrayhashmap_str19.put(byte_array28, "");
    java.lang.String str35 = bytearrayhashmap_str2.put(byte_array28, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str3.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str3.duplicate();
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_str3.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str5.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = bytearrayhashmap_str6.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = bytearrayhashmap_str9.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str13 = bytearrayhashmap_str12.duplicate();
    byte[] byte_array15 = new byte[] { (byte)1 };
    java.lang.String str16 = bytearrayhashmap_str12.get(byte_array15);
    java.lang.String str17 = bytearrayhashmap_str9.remove(byte_array15);
    java.lang.String str19 = bytearrayhashmap_str6.put(byte_array15, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str22 = bytearrayhashmap_str2.get(byte_array15, (int)(byte)100, (int)'a');
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
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    byte[] byte_array4 = new byte[] {  };
    java.lang.String str5 = bytearrayhashmap_str3.get(byte_array4);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str7.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    bytearrayhashmap_str8.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str13 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b14 = bytearrayhashmap_str13.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str17 = bytearrayhashmap_str16.duplicate();
    byte[] byte_array19 = new byte[] { (byte)1 };
    java.lang.String str20 = bytearrayhashmap_str16.get(byte_array19);
    java.lang.String str21 = bytearrayhashmap_str13.get(byte_array19);
    java.lang.String str22 = bytearrayhashmap_str8.get(byte_array19);
    java.lang.String str23 = bytearrayhashmap_str3.get(byte_array19);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str24 = bytearrayhashmap_str3.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str27 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str28 = bytearrayhashmap_str27.duplicate();
    byte[] byte_array29 = new byte[] {  };
    java.lang.String str30 = bytearrayhashmap_str28.get(byte_array29);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str32 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str33 = bytearrayhashmap_str32.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str34 = bytearrayhashmap_str33.duplicate();
    bytearrayhashmap_str33.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str38 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b39 = bytearrayhashmap_str38.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str41 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str42 = bytearrayhashmap_str41.duplicate();
    byte[] byte_array44 = new byte[] { (byte)1 };
    java.lang.String str45 = bytearrayhashmap_str41.get(byte_array44);
    java.lang.String str46 = bytearrayhashmap_str38.get(byte_array44);
    java.lang.String str47 = bytearrayhashmap_str33.get(byte_array44);
    java.lang.String str48 = bytearrayhashmap_str28.get(byte_array44);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str51 = bytearrayhashmap_str3.get(byte_array44, (int)(short)0, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str5.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array11 = new byte[] { (byte)1 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.lang.String str13 = bytearrayhashmap_str5.remove(byte_array11);
    java.lang.String str15 = bytearrayhashmap_str2.put(byte_array11, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = new ByteArrayHashMap<java.lang.String>();
    int i17 = bytearrayhashmap_str16.size();
    java.util.List<byte[]> list_byte_array18 = bytearrayhashmap_str16.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str20 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str21 = bytearrayhashmap_str20.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str22 = bytearrayhashmap_str21.duplicate();
    bytearrayhashmap_str21.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str24 = bytearrayhashmap_str21.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str26 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str27 = bytearrayhashmap_str26.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str29 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str30 = bytearrayhashmap_str29.duplicate();
    byte[] byte_array32 = new byte[] { (byte)1 };
    java.lang.String str33 = bytearrayhashmap_str29.get(byte_array32);
    java.lang.String str34 = bytearrayhashmap_str26.remove(byte_array32);
    boolean b35 = bytearrayhashmap_str24.containsKey(byte_array32);
    java.lang.String str36 = bytearrayhashmap_str16.get(byte_array32);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str39 = bytearrayhashmap_str2.get(byte_array32, (int)(short)10, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str2.duplicate();
    java.util.List<java.lang.String> list_str5 = bytearrayhashmap_str4.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b9 = bytearrayhashmap_str8.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = bytearrayhashmap_str11.duplicate();
    byte[] byte_array14 = new byte[] { (byte)1 };
    java.lang.String str15 = bytearrayhashmap_str11.get(byte_array14);
    java.lang.String str16 = bytearrayhashmap_str8.get(byte_array14);
    boolean b17 = bytearrayhashmap_str4.containsKey(byte_array14);
    byte[] byte_array18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = bytearrayhashmap_str4.get(byte_array18);
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
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b6 = bytearrayhashmap_str5.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array11 = new byte[] { (byte)1 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.lang.String str13 = bytearrayhashmap_str5.get(byte_array11);
    java.lang.String str15 = bytearrayhashmap_str2.put(byte_array11, "hi!");
    java.util.List<java.lang.String> list_str16 = bytearrayhashmap_str2.values();
    bytearrayhashmap_str2.clear();
    int i18 = bytearrayhashmap_str2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>();
    int i5 = bytearrayhashmap_str4.size();
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_str4.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = bytearrayhashmap_str9.duplicate();
    bytearrayhashmap_str9.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = bytearrayhashmap_str9.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str14 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = bytearrayhashmap_str14.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str17 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str18 = bytearrayhashmap_str17.duplicate();
    byte[] byte_array20 = new byte[] { (byte)1 };
    java.lang.String str21 = bytearrayhashmap_str17.get(byte_array20);
    java.lang.String str22 = bytearrayhashmap_str14.remove(byte_array20);
    boolean b23 = bytearrayhashmap_str12.containsKey(byte_array20);
    java.lang.String str24 = bytearrayhashmap_str4.get(byte_array20);
    java.lang.String str25 = bytearrayhashmap_str2.remove(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)'4');
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b5 = bytearrayhashmap_str4.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str4.duplicate();
    bytearrayhashmap_str4.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b11 = bytearrayhashmap_str10.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str13 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str14 = bytearrayhashmap_str13.duplicate();
    byte[] byte_array16 = new byte[] { (byte)1 };
    java.lang.String str17 = bytearrayhashmap_str13.get(byte_array16);
    java.lang.String str18 = bytearrayhashmap_str10.get(byte_array16);
    java.lang.String str19 = bytearrayhashmap_str4.get(byte_array16);
    java.lang.String str21 = bytearrayhashmap_str1.put(byte_array16, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    byte[] byte_array4 = new byte[] {  };
    java.lang.String str5 = bytearrayhashmap_str3.get(byte_array4);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str7.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    bytearrayhashmap_str8.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str13 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b14 = bytearrayhashmap_str13.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str17 = bytearrayhashmap_str16.duplicate();
    byte[] byte_array19 = new byte[] { (byte)1 };
    java.lang.String str20 = bytearrayhashmap_str16.get(byte_array19);
    java.lang.String str21 = bytearrayhashmap_str13.get(byte_array19);
    java.lang.String str22 = bytearrayhashmap_str8.get(byte_array19);
    java.lang.String str23 = bytearrayhashmap_str3.get(byte_array19);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str24 = bytearrayhashmap_str3.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str26 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str27 = bytearrayhashmap_str26.duplicate();
    byte[] byte_array29 = new byte[] { (byte)1 };
    java.lang.String str30 = bytearrayhashmap_str26.get(byte_array29);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str31 = bytearrayhashmap_str26.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str34 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b35 = bytearrayhashmap_str34.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str37 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str38 = bytearrayhashmap_str37.duplicate();
    byte[] byte_array40 = new byte[] { (byte)1 };
    java.lang.String str41 = bytearrayhashmap_str37.get(byte_array40);
    java.lang.String str42 = bytearrayhashmap_str34.get(byte_array40);
    java.lang.String str43 = bytearrayhashmap_str26.remove(byte_array40);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str46 = bytearrayhashmap_str3.get(byte_array40, (int)(byte)-1, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str2.clear();
    int i5 = bytearrayhashmap_str2.size();
    bytearrayhashmap_str2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str5.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array11 = new byte[] { (byte)1 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.lang.String str13 = bytearrayhashmap_str5.remove(byte_array11);
    java.lang.String str15 = bytearrayhashmap_str2.put(byte_array11, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str17 = new ByteArrayHashMap<java.lang.String>((int)(byte)100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str20 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b21 = bytearrayhashmap_str20.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str22 = bytearrayhashmap_str20.duplicate();
    java.util.List<java.lang.String> list_str23 = bytearrayhashmap_str22.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str26 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b27 = bytearrayhashmap_str26.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str29 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str30 = bytearrayhashmap_str29.duplicate();
    byte[] byte_array32 = new byte[] { (byte)1 };
    java.lang.String str33 = bytearrayhashmap_str29.get(byte_array32);
    java.lang.String str34 = bytearrayhashmap_str26.get(byte_array32);
    boolean b35 = bytearrayhashmap_str22.containsKey(byte_array32);
    java.lang.String str36 = bytearrayhashmap_str17.get(byte_array32);
    java.lang.String str38 = bytearrayhashmap_str2.put(byte_array32, "");
    java.util.List<java.lang.String> list_str39 = bytearrayhashmap_str2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str39);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)100, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)100);
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_str2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str3.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str3.duplicate();
    bytearrayhashmap_str3.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = new ByteArrayHashMap<java.lang.String>((int)(byte)0, 100.0f);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array11 = new byte[] { (byte)1 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.lang.String str14 = bytearrayhashmap_str6.put(byte_array11, "");
    java.lang.String str16 = bytearrayhashmap_str2.put(byte_array11, "");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str18 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str21 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b22 = bytearrayhashmap_str21.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str23 = bytearrayhashmap_str21.duplicate();
    bytearrayhashmap_str21.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str27 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str29 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str30 = bytearrayhashmap_str29.duplicate();
    byte[] byte_array32 = new byte[] { (byte)1 };
    java.lang.String str33 = bytearrayhashmap_str29.get(byte_array32);
    java.lang.String str34 = bytearrayhashmap_str27.get(byte_array32);
    java.lang.String str36 = bytearrayhashmap_str21.put(byte_array32, "hi!");
    boolean b37 = bytearrayhashmap_str18.containsKey(byte_array32);
    java.lang.String str39 = bytearrayhashmap_str2.put(byte_array32, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + ""+ "'", str39.equals(""));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(100);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b6 = bytearrayhashmap_str5.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array11 = new byte[] { (byte)1 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.lang.String str13 = bytearrayhashmap_str5.get(byte_array11);
    java.lang.String str15 = bytearrayhashmap_str2.put(byte_array11, "hi!");
    java.util.List<java.lang.String> list_str16 = bytearrayhashmap_str2.values();
    boolean b17 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str20 = bytearrayhashmap_str19.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str21 = bytearrayhashmap_str20.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str23 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str24 = bytearrayhashmap_str23.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str26 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str27 = bytearrayhashmap_str26.duplicate();
    byte[] byte_array29 = new byte[] { (byte)1 };
    java.lang.String str30 = bytearrayhashmap_str26.get(byte_array29);
    java.lang.String str31 = bytearrayhashmap_str23.remove(byte_array29);
    java.lang.String str33 = bytearrayhashmap_str21.put(byte_array29, "");
    java.lang.String str35 = bytearrayhashmap_str2.put(byte_array29, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str2.duplicate();
    int i5 = bytearrayhashmap_str2.size();
    java.util.List<java.lang.String> list_str6 = bytearrayhashmap_str2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str2.duplicate();
    java.util.List<java.lang.String> list_str5 = bytearrayhashmap_str4.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b9 = bytearrayhashmap_str8.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = bytearrayhashmap_str11.duplicate();
    byte[] byte_array14 = new byte[] { (byte)1 };
    java.lang.String str15 = bytearrayhashmap_str11.get(byte_array14);
    java.lang.String str16 = bytearrayhashmap_str8.get(byte_array14);
    boolean b17 = bytearrayhashmap_str4.containsKey(byte_array14);
    bytearrayhashmap_str4.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str20 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str21 = bytearrayhashmap_str20.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str24 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b25 = bytearrayhashmap_str24.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str27 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str28 = bytearrayhashmap_str27.duplicate();
    byte[] byte_array30 = new byte[] { (byte)1 };
    java.lang.String str31 = bytearrayhashmap_str27.get(byte_array30);
    java.lang.String str32 = bytearrayhashmap_str24.get(byte_array30);
    java.lang.String str34 = bytearrayhashmap_str21.put(byte_array30, "hi!");
    java.util.List<java.lang.String> list_str35 = bytearrayhashmap_str21.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str37 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str38 = bytearrayhashmap_str37.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str39 = bytearrayhashmap_str38.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str41 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str42 = bytearrayhashmap_str41.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str44 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str45 = bytearrayhashmap_str44.duplicate();
    byte[] byte_array47 = new byte[] { (byte)1 };
    java.lang.String str48 = bytearrayhashmap_str44.get(byte_array47);
    java.lang.String str49 = bytearrayhashmap_str41.remove(byte_array47);
    java.lang.String str51 = bytearrayhashmap_str39.put(byte_array47, "");
    java.lang.String str52 = bytearrayhashmap_str21.get(byte_array47);
    boolean b53 = bytearrayhashmap_str4.containsKey(byte_array47);
    bytearrayhashmap_str4.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!"+ "'", str52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)100);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)' ');

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)'#');
    java.util.List<java.lang.String> list_str2 = bytearrayhashmap_str1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str0 = new ByteArrayHashMap<java.lang.String>();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b4 = bytearrayhashmap_str3.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str3.duplicate();
    java.util.List<java.lang.String> list_str6 = bytearrayhashmap_str5.values();
    bytearrayhashmap_str5.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = bytearrayhashmap_str10.duplicate();
    byte[] byte_array12 = new byte[] {  };
    java.lang.String str13 = bytearrayhashmap_str11.get(byte_array12);
    java.lang.String str15 = bytearrayhashmap_str5.put(byte_array12, "");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str17 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str18 = bytearrayhashmap_str17.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = bytearrayhashmap_str18.duplicate();
    bytearrayhashmap_str19.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str21 = bytearrayhashmap_str19.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str24 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b25 = bytearrayhashmap_str24.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str28 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b29 = bytearrayhashmap_str28.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str30 = bytearrayhashmap_str28.duplicate();
    java.util.List<java.lang.String> list_str31 = bytearrayhashmap_str30.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str34 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b35 = bytearrayhashmap_str34.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str37 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str38 = bytearrayhashmap_str37.duplicate();
    byte[] byte_array40 = new byte[] { (byte)1 };
    java.lang.String str41 = bytearrayhashmap_str37.get(byte_array40);
    java.lang.String str42 = bytearrayhashmap_str34.get(byte_array40);
    boolean b43 = bytearrayhashmap_str30.containsKey(byte_array40);
    java.lang.String str45 = bytearrayhashmap_str24.put(byte_array40, "hi!");
    java.lang.String str46 = bytearrayhashmap_str21.remove(byte_array40);
    java.lang.String str48 = bytearrayhashmap_str5.put(byte_array40, "");
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str51 = bytearrayhashmap_str0.get(byte_array40, (int)(byte)1, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(byte)100);
    java.util.List<java.lang.String> list_str2 = bytearrayhashmap_str1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str5.duplicate();
    byte[] byte_array8 = new byte[] { (byte)1 };
    java.lang.String str9 = bytearrayhashmap_str5.get(byte_array8);
    java.lang.String str10 = bytearrayhashmap_str2.get(byte_array8);
    java.util.List<byte[]> list_byte_array11 = bytearrayhashmap_str2.keys();
    bytearrayhashmap_str2.clear();
    java.util.List<java.lang.String> list_str13 = bytearrayhashmap_str2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str2.duplicate();
    java.util.List<java.lang.String> list_str5 = bytearrayhashmap_str4.values();
    bytearrayhashmap_str4.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = bytearrayhashmap_str9.duplicate();
    byte[] byte_array11 = new byte[] {  };
    java.lang.String str12 = bytearrayhashmap_str10.get(byte_array11);
    java.lang.String str14 = bytearrayhashmap_str4.put(byte_array11, "");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str17 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b18 = bytearrayhashmap_str17.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = bytearrayhashmap_str17.duplicate();
    java.util.List<java.lang.String> list_str20 = bytearrayhashmap_str19.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str23 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b24 = bytearrayhashmap_str23.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str26 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str27 = bytearrayhashmap_str26.duplicate();
    byte[] byte_array29 = new byte[] { (byte)1 };
    java.lang.String str30 = bytearrayhashmap_str26.get(byte_array29);
    java.lang.String str31 = bytearrayhashmap_str23.get(byte_array29);
    boolean b32 = bytearrayhashmap_str19.containsKey(byte_array29);
    bytearrayhashmap_str19.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str35 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str36 = bytearrayhashmap_str35.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str39 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b40 = bytearrayhashmap_str39.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str42 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str43 = bytearrayhashmap_str42.duplicate();
    byte[] byte_array45 = new byte[] { (byte)1 };
    java.lang.String str46 = bytearrayhashmap_str42.get(byte_array45);
    java.lang.String str47 = bytearrayhashmap_str39.get(byte_array45);
    java.lang.String str49 = bytearrayhashmap_str36.put(byte_array45, "hi!");
    java.util.List<java.lang.String> list_str50 = bytearrayhashmap_str36.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str52 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str53 = bytearrayhashmap_str52.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str54 = bytearrayhashmap_str53.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str56 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str57 = bytearrayhashmap_str56.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str59 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str60 = bytearrayhashmap_str59.duplicate();
    byte[] byte_array62 = new byte[] { (byte)1 };
    java.lang.String str63 = bytearrayhashmap_str59.get(byte_array62);
    java.lang.String str64 = bytearrayhashmap_str56.remove(byte_array62);
    java.lang.String str66 = bytearrayhashmap_str54.put(byte_array62, "");
    java.lang.String str67 = bytearrayhashmap_str36.get(byte_array62);
    boolean b68 = bytearrayhashmap_str19.containsKey(byte_array62);
    java.lang.String str69 = bytearrayhashmap_str4.remove(byte_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!"+ "'", str67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str69);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    bytearrayhashmap_str2.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str2.duplicate();
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_str2.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = bytearrayhashmap_str2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str7);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str2.duplicate();
    int i6 = bytearrayhashmap_str2.size();
    java.util.List<java.lang.String> list_str7 = bytearrayhashmap_str2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str7);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(byte)10);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    byte[] byte_array4 = new byte[] {  };
    java.lang.String str5 = bytearrayhashmap_str3.get(byte_array4);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str7.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    bytearrayhashmap_str8.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str13 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b14 = bytearrayhashmap_str13.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str17 = bytearrayhashmap_str16.duplicate();
    byte[] byte_array19 = new byte[] { (byte)1 };
    java.lang.String str20 = bytearrayhashmap_str16.get(byte_array19);
    java.lang.String str21 = bytearrayhashmap_str13.get(byte_array19);
    java.lang.String str22 = bytearrayhashmap_str8.get(byte_array19);
    java.lang.String str23 = bytearrayhashmap_str3.get(byte_array19);
    bytearrayhashmap_str3.clear();
    int i25 = bytearrayhashmap_str3.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str0 = new ByteArrayHashMap<java.lang.String>();
    int i1 = bytearrayhashmap_str0.size();
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_str0.keys();
    boolean b3 = bytearrayhashmap_str0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(byte)0, 100.0f);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str4.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str7.duplicate();
    byte[] byte_array10 = new byte[] { (byte)1 };
    java.lang.String str11 = bytearrayhashmap_str7.get(byte_array10);
    java.lang.String str12 = bytearrayhashmap_str4.remove(byte_array10);
    java.lang.String str13 = bytearrayhashmap_str2.get(byte_array10);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str14 = bytearrayhashmap_str2.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = new ByteArrayHashMap<java.lang.String>((int)(byte)100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b20 = bytearrayhashmap_str19.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str21 = bytearrayhashmap_str19.duplicate();
    java.util.List<java.lang.String> list_str22 = bytearrayhashmap_str21.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str25 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b26 = bytearrayhashmap_str25.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str28 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str29 = bytearrayhashmap_str28.duplicate();
    byte[] byte_array31 = new byte[] { (byte)1 };
    java.lang.String str32 = bytearrayhashmap_str28.get(byte_array31);
    java.lang.String str33 = bytearrayhashmap_str25.get(byte_array31);
    boolean b34 = bytearrayhashmap_str21.containsKey(byte_array31);
    java.lang.String str35 = bytearrayhashmap_str16.get(byte_array31);
    java.lang.String str36 = bytearrayhashmap_str2.get(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    boolean b4 = bytearrayhashmap_str3.isEmpty();
    java.util.List<java.lang.String> list_str5 = bytearrayhashmap_str3.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str2.duplicate();
    java.util.List<byte[]> list_byte_array5 = bytearrayhashmap_str4.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b9 = bytearrayhashmap_str8.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = bytearrayhashmap_str8.duplicate();
    bytearrayhashmap_str8.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str13 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str14 = bytearrayhashmap_str13.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = bytearrayhashmap_str14.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str17 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str18 = bytearrayhashmap_str17.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str20 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str21 = bytearrayhashmap_str20.duplicate();
    byte[] byte_array23 = new byte[] { (byte)1 };
    java.lang.String str24 = bytearrayhashmap_str20.get(byte_array23);
    java.lang.String str25 = bytearrayhashmap_str17.remove(byte_array23);
    java.lang.String str27 = bytearrayhashmap_str15.put(byte_array23, "");
    java.lang.String str28 = bytearrayhashmap_str8.get(byte_array23);
    boolean b29 = bytearrayhashmap_str8.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str31 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str32 = bytearrayhashmap_str31.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str35 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b36 = bytearrayhashmap_str35.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str38 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str39 = bytearrayhashmap_str38.duplicate();
    byte[] byte_array41 = new byte[] { (byte)1 };
    java.lang.String str42 = bytearrayhashmap_str38.get(byte_array41);
    java.lang.String str43 = bytearrayhashmap_str35.get(byte_array41);
    java.lang.String str45 = bytearrayhashmap_str32.put(byte_array41, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str48 = new ByteArrayHashMap<java.lang.String>((int)'#', (float)1);
    boolean b49 = bytearrayhashmap_str48.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str51 = new ByteArrayHashMap<java.lang.String>(1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str52 = bytearrayhashmap_str51.duplicate();
    byte[] byte_array54 = new byte[] { (byte)1 };
    java.lang.String str55 = bytearrayhashmap_str51.get(byte_array54);
    java.lang.String str56 = bytearrayhashmap_str48.get(byte_array54);
    java.lang.String str57 = bytearrayhashmap_str32.get(byte_array54);
    boolean b58 = bytearrayhashmap_str8.containsKey(byte_array54);
    java.lang.String str59 = bytearrayhashmap_str4.get(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!"+ "'", str57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str59);

  }

}
