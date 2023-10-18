package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it2_livello2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Enumeration enumeration5 = weakHashtable0.keys();
    java.lang.Object obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj7 = weakHashtable0.remove(obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.keySet();
    java.util.Enumeration enumeration6 = weakHashtable0.elements();
    java.util.Enumeration enumeration7 = weakHashtable0.elements();
    java.lang.String str8 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{0.0=0}"+ "'", str8.equals("{0.0=0}"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.keySet();
    java.util.Enumeration enumeration6 = weakHashtable0.elements();
    java.util.Enumeration enumeration7 = weakHashtable0.elements();
    java.util.Collection collection8 = weakHashtable0.values();
    java.lang.Object obj10 = weakHashtable0.get((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.entrySet();
    int i6 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    java.util.Set set2 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration5 = weakHashtable0.keys();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.lang.Object obj10 = weakHashtable7.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b11 = weakHashtable7.isEmpty();
    boolean b13 = weakHashtable7.containsKey((java.lang.Object)'#');
    java.lang.Object obj15 = weakHashtable7.remove((java.lang.Object)1.0f);
    boolean b16 = weakHashtable7.isEmpty();
    java.util.Collection collection17 = weakHashtable7.values();
    java.lang.Object obj18 = weakHashtable6.get((java.lang.Object)weakHashtable7);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj19 = weakHashtable0.remove(obj18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.keySet();
    java.util.Enumeration enumeration6 = weakHashtable0.elements();
    java.lang.Object obj7 = null;
    java.lang.Object obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj9 = weakHashtable0.put(obj7, obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    java.lang.Object obj4 = weakHashtable1.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b5 = weakHashtable1.isEmpty();
    boolean b7 = weakHashtable1.containsKey((java.lang.Object)'#');
    java.lang.Object obj9 = weakHashtable1.remove((java.lang.Object)1.0f);
    boolean b10 = weakHashtable1.isEmpty();
    java.util.Collection collection11 = weakHashtable1.values();
    java.lang.Object obj12 = weakHashtable0.get((java.lang.Object)weakHashtable1);
    boolean b13 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.keySet();
    java.util.Enumeration enumeration6 = weakHashtable0.elements();
    java.lang.Object obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = weakHashtable0.containsKey(obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    int i4 = weakHashtable0.size();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj9 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b10 = weakHashtable6.isEmpty();
    boolean b12 = weakHashtable6.containsKey((java.lang.Object)'#');
    java.lang.Object obj13 = weakHashtable0.put((java.lang.Object)'#', (java.lang.Object)weakHashtable6);
    java.lang.Object obj15 = weakHashtable0.remove((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + ""+ "'", obj15.equals(""));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)'#');
    java.lang.Object obj8 = weakHashtable0.remove((java.lang.Object)1.0f);
    boolean b9 = weakHashtable0.isEmpty();
    java.util.Set set10 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.get((java.lang.Object)(byte)1);
    boolean b4 = weakHashtable0.containsKey((java.lang.Object)0);
    java.util.Set set5 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    boolean b2 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.Object obj6 = weakHashtable3.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration7 = weakHashtable3.keys();
    java.lang.Object obj9 = weakHashtable3.get((java.lang.Object)100.0d);
    boolean b10 = weakHashtable3.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    java.util.Set set12 = weakHashtable3.keySet();
    java.util.Set set13 = weakHashtable3.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration5 = weakHashtable0.keys();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    java.lang.Object obj10 = weakHashtable6.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set11 = weakHashtable6.keySet();
    java.util.Enumeration enumeration12 = weakHashtable6.elements();
    java.util.Enumeration enumeration13 = weakHashtable6.elements();
    java.util.Collection collection14 = weakHashtable6.values();
    java.lang.Object obj15 = weakHashtable0.get((java.lang.Object)weakHashtable6);
    boolean b16 = weakHashtable0.isEmpty();
    java.util.Set set17 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.lang.Object obj8 = weakHashtable5.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    int i9 = weakHashtable5.size();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.lang.Object obj14 = weakHashtable11.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b15 = weakHashtable11.isEmpty();
    boolean b17 = weakHashtable11.containsKey((java.lang.Object)'#');
    java.lang.Object obj18 = weakHashtable5.put((java.lang.Object)'#', (java.lang.Object)weakHashtable11);
    java.util.Collection collection19 = weakHashtable11.values();
    java.lang.Object obj20 = weakHashtable0.get((java.lang.Object)collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    WeakHashtable weakHashtable5 = new WeakHashtable();
    int i6 = weakHashtable5.size();
    boolean b7 = weakHashtable0.containsKey((java.lang.Object)i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.get((java.lang.Object)(byte)1);
    java.util.Collection collection3 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection3);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    java.lang.Object obj4 = weakHashtable1.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b5 = weakHashtable1.isEmpty();
    boolean b7 = weakHashtable1.containsKey((java.lang.Object)'#');
    java.lang.Object obj9 = weakHashtable1.remove((java.lang.Object)1.0f);
    boolean b10 = weakHashtable1.isEmpty();
    java.util.Collection collection11 = weakHashtable1.values();
    java.lang.Object obj12 = weakHashtable0.get((java.lang.Object)weakHashtable1);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    int i14 = weakHashtable13.size();
    java.lang.Object obj17 = weakHashtable13.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Enumeration enumeration18 = weakHashtable13.keys();
    boolean b19 = weakHashtable0.containsKey((java.lang.Object)weakHashtable13);
    java.util.Set set20 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    boolean b2 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.Object obj6 = weakHashtable3.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration7 = weakHashtable3.keys();
    java.lang.Object obj9 = weakHashtable3.get((java.lang.Object)100.0d);
    boolean b10 = weakHashtable3.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    java.util.Set set12 = weakHashtable0.entrySet();
    java.util.Set set13 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    java.lang.String str2 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}"+ "'", str2.equals("{}"));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    boolean b2 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.Object obj6 = weakHashtable3.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration7 = weakHashtable3.keys();
    java.lang.Object obj9 = weakHashtable3.get((java.lang.Object)100.0d);
    boolean b10 = weakHashtable3.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    boolean b12 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration13 = weakHashtable0.elements();
    java.util.Collection collection14 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration4 = weakHashtable0.keys();
    java.util.Enumeration enumeration5 = weakHashtable0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.lang.Object obj3 = weakHashtable0.get((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    boolean b2 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    int i4 = weakHashtable3.size();
    java.lang.Object obj7 = weakHashtable3.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Enumeration enumeration8 = weakHashtable3.keys();
    java.lang.Object obj9 = new java.lang.Object();
    boolean b10 = weakHashtable3.containsKey(obj9);
    java.lang.Object obj11 = weakHashtable0.remove(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    int i5 = weakHashtable0.size();
    java.util.Enumeration enumeration6 = weakHashtable0.elements();
    int i7 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    int i4 = weakHashtable0.size();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Collection collection6 = weakHashtable5.values();
    java.lang.Object obj9 = weakHashtable5.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration10 = weakHashtable5.keys();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.lang.Object obj15 = weakHashtable11.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set16 = weakHashtable11.keySet();
    java.util.Enumeration enumeration17 = weakHashtable11.elements();
    java.util.Enumeration enumeration18 = weakHashtable11.elements();
    java.util.Collection collection19 = weakHashtable11.values();
    java.lang.Object obj20 = weakHashtable5.get((java.lang.Object)weakHashtable11);
    java.lang.Object obj21 = weakHashtable0.remove((java.lang.Object)weakHashtable5);
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Collection collection23 = weakHashtable22.values();
    java.lang.String str24 = weakHashtable22.toString();
    weakHashtable5.putAll((java.util.Map)weakHashtable22);
    int i26 = weakHashtable5.size();
    int i27 = weakHashtable5.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}"+ "'", str24.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration4 = weakHashtable0.keys();
    java.lang.Object obj6 = weakHashtable0.get((java.lang.Object)100.0d);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Collection collection8 = weakHashtable7.values();
    java.lang.Object obj11 = weakHashtable7.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration12 = weakHashtable7.keys();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.Object obj15 = weakHashtable13.get((java.lang.Object)(byte)1);
    int i16 = weakHashtable13.size();
    java.util.Set set17 = weakHashtable13.entrySet();
    boolean b18 = weakHashtable7.containsKey((java.lang.Object)set17);
    boolean b19 = weakHashtable0.containsKey((java.lang.Object)b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)'#');
    java.lang.Object obj8 = weakHashtable0.remove((java.lang.Object)1.0f);
    boolean b9 = weakHashtable0.isEmpty();
    java.util.Set set10 = weakHashtable0.entrySet();
    boolean b11 = weakHashtable0.isEmpty();
    java.lang.String str12 = weakHashtable0.toString();
    int i13 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{10=}"+ "'", str12.equals("{10=}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration5 = weakHashtable0.keys();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    java.lang.Object obj10 = weakHashtable6.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set11 = weakHashtable6.keySet();
    java.util.Enumeration enumeration12 = weakHashtable6.elements();
    java.util.Enumeration enumeration13 = weakHashtable6.elements();
    java.util.Collection collection14 = weakHashtable6.values();
    java.lang.Object obj15 = weakHashtable0.get((java.lang.Object)weakHashtable6);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.lang.Object obj19 = weakHashtable16.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b20 = weakHashtable16.isEmpty();
    boolean b22 = weakHashtable16.containsKey((java.lang.Object)'#');
    java.lang.Object obj24 = weakHashtable16.remove((java.lang.Object)1.0f);
    boolean b25 = weakHashtable16.isEmpty();
    java.util.Set set26 = weakHashtable16.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.lang.String str5 = weakHashtable0.toString();
    java.util.Set set6 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{=100}"+ "'", str5.equals("{=100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    boolean b2 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.Object obj6 = weakHashtable3.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration7 = weakHashtable3.keys();
    java.lang.Object obj9 = weakHashtable3.get((java.lang.Object)100.0d);
    boolean b10 = weakHashtable3.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    boolean b12 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration13 = weakHashtable0.elements();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    java.util.Collection collection15 = weakHashtable14.values();
    java.lang.Object obj18 = weakHashtable14.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set19 = weakHashtable14.keySet();
    java.util.Map map20 = null;
    weakHashtable14.putAll(map20);
    weakHashtable0.putAll(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    java.util.Enumeration enumeration2 = weakHashtable0.keys();
    java.util.Set set3 = weakHashtable0.entrySet();
    boolean b4 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)'#');
    java.lang.Object obj8 = weakHashtable0.remove((java.lang.Object)1.0f);
    java.util.Set set9 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    int i4 = weakHashtable0.size();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj9 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b10 = weakHashtable6.isEmpty();
    boolean b12 = weakHashtable6.containsKey((java.lang.Object)'#');
    java.lang.Object obj13 = weakHashtable0.put((java.lang.Object)'#', (java.lang.Object)weakHashtable6);
    java.lang.Object obj15 = weakHashtable6.remove((java.lang.Object)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.Object obj6 = weakHashtable3.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b7 = weakHashtable3.isEmpty();
    boolean b9 = weakHashtable3.containsKey((java.lang.Object)'#');
    java.lang.Object obj11 = weakHashtable3.remove((java.lang.Object)1.0f);
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    java.util.Set set13 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    int i5 = weakHashtable0.size();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    java.lang.Object obj10 = weakHashtable6.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set11 = weakHashtable6.keySet();
    java.util.Enumeration enumeration12 = weakHashtable6.elements();
    java.util.Enumeration enumeration13 = weakHashtable6.elements();
    java.util.Collection collection14 = weakHashtable6.values();
    java.lang.Object obj15 = weakHashtable0.remove((java.lang.Object)collection14);
    java.util.Set set16 = weakHashtable0.entrySet();
    int i17 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    java.lang.String str2 = weakHashtable0.toString();
    java.lang.String str3 = weakHashtable0.toString();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.lang.Object obj8 = weakHashtable5.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b9 = weakHashtable5.isEmpty();
    boolean b11 = weakHashtable5.containsKey((java.lang.Object)'#');
    java.lang.Object obj13 = weakHashtable5.remove((java.lang.Object)1.0f);
    boolean b14 = weakHashtable5.isEmpty();
    java.util.Collection collection15 = weakHashtable5.values();
    java.lang.Object obj16 = weakHashtable4.get((java.lang.Object)weakHashtable5);
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}"+ "'", str2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}"+ "'", str3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    int i5 = weakHashtable0.size();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    java.lang.Object obj10 = weakHashtable6.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set11 = weakHashtable6.keySet();
    java.util.Enumeration enumeration12 = weakHashtable6.elements();
    java.util.Enumeration enumeration13 = weakHashtable6.elements();
    java.util.Collection collection14 = weakHashtable6.values();
    java.lang.Object obj15 = weakHashtable0.remove((java.lang.Object)collection14);
    java.util.Set set16 = weakHashtable0.entrySet();
    java.util.Set set17 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    java.util.Set set5 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration5 = weakHashtable0.keys();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Set set8 = weakHashtable7.entrySet();
    java.lang.Object obj9 = weakHashtable0.put((java.lang.Object)(-1), (java.lang.Object)weakHashtable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    java.util.Collection collection2 = weakHashtable0.values();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.Object obj5 = weakHashtable3.get((java.lang.Object)(byte)1);
    int i6 = weakHashtable3.size();
    java.util.Set set7 = weakHashtable3.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.Object obj12 = weakHashtable9.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b13 = weakHashtable9.isEmpty();
    int i14 = weakHashtable9.size();
    java.util.Enumeration enumeration15 = weakHashtable9.elements();
    weakHashtable0.putAll((java.util.Map)weakHashtable9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    int i4 = weakHashtable0.size();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj9 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b10 = weakHashtable6.isEmpty();
    boolean b12 = weakHashtable6.containsKey((java.lang.Object)'#');
    java.lang.Object obj13 = weakHashtable0.put((java.lang.Object)'#', (java.lang.Object)weakHashtable6);
    java.util.Collection collection14 = weakHashtable6.values();
    java.lang.Object obj16 = weakHashtable6.remove((java.lang.Object)'a');
    java.util.Set set17 = weakHashtable6.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    int i4 = weakHashtable0.size();
    boolean b5 = weakHashtable0.isEmpty();
    java.util.Set set6 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    java.lang.Object obj4 = weakHashtable1.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b5 = weakHashtable1.isEmpty();
    boolean b7 = weakHashtable1.containsKey((java.lang.Object)'#');
    java.lang.Object obj9 = weakHashtable1.remove((java.lang.Object)1.0f);
    boolean b10 = weakHashtable1.isEmpty();
    java.util.Collection collection11 = weakHashtable1.values();
    java.lang.Object obj12 = weakHashtable0.get((java.lang.Object)weakHashtable1);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    int i14 = weakHashtable13.size();
    java.lang.Object obj17 = weakHashtable13.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Enumeration enumeration18 = weakHashtable13.keys();
    boolean b19 = weakHashtable0.containsKey((java.lang.Object)weakHashtable13);
    java.lang.Object obj21 = weakHashtable0.get((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    int i4 = weakHashtable0.size();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj9 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b10 = weakHashtable6.isEmpty();
    boolean b12 = weakHashtable6.containsKey((java.lang.Object)'#');
    java.lang.Object obj13 = weakHashtable0.put((java.lang.Object)'#', (java.lang.Object)weakHashtable6);
    java.lang.String str14 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{#={10=}, 10=}"+ "'", str14.equals("{#={10=}, 10=}"));

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    boolean b2 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    java.lang.Object obj4 = weakHashtable1.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b5 = weakHashtable1.isEmpty();
    boolean b7 = weakHashtable1.containsKey((java.lang.Object)'#');
    java.lang.Object obj9 = weakHashtable1.remove((java.lang.Object)1.0f);
    boolean b10 = weakHashtable1.isEmpty();
    java.util.Collection collection11 = weakHashtable1.values();
    java.lang.Object obj12 = weakHashtable0.get((java.lang.Object)weakHashtable1);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    int i14 = weakHashtable13.size();
    boolean b15 = weakHashtable13.isEmpty();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.lang.Object obj19 = weakHashtable16.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration20 = weakHashtable16.keys();
    java.lang.Object obj22 = weakHashtable16.get((java.lang.Object)100.0d);
    boolean b23 = weakHashtable16.isEmpty();
    weakHashtable13.putAll((java.util.Map)weakHashtable16);
    java.util.Set set25 = weakHashtable13.entrySet();
    java.lang.Object obj26 = weakHashtable0.remove((java.lang.Object)weakHashtable13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    int i5 = weakHashtable0.size();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    java.lang.Object obj10 = weakHashtable6.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set11 = weakHashtable6.keySet();
    java.util.Enumeration enumeration12 = weakHashtable6.elements();
    java.util.Enumeration enumeration13 = weakHashtable6.elements();
    java.util.Collection collection14 = weakHashtable6.values();
    java.lang.Object obj15 = weakHashtable0.remove((java.lang.Object)collection14);
    java.lang.String str16 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{10=}"+ "'", str16.equals("{10=}"));

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.lang.Object obj5 = weakHashtable2.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b6 = weakHashtable2.isEmpty();
    boolean b7 = weakHashtable0.containsKey((java.lang.Object)b6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration4 = weakHashtable0.keys();
    java.lang.Object obj6 = weakHashtable0.get((java.lang.Object)100.0d);
    boolean b7 = weakHashtable0.isEmpty();
    java.util.Collection collection8 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection8);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.String str2 = weakHashtable0.toString();
    java.util.Enumeration enumeration3 = weakHashtable0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}"+ "'", str2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    boolean b2 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.Object obj6 = weakHashtable3.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration7 = weakHashtable3.keys();
    java.lang.Object obj9 = weakHashtable3.get((java.lang.Object)100.0d);
    boolean b10 = weakHashtable3.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    boolean b12 = weakHashtable0.isEmpty();
    int i13 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.entrySet();
    java.util.Set set6 = weakHashtable0.entrySet();
    java.util.Set set7 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.util.Enumeration enumeration9 = weakHashtable8.keys();
    boolean b10 = weakHashtable0.containsKey((java.lang.Object)enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.Object obj6 = weakHashtable3.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b7 = weakHashtable3.isEmpty();
    boolean b9 = weakHashtable3.containsKey((java.lang.Object)'#');
    java.lang.Object obj11 = weakHashtable3.remove((java.lang.Object)1.0f);
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.util.Collection collection14 = weakHashtable13.values();
    java.lang.Object obj17 = weakHashtable13.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration18 = weakHashtable13.keys();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    java.util.Collection collection20 = weakHashtable19.values();
    java.lang.Object obj23 = weakHashtable19.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set24 = weakHashtable19.keySet();
    java.util.Enumeration enumeration25 = weakHashtable19.elements();
    java.util.Enumeration enumeration26 = weakHashtable19.elements();
    java.util.Collection collection27 = weakHashtable19.values();
    java.lang.Object obj28 = weakHashtable13.get((java.lang.Object)weakHashtable19);
    weakHashtable3.putAll((java.util.Map)weakHashtable19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    java.util.Set set3 = weakHashtable0.entrySet();
    java.util.Set set4 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.keySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj9 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration10 = weakHashtable6.keys();
    java.lang.Object obj12 = weakHashtable6.get((java.lang.Object)100.0d);
    boolean b13 = weakHashtable6.isEmpty();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    int i15 = weakHashtable14.size();
    java.util.Collection collection16 = weakHashtable14.values();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.lang.Object obj19 = weakHashtable17.get((java.lang.Object)(byte)1);
    int i20 = weakHashtable17.size();
    java.util.Set set21 = weakHashtable17.entrySet();
    weakHashtable14.putAll((java.util.Map)weakHashtable17);
    boolean b23 = weakHashtable6.containsKey((java.lang.Object)weakHashtable14);
    boolean b24 = weakHashtable0.containsKey((java.lang.Object)weakHashtable14);
    boolean b25 = weakHashtable14.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.keySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj9 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration10 = weakHashtable6.keys();
    java.lang.Object obj12 = weakHashtable6.get((java.lang.Object)100.0d);
    boolean b13 = weakHashtable6.isEmpty();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    int i15 = weakHashtable14.size();
    java.util.Collection collection16 = weakHashtable14.values();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.lang.Object obj19 = weakHashtable17.get((java.lang.Object)(byte)1);
    int i20 = weakHashtable17.size();
    java.util.Set set21 = weakHashtable17.entrySet();
    weakHashtable14.putAll((java.util.Map)weakHashtable17);
    boolean b23 = weakHashtable6.containsKey((java.lang.Object)weakHashtable14);
    boolean b24 = weakHashtable0.containsKey((java.lang.Object)weakHashtable14);
    int i25 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)'#');
    java.lang.Object obj8 = weakHashtable0.remove((java.lang.Object)1.0f);
    boolean b9 = weakHashtable0.isEmpty();
    java.util.Set set10 = weakHashtable0.entrySet();
    boolean b11 = weakHashtable0.isEmpty();
    java.lang.String str12 = weakHashtable0.toString();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.Object obj16 = weakHashtable13.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration17 = weakHashtable13.elements();
    java.lang.Object obj18 = weakHashtable0.remove((java.lang.Object)enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{10=}"+ "'", str12.equals("{10=}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.get((java.lang.Object)(byte)1);
    int i3 = weakHashtable0.size();
    java.lang.Object obj5 = weakHashtable0.remove((java.lang.Object)"");
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    java.lang.String str8 = weakHashtable6.toString();
    java.lang.Object obj10 = weakHashtable6.remove((java.lang.Object)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj11 = weakHashtable0.get(obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}"+ "'", str8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Set set4 = weakHashtable0.entrySet();
    java.util.Enumeration enumeration5 = weakHashtable0.elements();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    java.lang.Object obj10 = weakHashtable6.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set11 = weakHashtable6.keySet();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.lang.Object obj15 = weakHashtable12.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration16 = weakHashtable12.keys();
    java.lang.Object obj18 = weakHashtable12.get((java.lang.Object)100.0d);
    boolean b19 = weakHashtable12.isEmpty();
    WeakHashtable weakHashtable20 = new WeakHashtable();
    int i21 = weakHashtable20.size();
    java.util.Collection collection22 = weakHashtable20.values();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    java.lang.Object obj25 = weakHashtable23.get((java.lang.Object)(byte)1);
    int i26 = weakHashtable23.size();
    java.util.Set set27 = weakHashtable23.entrySet();
    weakHashtable20.putAll((java.util.Map)weakHashtable23);
    boolean b29 = weakHashtable12.containsKey((java.lang.Object)weakHashtable20);
    boolean b30 = weakHashtable6.containsKey((java.lang.Object)weakHashtable20);
    weakHashtable0.putAll((java.util.Map)weakHashtable6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.entrySet();
    java.util.Set set6 = weakHashtable0.entrySet();
    java.util.Set set7 = weakHashtable0.entrySet();
    boolean b8 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.lang.String str5 = weakHashtable0.toString();
    java.lang.String str6 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{=100}"+ "'", str5.equals("{=100}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{=100}"+ "'", str6.equals("{=100}"));

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.get((java.lang.Object)(byte)1);
    int i3 = weakHashtable0.size();
    java.util.Set set4 = weakHashtable0.entrySet();
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)0L);
    java.util.Collection collection7 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    int i3 = weakHashtable2.size();
    java.lang.Object obj6 = weakHashtable2.put((java.lang.Object)"", (java.lang.Object)(short)100);
    java.util.Enumeration enumeration7 = weakHashtable2.keys();
    java.lang.Object obj8 = new java.lang.Object();
    boolean b9 = weakHashtable2.containsKey(obj8);
    boolean b10 = weakHashtable0.containsKey(obj8);
    java.util.Collection collection11 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.keySet();
    java.util.Map map6 = null;
    weakHashtable0.putAll(map6);
    boolean b8 = weakHashtable0.isEmpty();
    java.util.Collection collection9 = weakHashtable0.values();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.lang.Object obj13 = weakHashtable10.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    int i14 = weakHashtable10.size();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Collection collection16 = weakHashtable15.values();
    java.lang.Object obj19 = weakHashtable15.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration20 = weakHashtable15.keys();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    java.util.Collection collection22 = weakHashtable21.values();
    java.lang.Object obj25 = weakHashtable21.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set26 = weakHashtable21.keySet();
    java.util.Enumeration enumeration27 = weakHashtable21.elements();
    java.util.Enumeration enumeration28 = weakHashtable21.elements();
    java.util.Collection collection29 = weakHashtable21.values();
    java.lang.Object obj30 = weakHashtable15.get((java.lang.Object)weakHashtable21);
    java.lang.Object obj31 = weakHashtable10.remove((java.lang.Object)weakHashtable15);
    weakHashtable0.putAll((java.util.Map)weakHashtable10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.get((java.lang.Object)(byte)1);
    int i3 = weakHashtable0.size();
    java.util.Set set4 = weakHashtable0.entrySet();
    java.util.Set set5 = weakHashtable0.keySet();
    java.util.Collection collection6 = weakHashtable0.values();
    java.util.Set set7 = weakHashtable0.keySet();
    java.util.Set set8 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    int i1 = weakHashtable0.size();
    java.util.Enumeration enumeration2 = weakHashtable0.keys();
    java.util.Enumeration enumeration3 = weakHashtable0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.keySet();
    java.util.Map map6 = null;
    weakHashtable0.putAll(map6);
    boolean b8 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.Object obj12 = weakHashtable9.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration13 = weakHashtable9.keys();
    java.lang.Object obj14 = weakHashtable0.remove((java.lang.Object)enumeration13);
    java.util.Set set15 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    java.lang.Object obj4 = weakHashtable1.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b5 = weakHashtable1.isEmpty();
    boolean b7 = weakHashtable1.containsKey((java.lang.Object)'#');
    java.lang.Object obj9 = weakHashtable1.remove((java.lang.Object)1.0f);
    boolean b10 = weakHashtable1.isEmpty();
    java.util.Collection collection11 = weakHashtable1.values();
    java.lang.Object obj12 = weakHashtable0.get((java.lang.Object)weakHashtable1);
    java.util.Set set13 = weakHashtable0.keySet();
    java.lang.Object obj14 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b15 = weakHashtable0.containsKey(obj14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration5 = weakHashtable0.keys();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    java.lang.Object obj10 = weakHashtable6.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set11 = weakHashtable6.keySet();
    java.util.Enumeration enumeration12 = weakHashtable6.elements();
    java.util.Enumeration enumeration13 = weakHashtable6.elements();
    java.util.Collection collection14 = weakHashtable6.values();
    java.lang.Object obj15 = weakHashtable0.get((java.lang.Object)weakHashtable6);
    boolean b16 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration17 = weakHashtable0.elements();
    java.util.Enumeration enumeration18 = weakHashtable0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)'#');
    java.util.Collection collection7 = weakHashtable0.values();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    int i9 = weakHashtable8.size();
    boolean b10 = weakHashtable8.isEmpty();
    boolean b11 = weakHashtable0.containsKey((java.lang.Object)weakHashtable8);
    int i12 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    int i5 = weakHashtable0.size();
    java.util.Set set6 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)'#');
    java.lang.Object obj8 = weakHashtable0.remove((java.lang.Object)1.0f);
    boolean b9 = weakHashtable0.isEmpty();
    java.util.Collection collection10 = weakHashtable0.values();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    int i12 = weakHashtable11.size();
    java.util.Enumeration enumeration13 = weakHashtable11.keys();
    boolean b14 = weakHashtable0.containsKey((java.lang.Object)weakHashtable11);
    boolean b15 = weakHashtable11.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    int i4 = weakHashtable0.size();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Collection collection6 = weakHashtable5.values();
    java.lang.Object obj9 = weakHashtable5.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration10 = weakHashtable5.keys();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.lang.Object obj15 = weakHashtable11.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set16 = weakHashtable11.keySet();
    java.util.Enumeration enumeration17 = weakHashtable11.elements();
    java.util.Enumeration enumeration18 = weakHashtable11.elements();
    java.util.Collection collection19 = weakHashtable11.values();
    java.lang.Object obj20 = weakHashtable5.get((java.lang.Object)weakHashtable11);
    java.lang.Object obj21 = weakHashtable0.remove((java.lang.Object)weakHashtable5);
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Collection collection23 = weakHashtable22.values();
    java.lang.String str24 = weakHashtable22.toString();
    weakHashtable5.putAll((java.util.Map)weakHashtable22);
    WeakHashtable weakHashtable26 = new WeakHashtable();
    java.util.Collection collection27 = weakHashtable26.values();
    java.lang.Object obj30 = weakHashtable26.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set31 = weakHashtable26.keySet();
    java.util.Enumeration enumeration32 = weakHashtable26.elements();
    WeakHashtable weakHashtable33 = new WeakHashtable();
    java.util.Collection collection34 = weakHashtable33.values();
    java.lang.Object obj37 = weakHashtable33.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set38 = weakHashtable33.entrySet();
    java.util.Set set39 = weakHashtable33.entrySet();
    java.util.Enumeration enumeration40 = weakHashtable33.keys();
    java.lang.Object obj41 = weakHashtable5.put((java.lang.Object)weakHashtable26, (java.lang.Object)weakHashtable33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}"+ "'", str24.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    int i4 = weakHashtable0.size();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Collection collection6 = weakHashtable5.values();
    java.lang.Object obj9 = weakHashtable5.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration10 = weakHashtable5.keys();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.lang.Object obj15 = weakHashtable11.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set16 = weakHashtable11.keySet();
    java.util.Enumeration enumeration17 = weakHashtable11.elements();
    java.util.Enumeration enumeration18 = weakHashtable11.elements();
    java.util.Collection collection19 = weakHashtable11.values();
    java.lang.Object obj20 = weakHashtable5.get((java.lang.Object)weakHashtable11);
    java.lang.Object obj21 = weakHashtable0.remove((java.lang.Object)weakHashtable5);
    java.lang.String str22 = weakHashtable5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{0.0=0}"+ "'", str22.equals("{0.0=0}"));

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration5 = weakHashtable0.keys();
    java.util.Set set6 = weakHashtable0.keySet();
    java.util.Set set7 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b4 = weakHashtable0.isEmpty();
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)'#');
    java.lang.Object obj8 = weakHashtable0.remove((java.lang.Object)1.0f);
    boolean b9 = weakHashtable0.isEmpty();
    java.util.Collection collection10 = weakHashtable0.values();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    int i12 = weakHashtable11.size();
    java.util.Enumeration enumeration13 = weakHashtable11.keys();
    boolean b14 = weakHashtable0.containsKey((java.lang.Object)weakHashtable11);
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Collection collection16 = weakHashtable15.values();
    java.lang.Object obj19 = weakHashtable15.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration20 = weakHashtable15.keys();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    java.lang.Object obj23 = weakHashtable21.get((java.lang.Object)(byte)1);
    int i24 = weakHashtable21.size();
    java.util.Set set25 = weakHashtable21.entrySet();
    java.util.Set set26 = weakHashtable21.keySet();
    java.util.Collection collection27 = weakHashtable21.values();
    boolean b28 = weakHashtable15.containsKey((java.lang.Object)weakHashtable21);
    java.util.Collection collection29 = weakHashtable15.values();
    boolean b30 = weakHashtable0.containsKey((java.lang.Object)collection29);
    int i31 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    java.lang.Object obj4 = weakHashtable1.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    boolean b5 = weakHashtable1.isEmpty();
    boolean b7 = weakHashtable1.containsKey((java.lang.Object)'#');
    java.lang.Object obj9 = weakHashtable1.remove((java.lang.Object)1.0f);
    boolean b10 = weakHashtable1.isEmpty();
    java.util.Collection collection11 = weakHashtable1.values();
    java.lang.Object obj12 = weakHashtable0.get((java.lang.Object)weakHashtable1);
    java.lang.Object obj14 = weakHashtable0.get((java.lang.Object)(short)1);
    java.util.Enumeration enumeration15 = weakHashtable0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.get((java.lang.Object)(byte)1);
    int i3 = weakHashtable0.size();
    java.util.Set set4 = weakHashtable0.entrySet();
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)0L);
    java.lang.String str7 = weakHashtable0.toString();
    java.lang.Object obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj9 = weakHashtable0.get(obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}"+ "'", str7.equals("{}"));

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test80"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Enumeration enumeration5 = weakHashtable0.keys();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj8 = weakHashtable6.get((java.lang.Object)(byte)1);
    int i9 = weakHashtable6.size();
    java.util.Set set10 = weakHashtable6.entrySet();
    java.util.Set set11 = weakHashtable6.keySet();
    java.util.Collection collection12 = weakHashtable6.values();
    boolean b13 = weakHashtable0.containsKey((java.lang.Object)weakHashtable6);
    java.util.Collection collection14 = weakHashtable0.values();
    java.util.Enumeration enumeration15 = weakHashtable0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test81"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.put((java.lang.Object)0.0d, (java.lang.Object)(byte)0);
    java.util.Set set5 = weakHashtable0.keySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj9 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)"");
    java.util.Enumeration enumeration10 = weakHashtable6.keys();
    java.lang.Object obj12 = weakHashtable6.get((java.lang.Object)100.0d);
    boolean b13 = weakHashtable6.isEmpty();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    int i15 = weakHashtable14.size();
    java.util.Collection collection16 = weakHashtable14.values();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.lang.Object obj19 = weakHashtable17.get((java.lang.Object)(byte)1);
    int i20 = weakHashtable17.size();
    java.util.Set set21 = weakHashtable17.entrySet();
    weakHashtable14.putAll((java.util.Map)weakHashtable17);
    boolean b23 = weakHashtable6.containsKey((java.lang.Object)weakHashtable14);
    boolean b24 = weakHashtable0.containsKey((java.lang.Object)weakHashtable14);
    java.util.Set set25 = weakHashtable14.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);

  }

}
