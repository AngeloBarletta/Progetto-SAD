package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it0_livello1 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    java.lang.Object obj3 = weakHashtable0.put((java.lang.Object)weakHashtable1, (java.lang.Object)(byte)1);
    java.lang.String str4 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{{}=1}"+ "'", str4.equals("{{}=1}"));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.lang.Object obj3 = weakHashtable0.remove((java.lang.Object)'4');
    java.lang.Object obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = weakHashtable0.remove(obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.util.Set set2 = weakHashtable0.entrySet();
    boolean b3 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration4 = weakHashtable0.keys();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj8 = weakHashtable5.put((java.lang.Object)weakHashtable6, (java.lang.Object)(byte)1);
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    java.util.Enumeration enumeration10 = weakHashtable5.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    boolean b2 = weakHashtable0.isEmpty();
    boolean b3 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.util.Set set2 = weakHashtable0.entrySet();
    boolean b3 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration4 = weakHashtable0.keys();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj8 = weakHashtable5.put((java.lang.Object)weakHashtable6, (java.lang.Object)(byte)1);
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    boolean b10 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.util.Set set2 = weakHashtable0.entrySet();
    boolean b3 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration4 = weakHashtable0.keys();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj8 = weakHashtable5.put((java.lang.Object)weakHashtable6, (java.lang.Object)(byte)1);
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    weakHashtable5.putAll((java.util.Map)weakHashtable10);
    java.lang.Object obj14 = weakHashtable10.get((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.util.Set set2 = weakHashtable0.entrySet();
    boolean b3 = weakHashtable0.isEmpty();
    boolean b5 = weakHashtable0.containsKey((java.lang.Object)1.0d);
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Enumeration enumeration7 = weakHashtable6.keys();
    java.lang.Object obj9 = weakHashtable0.put((java.lang.Object)enumeration7, (java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.util.Set set2 = weakHashtable0.entrySet();
    boolean b3 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration4 = weakHashtable0.keys();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj8 = weakHashtable5.put((java.lang.Object)weakHashtable6, (java.lang.Object)(byte)1);
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    weakHashtable5.putAll((java.util.Map)weakHashtable10);
    java.lang.Object obj15 = weakHashtable10.put((java.lang.Object)1.0f, (java.lang.Object)100.0f);
    java.util.Collection collection16 = weakHashtable10.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.util.Set set2 = weakHashtable0.entrySet();
    boolean b3 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration4 = weakHashtable0.keys();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj8 = weakHashtable5.put((java.lang.Object)weakHashtable6, (java.lang.Object)(byte)1);
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    weakHashtable5.putAll((java.util.Map)weakHashtable10);
    int i13 = weakHashtable10.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.util.Set set2 = weakHashtable0.entrySet();
    boolean b3 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.util.Set set6 = weakHashtable4.entrySet();
    boolean b7 = weakHashtable4.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable4);
    java.util.Enumeration enumeration9 = weakHashtable4.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.lang.Object obj3 = weakHashtable0.get((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.util.Set set2 = weakHashtable0.entrySet();
    boolean b3 = weakHashtable0.isEmpty();
    boolean b5 = weakHashtable0.containsKey((java.lang.Object)1.0d);
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Enumeration enumeration7 = weakHashtable6.keys();
    java.util.Set set8 = weakHashtable6.entrySet();
    boolean b9 = weakHashtable6.isEmpty();
    java.util.Enumeration enumeration10 = weakHashtable6.keys();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.lang.Object obj14 = weakHashtable11.put((java.lang.Object)weakHashtable12, (java.lang.Object)(byte)1);
    weakHashtable6.putAll((java.util.Map)weakHashtable11);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Enumeration enumeration17 = weakHashtable16.keys();
    weakHashtable11.putAll((java.util.Map)weakHashtable16);
    java.lang.String str19 = weakHashtable11.toString();
    weakHashtable0.putAll((java.util.Map)weakHashtable11);
    java.util.Enumeration enumeration21 = weakHashtable11.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{{}=1}"+ "'", str19.equals("{{}=1}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.util.Set set2 = weakHashtable0.entrySet();
    boolean b3 = weakHashtable0.isEmpty();
    boolean b5 = weakHashtable0.containsKey((java.lang.Object)1.0d);
    boolean b6 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.util.Set set2 = weakHashtable0.entrySet();
    boolean b3 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.util.Set set6 = weakHashtable4.entrySet();
    boolean b7 = weakHashtable4.isEmpty();
    java.util.Set set8 = weakHashtable4.keySet();
    java.lang.Object obj9 = weakHashtable0.remove((java.lang.Object)set8);
    java.lang.Object obj11 = weakHashtable0.remove((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.lang.Object obj3 = weakHashtable0.remove((java.lang.Object)'4');
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.util.Set set6 = weakHashtable4.entrySet();
    boolean b7 = weakHashtable4.isEmpty();
    java.util.Enumeration enumeration8 = weakHashtable4.keys();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.lang.Object obj12 = weakHashtable9.put((java.lang.Object)weakHashtable10, (java.lang.Object)(byte)1);
    weakHashtable4.putAll((java.util.Map)weakHashtable9);
    java.lang.String str14 = weakHashtable4.toString();
    java.util.Enumeration enumeration15 = weakHashtable4.keys();
    java.util.Set set16 = weakHashtable4.entrySet();
    boolean b17 = weakHashtable0.containsKey((java.lang.Object)weakHashtable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{{}=1}"+ "'", str14.equals("{{}=1}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

}
