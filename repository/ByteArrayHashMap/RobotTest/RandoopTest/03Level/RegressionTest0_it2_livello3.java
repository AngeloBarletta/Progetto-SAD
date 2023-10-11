
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
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)-1);
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


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    boolean b7 = bytearrayhashmap_obj2.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj9 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array10 = new byte[] {  };
    boolean b11 = bytearrayhashmap_obj9.containsKey(byte_array10);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array10, (int)(byte)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj0 = new ByteArrayHashMap<java.lang.Object>();
    boolean b1 = bytearrayhashmap_obj0.isEmpty();
    boolean b2 = bytearrayhashmap_obj0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    java.util.List<java.lang.Object> list_obj4 = bytearrayhashmap_obj1.values();
    bytearrayhashmap_obj1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    int i5 = bytearrayhashmap_obj1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<java.lang.Object> list_obj16 = bytearrayhashmap_obj2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj16);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    boolean b7 = bytearrayhashmap_obj2.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj10 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj13 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array16 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj17 = bytearrayhashmap_obj13.remove(byte_array16);
    java.lang.Object obj19 = bytearrayhashmap_obj10.put(byte_array16, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj22 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj26 = bytearrayhashmap_obj22.remove(byte_array25);
    byte[] byte_array31 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj34 = bytearrayhashmap_obj22.get(byte_array31, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj35 = bytearrayhashmap_obj22.duplicate();
    java.lang.Object obj36 = bytearrayhashmap_obj2.put(byte_array16, (java.lang.Object)bytearrayhashmap_obj22);
    int i37 = bytearrayhashmap_obj22.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj15 = bytearrayhashmap_obj2.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj17 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array18 = new byte[] {  };
    boolean b19 = bytearrayhashmap_obj17.containsKey(byte_array18);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj22 = bytearrayhashmap_obj15.get(byte_array18, (int)(short)0, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    java.util.List<byte[]> list_byte_array3 = bytearrayhashmap_obj2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)(short)1, (float)1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((-1));
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


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = bytearrayhashmap_obj1.duplicate();
    int i6 = bytearrayhashmap_obj1.size();
    bytearrayhashmap_obj1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10, (float)'#');

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = bytearrayhashmap_obj1.duplicate();
    java.util.List<byte[]> list_byte_array6 = bytearrayhashmap_obj1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array6);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    byte[] byte_array21 = new byte[] { (byte)0, (byte)10, (byte)0, (byte)-1, (byte)-1 };
    boolean b22 = bytearrayhashmap_obj2.containsKey(byte_array21);
    boolean b23 = bytearrayhashmap_obj2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    bytearrayhashmap_obj2.clear();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj19 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array22 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj23 = bytearrayhashmap_obj19.remove(byte_array22);
    byte[] byte_array28 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj31 = bytearrayhashmap_obj19.get(byte_array28, (int)(short)0, 1);
    java.lang.Object obj32 = bytearrayhashmap_obj2.remove(byte_array28);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj33 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj36 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array39 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj40 = bytearrayhashmap_obj36.remove(byte_array39);
    byte[] byte_array45 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj48 = bytearrayhashmap_obj36.get(byte_array45, (int)(short)0, 1);
    java.lang.Object obj50 = bytearrayhashmap_obj33.put(byte_array45, (java.lang.Object)1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj53 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array56 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj57 = bytearrayhashmap_obj53.remove(byte_array56);
    java.lang.Object obj59 = bytearrayhashmap_obj33.put(byte_array56, (java.lang.Object)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj62 = bytearrayhashmap_obj2.get(byte_array56, (int)' ', (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)(byte)0, (float)100);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    boolean b7 = bytearrayhashmap_obj2.isEmpty();
    java.util.List<java.lang.Object> list_obj8 = bytearrayhashmap_obj2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj8);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(short)1);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj6 = bytearrayhashmap_obj5.duplicate();
    int i7 = bytearrayhashmap_obj6.size();
    java.util.List<java.lang.Object> list_obj8 = bytearrayhashmap_obj6.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj8);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    boolean b7 = bytearrayhashmap_obj2.isEmpty();
    bytearrayhashmap_obj2.clear();
    int i9 = bytearrayhashmap_obj2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj0 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj3 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array6 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj7 = bytearrayhashmap_obj3.remove(byte_array6);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj15 = bytearrayhashmap_obj3.get(byte_array12, (int)(short)0, 1);
    java.lang.Object obj17 = bytearrayhashmap_obj0.put(byte_array12, (java.lang.Object)1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj20 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array23 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj24 = bytearrayhashmap_obj20.remove(byte_array23);
    java.lang.Object obj26 = bytearrayhashmap_obj0.put(byte_array23, (java.lang.Object)1);
    bytearrayhashmap_obj0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)' ', 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj17 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj20 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array23 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj24 = bytearrayhashmap_obj20.remove(byte_array23);
    byte[] byte_array29 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj32 = bytearrayhashmap_obj20.get(byte_array29, (int)(short)0, 1);
    java.lang.Object obj34 = bytearrayhashmap_obj17.put(byte_array29, (java.lang.Object)1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj37 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array40 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj41 = bytearrayhashmap_obj37.remove(byte_array40);
    java.lang.Object obj43 = bytearrayhashmap_obj17.put(byte_array40, (java.lang.Object)1);
    java.lang.Object obj44 = bytearrayhashmap_obj2.remove(byte_array40);
    bytearrayhashmap_obj2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    int i17 = bytearrayhashmap_obj2.size();
    java.util.List<java.lang.Object> list_obj18 = bytearrayhashmap_obj2.values();
    boolean b19 = bytearrayhashmap_obj2.isEmpty();
    int i20 = bytearrayhashmap_obj2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(short)0);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    java.util.List<java.lang.Object> list_obj4 = bytearrayhashmap_obj1.values();
    java.util.List<java.lang.Object> list_obj5 = bytearrayhashmap_obj1.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj5);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)100);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    bytearrayhashmap_obj2.clear();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    int i17 = bytearrayhashmap_obj2.size();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj20 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array21 = new byte[] {  };
    java.lang.Object obj22 = bytearrayhashmap_obj20.remove(byte_array21);
    java.lang.Object obj23 = bytearrayhashmap_obj2.get(byte_array21);
    java.util.List<byte[]> list_byte_array24 = bytearrayhashmap_obj2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array24);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array8 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj9 = bytearrayhashmap_obj5.remove(byte_array8);
    java.lang.Object obj11 = bytearrayhashmap_obj2.put(byte_array8, (java.lang.Object)(short)100);
    java.util.List<java.lang.Object> list_obj12 = bytearrayhashmap_obj2.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj15 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj18 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array21 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj22 = bytearrayhashmap_obj18.remove(byte_array21);
    java.lang.Object obj24 = bytearrayhashmap_obj15.put(byte_array21, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj27 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array30 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj31 = bytearrayhashmap_obj27.remove(byte_array30);
    byte[] byte_array36 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj39 = bytearrayhashmap_obj27.get(byte_array36, (int)(short)0, 1);
    int i40 = bytearrayhashmap_obj27.size();
    byte[] byte_array46 = new byte[] { (byte)0, (byte)10, (byte)0, (byte)-1, (byte)-1 };
    boolean b47 = bytearrayhashmap_obj27.containsKey(byte_array46);
    java.lang.Object obj49 = bytearrayhashmap_obj15.put(byte_array46, (java.lang.Object)'a');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj52 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array55 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj56 = bytearrayhashmap_obj52.remove(byte_array55);
    byte[] byte_array61 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj64 = bytearrayhashmap_obj52.get(byte_array61, (int)(short)0, 1);
    int i65 = bytearrayhashmap_obj52.size();
    bytearrayhashmap_obj52.clear();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj69 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array72 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj73 = bytearrayhashmap_obj69.remove(byte_array72);
    byte[] byte_array78 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj81 = bytearrayhashmap_obj69.get(byte_array78, (int)(short)0, 1);
    java.lang.Object obj82 = bytearrayhashmap_obj52.remove(byte_array78);
    boolean b83 = bytearrayhashmap_obj15.containsKey(byte_array78);
    java.lang.Object obj84 = bytearrayhashmap_obj2.remove(byte_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj84);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array8 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj9 = bytearrayhashmap_obj5.remove(byte_array8);
    java.lang.Object obj11 = bytearrayhashmap_obj2.put(byte_array8, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj14 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array17 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj18 = bytearrayhashmap_obj14.remove(byte_array17);
    byte[] byte_array23 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj26 = bytearrayhashmap_obj14.get(byte_array23, (int)(short)0, 1);
    int i27 = bytearrayhashmap_obj14.size();
    byte[] byte_array33 = new byte[] { (byte)0, (byte)10, (byte)0, (byte)-1, (byte)-1 };
    boolean b34 = bytearrayhashmap_obj14.containsKey(byte_array33);
    java.lang.Object obj36 = bytearrayhashmap_obj2.put(byte_array33, (java.lang.Object)'a');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj39 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array42 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj43 = bytearrayhashmap_obj39.remove(byte_array42);
    byte[] byte_array48 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj51 = bytearrayhashmap_obj39.get(byte_array48, (int)(short)0, 1);
    int i52 = bytearrayhashmap_obj39.size();
    bytearrayhashmap_obj39.clear();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj56 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array59 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj60 = bytearrayhashmap_obj56.remove(byte_array59);
    byte[] byte_array65 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj68 = bytearrayhashmap_obj56.get(byte_array65, (int)(short)0, 1);
    java.lang.Object obj69 = bytearrayhashmap_obj39.remove(byte_array65);
    boolean b70 = bytearrayhashmap_obj2.containsKey(byte_array65);
    java.util.List<java.lang.Object> list_obj71 = bytearrayhashmap_obj2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj71);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj7 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array10 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj11 = bytearrayhashmap_obj7.remove(byte_array10);
    boolean b12 = bytearrayhashmap_obj7.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj15 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array18 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj19 = bytearrayhashmap_obj15.remove(byte_array18);
    byte[] byte_array24 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj27 = bytearrayhashmap_obj15.get(byte_array24, (int)(short)0, 1);
    java.lang.Object obj28 = bytearrayhashmap_obj7.remove(byte_array24);
    java.lang.Object obj29 = bytearrayhashmap_obj4.remove(byte_array24);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj32 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array35 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj36 = bytearrayhashmap_obj32.remove(byte_array35);
    boolean b37 = bytearrayhashmap_obj32.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj40 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj43 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array46 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj47 = bytearrayhashmap_obj43.remove(byte_array46);
    java.lang.Object obj49 = bytearrayhashmap_obj40.put(byte_array46, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj52 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array55 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj56 = bytearrayhashmap_obj52.remove(byte_array55);
    byte[] byte_array61 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj64 = bytearrayhashmap_obj52.get(byte_array61, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj65 = bytearrayhashmap_obj52.duplicate();
    java.lang.Object obj66 = bytearrayhashmap_obj32.put(byte_array46, (java.lang.Object)bytearrayhashmap_obj52);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj67 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj70 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array73 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj74 = bytearrayhashmap_obj70.remove(byte_array73);
    byte[] byte_array79 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj82 = bytearrayhashmap_obj70.get(byte_array79, (int)(short)0, 1);
    java.lang.Object obj84 = bytearrayhashmap_obj67.put(byte_array79, (java.lang.Object)1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj87 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array90 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj91 = bytearrayhashmap_obj87.remove(byte_array90);
    java.lang.Object obj93 = bytearrayhashmap_obj67.put(byte_array90, (java.lang.Object)1);
    java.lang.Object obj94 = bytearrayhashmap_obj32.get(byte_array90);
    java.lang.Object obj95 = bytearrayhashmap_obj4.get(byte_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj95);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    bytearrayhashmap_obj2.clear();
    byte[] byte_array6 = new byte[] { (byte)100, (byte)0 };
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj9 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array12 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj13 = bytearrayhashmap_obj9.remove(byte_array12);
    byte[] byte_array18 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj21 = bytearrayhashmap_obj9.get(byte_array18, (int)(short)0, 1);
    int i22 = bytearrayhashmap_obj9.size();
    java.util.List<byte[]> list_byte_array23 = bytearrayhashmap_obj9.keys();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj25 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array26 = new byte[] {  };
    boolean b27 = bytearrayhashmap_obj25.containsKey(byte_array26);
    java.lang.Object obj28 = bytearrayhashmap_obj9.get(byte_array26);
    boolean b29 = bytearrayhashmap_obj9.isEmpty();
    java.lang.Object obj30 = bytearrayhashmap_obj2.put(byte_array6, (java.lang.Object)bytearrayhashmap_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array8 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj9 = bytearrayhashmap_obj5.remove(byte_array8);
    java.lang.Object obj11 = bytearrayhashmap_obj2.put(byte_array8, (java.lang.Object)(short)100);
    java.util.List<java.lang.Object> list_obj12 = bytearrayhashmap_obj2.values();
    java.util.List<java.lang.Object> list_obj13 = bytearrayhashmap_obj2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj13);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    boolean b7 = bytearrayhashmap_obj2.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj10 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj13 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array16 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj17 = bytearrayhashmap_obj13.remove(byte_array16);
    java.lang.Object obj19 = bytearrayhashmap_obj10.put(byte_array16, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj22 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj26 = bytearrayhashmap_obj22.remove(byte_array25);
    byte[] byte_array31 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj34 = bytearrayhashmap_obj22.get(byte_array31, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj35 = bytearrayhashmap_obj22.duplicate();
    java.lang.Object obj36 = bytearrayhashmap_obj2.put(byte_array16, (java.lang.Object)bytearrayhashmap_obj22);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj37 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj40 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array43 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj44 = bytearrayhashmap_obj40.remove(byte_array43);
    byte[] byte_array49 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj52 = bytearrayhashmap_obj40.get(byte_array49, (int)(short)0, 1);
    java.lang.Object obj54 = bytearrayhashmap_obj37.put(byte_array49, (java.lang.Object)1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj57 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array60 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj61 = bytearrayhashmap_obj57.remove(byte_array60);
    java.lang.Object obj63 = bytearrayhashmap_obj37.put(byte_array60, (java.lang.Object)1);
    java.lang.Object obj64 = bytearrayhashmap_obj2.get(byte_array60);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj67 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array70 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj71 = bytearrayhashmap_obj67.remove(byte_array70);
    byte[] byte_array76 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj79 = bytearrayhashmap_obj67.get(byte_array76, (int)(short)0, 1);
    int i80 = bytearrayhashmap_obj67.size();
    java.util.List<byte[]> list_byte_array81 = bytearrayhashmap_obj67.keys();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj83 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array84 = new byte[] {  };
    boolean b85 = bytearrayhashmap_obj83.containsKey(byte_array84);
    java.lang.Object obj86 = bytearrayhashmap_obj67.get(byte_array84);
    java.lang.Object obj87 = bytearrayhashmap_obj2.remove(byte_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj87);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    java.util.List<java.lang.Object> list_obj17 = bytearrayhashmap_obj2.values();
    int i18 = bytearrayhashmap_obj2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)(short)0, (float)'4');

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    boolean b7 = bytearrayhashmap_obj2.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj10 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj13 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array16 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj17 = bytearrayhashmap_obj13.remove(byte_array16);
    java.lang.Object obj19 = bytearrayhashmap_obj10.put(byte_array16, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj22 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj26 = bytearrayhashmap_obj22.remove(byte_array25);
    byte[] byte_array31 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj34 = bytearrayhashmap_obj22.get(byte_array31, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj35 = bytearrayhashmap_obj22.duplicate();
    java.lang.Object obj36 = bytearrayhashmap_obj2.put(byte_array16, (java.lang.Object)bytearrayhashmap_obj22);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj37 = bytearrayhashmap_obj2.duplicate();
    bytearrayhashmap_obj37.clear();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj40 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array41 = new byte[] {  };
    boolean b42 = bytearrayhashmap_obj40.containsKey(byte_array41);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj45 = bytearrayhashmap_obj37.get(byte_array41, (int)(short)1, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    boolean b7 = bytearrayhashmap_obj2.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj10 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj13 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array16 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj17 = bytearrayhashmap_obj13.remove(byte_array16);
    java.lang.Object obj19 = bytearrayhashmap_obj10.put(byte_array16, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj22 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj26 = bytearrayhashmap_obj22.remove(byte_array25);
    byte[] byte_array31 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj34 = bytearrayhashmap_obj22.get(byte_array31, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj35 = bytearrayhashmap_obj22.duplicate();
    java.lang.Object obj36 = bytearrayhashmap_obj2.put(byte_array16, (java.lang.Object)bytearrayhashmap_obj22);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj37 = bytearrayhashmap_obj2.duplicate();
    boolean b38 = bytearrayhashmap_obj2.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj39 = bytearrayhashmap_obj2.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj41 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array42 = new byte[] {  };
    boolean b43 = bytearrayhashmap_obj41.containsKey(byte_array42);
    boolean b44 = bytearrayhashmap_obj2.containsKey(byte_array42);
    java.util.List<java.lang.Object> list_obj45 = bytearrayhashmap_obj2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj45);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)(byte)0, (float)(short)100);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    int i17 = bytearrayhashmap_obj2.size();
    java.util.List<java.lang.Object> list_obj18 = bytearrayhashmap_obj2.values();
    boolean b19 = bytearrayhashmap_obj2.isEmpty();
    bytearrayhashmap_obj2.clear();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj23 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array26 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj27 = bytearrayhashmap_obj23.remove(byte_array26);
    byte[] byte_array32 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj35 = bytearrayhashmap_obj23.get(byte_array32, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj36 = bytearrayhashmap_obj23.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj37 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj40 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array43 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj44 = bytearrayhashmap_obj40.remove(byte_array43);
    byte[] byte_array49 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj52 = bytearrayhashmap_obj40.get(byte_array49, (int)(short)0, 1);
    java.lang.Object obj54 = bytearrayhashmap_obj37.put(byte_array49, (java.lang.Object)1);
    java.util.List<java.lang.Object> list_obj55 = bytearrayhashmap_obj37.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj58 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array61 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj62 = bytearrayhashmap_obj58.remove(byte_array61);
    byte[] byte_array67 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj70 = bytearrayhashmap_obj58.get(byte_array67, (int)(short)0, 1);
    int i71 = bytearrayhashmap_obj58.size();
    byte[] byte_array77 = new byte[] { (byte)0, (byte)10, (byte)0, (byte)-1, (byte)-1 };
    boolean b78 = bytearrayhashmap_obj58.containsKey(byte_array77);
    java.lang.Object obj80 = bytearrayhashmap_obj37.put(byte_array77, (java.lang.Object)(short)-1);
    boolean b81 = bytearrayhashmap_obj23.containsKey(byte_array77);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj84 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array87 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj88 = bytearrayhashmap_obj84.remove(byte_array87);
    java.lang.Object obj89 = bytearrayhashmap_obj23.remove(byte_array87);
    java.lang.Object obj92 = bytearrayhashmap_obj2.get(byte_array87, (int)(short)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj92);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)'a');

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj6 = bytearrayhashmap_obj5.duplicate();
    boolean b7 = bytearrayhashmap_obj5.isEmpty();
    boolean b8 = bytearrayhashmap_obj5.isEmpty();
    java.util.List<java.lang.Object> list_obj9 = bytearrayhashmap_obj5.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj9);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj0 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj3 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array6 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj7 = bytearrayhashmap_obj3.remove(byte_array6);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj15 = bytearrayhashmap_obj3.get(byte_array12, (int)(short)0, 1);
    java.lang.Object obj17 = bytearrayhashmap_obj0.put(byte_array12, (java.lang.Object)1);
    java.util.List<java.lang.Object> list_obj18 = bytearrayhashmap_obj0.values();
    java.util.List<java.lang.Object> list_obj19 = bytearrayhashmap_obj0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj19);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    int i17 = bytearrayhashmap_obj2.size();
    java.util.List<java.lang.Object> list_obj18 = bytearrayhashmap_obj2.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj20 = new ByteArrayHashMap<java.lang.Object>((int)'#');
    int i21 = bytearrayhashmap_obj20.size();
    byte[] byte_array25 = new byte[] { (byte)0, (byte)100, (byte)1 };
    java.lang.Object obj26 = bytearrayhashmap_obj20.get(byte_array25);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj28 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array29 = new byte[] {  };
    boolean b30 = bytearrayhashmap_obj28.containsKey(byte_array29);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj31 = bytearrayhashmap_obj28.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj34 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array37 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj38 = bytearrayhashmap_obj34.remove(byte_array37);
    boolean b39 = bytearrayhashmap_obj34.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj42 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array45 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj46 = bytearrayhashmap_obj42.remove(byte_array45);
    byte[] byte_array51 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj54 = bytearrayhashmap_obj42.get(byte_array51, (int)(short)0, 1);
    java.lang.Object obj55 = bytearrayhashmap_obj34.remove(byte_array51);
    java.lang.Object obj56 = bytearrayhashmap_obj31.remove(byte_array51);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj59 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array62 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj63 = bytearrayhashmap_obj59.remove(byte_array62);
    byte[] byte_array68 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj71 = bytearrayhashmap_obj59.get(byte_array68, (int)(short)0, 1);
    int i72 = bytearrayhashmap_obj59.size();
    java.util.List<byte[]> list_byte_array73 = bytearrayhashmap_obj59.keys();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj75 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array76 = new byte[] {  };
    boolean b77 = bytearrayhashmap_obj75.containsKey(byte_array76);
    java.lang.Object obj78 = bytearrayhashmap_obj59.get(byte_array76);
    java.lang.Object obj79 = bytearrayhashmap_obj20.put(byte_array51, (java.lang.Object)byte_array76);
    boolean b80 = bytearrayhashmap_obj2.containsKey(byte_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>(1, (float)(byte)10);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>(10, 100.0f);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    bytearrayhashmap_obj2.clear();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj2.duplicate();
    java.util.List<java.lang.Object> list_obj5 = bytearrayhashmap_obj2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj5);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj18 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array21 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj22 = bytearrayhashmap_obj18.remove(byte_array21);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj25 = bytearrayhashmap_obj2.get(byte_array21, (-1), 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    bytearrayhashmap_obj2.clear();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj7 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array10 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj11 = bytearrayhashmap_obj7.remove(byte_array10);
    byte[] byte_array16 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj19 = bytearrayhashmap_obj7.get(byte_array16, (int)(short)0, 1);
    java.lang.Object obj21 = bytearrayhashmap_obj4.put(byte_array16, (java.lang.Object)1);
    java.util.List<java.lang.Object> list_obj22 = bytearrayhashmap_obj4.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj25 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array28 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj29 = bytearrayhashmap_obj25.remove(byte_array28);
    boolean b30 = bytearrayhashmap_obj25.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj33 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj36 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array39 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj40 = bytearrayhashmap_obj36.remove(byte_array39);
    java.lang.Object obj42 = bytearrayhashmap_obj33.put(byte_array39, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj45 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array48 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj49 = bytearrayhashmap_obj45.remove(byte_array48);
    byte[] byte_array54 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj57 = bytearrayhashmap_obj45.get(byte_array54, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj58 = bytearrayhashmap_obj45.duplicate();
    java.lang.Object obj59 = bytearrayhashmap_obj25.put(byte_array39, (java.lang.Object)bytearrayhashmap_obj45);
    java.lang.Object obj61 = bytearrayhashmap_obj4.put(byte_array39, (java.lang.Object)10);
    java.lang.Object obj62 = bytearrayhashmap_obj2.remove(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj62);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    int i17 = bytearrayhashmap_obj2.size();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj18 = bytearrayhashmap_obj2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj18);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>(10);
    byte[] byte_array2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = bytearrayhashmap_obj1.remove(byte_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>(10, (float)(byte)1);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)(byte)100, (float)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array8 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj9 = bytearrayhashmap_obj5.remove(byte_array8);
    java.lang.Object obj11 = bytearrayhashmap_obj2.put(byte_array8, (java.lang.Object)(short)100);
    java.util.List<java.lang.Object> list_obj12 = bytearrayhashmap_obj2.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj13 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj16 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array19 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj20 = bytearrayhashmap_obj16.remove(byte_array19);
    byte[] byte_array25 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj28 = bytearrayhashmap_obj16.get(byte_array25, (int)(short)0, 1);
    java.lang.Object obj30 = bytearrayhashmap_obj13.put(byte_array25, (java.lang.Object)1);
    java.util.List<java.lang.Object> list_obj31 = bytearrayhashmap_obj13.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj34 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array37 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj38 = bytearrayhashmap_obj34.remove(byte_array37);
    boolean b39 = bytearrayhashmap_obj34.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj42 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj45 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array48 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj49 = bytearrayhashmap_obj45.remove(byte_array48);
    java.lang.Object obj51 = bytearrayhashmap_obj42.put(byte_array48, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj54 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array57 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj58 = bytearrayhashmap_obj54.remove(byte_array57);
    byte[] byte_array63 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj66 = bytearrayhashmap_obj54.get(byte_array63, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj67 = bytearrayhashmap_obj54.duplicate();
    java.lang.Object obj68 = bytearrayhashmap_obj34.put(byte_array48, (java.lang.Object)bytearrayhashmap_obj54);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj71 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array74 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj75 = bytearrayhashmap_obj71.remove(byte_array74);
    byte[] byte_array80 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj83 = bytearrayhashmap_obj71.get(byte_array80, (int)(short)0, 1);
    java.lang.Object obj84 = bytearrayhashmap_obj13.put(byte_array48, (java.lang.Object)bytearrayhashmap_obj71);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj87 = bytearrayhashmap_obj2.get(byte_array48, (int)(short)-1, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NegativeArraySizeException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj84);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    int i17 = bytearrayhashmap_obj2.size();
    java.util.List<java.lang.Object> list_obj18 = bytearrayhashmap_obj2.values();
    boolean b19 = bytearrayhashmap_obj2.isEmpty();
    bytearrayhashmap_obj2.clear();
    java.util.List<java.lang.Object> list_obj21 = bytearrayhashmap_obj2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj21);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj0 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj3 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array6 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj7 = bytearrayhashmap_obj3.remove(byte_array6);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj15 = bytearrayhashmap_obj3.get(byte_array12, (int)(short)0, 1);
    java.lang.Object obj17 = bytearrayhashmap_obj0.put(byte_array12, (java.lang.Object)1);
    java.util.List<java.lang.Object> list_obj18 = bytearrayhashmap_obj0.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj21 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array24 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj25 = bytearrayhashmap_obj21.remove(byte_array24);
    boolean b26 = bytearrayhashmap_obj21.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj29 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj32 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array35 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj36 = bytearrayhashmap_obj32.remove(byte_array35);
    java.lang.Object obj38 = bytearrayhashmap_obj29.put(byte_array35, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj41 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array44 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj45 = bytearrayhashmap_obj41.remove(byte_array44);
    byte[] byte_array50 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj53 = bytearrayhashmap_obj41.get(byte_array50, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj54 = bytearrayhashmap_obj41.duplicate();
    java.lang.Object obj55 = bytearrayhashmap_obj21.put(byte_array35, (java.lang.Object)bytearrayhashmap_obj41);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj58 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array61 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj62 = bytearrayhashmap_obj58.remove(byte_array61);
    byte[] byte_array67 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj70 = bytearrayhashmap_obj58.get(byte_array67, (int)(short)0, 1);
    java.lang.Object obj71 = bytearrayhashmap_obj0.put(byte_array35, (java.lang.Object)bytearrayhashmap_obj58);
    java.util.List<java.lang.Object> list_obj72 = bytearrayhashmap_obj0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj72);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = bytearrayhashmap_obj1.duplicate();
    int i6 = bytearrayhashmap_obj1.size();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj9 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array12 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj13 = bytearrayhashmap_obj9.remove(byte_array12);
    byte[] byte_array18 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj21 = bytearrayhashmap_obj9.get(byte_array18, (int)(short)0, 1);
    int i22 = bytearrayhashmap_obj9.size();
    java.util.List<byte[]> list_byte_array23 = bytearrayhashmap_obj9.keys();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj25 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array26 = new byte[] {  };
    boolean b27 = bytearrayhashmap_obj25.containsKey(byte_array26);
    java.lang.Object obj28 = bytearrayhashmap_obj9.get(byte_array26);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj31 = bytearrayhashmap_obj1.get(byte_array26, (int)'a', (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>(10);
    java.util.List<byte[]> list_byte_array2 = bytearrayhashmap_obj1.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array2);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    bytearrayhashmap_obj2.clear();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj7 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array10 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj11 = bytearrayhashmap_obj7.remove(byte_array10);
    byte[] byte_array16 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj19 = bytearrayhashmap_obj7.get(byte_array16, (int)(short)0, 1);
    java.lang.Object obj21 = bytearrayhashmap_obj4.put(byte_array16, (java.lang.Object)1);
    java.util.List<java.lang.Object> list_obj22 = bytearrayhashmap_obj4.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj25 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array28 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj29 = bytearrayhashmap_obj25.remove(byte_array28);
    byte[] byte_array34 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj37 = bytearrayhashmap_obj25.get(byte_array34, (int)(short)0, 1);
    int i38 = bytearrayhashmap_obj25.size();
    byte[] byte_array44 = new byte[] { (byte)0, (byte)10, (byte)0, (byte)-1, (byte)-1 };
    boolean b45 = bytearrayhashmap_obj25.containsKey(byte_array44);
    java.lang.Object obj47 = bytearrayhashmap_obj4.put(byte_array44, (java.lang.Object)(short)-1);
    boolean b48 = bytearrayhashmap_obj2.containsKey(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    bytearrayhashmap_obj2.clear();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj8 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj11 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array14 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj15 = bytearrayhashmap_obj11.remove(byte_array14);
    byte[] byte_array20 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj23 = bytearrayhashmap_obj11.get(byte_array20, (int)(short)0, 1);
    java.lang.Object obj25 = bytearrayhashmap_obj8.put(byte_array20, (java.lang.Object)1);
    java.util.List<java.lang.Object> list_obj26 = bytearrayhashmap_obj8.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj29 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array32 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj33 = bytearrayhashmap_obj29.remove(byte_array32);
    boolean b34 = bytearrayhashmap_obj29.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj37 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj40 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array43 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj44 = bytearrayhashmap_obj40.remove(byte_array43);
    java.lang.Object obj46 = bytearrayhashmap_obj37.put(byte_array43, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj49 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array52 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj53 = bytearrayhashmap_obj49.remove(byte_array52);
    byte[] byte_array58 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj61 = bytearrayhashmap_obj49.get(byte_array58, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj62 = bytearrayhashmap_obj49.duplicate();
    java.lang.Object obj63 = bytearrayhashmap_obj29.put(byte_array43, (java.lang.Object)bytearrayhashmap_obj49);
    java.lang.Object obj65 = bytearrayhashmap_obj8.put(byte_array43, (java.lang.Object)10);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj68 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array71 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj72 = bytearrayhashmap_obj68.remove(byte_array71);
    byte[] byte_array77 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj80 = bytearrayhashmap_obj68.get(byte_array77, (int)(short)0, 1);
    bytearrayhashmap_obj68.clear();
    bytearrayhashmap_obj68.clear();
    java.lang.Object obj83 = bytearrayhashmap_obj2.put(byte_array43, (java.lang.Object)bytearrayhashmap_obj68);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj86 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array89 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj90 = bytearrayhashmap_obj86.remove(byte_array89);
    java.lang.Object obj91 = bytearrayhashmap_obj2.get(byte_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj91);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj8 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj12 = bytearrayhashmap_obj8.remove(byte_array11);
    byte[] byte_array17 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj20 = bytearrayhashmap_obj8.get(byte_array17, (int)(short)0, 1);
    java.lang.Object obj22 = bytearrayhashmap_obj5.put(byte_array17, (java.lang.Object)1);
    java.lang.Object obj23 = bytearrayhashmap_obj1.remove(byte_array17);
    bytearrayhashmap_obj1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    boolean b7 = bytearrayhashmap_obj2.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj10 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj13 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array16 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj17 = bytearrayhashmap_obj13.remove(byte_array16);
    java.lang.Object obj19 = bytearrayhashmap_obj10.put(byte_array16, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj22 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj26 = bytearrayhashmap_obj22.remove(byte_array25);
    byte[] byte_array31 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj34 = bytearrayhashmap_obj22.get(byte_array31, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj35 = bytearrayhashmap_obj22.duplicate();
    java.lang.Object obj36 = bytearrayhashmap_obj2.put(byte_array16, (java.lang.Object)bytearrayhashmap_obj22);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj37 = bytearrayhashmap_obj2.duplicate();
    bytearrayhashmap_obj37.clear();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj39 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj42 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array45 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj46 = bytearrayhashmap_obj42.remove(byte_array45);
    byte[] byte_array51 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj54 = bytearrayhashmap_obj42.get(byte_array51, (int)(short)0, 1);
    java.lang.Object obj56 = bytearrayhashmap_obj39.put(byte_array51, (java.lang.Object)1);
    java.util.List<java.lang.Object> list_obj57 = bytearrayhashmap_obj39.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj60 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array63 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj64 = bytearrayhashmap_obj60.remove(byte_array63);
    byte[] byte_array69 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj72 = bytearrayhashmap_obj60.get(byte_array69, (int)(short)0, 1);
    int i73 = bytearrayhashmap_obj60.size();
    byte[] byte_array79 = new byte[] { (byte)0, (byte)10, (byte)0, (byte)-1, (byte)-1 };
    boolean b80 = bytearrayhashmap_obj60.containsKey(byte_array79);
    java.lang.Object obj82 = bytearrayhashmap_obj39.put(byte_array79, (java.lang.Object)(short)-1);
    java.lang.Object obj83 = bytearrayhashmap_obj37.get(byte_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj83);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj7 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    bytearrayhashmap_obj7.clear();
    java.util.List<byte[]> list_byte_array9 = bytearrayhashmap_obj7.keys();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj12 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array15 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj16 = bytearrayhashmap_obj12.remove(byte_array15);
    byte[] byte_array21 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj24 = bytearrayhashmap_obj12.get(byte_array21, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj25 = bytearrayhashmap_obj12.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj27 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array28 = new byte[] {  };
    boolean b29 = bytearrayhashmap_obj27.containsKey(byte_array28);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj30 = bytearrayhashmap_obj27.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj33 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array36 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj37 = bytearrayhashmap_obj33.remove(byte_array36);
    boolean b38 = bytearrayhashmap_obj33.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj41 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array44 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj45 = bytearrayhashmap_obj41.remove(byte_array44);
    byte[] byte_array50 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj53 = bytearrayhashmap_obj41.get(byte_array50, (int)(short)0, 1);
    java.lang.Object obj54 = bytearrayhashmap_obj33.remove(byte_array50);
    java.lang.Object obj55 = bytearrayhashmap_obj30.remove(byte_array50);
    java.lang.Object obj56 = bytearrayhashmap_obj25.remove(byte_array50);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj59 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj62 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array65 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj66 = bytearrayhashmap_obj62.remove(byte_array65);
    java.lang.Object obj68 = bytearrayhashmap_obj59.put(byte_array65, (java.lang.Object)(short)100);
    java.lang.Object obj69 = bytearrayhashmap_obj25.remove(byte_array65);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj71 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array72 = new byte[] {  };
    boolean b73 = bytearrayhashmap_obj71.containsKey(byte_array72);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj74 = bytearrayhashmap_obj71.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj75 = bytearrayhashmap_obj71.duplicate();
    java.lang.Object obj76 = bytearrayhashmap_obj7.put(byte_array65, (java.lang.Object)bytearrayhashmap_obj75);
    java.lang.Object obj77 = bytearrayhashmap_obj1.get(byte_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj77);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj16 = bytearrayhashmap_obj2.duplicate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj16);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)(byte)1, (float)1L);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    boolean b7 = bytearrayhashmap_obj2.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj10 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj13 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array16 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj17 = bytearrayhashmap_obj13.remove(byte_array16);
    java.lang.Object obj19 = bytearrayhashmap_obj10.put(byte_array16, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj22 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj26 = bytearrayhashmap_obj22.remove(byte_array25);
    byte[] byte_array31 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj34 = bytearrayhashmap_obj22.get(byte_array31, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj35 = bytearrayhashmap_obj22.duplicate();
    java.lang.Object obj36 = bytearrayhashmap_obj2.put(byte_array16, (java.lang.Object)bytearrayhashmap_obj22);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj37 = bytearrayhashmap_obj2.duplicate();
    boolean b38 = bytearrayhashmap_obj2.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj39 = bytearrayhashmap_obj2.duplicate();
    int i40 = bytearrayhashmap_obj2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>(10, (float)0L);
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


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    boolean b5 = bytearrayhashmap_obj1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>(0);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj3 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array4 = new byte[] {  };
    boolean b5 = bytearrayhashmap_obj3.containsKey(byte_array4);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj6 = bytearrayhashmap_obj3.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj9 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array12 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj13 = bytearrayhashmap_obj9.remove(byte_array12);
    boolean b14 = bytearrayhashmap_obj9.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj17 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array20 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj21 = bytearrayhashmap_obj17.remove(byte_array20);
    byte[] byte_array26 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj29 = bytearrayhashmap_obj17.get(byte_array26, (int)(short)0, 1);
    java.lang.Object obj30 = bytearrayhashmap_obj9.remove(byte_array26);
    java.lang.Object obj31 = bytearrayhashmap_obj6.remove(byte_array26);
    java.lang.Object obj32 = null;
    java.lang.Object obj33 = bytearrayhashmap_obj1.put(byte_array26, obj32);
    boolean b34 = bytearrayhashmap_obj1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    bytearrayhashmap_obj2.clear();
    bytearrayhashmap_obj2.clear();
    java.util.List<byte[]> list_byte_array17 = bytearrayhashmap_obj2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array17);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    java.util.List<java.lang.Object> list_obj17 = bytearrayhashmap_obj2.values();
    java.util.List<java.lang.Object> list_obj18 = bytearrayhashmap_obj2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj18);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    byte[] byte_array21 = new byte[] { (byte)0, (byte)10, (byte)0, (byte)-1, (byte)-1 };
    boolean b22 = bytearrayhashmap_obj2.containsKey(byte_array21);
    java.util.List<byte[]> list_byte_array23 = bytearrayhashmap_obj2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array23);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = bytearrayhashmap_obj1.duplicate();
    bytearrayhashmap_obj1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj5);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj0 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj3 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array6 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj7 = bytearrayhashmap_obj3.remove(byte_array6);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj15 = bytearrayhashmap_obj3.get(byte_array12, (int)(short)0, 1);
    int i16 = bytearrayhashmap_obj3.size();
    byte[] byte_array22 = new byte[] { (byte)0, (byte)10, (byte)0, (byte)-1, (byte)-1 };
    boolean b23 = bytearrayhashmap_obj3.containsKey(byte_array22);
    java.lang.Object obj24 = bytearrayhashmap_obj0.remove(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    bytearrayhashmap_obj2.clear();
    int i16 = bytearrayhashmap_obj2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test80"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array8 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj9 = bytearrayhashmap_obj5.remove(byte_array8);
    java.lang.Object obj11 = bytearrayhashmap_obj2.put(byte_array8, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj14 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array17 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj18 = bytearrayhashmap_obj14.remove(byte_array17);
    byte[] byte_array23 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj26 = bytearrayhashmap_obj14.get(byte_array23, (int)(short)0, 1);
    int i27 = bytearrayhashmap_obj14.size();
    byte[] byte_array33 = new byte[] { (byte)0, (byte)10, (byte)0, (byte)-1, (byte)-1 };
    boolean b34 = bytearrayhashmap_obj14.containsKey(byte_array33);
    java.lang.Object obj36 = bytearrayhashmap_obj2.put(byte_array33, (java.lang.Object)'a');
    int i37 = bytearrayhashmap_obj2.size();
    bytearrayhashmap_obj2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test81"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    bytearrayhashmap_obj2.clear();
    java.util.List<byte[]> list_byte_array4 = bytearrayhashmap_obj2.keys();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj7 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array10 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj11 = bytearrayhashmap_obj7.remove(byte_array10);
    byte[] byte_array16 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj19 = bytearrayhashmap_obj7.get(byte_array16, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj20 = bytearrayhashmap_obj7.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj22 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array23 = new byte[] {  };
    boolean b24 = bytearrayhashmap_obj22.containsKey(byte_array23);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj25 = bytearrayhashmap_obj22.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj28 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array31 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj32 = bytearrayhashmap_obj28.remove(byte_array31);
    boolean b33 = bytearrayhashmap_obj28.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj36 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array39 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj40 = bytearrayhashmap_obj36.remove(byte_array39);
    byte[] byte_array45 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj48 = bytearrayhashmap_obj36.get(byte_array45, (int)(short)0, 1);
    java.lang.Object obj49 = bytearrayhashmap_obj28.remove(byte_array45);
    java.lang.Object obj50 = bytearrayhashmap_obj25.remove(byte_array45);
    java.lang.Object obj51 = bytearrayhashmap_obj20.remove(byte_array45);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj54 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj57 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array60 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj61 = bytearrayhashmap_obj57.remove(byte_array60);
    java.lang.Object obj63 = bytearrayhashmap_obj54.put(byte_array60, (java.lang.Object)(short)100);
    java.lang.Object obj64 = bytearrayhashmap_obj20.remove(byte_array60);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj66 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array67 = new byte[] {  };
    boolean b68 = bytearrayhashmap_obj66.containsKey(byte_array67);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj69 = bytearrayhashmap_obj66.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj70 = bytearrayhashmap_obj66.duplicate();
    java.lang.Object obj71 = bytearrayhashmap_obj2.put(byte_array60, (java.lang.Object)bytearrayhashmap_obj70);
    bytearrayhashmap_obj70.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj71);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test82"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj15 = bytearrayhashmap_obj2.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj16 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj19 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array22 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj23 = bytearrayhashmap_obj19.remove(byte_array22);
    byte[] byte_array28 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj31 = bytearrayhashmap_obj19.get(byte_array28, (int)(short)0, 1);
    java.lang.Object obj33 = bytearrayhashmap_obj16.put(byte_array28, (java.lang.Object)1);
    java.util.List<java.lang.Object> list_obj34 = bytearrayhashmap_obj16.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj37 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array40 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj41 = bytearrayhashmap_obj37.remove(byte_array40);
    byte[] byte_array46 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj49 = bytearrayhashmap_obj37.get(byte_array46, (int)(short)0, 1);
    int i50 = bytearrayhashmap_obj37.size();
    byte[] byte_array56 = new byte[] { (byte)0, (byte)10, (byte)0, (byte)-1, (byte)-1 };
    boolean b57 = bytearrayhashmap_obj37.containsKey(byte_array56);
    java.lang.Object obj59 = bytearrayhashmap_obj16.put(byte_array56, (java.lang.Object)(short)-1);
    boolean b60 = bytearrayhashmap_obj2.containsKey(byte_array56);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj63 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array66 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj67 = bytearrayhashmap_obj63.remove(byte_array66);
    java.lang.Object obj68 = bytearrayhashmap_obj2.remove(byte_array66);
    int i69 = bytearrayhashmap_obj2.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test83"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)'#');
    int i2 = bytearrayhashmap_obj1.size();
    byte[] byte_array6 = new byte[] { (byte)0, (byte)100, (byte)1 };
    java.lang.Object obj7 = bytearrayhashmap_obj1.get(byte_array6);
    bytearrayhashmap_obj1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test84"); }


    // The following exception was thrown during execution in test generation
    try {
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>(1, (float)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test85"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj17 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj20 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array23 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj24 = bytearrayhashmap_obj20.remove(byte_array23);
    byte[] byte_array29 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj32 = bytearrayhashmap_obj20.get(byte_array29, (int)(short)0, 1);
    java.lang.Object obj34 = bytearrayhashmap_obj17.put(byte_array29, (java.lang.Object)1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj37 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array40 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj41 = bytearrayhashmap_obj37.remove(byte_array40);
    java.lang.Object obj43 = bytearrayhashmap_obj17.put(byte_array40, (java.lang.Object)1);
    java.lang.Object obj44 = bytearrayhashmap_obj2.remove(byte_array40);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj47 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj50 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array53 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj54 = bytearrayhashmap_obj50.remove(byte_array53);
    java.lang.Object obj56 = bytearrayhashmap_obj47.put(byte_array53, (java.lang.Object)(short)100);
    java.lang.Object obj57 = bytearrayhashmap_obj2.get(byte_array53);
    bytearrayhashmap_obj2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj57);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test86"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    int i17 = bytearrayhashmap_obj2.size();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj20 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array21 = new byte[] {  };
    java.lang.Object obj22 = bytearrayhashmap_obj20.remove(byte_array21);
    java.lang.Object obj23 = bytearrayhashmap_obj2.get(byte_array21);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj26 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj29 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array32 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj33 = bytearrayhashmap_obj29.remove(byte_array32);
    java.lang.Object obj35 = bytearrayhashmap_obj26.put(byte_array32, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj38 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array41 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj42 = bytearrayhashmap_obj38.remove(byte_array41);
    byte[] byte_array47 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj50 = bytearrayhashmap_obj38.get(byte_array47, (int)(short)0, 1);
    int i51 = bytearrayhashmap_obj38.size();
    byte[] byte_array57 = new byte[] { (byte)0, (byte)10, (byte)0, (byte)-1, (byte)-1 };
    boolean b58 = bytearrayhashmap_obj38.containsKey(byte_array57);
    java.lang.Object obj60 = bytearrayhashmap_obj26.put(byte_array57, (java.lang.Object)'a');
    boolean b61 = bytearrayhashmap_obj2.containsKey(byte_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test87"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj0 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj3 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array6 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj7 = bytearrayhashmap_obj3.remove(byte_array6);
    byte[] byte_array12 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj15 = bytearrayhashmap_obj3.get(byte_array12, (int)(short)0, 1);
    java.lang.Object obj17 = bytearrayhashmap_obj0.put(byte_array12, (java.lang.Object)1);
    java.util.List<java.lang.Object> list_obj18 = bytearrayhashmap_obj0.values();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj21 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array24 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj25 = bytearrayhashmap_obj21.remove(byte_array24);
    boolean b26 = bytearrayhashmap_obj21.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj29 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj32 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array35 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj36 = bytearrayhashmap_obj32.remove(byte_array35);
    java.lang.Object obj38 = bytearrayhashmap_obj29.put(byte_array35, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj41 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array44 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj45 = bytearrayhashmap_obj41.remove(byte_array44);
    byte[] byte_array50 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj53 = bytearrayhashmap_obj41.get(byte_array50, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj54 = bytearrayhashmap_obj41.duplicate();
    java.lang.Object obj55 = bytearrayhashmap_obj21.put(byte_array35, (java.lang.Object)bytearrayhashmap_obj41);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj58 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array61 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj62 = bytearrayhashmap_obj58.remove(byte_array61);
    byte[] byte_array67 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj70 = bytearrayhashmap_obj58.get(byte_array67, (int)(short)0, 1);
    java.lang.Object obj71 = bytearrayhashmap_obj0.put(byte_array35, (java.lang.Object)bytearrayhashmap_obj58);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj74 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array77 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj78 = bytearrayhashmap_obj74.remove(byte_array77);
    byte[] byte_array83 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj86 = bytearrayhashmap_obj74.get(byte_array83, (int)(short)0, 1);
    int i87 = bytearrayhashmap_obj74.size();
    java.util.List<byte[]> list_byte_array88 = bytearrayhashmap_obj74.keys();
    int i89 = bytearrayhashmap_obj74.size();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj92 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array93 = new byte[] {  };
    java.lang.Object obj94 = bytearrayhashmap_obj92.remove(byte_array93);
    java.lang.Object obj95 = bytearrayhashmap_obj74.get(byte_array93);
    boolean b96 = bytearrayhashmap_obj0.containsKey(byte_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test88"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)(short)100, (float)2);

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test89"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj8 = new ByteArrayHashMap<java.lang.Object>(0);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj10 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array11 = new byte[] {  };
    boolean b12 = bytearrayhashmap_obj10.containsKey(byte_array11);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj13 = bytearrayhashmap_obj10.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj16 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array19 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj20 = bytearrayhashmap_obj16.remove(byte_array19);
    boolean b21 = bytearrayhashmap_obj16.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj24 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array27 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj28 = bytearrayhashmap_obj24.remove(byte_array27);
    byte[] byte_array33 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj36 = bytearrayhashmap_obj24.get(byte_array33, (int)(short)0, 1);
    java.lang.Object obj37 = bytearrayhashmap_obj16.remove(byte_array33);
    java.lang.Object obj38 = bytearrayhashmap_obj13.remove(byte_array33);
    java.lang.Object obj39 = null;
    java.lang.Object obj40 = bytearrayhashmap_obj8.put(byte_array33, obj39);
    java.lang.Object obj41 = bytearrayhashmap_obj2.get(byte_array33);
    boolean b42 = bytearrayhashmap_obj2.isEmpty();
    java.util.List<java.lang.Object> list_obj43 = bytearrayhashmap_obj2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_obj43);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test90"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    int i15 = bytearrayhashmap_obj2.size();
    java.util.List<byte[]> list_byte_array16 = bytearrayhashmap_obj2.keys();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj18 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array19 = new byte[] {  };
    boolean b20 = bytearrayhashmap_obj18.containsKey(byte_array19);
    java.lang.Object obj21 = bytearrayhashmap_obj2.get(byte_array19);
    boolean b22 = bytearrayhashmap_obj2.isEmpty();
    boolean b23 = bytearrayhashmap_obj2.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj25 = new ByteArrayHashMap<java.lang.Object>(0);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj27 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array28 = new byte[] {  };
    boolean b29 = bytearrayhashmap_obj27.containsKey(byte_array28);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj30 = bytearrayhashmap_obj27.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj33 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array36 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj37 = bytearrayhashmap_obj33.remove(byte_array36);
    boolean b38 = bytearrayhashmap_obj33.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj41 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array44 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj45 = bytearrayhashmap_obj41.remove(byte_array44);
    byte[] byte_array50 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj53 = bytearrayhashmap_obj41.get(byte_array50, (int)(short)0, 1);
    java.lang.Object obj54 = bytearrayhashmap_obj33.remove(byte_array50);
    java.lang.Object obj55 = bytearrayhashmap_obj30.remove(byte_array50);
    java.lang.Object obj56 = null;
    java.lang.Object obj57 = bytearrayhashmap_obj25.put(byte_array50, obj56);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj59 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array60 = new byte[] {  };
    boolean b61 = bytearrayhashmap_obj59.containsKey(byte_array60);
    java.lang.Object obj62 = bytearrayhashmap_obj25.remove(byte_array60);
    boolean b63 = bytearrayhashmap_obj2.containsKey(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test91"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)(byte)10);
    byte[] byte_array2 = new byte[] {  };
    boolean b3 = bytearrayhashmap_obj1.containsKey(byte_array2);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj4 = bytearrayhashmap_obj1.duplicate();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj5 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj8 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array11 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj12 = bytearrayhashmap_obj8.remove(byte_array11);
    byte[] byte_array17 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj20 = bytearrayhashmap_obj8.get(byte_array17, (int)(short)0, 1);
    java.lang.Object obj22 = bytearrayhashmap_obj5.put(byte_array17, (java.lang.Object)1);
    java.lang.Object obj23 = bytearrayhashmap_obj1.remove(byte_array17);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj26 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array29 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj30 = bytearrayhashmap_obj26.remove(byte_array29);
    boolean b31 = bytearrayhashmap_obj26.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj34 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array37 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj38 = bytearrayhashmap_obj34.remove(byte_array37);
    byte[] byte_array43 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj46 = bytearrayhashmap_obj34.get(byte_array43, (int)(short)0, 1);
    java.lang.Object obj47 = bytearrayhashmap_obj26.remove(byte_array43);
    boolean b48 = bytearrayhashmap_obj1.containsKey(byte_array43);
    int i49 = bytearrayhashmap_obj1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test92"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    byte[] byte_array11 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj14 = bytearrayhashmap_obj2.get(byte_array11, (int)(short)0, 1);
    bytearrayhashmap_obj2.clear();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj18 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array19 = new byte[] {  };
    java.lang.Object obj20 = bytearrayhashmap_obj18.remove(byte_array19);
    boolean b21 = bytearrayhashmap_obj2.containsKey(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test93"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj1 = new ByteArrayHashMap<java.lang.Object>((int)'#');
    int i2 = bytearrayhashmap_obj1.size();
    byte[] byte_array6 = new byte[] { (byte)0, (byte)100, (byte)1 };
    java.lang.Object obj7 = bytearrayhashmap_obj1.get(byte_array6);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj8 = bytearrayhashmap_obj1.duplicate();
    boolean b9 = bytearrayhashmap_obj1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test94() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test94"); }


    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj2 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj6 = bytearrayhashmap_obj2.remove(byte_array5);
    boolean b7 = bytearrayhashmap_obj2.isEmpty();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj10 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj13 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array16 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj17 = bytearrayhashmap_obj13.remove(byte_array16);
    java.lang.Object obj19 = bytearrayhashmap_obj10.put(byte_array16, (java.lang.Object)(short)100);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj22 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array25 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj26 = bytearrayhashmap_obj22.remove(byte_array25);
    byte[] byte_array31 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj34 = bytearrayhashmap_obj22.get(byte_array31, (int)(short)0, 1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj35 = bytearrayhashmap_obj22.duplicate();
    java.lang.Object obj36 = bytearrayhashmap_obj2.put(byte_array16, (java.lang.Object)bytearrayhashmap_obj22);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj37 = new ByteArrayHashMap<java.lang.Object>();
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj40 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array43 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj44 = bytearrayhashmap_obj40.remove(byte_array43);
    byte[] byte_array49 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj52 = bytearrayhashmap_obj40.get(byte_array49, (int)(short)0, 1);
    java.lang.Object obj54 = bytearrayhashmap_obj37.put(byte_array49, (java.lang.Object)1);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj57 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array60 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj61 = bytearrayhashmap_obj57.remove(byte_array60);
    java.lang.Object obj63 = bytearrayhashmap_obj37.put(byte_array60, (java.lang.Object)1);
    java.lang.Object obj64 = bytearrayhashmap_obj2.get(byte_array60);
    ByteArrayHashMap<java.lang.Object> bytearrayhashmap_obj67 = new ByteArrayHashMap<java.lang.Object>((int)'4', (float)'4');
    byte[] byte_array70 = new byte[] { (byte)0, (byte)0 };
    java.lang.Object obj71 = bytearrayhashmap_obj67.remove(byte_array70);
    byte[] byte_array76 = new byte[] { (byte)10, (byte)-1, (byte)-1, (byte)-1 };
    java.lang.Object obj79 = bytearrayhashmap_obj67.get(byte_array76, (int)(short)0, 1);
    java.lang.Object obj80 = bytearrayhashmap_obj2.get(byte_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(bytearrayhashmap_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj80);

  }

}
