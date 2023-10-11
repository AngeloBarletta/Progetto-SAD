
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
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(byte)0, (float)0L);
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


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array10 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str11 = bytearrayhashmap_str7.get(byte_array10);
    byte[] byte_array17 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str18 = bytearrayhashmap_str7.get(byte_array17);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str21 = bytearrayhashmap_str1.get(byte_array17, 10, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str0 = new ByteArrayHashMap<java.lang.String>();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((-1), (float)1L);
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


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str12 = bytearrayhashmap_str1.get(byte_array11);
    boolean b13 = bytearrayhashmap_str1.isEmpty();
    java.util.List<java.lang.String> list_str14 = bytearrayhashmap_str1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str14);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str1.values();
    int i4 = bytearrayhashmap_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)'a');

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    java.util.List<java.lang.String> list_str6 = bytearrayhashmap_str1.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = new ByteArrayHashMap<java.lang.String>((int)'a', (float)10L);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str11 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array14 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str15 = bytearrayhashmap_str11.get(byte_array14);
    byte[] byte_array21 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str22 = bytearrayhashmap_str11.get(byte_array21);
    boolean b23 = bytearrayhashmap_str11.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str25 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array28 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str29 = bytearrayhashmap_str25.get(byte_array28);
    byte[] byte_array35 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str36 = bytearrayhashmap_str25.get(byte_array35);
    java.lang.String str38 = bytearrayhashmap_str11.put(byte_array35, "");
    java.lang.String str40 = bytearrayhashmap_str9.put(byte_array35, "");
    boolean b41 = bytearrayhashmap_str1.containsKey(byte_array35);
    byte[] byte_array42 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str45 = bytearrayhashmap_str1.get(byte_array42, 100, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str12 = bytearrayhashmap_str1.get(byte_array11);
    boolean b13 = bytearrayhashmap_str1.isEmpty();
    java.util.List<byte[]> list_byte_array14 = bytearrayhashmap_str1.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array19 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str20 = bytearrayhashmap_str16.get(byte_array19);
    java.util.List<java.lang.String> list_str21 = bytearrayhashmap_str16.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str23 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array26 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str27 = bytearrayhashmap_str23.get(byte_array26);
    byte[] byte_array33 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str34 = bytearrayhashmap_str23.get(byte_array33);
    boolean b35 = bytearrayhashmap_str23.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str37 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array40 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str41 = bytearrayhashmap_str37.get(byte_array40);
    byte[] byte_array47 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str48 = bytearrayhashmap_str37.get(byte_array47);
    java.lang.String str50 = bytearrayhashmap_str23.put(byte_array47, "");
    java.lang.String str52 = bytearrayhashmap_str16.put(byte_array47, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str55 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str57 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str58 = bytearrayhashmap_str57.duplicate();
    byte[] byte_array65 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b66 = bytearrayhashmap_str57.containsKey(byte_array65);
    int i67 = bytearrayhashmap_str57.size();
    byte[] byte_array68 = new byte[] {  };
    boolean b69 = bytearrayhashmap_str57.containsKey(byte_array68);
    boolean b70 = bytearrayhashmap_str55.containsKey(byte_array68);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str72 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array75 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str76 = bytearrayhashmap_str72.get(byte_array75);
    byte[] byte_array82 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str83 = bytearrayhashmap_str72.get(byte_array82);
    boolean b84 = bytearrayhashmap_str55.containsKey(byte_array82);
    java.lang.String str85 = bytearrayhashmap_str16.remove(byte_array82);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str87 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str88 = bytearrayhashmap_str87.duplicate();
    byte[] byte_array95 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b96 = bytearrayhashmap_str87.containsKey(byte_array95);
    java.lang.String str97 = bytearrayhashmap_str16.get(byte_array95);
    java.lang.String str98 = bytearrayhashmap_str1.remove(byte_array95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "hi!"+ "'", str85.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str98);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>(0, (float)10);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = bytearrayhashmap_str2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((-1), (float)100L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    java.util.List<java.lang.String> list_str6 = bytearrayhashmap_str1.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array11 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    byte[] byte_array18 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str19 = bytearrayhashmap_str8.get(byte_array18);
    boolean b20 = bytearrayhashmap_str8.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str22 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array25 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str26 = bytearrayhashmap_str22.get(byte_array25);
    byte[] byte_array32 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str33 = bytearrayhashmap_str22.get(byte_array32);
    java.lang.String str35 = bytearrayhashmap_str8.put(byte_array32, "");
    java.lang.String str37 = bytearrayhashmap_str1.put(byte_array32, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str40 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str42 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str43 = bytearrayhashmap_str42.duplicate();
    byte[] byte_array50 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b51 = bytearrayhashmap_str42.containsKey(byte_array50);
    int i52 = bytearrayhashmap_str42.size();
    byte[] byte_array53 = new byte[] {  };
    boolean b54 = bytearrayhashmap_str42.containsKey(byte_array53);
    boolean b55 = bytearrayhashmap_str40.containsKey(byte_array53);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str57 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array60 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str61 = bytearrayhashmap_str57.get(byte_array60);
    byte[] byte_array67 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str68 = bytearrayhashmap_str57.get(byte_array67);
    boolean b69 = bytearrayhashmap_str40.containsKey(byte_array67);
    java.lang.String str70 = bytearrayhashmap_str1.remove(byte_array67);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str72 = new ByteArrayHashMap<java.lang.String>(0);
    java.util.List<java.lang.String> list_str73 = bytearrayhashmap_str72.values();
    byte[] byte_array75 = new byte[] { (byte)-1 };
    java.lang.String str76 = bytearrayhashmap_str72.get(byte_array75);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str79 = bytearrayhashmap_str1.get(byte_array75, (int)(short)10, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!"+ "'", str70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str76);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'a', (float)10L);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>(0, (float)10);
    boolean b3 = bytearrayhashmap_str2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)' ', (float)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(byte)10);
    java.util.List<java.lang.String> list_str2 = bytearrayhashmap_str1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>(0, 10.0f);
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)-1, (float)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str12 = bytearrayhashmap_str1.get(byte_array11);
    boolean b13 = bytearrayhashmap_str1.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array18 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str19 = bytearrayhashmap_str15.get(byte_array18);
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str26 = bytearrayhashmap_str15.get(byte_array25);
    java.lang.String str28 = bytearrayhashmap_str1.put(byte_array25, "");
    boolean b29 = bytearrayhashmap_str1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    bytearrayhashmap_str2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    bytearrayhashmap_str1.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str4.duplicate();
    byte[] byte_array12 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b13 = bytearrayhashmap_str4.containsKey(byte_array12);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array18 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str19 = bytearrayhashmap_str15.get(byte_array18);
    java.lang.String str20 = bytearrayhashmap_str4.get(byte_array18);
    java.lang.String str22 = bytearrayhashmap_str1.put(byte_array18, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str4.duplicate();
    byte[] byte_array12 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b13 = bytearrayhashmap_str4.containsKey(byte_array12);
    int i14 = bytearrayhashmap_str4.size();
    byte[] byte_array15 = new byte[] {  };
    boolean b16 = bytearrayhashmap_str4.containsKey(byte_array15);
    boolean b17 = bytearrayhashmap_str2.containsKey(byte_array15);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array22 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str23 = bytearrayhashmap_str19.get(byte_array22);
    byte[] byte_array29 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str30 = bytearrayhashmap_str19.get(byte_array29);
    boolean b31 = bytearrayhashmap_str2.containsKey(byte_array29);
    byte[] byte_array32 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str33 = bytearrayhashmap_str2.remove(byte_array32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)'a', (float)10L);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array7 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str8 = bytearrayhashmap_str4.get(byte_array7);
    byte[] byte_array14 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str15 = bytearrayhashmap_str4.get(byte_array14);
    boolean b16 = bytearrayhashmap_str4.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str18 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array21 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str22 = bytearrayhashmap_str18.get(byte_array21);
    byte[] byte_array28 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str29 = bytearrayhashmap_str18.get(byte_array28);
    java.lang.String str31 = bytearrayhashmap_str4.put(byte_array28, "");
    java.lang.String str33 = bytearrayhashmap_str2.put(byte_array28, "");
    java.util.List<byte[]> list_byte_array34 = bytearrayhashmap_str2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array34);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    java.util.List<java.lang.String> list_str6 = bytearrayhashmap_str1.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array13 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str14 = bytearrayhashmap_str10.get(byte_array13);
    byte[] byte_array20 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str21 = bytearrayhashmap_str10.get(byte_array20);
    boolean b22 = bytearrayhashmap_str10.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str24 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array27 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str28 = bytearrayhashmap_str24.get(byte_array27);
    byte[] byte_array34 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str35 = bytearrayhashmap_str24.get(byte_array34);
    java.lang.String str37 = bytearrayhashmap_str10.put(byte_array34, "");
    java.lang.String str39 = bytearrayhashmap_str8.put(byte_array34, "");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str42 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str44 = new ByteArrayHashMap<java.lang.String>(100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str46 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array49 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str50 = bytearrayhashmap_str46.get(byte_array49);
    byte[] byte_array56 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str57 = bytearrayhashmap_str46.get(byte_array56);
    boolean b58 = bytearrayhashmap_str46.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str60 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array63 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str64 = bytearrayhashmap_str60.get(byte_array63);
    byte[] byte_array70 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str71 = bytearrayhashmap_str60.get(byte_array70);
    java.lang.String str73 = bytearrayhashmap_str46.put(byte_array70, "");
    java.lang.String str75 = bytearrayhashmap_str44.put(byte_array70, "");
    java.lang.String str77 = bytearrayhashmap_str42.put(byte_array70, "hi!");
    java.lang.String str78 = bytearrayhashmap_str8.remove(byte_array70);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str81 = bytearrayhashmap_str1.get(byte_array70, (int)(byte)1, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + ""+ "'", str78.equals(""));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    byte[] byte_array9 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b10 = bytearrayhashmap_str1.containsKey(byte_array9);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array15 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str16 = bytearrayhashmap_str12.get(byte_array15);
    java.lang.String str17 = bytearrayhashmap_str1.get(byte_array15);
    byte[] byte_array18 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str19 = bytearrayhashmap_str1.remove(byte_array18);
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
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    boolean b6 = bytearrayhashmap_str1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str12 = bytearrayhashmap_str1.get(byte_array11);
    boolean b13 = bytearrayhashmap_str1.isEmpty();
    int i14 = bytearrayhashmap_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str1.values();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_str1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    boolean b3 = bytearrayhashmap_str1.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = bytearrayhashmap_str1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str4);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str7 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = bytearrayhashmap_str7.duplicate();
    byte[] byte_array15 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b16 = bytearrayhashmap_str7.containsKey(byte_array15);
    int i17 = bytearrayhashmap_str7.size();
    byte[] byte_array18 = new byte[] {  };
    boolean b19 = bytearrayhashmap_str7.containsKey(byte_array18);
    byte[] byte_array26 = new byte[] { (byte)10, (byte)0, (byte)100, (byte)-1, (byte)1, (byte)1 };
    java.lang.String str27 = bytearrayhashmap_str7.remove(byte_array26);
    java.lang.String str28 = bytearrayhashmap_str1.remove(byte_array26);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str30 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str31 = bytearrayhashmap_str30.duplicate();
    byte[] byte_array38 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b39 = bytearrayhashmap_str30.containsKey(byte_array38);
    boolean b40 = bytearrayhashmap_str1.containsKey(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str2.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array8 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str9 = bytearrayhashmap_str5.get(byte_array8);
    byte[] byte_array15 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str16 = bytearrayhashmap_str5.get(byte_array15);
    boolean b17 = bytearrayhashmap_str5.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array22 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str23 = bytearrayhashmap_str19.get(byte_array22);
    byte[] byte_array29 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str30 = bytearrayhashmap_str19.get(byte_array29);
    java.lang.String str32 = bytearrayhashmap_str5.put(byte_array29, "");
    java.lang.String str34 = bytearrayhashmap_str2.put(byte_array29, "");
    java.util.List<java.lang.String> list_str35 = bytearrayhashmap_str2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str35);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_str2.keys();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_str2.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(100);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_str1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    java.util.List<java.lang.String> list_str2 = bytearrayhashmap_str1.values();
    boolean b3 = bytearrayhashmap_str1.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = new ByteArrayHashMap<java.lang.String>((int)'a', (float)10L);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str9 = bytearrayhashmap_str8.duplicate();
    byte[] byte_array16 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b17 = bytearrayhashmap_str8.containsKey(byte_array16);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array22 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str23 = bytearrayhashmap_str19.get(byte_array22);
    java.lang.String str24 = bytearrayhashmap_str8.get(byte_array22);
    java.lang.String str26 = bytearrayhashmap_str6.put(byte_array22, "");
    java.lang.String str28 = bytearrayhashmap_str1.put(byte_array22, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str3 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array6 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str7 = bytearrayhashmap_str3.get(byte_array6);
    byte[] byte_array13 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str14 = bytearrayhashmap_str3.get(byte_array13);
    boolean b15 = bytearrayhashmap_str3.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str17 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array20 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str21 = bytearrayhashmap_str17.get(byte_array20);
    byte[] byte_array27 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str28 = bytearrayhashmap_str17.get(byte_array27);
    java.lang.String str30 = bytearrayhashmap_str3.put(byte_array27, "");
    java.lang.String str32 = bytearrayhashmap_str1.put(byte_array27, "");
    java.util.List<byte[]> list_byte_array33 = bytearrayhashmap_str1.keys();
    int i34 = bytearrayhashmap_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    byte[] byte_array6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = bytearrayhashmap_str1.remove(byte_array6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str2.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str5.duplicate();
    byte[] byte_array13 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b14 = bytearrayhashmap_str5.containsKey(byte_array13);
    int i15 = bytearrayhashmap_str5.size();
    byte[] byte_array16 = new byte[] {  };
    boolean b17 = bytearrayhashmap_str5.containsKey(byte_array16);
    byte[] byte_array24 = new byte[] { (byte)10, (byte)0, (byte)100, (byte)-1, (byte)1, (byte)1 };
    java.lang.String str25 = bytearrayhashmap_str5.remove(byte_array24);
    java.lang.String str26 = bytearrayhashmap_str2.remove(byte_array24);
    int i27 = bytearrayhashmap_str2.size();
    java.util.List<java.lang.String> list_str28 = bytearrayhashmap_str2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str4.duplicate();
    byte[] byte_array12 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b13 = bytearrayhashmap_str4.containsKey(byte_array12);
    int i14 = bytearrayhashmap_str4.size();
    byte[] byte_array15 = new byte[] {  };
    boolean b16 = bytearrayhashmap_str4.containsKey(byte_array15);
    boolean b17 = bytearrayhashmap_str2.containsKey(byte_array15);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array22 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str23 = bytearrayhashmap_str19.get(byte_array22);
    byte[] byte_array29 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str30 = bytearrayhashmap_str19.get(byte_array29);
    boolean b31 = bytearrayhashmap_str2.containsKey(byte_array29);
    int i32 = bytearrayhashmap_str2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(byte)0, (float)'#');

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    java.util.List<java.lang.String> list_str6 = bytearrayhashmap_str1.values();
    java.util.List<byte[]> list_byte_array7 = bytearrayhashmap_str1.keys();
    int i8 = bytearrayhashmap_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    java.util.List<java.lang.String> list_str6 = bytearrayhashmap_str1.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array11 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    java.util.List<java.lang.String> list_str13 = bytearrayhashmap_str8.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array18 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str19 = bytearrayhashmap_str15.get(byte_array18);
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str26 = bytearrayhashmap_str15.get(byte_array25);
    boolean b27 = bytearrayhashmap_str15.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str29 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array32 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str33 = bytearrayhashmap_str29.get(byte_array32);
    byte[] byte_array39 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str40 = bytearrayhashmap_str29.get(byte_array39);
    java.lang.String str42 = bytearrayhashmap_str15.put(byte_array39, "");
    java.lang.String str44 = bytearrayhashmap_str8.put(byte_array39, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str46 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str47 = bytearrayhashmap_str46.duplicate();
    byte[] byte_array54 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b55 = bytearrayhashmap_str46.containsKey(byte_array54);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str57 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array60 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str61 = bytearrayhashmap_str57.get(byte_array60);
    java.lang.String str62 = bytearrayhashmap_str46.get(byte_array60);
    java.lang.String str64 = bytearrayhashmap_str8.put(byte_array60, "hi!");
    java.lang.String str65 = bytearrayhashmap_str1.remove(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str65);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    byte[] byte_array9 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b10 = bytearrayhashmap_str1.containsKey(byte_array9);
    int i11 = bytearrayhashmap_str1.size();
    byte[] byte_array12 = new byte[] {  };
    boolean b13 = bytearrayhashmap_str1.containsKey(byte_array12);
    byte[] byte_array20 = new byte[] { (byte)10, (byte)0, (byte)100, (byte)-1, (byte)1, (byte)1 };
    java.lang.String str21 = bytearrayhashmap_str1.remove(byte_array20);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str23 = new ByteArrayHashMap<java.lang.String>(100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str25 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array28 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str29 = bytearrayhashmap_str25.get(byte_array28);
    byte[] byte_array35 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str36 = bytearrayhashmap_str25.get(byte_array35);
    boolean b37 = bytearrayhashmap_str25.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str39 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array42 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str43 = bytearrayhashmap_str39.get(byte_array42);
    byte[] byte_array49 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str50 = bytearrayhashmap_str39.get(byte_array49);
    java.lang.String str52 = bytearrayhashmap_str25.put(byte_array49, "");
    java.lang.String str54 = bytearrayhashmap_str23.put(byte_array49, "");
    boolean b55 = bytearrayhashmap_str1.containsKey(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str12 = bytearrayhashmap_str1.get(byte_array11);
    bytearrayhashmap_str1.clear();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str15 = new ByteArrayHashMap<java.lang.String>(0);
    java.util.List<java.lang.String> list_str16 = bytearrayhashmap_str15.values();
    byte[] byte_array18 = new byte[] { (byte)-1 };
    java.lang.String str19 = bytearrayhashmap_str15.get(byte_array18);
    java.lang.String str21 = bytearrayhashmap_str1.put(byte_array18, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(short)100);
    java.util.List<java.lang.String> list_str2 = bytearrayhashmap_str1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>(100);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array9 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str10 = bytearrayhashmap_str6.get(byte_array9);
    byte[] byte_array16 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str17 = bytearrayhashmap_str6.get(byte_array16);
    boolean b18 = bytearrayhashmap_str6.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str20 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array23 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str24 = bytearrayhashmap_str20.get(byte_array23);
    byte[] byte_array30 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str31 = bytearrayhashmap_str20.get(byte_array30);
    java.lang.String str33 = bytearrayhashmap_str6.put(byte_array30, "");
    java.lang.String str35 = bytearrayhashmap_str4.put(byte_array30, "");
    java.lang.String str37 = bytearrayhashmap_str2.put(byte_array30, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str39 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array42 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str43 = bytearrayhashmap_str39.get(byte_array42);
    byte[] byte_array49 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str50 = bytearrayhashmap_str39.get(byte_array49);
    boolean b51 = bytearrayhashmap_str39.isEmpty();
    java.util.List<byte[]> list_byte_array52 = bytearrayhashmap_str39.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str54 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array57 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str58 = bytearrayhashmap_str54.get(byte_array57);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str60 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str61 = bytearrayhashmap_str60.duplicate();
    byte[] byte_array68 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b69 = bytearrayhashmap_str60.containsKey(byte_array68);
    int i70 = bytearrayhashmap_str60.size();
    byte[] byte_array71 = new byte[] {  };
    boolean b72 = bytearrayhashmap_str60.containsKey(byte_array71);
    byte[] byte_array79 = new byte[] { (byte)10, (byte)0, (byte)100, (byte)-1, (byte)1, (byte)1 };
    java.lang.String str80 = bytearrayhashmap_str60.remove(byte_array79);
    java.lang.String str81 = bytearrayhashmap_str54.remove(byte_array79);
    java.lang.String str83 = bytearrayhashmap_str39.put(byte_array79, "");
    java.lang.String str84 = bytearrayhashmap_str2.get(byte_array79);
    byte[] byte_array85 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str86 = bytearrayhashmap_str2.get(byte_array85);
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
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str84);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array7 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str8 = bytearrayhashmap_str4.get(byte_array7);
    byte[] byte_array14 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str15 = bytearrayhashmap_str4.get(byte_array14);
    boolean b16 = bytearrayhashmap_str4.isEmpty();
    java.util.List<byte[]> list_byte_array17 = bytearrayhashmap_str4.keys();
    bytearrayhashmap_str4.clear();
    byte[] byte_array21 = new byte[] { (byte)0, (byte)10 };
    boolean b22 = bytearrayhashmap_str4.containsKey(byte_array21);
    java.lang.String str23 = bytearrayhashmap_str2.remove(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = bytearrayhashmap_str4.duplicate();
    byte[] byte_array12 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b13 = bytearrayhashmap_str4.containsKey(byte_array12);
    int i14 = bytearrayhashmap_str4.size();
    byte[] byte_array15 = new byte[] {  };
    boolean b16 = bytearrayhashmap_str4.containsKey(byte_array15);
    boolean b17 = bytearrayhashmap_str2.containsKey(byte_array15);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array22 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str23 = bytearrayhashmap_str19.get(byte_array22);
    byte[] byte_array29 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str30 = bytearrayhashmap_str19.get(byte_array29);
    java.lang.String str31 = bytearrayhashmap_str2.get(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str31);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    java.util.List<java.lang.String> list_str2 = bytearrayhashmap_str1.values();
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    byte[] byte_array9 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b10 = bytearrayhashmap_str1.containsKey(byte_array9);
    int i11 = bytearrayhashmap_str1.size();
    byte[] byte_array12 = new byte[] {  };
    boolean b13 = bytearrayhashmap_str1.containsKey(byte_array12);
    byte[] byte_array20 = new byte[] { (byte)10, (byte)0, (byte)100, (byte)-1, (byte)1, (byte)1 };
    java.lang.String str21 = bytearrayhashmap_str1.remove(byte_array20);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str23 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array26 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str27 = bytearrayhashmap_str23.get(byte_array26);
    java.util.List<java.lang.String> list_str28 = bytearrayhashmap_str23.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str31 = new ByteArrayHashMap<java.lang.String>((int)'a', (float)10L);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str33 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array36 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str37 = bytearrayhashmap_str33.get(byte_array36);
    byte[] byte_array43 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str44 = bytearrayhashmap_str33.get(byte_array43);
    boolean b45 = bytearrayhashmap_str33.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str47 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array50 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str51 = bytearrayhashmap_str47.get(byte_array50);
    byte[] byte_array57 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str58 = bytearrayhashmap_str47.get(byte_array57);
    java.lang.String str60 = bytearrayhashmap_str33.put(byte_array57, "");
    java.lang.String str62 = bytearrayhashmap_str31.put(byte_array57, "");
    boolean b63 = bytearrayhashmap_str23.containsKey(byte_array57);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str65 = new ByteArrayHashMap<java.lang.String>(0);
    java.util.List<java.lang.String> list_str66 = bytearrayhashmap_str65.values();
    byte[] byte_array68 = new byte[] { (byte)-1 };
    java.lang.String str69 = bytearrayhashmap_str65.get(byte_array68);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str71 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array74 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str75 = bytearrayhashmap_str71.get(byte_array74);
    byte[] byte_array81 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str82 = bytearrayhashmap_str71.get(byte_array81);
    boolean b83 = bytearrayhashmap_str71.isEmpty();
    java.util.List<byte[]> list_byte_array84 = bytearrayhashmap_str71.keys();
    bytearrayhashmap_str71.clear();
    byte[] byte_array88 = new byte[] { (byte)0, (byte)10 };
    boolean b89 = bytearrayhashmap_str71.containsKey(byte_array88);
    java.lang.String str90 = bytearrayhashmap_str65.remove(byte_array88);
    boolean b91 = bytearrayhashmap_str23.containsKey(byte_array88);
    java.lang.String str92 = bytearrayhashmap_str1.remove(byte_array88);
    bytearrayhashmap_str1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str92);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str4 = new ByteArrayHashMap<java.lang.String>(0);
    java.util.List<java.lang.String> list_str5 = bytearrayhashmap_str4.values();
    byte[] byte_array7 = new byte[] { (byte)-1 };
    java.lang.String str8 = bytearrayhashmap_str4.get(byte_array7);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str10 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array13 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str14 = bytearrayhashmap_str10.get(byte_array13);
    byte[] byte_array20 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str21 = bytearrayhashmap_str10.get(byte_array20);
    boolean b22 = bytearrayhashmap_str10.isEmpty();
    java.util.List<byte[]> list_byte_array23 = bytearrayhashmap_str10.keys();
    bytearrayhashmap_str10.clear();
    byte[] byte_array27 = new byte[] { (byte)0, (byte)10 };
    boolean b28 = bytearrayhashmap_str10.containsKey(byte_array27);
    java.lang.String str29 = bytearrayhashmap_str4.remove(byte_array27);
    boolean b30 = bytearrayhashmap_str2.containsKey(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str2.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array8 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str9 = bytearrayhashmap_str5.get(byte_array8);
    byte[] byte_array15 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str16 = bytearrayhashmap_str5.get(byte_array15);
    boolean b17 = bytearrayhashmap_str5.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array22 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str23 = bytearrayhashmap_str19.get(byte_array22);
    byte[] byte_array29 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str30 = bytearrayhashmap_str19.get(byte_array29);
    java.lang.String str32 = bytearrayhashmap_str5.put(byte_array29, "");
    java.lang.String str34 = bytearrayhashmap_str2.put(byte_array29, "");
    byte[] byte_array35 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str36 = bytearrayhashmap_str2.remove(byte_array35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    byte[] byte_array9 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b10 = bytearrayhashmap_str1.containsKey(byte_array9);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str12 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array15 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str16 = bytearrayhashmap_str12.get(byte_array15);
    java.util.List<java.lang.String> list_str17 = bytearrayhashmap_str12.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str20 = new ByteArrayHashMap<java.lang.String>((int)'a', (float)10L);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str22 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array25 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str26 = bytearrayhashmap_str22.get(byte_array25);
    byte[] byte_array32 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str33 = bytearrayhashmap_str22.get(byte_array32);
    boolean b34 = bytearrayhashmap_str22.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str36 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array39 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str40 = bytearrayhashmap_str36.get(byte_array39);
    byte[] byte_array46 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str47 = bytearrayhashmap_str36.get(byte_array46);
    java.lang.String str49 = bytearrayhashmap_str22.put(byte_array46, "");
    java.lang.String str51 = bytearrayhashmap_str20.put(byte_array46, "");
    boolean b52 = bytearrayhashmap_str12.containsKey(byte_array46);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str54 = new ByteArrayHashMap<java.lang.String>(0);
    java.util.List<java.lang.String> list_str55 = bytearrayhashmap_str54.values();
    byte[] byte_array57 = new byte[] { (byte)-1 };
    java.lang.String str58 = bytearrayhashmap_str54.get(byte_array57);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str60 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array63 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str64 = bytearrayhashmap_str60.get(byte_array63);
    byte[] byte_array70 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str71 = bytearrayhashmap_str60.get(byte_array70);
    boolean b72 = bytearrayhashmap_str60.isEmpty();
    java.util.List<byte[]> list_byte_array73 = bytearrayhashmap_str60.keys();
    bytearrayhashmap_str60.clear();
    byte[] byte_array77 = new byte[] { (byte)0, (byte)10 };
    boolean b78 = bytearrayhashmap_str60.containsKey(byte_array77);
    java.lang.String str79 = bytearrayhashmap_str54.remove(byte_array77);
    boolean b80 = bytearrayhashmap_str12.containsKey(byte_array77);
    java.lang.String str82 = bytearrayhashmap_str1.put(byte_array77, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str82);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(byte)0);
    int i2 = bytearrayhashmap_str1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(short)1);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_str1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str2.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str5.duplicate();
    byte[] byte_array13 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b14 = bytearrayhashmap_str5.containsKey(byte_array13);
    int i15 = bytearrayhashmap_str5.size();
    byte[] byte_array16 = new byte[] {  };
    boolean b17 = bytearrayhashmap_str5.containsKey(byte_array16);
    byte[] byte_array24 = new byte[] { (byte)10, (byte)0, (byte)100, (byte)-1, (byte)1, (byte)1 };
    java.lang.String str25 = bytearrayhashmap_str5.remove(byte_array24);
    java.lang.String str26 = bytearrayhashmap_str2.remove(byte_array24);
    bytearrayhashmap_str2.clear();
    java.util.List<byte[]> list_byte_array28 = bytearrayhashmap_str2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array28);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(byte)100);
    boolean b2 = bytearrayhashmap_str1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str2.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str6 = bytearrayhashmap_str5.duplicate();
    byte[] byte_array13 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b14 = bytearrayhashmap_str5.containsKey(byte_array13);
    int i15 = bytearrayhashmap_str5.size();
    byte[] byte_array16 = new byte[] {  };
    boolean b17 = bytearrayhashmap_str5.containsKey(byte_array16);
    byte[] byte_array24 = new byte[] { (byte)10, (byte)0, (byte)100, (byte)-1, (byte)1, (byte)1 };
    java.lang.String str25 = bytearrayhashmap_str5.remove(byte_array24);
    java.lang.String str26 = bytearrayhashmap_str2.remove(byte_array24);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str28 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array31 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str32 = bytearrayhashmap_str28.get(byte_array31);
    byte[] byte_array38 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str39 = bytearrayhashmap_str28.get(byte_array38);
    boolean b40 = bytearrayhashmap_str28.isEmpty();
    java.util.List<byte[]> list_byte_array41 = bytearrayhashmap_str28.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str43 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array46 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str47 = bytearrayhashmap_str43.get(byte_array46);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str49 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str50 = bytearrayhashmap_str49.duplicate();
    byte[] byte_array57 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b58 = bytearrayhashmap_str49.containsKey(byte_array57);
    int i59 = bytearrayhashmap_str49.size();
    byte[] byte_array60 = new byte[] {  };
    boolean b61 = bytearrayhashmap_str49.containsKey(byte_array60);
    byte[] byte_array68 = new byte[] { (byte)10, (byte)0, (byte)100, (byte)-1, (byte)1, (byte)1 };
    java.lang.String str69 = bytearrayhashmap_str49.remove(byte_array68);
    java.lang.String str70 = bytearrayhashmap_str43.remove(byte_array68);
    java.lang.String str72 = bytearrayhashmap_str28.put(byte_array68, "");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str74 = new ByteArrayHashMap<java.lang.String>(0);
    java.util.List<java.lang.String> list_str75 = bytearrayhashmap_str74.values();
    byte[] byte_array77 = new byte[] { (byte)-1 };
    java.lang.String str78 = bytearrayhashmap_str74.get(byte_array77);
    java.lang.String str79 = bytearrayhashmap_str28.remove(byte_array77);
    java.lang.String str81 = bytearrayhashmap_str2.put(byte_array77, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str81);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>((int)(byte)100);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_str1.keys();
    boolean b3 = bytearrayhashmap_str1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    java.util.List<java.lang.String> list_str6 = bytearrayhashmap_str1.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array11 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    byte[] byte_array18 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str19 = bytearrayhashmap_str8.get(byte_array18);
    boolean b20 = bytearrayhashmap_str8.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str22 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array25 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str26 = bytearrayhashmap_str22.get(byte_array25);
    byte[] byte_array32 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str33 = bytearrayhashmap_str22.get(byte_array32);
    java.lang.String str35 = bytearrayhashmap_str8.put(byte_array32, "");
    java.lang.String str37 = bytearrayhashmap_str1.put(byte_array32, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str38 = bytearrayhashmap_str1.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str38);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str2.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array8 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str9 = bytearrayhashmap_str5.get(byte_array8);
    byte[] byte_array15 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str16 = bytearrayhashmap_str5.get(byte_array15);
    boolean b17 = bytearrayhashmap_str5.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array22 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str23 = bytearrayhashmap_str19.get(byte_array22);
    byte[] byte_array29 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str30 = bytearrayhashmap_str19.get(byte_array29);
    java.lang.String str32 = bytearrayhashmap_str5.put(byte_array29, "");
    java.lang.String str34 = bytearrayhashmap_str2.put(byte_array29, "");
    java.util.List<byte[]> list_byte_array35 = bytearrayhashmap_str2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array35);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array4 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str5 = bytearrayhashmap_str1.get(byte_array4);
    java.util.List<java.lang.String> list_str6 = bytearrayhashmap_str1.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str8 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array11 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str12 = bytearrayhashmap_str8.get(byte_array11);
    byte[] byte_array18 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str19 = bytearrayhashmap_str8.get(byte_array18);
    boolean b20 = bytearrayhashmap_str8.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str22 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array25 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str26 = bytearrayhashmap_str22.get(byte_array25);
    byte[] byte_array32 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str33 = bytearrayhashmap_str22.get(byte_array32);
    java.lang.String str35 = bytearrayhashmap_str8.put(byte_array32, "");
    java.lang.String str37 = bytearrayhashmap_str1.put(byte_array32, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str39 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str40 = bytearrayhashmap_str39.duplicate();
    byte[] byte_array47 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b48 = bytearrayhashmap_str39.containsKey(byte_array47);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str50 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array53 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str54 = bytearrayhashmap_str50.get(byte_array53);
    java.lang.String str55 = bytearrayhashmap_str39.get(byte_array53);
    java.lang.String str57 = bytearrayhashmap_str1.put(byte_array53, "hi!");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str60 = new ByteArrayHashMap<java.lang.String>(0, (float)10);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str63 = new ByteArrayHashMap<java.lang.String>((int)'a', (float)10L);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str65 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str66 = bytearrayhashmap_str65.duplicate();
    byte[] byte_array73 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b74 = bytearrayhashmap_str65.containsKey(byte_array73);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str76 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array79 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str80 = bytearrayhashmap_str76.get(byte_array79);
    java.lang.String str81 = bytearrayhashmap_str65.get(byte_array79);
    java.lang.String str83 = bytearrayhashmap_str63.put(byte_array79, "");
    java.lang.String str84 = bytearrayhashmap_str60.remove(byte_array79);
    boolean b85 = bytearrayhashmap_str1.containsKey(byte_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(short)10, (float)(short)1);
    java.util.List<java.lang.String> list_str3 = bytearrayhashmap_str2.values();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str5 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array8 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str9 = bytearrayhashmap_str5.get(byte_array8);
    byte[] byte_array15 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str16 = bytearrayhashmap_str5.get(byte_array15);
    boolean b17 = bytearrayhashmap_str5.isEmpty();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str19 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array22 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str23 = bytearrayhashmap_str19.get(byte_array22);
    byte[] byte_array29 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str30 = bytearrayhashmap_str19.get(byte_array29);
    java.lang.String str32 = bytearrayhashmap_str5.put(byte_array29, "");
    java.lang.String str34 = bytearrayhashmap_str2.put(byte_array29, "");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str36 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array39 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str40 = bytearrayhashmap_str36.get(byte_array39);
    byte[] byte_array46 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str47 = bytearrayhashmap_str36.get(byte_array46);
    boolean b48 = bytearrayhashmap_str36.isEmpty();
    java.util.List<byte[]> list_byte_array49 = bytearrayhashmap_str36.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str51 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array54 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str55 = bytearrayhashmap_str51.get(byte_array54);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str57 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str58 = bytearrayhashmap_str57.duplicate();
    byte[] byte_array65 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b66 = bytearrayhashmap_str57.containsKey(byte_array65);
    int i67 = bytearrayhashmap_str57.size();
    byte[] byte_array68 = new byte[] {  };
    boolean b69 = bytearrayhashmap_str57.containsKey(byte_array68);
    byte[] byte_array76 = new byte[] { (byte)10, (byte)0, (byte)100, (byte)-1, (byte)1, (byte)1 };
    java.lang.String str77 = bytearrayhashmap_str57.remove(byte_array76);
    java.lang.String str78 = bytearrayhashmap_str51.remove(byte_array76);
    java.lang.String str80 = bytearrayhashmap_str36.put(byte_array76, "");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str82 = new ByteArrayHashMap<java.lang.String>(0);
    java.util.List<java.lang.String> list_str83 = bytearrayhashmap_str82.values();
    byte[] byte_array85 = new byte[] { (byte)-1 };
    java.lang.String str86 = bytearrayhashmap_str82.get(byte_array85);
    java.lang.String str87 = bytearrayhashmap_str36.remove(byte_array85);
    java.lang.String str88 = bytearrayhashmap_str2.remove(byte_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str88);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = new ByteArrayHashMap<java.lang.String>((int)(byte)-1, (float)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str1 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str2 = bytearrayhashmap_str1.duplicate();
    byte[] byte_array9 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b10 = bytearrayhashmap_str1.containsKey(byte_array9);
    int i11 = bytearrayhashmap_str1.size();
    byte[] byte_array12 = new byte[] {  };
    boolean b13 = bytearrayhashmap_str1.containsKey(byte_array12);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str14 = bytearrayhashmap_str1.duplicate();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str16 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array19 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str20 = bytearrayhashmap_str16.get(byte_array19);
    byte[] byte_array26 = new byte[] { (byte)0, (byte)0, (byte)100, (byte)10, (byte)10 };
    java.lang.String str27 = bytearrayhashmap_str16.get(byte_array26);
    boolean b28 = bytearrayhashmap_str16.isEmpty();
    java.util.List<byte[]> list_byte_array29 = bytearrayhashmap_str16.keys();
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str31 = new ByteArrayHashMap<java.lang.String>(0);
    byte[] byte_array34 = new byte[] { (byte)100, (byte)100 };
    java.lang.String str35 = bytearrayhashmap_str31.get(byte_array34);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str37 = new ByteArrayHashMap<java.lang.String>(0);
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str38 = bytearrayhashmap_str37.duplicate();
    byte[] byte_array45 = new byte[] { (byte)1, (byte)0, (byte)0, (byte)100, (byte)-1, (byte)100 };
    boolean b46 = bytearrayhashmap_str37.containsKey(byte_array45);
    int i47 = bytearrayhashmap_str37.size();
    byte[] byte_array48 = new byte[] {  };
    boolean b49 = bytearrayhashmap_str37.containsKey(byte_array48);
    byte[] byte_array56 = new byte[] { (byte)10, (byte)0, (byte)100, (byte)-1, (byte)1, (byte)1 };
    java.lang.String str57 = bytearrayhashmap_str37.remove(byte_array56);
    java.lang.String str58 = bytearrayhashmap_str31.remove(byte_array56);
    java.lang.String str60 = bytearrayhashmap_str16.put(byte_array56, "");
    ByteArrayHashMap<java.lang.String> bytearrayhashmap_str62 = new ByteArrayHashMap<java.lang.String>(0);
    java.util.List<java.lang.String> list_str63 = bytearrayhashmap_str62.values();
    byte[] byte_array65 = new byte[] { (byte)-1 };
    java.lang.String str66 = bytearrayhashmap_str62.get(byte_array65);
    java.lang.String str67 = bytearrayhashmap_str16.remove(byte_array65);
    java.lang.String str69 = bytearrayhashmap_str1.put(byte_array65, "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str69);

  }

}
