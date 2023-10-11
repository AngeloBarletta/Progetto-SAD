
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    java.util.Collection collection7 = weakHashtable4.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj5 = new java.lang.Object();
    boolean b6 = weakHashtable2.containsKey(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    weakHashtable2.putAll((java.util.Map)weakHashtable4);
    java.util.Set set7 = weakHashtable4.keySet();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b9 = weakHashtable8.isEmpty();
    java.util.Set set10 = weakHashtable8.entrySet();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.util.Enumeration enumeration13 = weakHashtable12.keys();
    java.lang.Object obj14 = weakHashtable8.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable12);
    java.lang.Object obj15 = weakHashtable4.get((java.lang.Object)weakHashtable12);
    weakHashtable0.putAll((java.util.Map)weakHashtable12);
    java.util.Collection collection17 = weakHashtable0.values();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    boolean b19 = weakHashtable18.isEmpty();
    java.util.Set set20 = weakHashtable18.entrySet();
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Enumeration enumeration23 = weakHashtable22.keys();
    java.lang.Object obj24 = weakHashtable18.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable22);
    java.util.Collection collection25 = weakHashtable18.values();
    boolean b27 = weakHashtable18.containsKey((java.lang.Object)false);
    java.lang.Object obj28 = weakHashtable0.remove((java.lang.Object)weakHashtable18);
    java.util.Set set29 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.String str4 = weakHashtable0.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.util.Set set10 = weakHashtable7.keySet();
    boolean b11 = weakHashtable0.containsKey((java.lang.Object)weakHashtable7);
    java.util.Enumeration enumeration12 = weakHashtable0.keys();
    java.util.Collection collection13 = weakHashtable0.values();
    java.util.Set set14 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Set set5 = weakHashtable2.keySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    java.lang.Object obj13 = weakHashtable2.get((java.lang.Object)weakHashtable10);
    java.lang.String str14 = weakHashtable10.toString();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    boolean b16 = weakHashtable15.isEmpty();
    java.util.Set set17 = weakHashtable15.entrySet();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    java.util.Enumeration enumeration20 = weakHashtable19.keys();
    java.lang.Object obj21 = weakHashtable15.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable19);
    WeakHashtable weakHashtable22 = new WeakHashtable();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    boolean b24 = weakHashtable23.isEmpty();
    java.util.Set set25 = weakHashtable23.entrySet();
    java.lang.Object obj26 = weakHashtable22.get((java.lang.Object)weakHashtable23);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj27 = weakHashtable10.put((java.lang.Object)(byte)10, obj26);
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
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    weakHashtable2.putAll((java.util.Map)weakHashtable4);
    java.util.Set set7 = weakHashtable4.keySet();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b9 = weakHashtable8.isEmpty();
    java.util.Set set10 = weakHashtable8.entrySet();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.util.Enumeration enumeration13 = weakHashtable12.keys();
    java.lang.Object obj14 = weakHashtable8.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable12);
    java.lang.Object obj15 = weakHashtable4.get((java.lang.Object)weakHashtable12);
    weakHashtable0.putAll((java.util.Map)weakHashtable12);
    java.util.Collection collection17 = weakHashtable0.values();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    boolean b19 = weakHashtable18.isEmpty();
    java.util.Set set20 = weakHashtable18.entrySet();
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Enumeration enumeration23 = weakHashtable22.keys();
    java.lang.Object obj24 = weakHashtable18.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable22);
    java.util.Collection collection25 = weakHashtable18.values();
    boolean b27 = weakHashtable18.containsKey((java.lang.Object)false);
    java.lang.Object obj28 = weakHashtable0.remove((java.lang.Object)weakHashtable18);
    WeakHashtable weakHashtable29 = new WeakHashtable();
    boolean b30 = weakHashtable29.isEmpty();
    WeakHashtable weakHashtable31 = new WeakHashtable();
    boolean b32 = weakHashtable31.isEmpty();
    weakHashtable29.putAll((java.util.Map)weakHashtable31);
    weakHashtable18.putAll((java.util.Map)weakHashtable31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    weakHashtable2.putAll((java.util.Map)weakHashtable4);
    java.util.Set set7 = weakHashtable4.keySet();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b9 = weakHashtable8.isEmpty();
    java.util.Set set10 = weakHashtable8.entrySet();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.util.Enumeration enumeration13 = weakHashtable12.keys();
    java.lang.Object obj14 = weakHashtable8.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable12);
    java.lang.Object obj15 = weakHashtable4.get((java.lang.Object)weakHashtable12);
    weakHashtable0.putAll((java.util.Map)weakHashtable12);
    java.util.Enumeration enumeration17 = weakHashtable12.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration17);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    java.util.Collection collection7 = weakHashtable0.values();
    boolean b9 = weakHashtable0.containsKey((java.lang.Object)false);
    java.util.Set set10 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.String str5 = weakHashtable0.toString();
    java.util.Collection collection6 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    java.util.Enumeration enumeration3 = weakHashtable0.elements();
    boolean b4 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    WeakHashtable weakHashtable10 = new WeakHashtable();
    boolean b11 = weakHashtable10.isEmpty();
    java.util.Enumeration enumeration12 = weakHashtable10.elements();
    java.util.Enumeration enumeration13 = weakHashtable10.elements();
    boolean b14 = weakHashtable10.isEmpty();
    weakHashtable5.putAll((java.util.Map)weakHashtable10);
    java.lang.Object obj16 = weakHashtable0.remove((java.lang.Object)weakHashtable5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    java.util.Set set3 = weakHashtable1.entrySet();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable1);
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    java.util.Enumeration enumeration7 = weakHashtable5.elements();
    java.lang.Object obj10 = weakHashtable5.put((java.lang.Object)(short)1, (java.lang.Object)10);
    weakHashtable1.putAll((java.util.Map)weakHashtable5);
    WeakHashtable weakHashtable12 = new WeakHashtable();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b14 = weakHashtable13.isEmpty();
    java.util.Set set15 = weakHashtable13.entrySet();
    java.lang.Object obj16 = weakHashtable12.get((java.lang.Object)weakHashtable13);
    WeakHashtable weakHashtable17 = new WeakHashtable();
    boolean b18 = weakHashtable17.isEmpty();
    java.util.Enumeration enumeration19 = weakHashtable17.elements();
    java.lang.Object obj22 = weakHashtable17.put((java.lang.Object)(short)1, (java.lang.Object)10);
    weakHashtable13.putAll((java.util.Map)weakHashtable17);
    weakHashtable5.putAll((java.util.Map)weakHashtable13);
    java.util.Enumeration enumeration25 = weakHashtable5.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration25);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    int i5 = weakHashtable2.size();
    java.lang.String str6 = weakHashtable2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}"+ "'", str6.equals("{}"));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Set set5 = weakHashtable2.keySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    java.lang.Object obj13 = weakHashtable2.get((java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    java.util.Set set16 = weakHashtable14.entrySet();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    java.util.Enumeration enumeration19 = weakHashtable18.keys();
    java.lang.Object obj20 = weakHashtable14.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable18);
    java.lang.Object obj21 = weakHashtable2.remove((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable7.elements();
    java.util.Enumeration enumeration10 = weakHashtable7.elements();
    java.lang.Object obj11 = weakHashtable4.get((java.lang.Object)weakHashtable7);
    int i12 = weakHashtable7.size();
    java.util.Enumeration enumeration13 = weakHashtable7.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable7.elements();
    java.util.Enumeration enumeration10 = weakHashtable7.elements();
    java.lang.Object obj11 = weakHashtable4.get((java.lang.Object)weakHashtable7);
    WeakHashtable weakHashtable12 = new WeakHashtable();
    boolean b13 = weakHashtable12.isEmpty();
    java.util.Enumeration enumeration14 = weakHashtable12.elements();
    boolean b15 = weakHashtable12.isEmpty();
    java.lang.String str16 = weakHashtable12.toString();
    weakHashtable4.putAll((java.util.Map)weakHashtable12);
    java.util.Enumeration enumeration18 = weakHashtable4.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}"+ "'", str16.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.String str4 = weakHashtable0.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.util.Set set10 = weakHashtable7.keySet();
    boolean b11 = weakHashtable0.containsKey((java.lang.Object)weakHashtable7);
    java.util.Enumeration enumeration12 = weakHashtable0.elements();
    java.lang.Object obj14 = weakHashtable0.remove((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    java.util.Collection collection7 = weakHashtable0.values();
    int i8 = weakHashtable0.size();
    boolean b10 = weakHashtable0.containsKey((java.lang.Object)'#');
    java.util.Collection collection11 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    weakHashtable2.putAll((java.util.Map)weakHashtable4);
    java.util.Set set7 = weakHashtable4.keySet();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b9 = weakHashtable8.isEmpty();
    java.util.Set set10 = weakHashtable8.entrySet();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.util.Enumeration enumeration13 = weakHashtable12.keys();
    java.lang.Object obj14 = weakHashtable8.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable12);
    java.lang.Object obj15 = weakHashtable4.get((java.lang.Object)weakHashtable12);
    weakHashtable0.putAll((java.util.Map)weakHashtable12);
    java.util.Set set17 = weakHashtable12.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    java.lang.String str7 = weakHashtable4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}"+ "'", str7.equals("{}"));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    java.util.Enumeration enumeration3 = weakHashtable1.elements();
    boolean b4 = weakHashtable1.isEmpty();
    java.lang.Object obj5 = weakHashtable0.remove((java.lang.Object)b4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable7.elements();
    java.util.Enumeration enumeration10 = weakHashtable7.elements();
    java.lang.Object obj11 = weakHashtable4.get((java.lang.Object)weakHashtable7);
    java.lang.Object obj13 = weakHashtable4.remove((java.lang.Object)1);
    int i14 = weakHashtable4.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.Object obj5 = weakHashtable0.remove((java.lang.Object)(byte)1);
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b14 = weakHashtable13.isEmpty();
    java.util.Enumeration enumeration15 = weakHashtable13.elements();
    java.util.Enumeration enumeration16 = weakHashtable13.elements();
    java.lang.Object obj17 = weakHashtable10.get((java.lang.Object)weakHashtable13);
    weakHashtable0.putAll((java.util.Map)weakHashtable10);
    int i19 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.util.Set set4 = weakHashtable2.entrySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Enumeration enumeration7 = weakHashtable6.keys();
    java.lang.Object obj8 = weakHashtable2.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable6);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    boolean b10 = weakHashtable9.isEmpty();
    java.util.Enumeration enumeration11 = weakHashtable9.elements();
    java.util.Enumeration enumeration12 = weakHashtable9.elements();
    java.lang.Object obj13 = weakHashtable6.get((java.lang.Object)weakHashtable9);
    int i14 = weakHashtable9.size();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    boolean b16 = weakHashtable15.isEmpty();
    java.util.Set set17 = weakHashtable15.entrySet();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    java.util.Enumeration enumeration20 = weakHashtable19.keys();
    java.lang.Object obj21 = weakHashtable15.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable19);
    java.util.Enumeration enumeration22 = weakHashtable15.elements();
    weakHashtable9.putAll((java.util.Map)weakHashtable15);
    java.util.Set set24 = weakHashtable15.keySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable15);
    WeakHashtable weakHashtable26 = new WeakHashtable();
    boolean b27 = weakHashtable26.isEmpty();
    java.util.Enumeration enumeration28 = weakHashtable26.elements();
    java.lang.Object obj31 = weakHashtable26.put((java.lang.Object)(short)1, (java.lang.Object)10);
    java.lang.Object obj32 = weakHashtable15.get((java.lang.Object)weakHashtable26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.String str4 = weakHashtable0.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.util.Set set10 = weakHashtable7.keySet();
    boolean b11 = weakHashtable0.containsKey((java.lang.Object)weakHashtable7);
    java.util.Enumeration enumeration12 = weakHashtable0.elements();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b14 = weakHashtable13.isEmpty();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    boolean b16 = weakHashtable15.isEmpty();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    boolean b18 = weakHashtable17.isEmpty();
    weakHashtable15.putAll((java.util.Map)weakHashtable17);
    java.util.Set set20 = weakHashtable17.keySet();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    boolean b22 = weakHashtable21.isEmpty();
    java.util.Set set23 = weakHashtable21.entrySet();
    WeakHashtable weakHashtable25 = new WeakHashtable();
    java.util.Enumeration enumeration26 = weakHashtable25.keys();
    java.lang.Object obj27 = weakHashtable21.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable25);
    java.lang.Object obj28 = weakHashtable17.get((java.lang.Object)weakHashtable25);
    weakHashtable13.putAll((java.util.Map)weakHashtable25);
    java.util.Collection collection30 = weakHashtable13.values();
    WeakHashtable weakHashtable31 = new WeakHashtable();
    boolean b32 = weakHashtable31.isEmpty();
    java.util.Set set33 = weakHashtable31.entrySet();
    WeakHashtable weakHashtable35 = new WeakHashtable();
    java.util.Enumeration enumeration36 = weakHashtable35.keys();
    java.lang.Object obj37 = weakHashtable31.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable35);
    java.util.Collection collection38 = weakHashtable31.values();
    boolean b40 = weakHashtable31.containsKey((java.lang.Object)false);
    java.lang.Object obj41 = weakHashtable13.remove((java.lang.Object)weakHashtable31);
    WeakHashtable weakHashtable42 = new WeakHashtable();
    boolean b43 = weakHashtable42.isEmpty();
    java.util.Set set44 = weakHashtable42.entrySet();
    WeakHashtable weakHashtable46 = new WeakHashtable();
    java.util.Enumeration enumeration47 = weakHashtable46.keys();
    java.lang.Object obj48 = weakHashtable42.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable46);
    weakHashtable13.putAll((java.util.Map)weakHashtable42);
    weakHashtable0.putAll((java.util.Map)weakHashtable42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj48);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    java.util.Enumeration enumeration3 = weakHashtable0.elements();
    java.lang.Object obj5 = weakHashtable0.remove((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.String str4 = weakHashtable0.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.util.Set set10 = weakHashtable7.keySet();
    boolean b11 = weakHashtable0.containsKey((java.lang.Object)weakHashtable7);
    java.util.Enumeration enumeration12 = weakHashtable0.keys();
    int i13 = weakHashtable0.size();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    boolean b19 = weakHashtable18.isEmpty();
    weakHashtable16.putAll((java.util.Map)weakHashtable18);
    java.util.Set set21 = weakHashtable18.keySet();
    WeakHashtable weakHashtable22 = new WeakHashtable();
    boolean b23 = weakHashtable22.isEmpty();
    java.util.Set set24 = weakHashtable22.entrySet();
    WeakHashtable weakHashtable26 = new WeakHashtable();
    java.util.Enumeration enumeration27 = weakHashtable26.keys();
    java.lang.Object obj28 = weakHashtable22.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable26);
    java.lang.Object obj29 = weakHashtable18.get((java.lang.Object)weakHashtable26);
    weakHashtable14.putAll((java.util.Map)weakHashtable26);
    java.util.Collection collection31 = weakHashtable14.values();
    WeakHashtable weakHashtable32 = new WeakHashtable();
    boolean b33 = weakHashtable32.isEmpty();
    java.util.Set set34 = weakHashtable32.entrySet();
    WeakHashtable weakHashtable36 = new WeakHashtable();
    java.util.Enumeration enumeration37 = weakHashtable36.keys();
    java.lang.Object obj38 = weakHashtable32.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable36);
    java.util.Collection collection39 = weakHashtable32.values();
    boolean b41 = weakHashtable32.containsKey((java.lang.Object)false);
    java.lang.Object obj42 = weakHashtable14.remove((java.lang.Object)weakHashtable32);
    weakHashtable0.putAll((java.util.Map)weakHashtable32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Set set5 = weakHashtable2.keySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    java.lang.Object obj13 = weakHashtable2.get((java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    java.util.Set set18 = weakHashtable16.entrySet();
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.util.Enumeration enumeration21 = weakHashtable20.keys();
    java.lang.Object obj22 = weakHashtable16.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable20);
    java.util.Collection collection23 = weakHashtable16.values();
    java.lang.Object obj24 = weakHashtable10.put((java.lang.Object)weakHashtable14, (java.lang.Object)weakHashtable16);
    WeakHashtable weakHashtable25 = new WeakHashtable();
    boolean b26 = weakHashtable25.isEmpty();
    java.util.Enumeration enumeration27 = weakHashtable25.elements();
    boolean b28 = weakHashtable25.isEmpty();
    java.lang.String str29 = weakHashtable25.toString();
    weakHashtable16.putAll((java.util.Map)weakHashtable25);
    WeakHashtable weakHashtable31 = new WeakHashtable();
    boolean b32 = weakHashtable31.isEmpty();
    java.util.Set set33 = weakHashtable31.entrySet();
    WeakHashtable weakHashtable35 = new WeakHashtable();
    java.util.Enumeration enumeration36 = weakHashtable35.keys();
    java.lang.Object obj37 = weakHashtable31.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable35);
    WeakHashtable weakHashtable38 = new WeakHashtable();
    boolean b39 = weakHashtable38.isEmpty();
    java.util.Enumeration enumeration40 = weakHashtable38.elements();
    java.util.Enumeration enumeration41 = weakHashtable38.elements();
    java.lang.Object obj42 = weakHashtable35.get((java.lang.Object)weakHashtable38);
    java.lang.Object obj44 = weakHashtable35.remove((java.lang.Object)1);
    WeakHashtable weakHashtable45 = new WeakHashtable();
    boolean b46 = weakHashtable45.isEmpty();
    java.util.Enumeration enumeration47 = weakHashtable45.elements();
    boolean b48 = weakHashtable45.isEmpty();
    java.lang.String str49 = weakHashtable45.toString();
    WeakHashtable weakHashtable50 = new WeakHashtable();
    boolean b51 = weakHashtable50.isEmpty();
    WeakHashtable weakHashtable52 = new WeakHashtable();
    boolean b53 = weakHashtable52.isEmpty();
    weakHashtable50.putAll((java.util.Map)weakHashtable52);
    java.util.Set set55 = weakHashtable52.keySet();
    boolean b56 = weakHashtable45.containsKey((java.lang.Object)weakHashtable52);
    java.util.Enumeration enumeration57 = weakHashtable45.keys();
    java.util.Collection collection58 = weakHashtable45.values();
    boolean b59 = weakHashtable35.containsKey((java.lang.Object)weakHashtable45);
    java.lang.Object obj60 = weakHashtable16.get((java.lang.Object)weakHashtable45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}"+ "'", str29.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}"+ "'", str49.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj60);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    java.util.Collection collection7 = weakHashtable0.values();
    int i8 = weakHashtable0.size();
    java.util.Set set9 = weakHashtable0.keySet();
    java.util.Map map10 = null;
    weakHashtable0.putAll(map10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    java.util.Collection collection7 = weakHashtable0.values();
    int i8 = weakHashtable0.size();
    boolean b10 = weakHashtable0.containsKey((java.lang.Object)'#');
    int i11 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Enumeration enumeration2 = weakHashtable0.keys();
    int i3 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    java.util.Enumeration enumeration7 = weakHashtable5.elements();
    java.util.Enumeration enumeration8 = weakHashtable5.elements();
    boolean b9 = weakHashtable5.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    boolean b12 = weakHashtable11.isEmpty();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b14 = weakHashtable13.isEmpty();
    weakHashtable11.putAll((java.util.Map)weakHashtable13);
    java.lang.Object obj16 = weakHashtable5.get((java.lang.Object)weakHashtable13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable7.elements();
    java.util.Enumeration enumeration10 = weakHashtable7.elements();
    java.lang.Object obj11 = weakHashtable4.get((java.lang.Object)weakHashtable7);
    java.lang.Object obj13 = weakHashtable4.remove((java.lang.Object)1);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    java.util.Enumeration enumeration16 = weakHashtable14.elements();
    boolean b17 = weakHashtable14.isEmpty();
    java.lang.String str18 = weakHashtable14.toString();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    boolean b20 = weakHashtable19.isEmpty();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    boolean b22 = weakHashtable21.isEmpty();
    weakHashtable19.putAll((java.util.Map)weakHashtable21);
    java.util.Set set24 = weakHashtable21.keySet();
    boolean b25 = weakHashtable14.containsKey((java.lang.Object)weakHashtable21);
    java.util.Enumeration enumeration26 = weakHashtable14.keys();
    java.util.Collection collection27 = weakHashtable14.values();
    boolean b28 = weakHashtable4.containsKey((java.lang.Object)weakHashtable14);
    java.util.Collection collection29 = weakHashtable4.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}"+ "'", str18.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection29);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable7.elements();
    java.util.Enumeration enumeration10 = weakHashtable7.elements();
    java.lang.Object obj11 = weakHashtable4.get((java.lang.Object)weakHashtable7);
    java.lang.Object obj13 = weakHashtable4.remove((java.lang.Object)1);
    java.util.Set set14 = weakHashtable4.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    java.util.Enumeration enumeration7 = weakHashtable0.elements();
    int i8 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.String str4 = weakHashtable0.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.util.Set set10 = weakHashtable7.keySet();
    boolean b11 = weakHashtable0.containsKey((java.lang.Object)weakHashtable7);
    java.util.Enumeration enumeration12 = weakHashtable0.keys();
    int i13 = weakHashtable0.size();
    java.util.Enumeration enumeration14 = weakHashtable0.elements();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    boolean b16 = weakHashtable15.isEmpty();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    boolean b18 = weakHashtable17.isEmpty();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    boolean b20 = weakHashtable19.isEmpty();
    weakHashtable17.putAll((java.util.Map)weakHashtable19);
    java.util.Set set22 = weakHashtable19.keySet();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    boolean b24 = weakHashtable23.isEmpty();
    java.util.Set set25 = weakHashtable23.entrySet();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.util.Enumeration enumeration28 = weakHashtable27.keys();
    java.lang.Object obj29 = weakHashtable23.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable27);
    java.lang.Object obj30 = weakHashtable19.get((java.lang.Object)weakHashtable27);
    weakHashtable15.putAll((java.util.Map)weakHashtable27);
    java.util.Collection collection32 = weakHashtable15.values();
    WeakHashtable weakHashtable33 = new WeakHashtable();
    boolean b34 = weakHashtable33.isEmpty();
    java.util.Set set35 = weakHashtable33.entrySet();
    WeakHashtable weakHashtable37 = new WeakHashtable();
    java.util.Enumeration enumeration38 = weakHashtable37.keys();
    java.lang.Object obj39 = weakHashtable33.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable37);
    java.util.Collection collection40 = weakHashtable33.values();
    boolean b42 = weakHashtable33.containsKey((java.lang.Object)false);
    java.lang.Object obj43 = weakHashtable15.remove((java.lang.Object)weakHashtable33);
    WeakHashtable weakHashtable44 = new WeakHashtable();
    boolean b45 = weakHashtable44.isEmpty();
    java.util.Set set46 = weakHashtable44.entrySet();
    WeakHashtable weakHashtable48 = new WeakHashtable();
    java.util.Enumeration enumeration49 = weakHashtable48.keys();
    java.lang.Object obj50 = weakHashtable44.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable48);
    weakHashtable15.putAll((java.util.Map)weakHashtable44);
    java.lang.String str52 = weakHashtable44.toString();
    weakHashtable0.putAll((java.util.Map)weakHashtable44);
    java.util.Set set54 = weakHashtable44.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{10={}}"+ "'", str52.equals("{10={}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set54);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.String str4 = weakHashtable0.toString();
    boolean b5 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration6 = weakHashtable0.keys();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Collection collection8 = weakHashtable7.values();
    weakHashtable0.putAll((java.util.Map)weakHashtable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection8);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable7.elements();
    java.util.Enumeration enumeration10 = weakHashtable7.elements();
    java.lang.Object obj11 = weakHashtable4.get((java.lang.Object)weakHashtable7);
    java.lang.Object obj13 = weakHashtable4.remove((java.lang.Object)1);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    java.util.Enumeration enumeration16 = weakHashtable14.elements();
    boolean b17 = weakHashtable14.isEmpty();
    java.lang.String str18 = weakHashtable14.toString();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    boolean b20 = weakHashtable19.isEmpty();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    boolean b22 = weakHashtable21.isEmpty();
    weakHashtable19.putAll((java.util.Map)weakHashtable21);
    java.util.Set set24 = weakHashtable21.keySet();
    boolean b25 = weakHashtable14.containsKey((java.lang.Object)weakHashtable21);
    java.util.Enumeration enumeration26 = weakHashtable14.keys();
    java.util.Collection collection27 = weakHashtable14.values();
    boolean b28 = weakHashtable4.containsKey((java.lang.Object)weakHashtable14);
    int i29 = weakHashtable14.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}"+ "'", str18.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.Object obj5 = weakHashtable0.remove((java.lang.Object)(byte)1);
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b14 = weakHashtable13.isEmpty();
    java.util.Enumeration enumeration15 = weakHashtable13.elements();
    java.util.Enumeration enumeration16 = weakHashtable13.elements();
    java.lang.Object obj17 = weakHashtable10.get((java.lang.Object)weakHashtable13);
    weakHashtable0.putAll((java.util.Map)weakHashtable10);
    boolean b19 = weakHashtable10.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable7.elements();
    java.util.Enumeration enumeration10 = weakHashtable7.elements();
    java.lang.Object obj11 = weakHashtable4.get((java.lang.Object)weakHashtable7);
    java.lang.Object obj13 = weakHashtable4.remove((java.lang.Object)1);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    java.util.Enumeration enumeration16 = weakHashtable14.elements();
    boolean b17 = weakHashtable14.isEmpty();
    java.lang.String str18 = weakHashtable14.toString();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    boolean b20 = weakHashtable19.isEmpty();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    boolean b22 = weakHashtable21.isEmpty();
    weakHashtable19.putAll((java.util.Map)weakHashtable21);
    java.util.Set set24 = weakHashtable21.keySet();
    boolean b25 = weakHashtable14.containsKey((java.lang.Object)weakHashtable21);
    java.util.Enumeration enumeration26 = weakHashtable14.keys();
    java.util.Collection collection27 = weakHashtable14.values();
    boolean b28 = weakHashtable4.containsKey((java.lang.Object)weakHashtable14);
    java.util.Enumeration enumeration29 = weakHashtable14.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}"+ "'", str18.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration29);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration4 = weakHashtable0.keys();
    java.util.Collection collection5 = weakHashtable0.values();
    java.util.Enumeration enumeration6 = weakHashtable0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Enumeration enumeration1 = weakHashtable0.keys();
    java.util.Set set2 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.util.Set set4 = weakHashtable2.entrySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Enumeration enumeration7 = weakHashtable6.keys();
    java.lang.Object obj8 = weakHashtable2.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable6);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    boolean b10 = weakHashtable9.isEmpty();
    java.util.Enumeration enumeration11 = weakHashtable9.elements();
    java.util.Enumeration enumeration12 = weakHashtable9.elements();
    java.lang.Object obj13 = weakHashtable6.get((java.lang.Object)weakHashtable9);
    int i14 = weakHashtable9.size();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    boolean b16 = weakHashtable15.isEmpty();
    java.util.Set set17 = weakHashtable15.entrySet();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    java.util.Enumeration enumeration20 = weakHashtable19.keys();
    java.lang.Object obj21 = weakHashtable15.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable19);
    java.util.Enumeration enumeration22 = weakHashtable15.elements();
    weakHashtable9.putAll((java.util.Map)weakHashtable15);
    java.util.Set set24 = weakHashtable15.keySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable15);
    java.util.Set set26 = weakHashtable15.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.util.Set set4 = weakHashtable2.entrySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Enumeration enumeration7 = weakHashtable6.keys();
    java.lang.Object obj8 = weakHashtable2.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable6);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    boolean b10 = weakHashtable9.isEmpty();
    java.util.Enumeration enumeration11 = weakHashtable9.elements();
    java.util.Enumeration enumeration12 = weakHashtable9.elements();
    java.lang.Object obj13 = weakHashtable6.get((java.lang.Object)weakHashtable9);
    int i14 = weakHashtable9.size();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    boolean b16 = weakHashtable15.isEmpty();
    java.util.Set set17 = weakHashtable15.entrySet();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    java.util.Enumeration enumeration20 = weakHashtable19.keys();
    java.lang.Object obj21 = weakHashtable15.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable19);
    java.util.Enumeration enumeration22 = weakHashtable15.elements();
    weakHashtable9.putAll((java.util.Map)weakHashtable15);
    java.util.Set set24 = weakHashtable15.keySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable15);
    java.util.Set set26 = weakHashtable0.entrySet();
    java.lang.String str27 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{10={}}"+ "'", str27.equals("{10={}}"));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    java.util.Collection collection7 = weakHashtable0.values();
    int i8 = weakHashtable0.size();
    boolean b10 = weakHashtable0.containsKey((java.lang.Object)'#');
    WeakHashtable weakHashtable11 = new WeakHashtable();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    boolean b13 = weakHashtable12.isEmpty();
    java.util.Set set14 = weakHashtable12.entrySet();
    java.lang.Object obj15 = weakHashtable11.get((java.lang.Object)weakHashtable12);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    java.util.Enumeration enumeration18 = weakHashtable16.elements();
    java.lang.Object obj21 = weakHashtable16.put((java.lang.Object)(short)1, (java.lang.Object)10);
    weakHashtable12.putAll((java.util.Map)weakHashtable16);
    java.lang.Object obj24 = weakHashtable0.put((java.lang.Object)weakHashtable16, (java.lang.Object)"{}");
    WeakHashtable weakHashtable25 = new WeakHashtable();
    boolean b26 = weakHashtable25.isEmpty();
    java.util.Enumeration enumeration27 = weakHashtable25.elements();
    boolean b28 = weakHashtable25.isEmpty();
    WeakHashtable weakHashtable29 = new WeakHashtable();
    boolean b30 = weakHashtable29.isEmpty();
    java.util.Enumeration enumeration31 = weakHashtable29.elements();
    java.util.Enumeration enumeration32 = weakHashtable29.elements();
    java.lang.Object obj33 = weakHashtable16.put((java.lang.Object)weakHashtable25, (java.lang.Object)weakHashtable29);
    java.util.Set set34 = weakHashtable29.keySet();
    java.util.Set set35 = weakHashtable29.keySet();
    java.util.Enumeration enumeration36 = weakHashtable29.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration36);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    boolean b4 = weakHashtable3.isEmpty();
    java.util.Enumeration enumeration5 = weakHashtable3.elements();
    java.lang.Object obj8 = weakHashtable3.put((java.lang.Object)(short)1, (java.lang.Object)10);
    java.lang.Object obj9 = weakHashtable0.get((java.lang.Object)(short)1);
    java.util.Set set10 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    java.lang.Object obj5 = weakHashtable0.put((java.lang.Object)(short)1, (java.lang.Object)10);
    java.util.Set set6 = weakHashtable0.entrySet();
    boolean b7 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration8 = weakHashtable0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    weakHashtable2.putAll((java.util.Map)weakHashtable4);
    java.util.Set set7 = weakHashtable4.keySet();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b9 = weakHashtable8.isEmpty();
    java.util.Set set10 = weakHashtable8.entrySet();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.util.Enumeration enumeration13 = weakHashtable12.keys();
    java.lang.Object obj14 = weakHashtable8.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable12);
    java.lang.Object obj15 = weakHashtable4.get((java.lang.Object)weakHashtable12);
    weakHashtable0.putAll((java.util.Map)weakHashtable12);
    java.util.Set set17 = weakHashtable12.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    java.util.Enumeration enumeration7 = weakHashtable5.elements();
    java.util.Enumeration enumeration8 = weakHashtable5.elements();
    boolean b9 = weakHashtable5.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.lang.Object obj13 = weakHashtable5.get((java.lang.Object)collection12);
    boolean b14 = weakHashtable5.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.String str4 = weakHashtable0.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.util.Set set10 = weakHashtable7.keySet();
    boolean b11 = weakHashtable0.containsKey((java.lang.Object)weakHashtable7);
    java.util.Enumeration enumeration12 = weakHashtable0.keys();
    int i13 = weakHashtable0.size();
    java.util.Enumeration enumeration14 = weakHashtable0.elements();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    boolean b16 = weakHashtable15.isEmpty();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    boolean b18 = weakHashtable17.isEmpty();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    boolean b20 = weakHashtable19.isEmpty();
    weakHashtable17.putAll((java.util.Map)weakHashtable19);
    java.util.Set set22 = weakHashtable19.keySet();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    boolean b24 = weakHashtable23.isEmpty();
    java.util.Set set25 = weakHashtable23.entrySet();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.util.Enumeration enumeration28 = weakHashtable27.keys();
    java.lang.Object obj29 = weakHashtable23.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable27);
    java.lang.Object obj30 = weakHashtable19.get((java.lang.Object)weakHashtable27);
    weakHashtable15.putAll((java.util.Map)weakHashtable27);
    java.util.Collection collection32 = weakHashtable15.values();
    WeakHashtable weakHashtable33 = new WeakHashtable();
    boolean b34 = weakHashtable33.isEmpty();
    java.util.Set set35 = weakHashtable33.entrySet();
    WeakHashtable weakHashtable37 = new WeakHashtable();
    java.util.Enumeration enumeration38 = weakHashtable37.keys();
    java.lang.Object obj39 = weakHashtable33.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable37);
    java.util.Collection collection40 = weakHashtable33.values();
    boolean b42 = weakHashtable33.containsKey((java.lang.Object)false);
    java.lang.Object obj43 = weakHashtable15.remove((java.lang.Object)weakHashtable33);
    WeakHashtable weakHashtable44 = new WeakHashtable();
    boolean b45 = weakHashtable44.isEmpty();
    java.util.Set set46 = weakHashtable44.entrySet();
    WeakHashtable weakHashtable48 = new WeakHashtable();
    java.util.Enumeration enumeration49 = weakHashtable48.keys();
    java.lang.Object obj50 = weakHashtable44.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable48);
    weakHashtable15.putAll((java.util.Map)weakHashtable44);
    java.lang.String str52 = weakHashtable44.toString();
    weakHashtable0.putAll((java.util.Map)weakHashtable44);
    java.util.Set set54 = weakHashtable44.keySet();
    int i55 = weakHashtable44.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{10={}}"+ "'", str52.equals("{10={}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable7.elements();
    java.util.Enumeration enumeration10 = weakHashtable7.elements();
    java.lang.Object obj11 = weakHashtable4.get((java.lang.Object)weakHashtable7);
    int i12 = weakHashtable7.size();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b14 = weakHashtable13.isEmpty();
    java.util.Set set15 = weakHashtable13.entrySet();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.util.Enumeration enumeration18 = weakHashtable17.keys();
    java.lang.Object obj19 = weakHashtable13.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable17);
    java.util.Enumeration enumeration20 = weakHashtable13.elements();
    weakHashtable7.putAll((java.util.Map)weakHashtable13);
    java.util.Set set22 = weakHashtable13.keySet();
    int i23 = weakHashtable13.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.Object obj5 = weakHashtable0.remove((java.lang.Object)(byte)1);
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b14 = weakHashtable13.isEmpty();
    java.util.Enumeration enumeration15 = weakHashtable13.elements();
    java.util.Enumeration enumeration16 = weakHashtable13.elements();
    java.lang.Object obj17 = weakHashtable10.get((java.lang.Object)weakHashtable13);
    weakHashtable0.putAll((java.util.Map)weakHashtable10);
    WeakHashtable weakHashtable19 = new WeakHashtable();
    boolean b20 = weakHashtable19.isEmpty();
    java.util.Set set21 = weakHashtable19.entrySet();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    java.util.Enumeration enumeration24 = weakHashtable23.keys();
    java.lang.Object obj25 = weakHashtable19.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable23);
    java.util.Collection collection26 = weakHashtable19.values();
    int i27 = weakHashtable19.size();
    boolean b29 = weakHashtable19.containsKey((java.lang.Object)'#');
    WeakHashtable weakHashtable30 = new WeakHashtable();
    WeakHashtable weakHashtable31 = new WeakHashtable();
    boolean b32 = weakHashtable31.isEmpty();
    java.util.Set set33 = weakHashtable31.entrySet();
    java.lang.Object obj34 = weakHashtable30.get((java.lang.Object)weakHashtable31);
    WeakHashtable weakHashtable35 = new WeakHashtable();
    boolean b36 = weakHashtable35.isEmpty();
    java.util.Enumeration enumeration37 = weakHashtable35.elements();
    java.lang.Object obj40 = weakHashtable35.put((java.lang.Object)(short)1, (java.lang.Object)10);
    weakHashtable31.putAll((java.util.Map)weakHashtable35);
    java.lang.Object obj43 = weakHashtable19.put((java.lang.Object)weakHashtable35, (java.lang.Object)"{}");
    WeakHashtable weakHashtable44 = new WeakHashtable();
    boolean b45 = weakHashtable44.isEmpty();
    java.util.Enumeration enumeration46 = weakHashtable44.elements();
    boolean b47 = weakHashtable44.isEmpty();
    WeakHashtable weakHashtable48 = new WeakHashtable();
    boolean b49 = weakHashtable48.isEmpty();
    java.util.Enumeration enumeration50 = weakHashtable48.elements();
    java.util.Enumeration enumeration51 = weakHashtable48.elements();
    java.lang.Object obj52 = weakHashtable35.put((java.lang.Object)weakHashtable44, (java.lang.Object)weakHashtable48);
    java.lang.Object obj53 = weakHashtable10.get((java.lang.Object)weakHashtable48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    java.util.Collection collection7 = weakHashtable0.values();
    int i8 = weakHashtable0.size();
    boolean b10 = weakHashtable0.containsKey((java.lang.Object)'#');
    WeakHashtable weakHashtable11 = new WeakHashtable();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    boolean b13 = weakHashtable12.isEmpty();
    java.util.Set set14 = weakHashtable12.entrySet();
    java.lang.Object obj15 = weakHashtable11.get((java.lang.Object)weakHashtable12);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    java.util.Enumeration enumeration18 = weakHashtable16.elements();
    java.lang.Object obj21 = weakHashtable16.put((java.lang.Object)(short)1, (java.lang.Object)10);
    weakHashtable12.putAll((java.util.Map)weakHashtable16);
    java.lang.Object obj24 = weakHashtable0.put((java.lang.Object)weakHashtable16, (java.lang.Object)"{}");
    WeakHashtable weakHashtable25 = new WeakHashtable();
    boolean b26 = weakHashtable25.isEmpty();
    weakHashtable16.putAll((java.util.Map)weakHashtable25);
    WeakHashtable weakHashtable28 = new WeakHashtable();
    boolean b29 = weakHashtable28.isEmpty();
    WeakHashtable weakHashtable30 = new WeakHashtable();
    boolean b31 = weakHashtable30.isEmpty();
    WeakHashtable weakHashtable32 = new WeakHashtable();
    boolean b33 = weakHashtable32.isEmpty();
    weakHashtable30.putAll((java.util.Map)weakHashtable32);
    java.util.Set set35 = weakHashtable32.keySet();
    WeakHashtable weakHashtable36 = new WeakHashtable();
    boolean b37 = weakHashtable36.isEmpty();
    java.util.Set set38 = weakHashtable36.entrySet();
    WeakHashtable weakHashtable40 = new WeakHashtable();
    java.util.Enumeration enumeration41 = weakHashtable40.keys();
    java.lang.Object obj42 = weakHashtable36.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable40);
    java.lang.Object obj43 = weakHashtable32.get((java.lang.Object)weakHashtable40);
    weakHashtable28.putAll((java.util.Map)weakHashtable40);
    java.util.Collection collection45 = weakHashtable28.values();
    WeakHashtable weakHashtable46 = new WeakHashtable();
    boolean b47 = weakHashtable46.isEmpty();
    java.util.Set set48 = weakHashtable46.entrySet();
    WeakHashtable weakHashtable50 = new WeakHashtable();
    java.util.Enumeration enumeration51 = weakHashtable50.keys();
    java.lang.Object obj52 = weakHashtable46.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable50);
    java.util.Collection collection53 = weakHashtable46.values();
    boolean b55 = weakHashtable46.containsKey((java.lang.Object)false);
    java.lang.Object obj56 = weakHashtable28.remove((java.lang.Object)weakHashtable46);
    WeakHashtable weakHashtable57 = new WeakHashtable();
    boolean b58 = weakHashtable57.isEmpty();
    java.util.Set set59 = weakHashtable57.entrySet();
    WeakHashtable weakHashtable61 = new WeakHashtable();
    java.util.Enumeration enumeration62 = weakHashtable61.keys();
    java.lang.Object obj63 = weakHashtable57.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable61);
    weakHashtable28.putAll((java.util.Map)weakHashtable57);
    java.lang.Object obj65 = weakHashtable16.remove((java.lang.Object)weakHashtable28);
    java.util.Set set66 = weakHashtable16.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set66);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Set set5 = weakHashtable2.keySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    java.lang.Object obj13 = weakHashtable2.get((java.lang.Object)weakHashtable10);
    java.lang.String str14 = weakHashtable10.toString();
    int i15 = weakHashtable10.size();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    java.util.Set set18 = weakHashtable16.entrySet();
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.util.Enumeration enumeration21 = weakHashtable20.keys();
    java.lang.Object obj22 = weakHashtable16.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable20);
    WeakHashtable weakHashtable23 = new WeakHashtable();
    boolean b24 = weakHashtable23.isEmpty();
    WeakHashtable weakHashtable25 = new WeakHashtable();
    boolean b26 = weakHashtable25.isEmpty();
    weakHashtable23.putAll((java.util.Map)weakHashtable25);
    int i28 = weakHashtable25.size();
    WeakHashtable weakHashtable29 = new WeakHashtable();
    java.util.Collection collection30 = weakHashtable29.values();
    java.util.Enumeration enumeration31 = weakHashtable29.keys();
    WeakHashtable weakHashtable32 = new WeakHashtable();
    boolean b33 = weakHashtable32.isEmpty();
    java.util.Enumeration enumeration34 = weakHashtable32.elements();
    boolean b35 = weakHashtable32.isEmpty();
    java.util.Enumeration enumeration36 = weakHashtable32.keys();
    java.lang.Object obj37 = weakHashtable25.put((java.lang.Object)weakHashtable29, (java.lang.Object)weakHashtable32);
    java.lang.Object obj38 = weakHashtable10.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable7.elements();
    java.util.Enumeration enumeration10 = weakHashtable7.elements();
    java.lang.Object obj11 = weakHashtable4.get((java.lang.Object)weakHashtable7);
    java.util.Collection collection12 = weakHashtable7.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.Object obj5 = weakHashtable0.remove((java.lang.Object)(byte)1);
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b14 = weakHashtable13.isEmpty();
    java.util.Enumeration enumeration15 = weakHashtable13.elements();
    java.util.Enumeration enumeration16 = weakHashtable13.elements();
    java.lang.Object obj17 = weakHashtable10.get((java.lang.Object)weakHashtable13);
    weakHashtable0.putAll((java.util.Map)weakHashtable10);
    WeakHashtable weakHashtable19 = new WeakHashtable();
    WeakHashtable weakHashtable20 = new WeakHashtable();
    boolean b21 = weakHashtable20.isEmpty();
    java.util.Set set22 = weakHashtable20.entrySet();
    java.lang.Object obj23 = weakHashtable19.get((java.lang.Object)weakHashtable20);
    WeakHashtable weakHashtable24 = new WeakHashtable();
    boolean b25 = weakHashtable24.isEmpty();
    java.util.Enumeration enumeration26 = weakHashtable24.elements();
    java.lang.Object obj29 = weakHashtable24.put((java.lang.Object)(short)1, (java.lang.Object)10);
    weakHashtable20.putAll((java.util.Map)weakHashtable24);
    boolean b31 = weakHashtable10.containsKey((java.lang.Object)weakHashtable20);
    java.util.Set set32 = weakHashtable10.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Set set5 = weakHashtable2.keySet();
    java.util.Enumeration enumeration6 = weakHashtable2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Set set5 = weakHashtable2.keySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    java.lang.Object obj13 = weakHashtable2.get((java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    java.util.Set set18 = weakHashtable16.entrySet();
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.util.Enumeration enumeration21 = weakHashtable20.keys();
    java.lang.Object obj22 = weakHashtable16.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable20);
    java.util.Collection collection23 = weakHashtable16.values();
    java.lang.Object obj24 = weakHashtable10.put((java.lang.Object)weakHashtable14, (java.lang.Object)weakHashtable16);
    WeakHashtable weakHashtable25 = new WeakHashtable();
    boolean b26 = weakHashtable25.isEmpty();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    boolean b28 = weakHashtable27.isEmpty();
    WeakHashtable weakHashtable29 = new WeakHashtable();
    boolean b30 = weakHashtable29.isEmpty();
    weakHashtable27.putAll((java.util.Map)weakHashtable29);
    java.util.Set set32 = weakHashtable29.keySet();
    WeakHashtable weakHashtable33 = new WeakHashtable();
    boolean b34 = weakHashtable33.isEmpty();
    java.util.Set set35 = weakHashtable33.entrySet();
    WeakHashtable weakHashtable37 = new WeakHashtable();
    java.util.Enumeration enumeration38 = weakHashtable37.keys();
    java.lang.Object obj39 = weakHashtable33.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable37);
    java.lang.Object obj40 = weakHashtable29.get((java.lang.Object)weakHashtable37);
    weakHashtable25.putAll((java.util.Map)weakHashtable37);
    java.util.Collection collection42 = weakHashtable25.values();
    WeakHashtable weakHashtable43 = new WeakHashtable();
    boolean b44 = weakHashtable43.isEmpty();
    java.util.Set set45 = weakHashtable43.entrySet();
    WeakHashtable weakHashtable47 = new WeakHashtable();
    java.util.Enumeration enumeration48 = weakHashtable47.keys();
    java.lang.Object obj49 = weakHashtable43.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable47);
    java.util.Collection collection50 = weakHashtable43.values();
    boolean b52 = weakHashtable43.containsKey((java.lang.Object)false);
    java.lang.Object obj53 = weakHashtable25.remove((java.lang.Object)weakHashtable43);
    WeakHashtable weakHashtable54 = new WeakHashtable();
    boolean b55 = weakHashtable54.isEmpty();
    java.util.Set set56 = weakHashtable54.entrySet();
    WeakHashtable weakHashtable58 = new WeakHashtable();
    java.util.Enumeration enumeration59 = weakHashtable58.keys();
    java.lang.Object obj60 = weakHashtable54.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable58);
    weakHashtable25.putAll((java.util.Map)weakHashtable54);
    boolean b62 = weakHashtable16.containsKey((java.lang.Object)weakHashtable25);
    java.lang.String str63 = weakHashtable16.toString();
    java.lang.String str64 = weakHashtable16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{10={}}"+ "'", str63.equals("{10={}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{10={}}"+ "'", str64.equals("{10={}}"));

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    java.util.Enumeration enumeration3 = weakHashtable0.elements();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    java.util.Set set6 = weakHashtable4.entrySet();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.util.Enumeration enumeration9 = weakHashtable8.keys();
    java.lang.Object obj10 = weakHashtable4.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable8);
    java.util.Enumeration enumeration11 = weakHashtable4.elements();
    boolean b12 = weakHashtable0.containsKey((java.lang.Object)enumeration11);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b14 = weakHashtable13.isEmpty();
    java.util.Enumeration enumeration15 = weakHashtable13.elements();
    boolean b16 = weakHashtable13.isEmpty();
    java.lang.Object obj18 = weakHashtable13.remove((java.lang.Object)(byte)1);
    WeakHashtable weakHashtable19 = new WeakHashtable();
    boolean b20 = weakHashtable19.isEmpty();
    java.util.Set set21 = weakHashtable19.entrySet();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    java.util.Enumeration enumeration24 = weakHashtable23.keys();
    java.lang.Object obj25 = weakHashtable19.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable23);
    WeakHashtable weakHashtable26 = new WeakHashtable();
    boolean b27 = weakHashtable26.isEmpty();
    java.util.Enumeration enumeration28 = weakHashtable26.elements();
    java.util.Enumeration enumeration29 = weakHashtable26.elements();
    java.lang.Object obj30 = weakHashtable23.get((java.lang.Object)weakHashtable26);
    weakHashtable13.putAll((java.util.Map)weakHashtable23);
    java.lang.Object obj32 = weakHashtable0.get((java.lang.Object)weakHashtable13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.String str4 = weakHashtable0.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.util.Set set10 = weakHashtable7.keySet();
    boolean b11 = weakHashtable0.containsKey((java.lang.Object)weakHashtable7);
    java.util.Set set12 = weakHashtable7.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.String str4 = weakHashtable0.toString();
    boolean b5 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Enumeration enumeration8 = weakHashtable6.elements();
    boolean b9 = weakHashtable6.isEmpty();
    java.lang.String str10 = weakHashtable6.toString();
    java.lang.Object obj11 = weakHashtable0.get((java.lang.Object)weakHashtable6);
    WeakHashtable weakHashtable12 = new WeakHashtable();
    boolean b13 = weakHashtable12.isEmpty();
    java.util.Enumeration enumeration14 = weakHashtable12.elements();
    boolean b15 = weakHashtable12.isEmpty();
    java.lang.String str16 = weakHashtable12.toString();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    boolean b18 = weakHashtable17.isEmpty();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    boolean b20 = weakHashtable19.isEmpty();
    weakHashtable17.putAll((java.util.Map)weakHashtable19);
    java.util.Set set22 = weakHashtable19.keySet();
    boolean b23 = weakHashtable12.containsKey((java.lang.Object)weakHashtable19);
    java.util.Enumeration enumeration24 = weakHashtable12.keys();
    java.util.Collection collection25 = weakHashtable12.values();
    java.lang.Object obj26 = weakHashtable6.remove((java.lang.Object)weakHashtable12);
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.util.Collection collection28 = weakHashtable27.values();
    java.util.Enumeration enumeration29 = weakHashtable27.keys();
    java.util.Set set30 = weakHashtable27.keySet();
    boolean b31 = weakHashtable6.containsKey((java.lang.Object)set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}"+ "'", str16.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    java.util.Enumeration enumeration7 = weakHashtable5.elements();
    java.util.Enumeration enumeration8 = weakHashtable5.elements();
    boolean b9 = weakHashtable5.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    java.util.Set set11 = weakHashtable5.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.String str4 = weakHashtable0.toString();
    boolean b5 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Enumeration enumeration8 = weakHashtable6.elements();
    boolean b9 = weakHashtable6.isEmpty();
    java.lang.String str10 = weakHashtable6.toString();
    java.lang.Object obj11 = weakHashtable0.get((java.lang.Object)weakHashtable6);
    WeakHashtable weakHashtable12 = new WeakHashtable();
    boolean b13 = weakHashtable12.isEmpty();
    java.util.Enumeration enumeration14 = weakHashtable12.elements();
    boolean b15 = weakHashtable12.isEmpty();
    java.lang.String str16 = weakHashtable12.toString();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    boolean b18 = weakHashtable17.isEmpty();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    boolean b20 = weakHashtable19.isEmpty();
    weakHashtable17.putAll((java.util.Map)weakHashtable19);
    java.util.Set set22 = weakHashtable19.keySet();
    boolean b23 = weakHashtable12.containsKey((java.lang.Object)weakHashtable19);
    java.util.Enumeration enumeration24 = weakHashtable12.keys();
    java.util.Collection collection25 = weakHashtable12.values();
    java.lang.Object obj26 = weakHashtable6.remove((java.lang.Object)weakHashtable12);
    WeakHashtable weakHashtable27 = new WeakHashtable();
    boolean b28 = weakHashtable27.isEmpty();
    java.util.Set set29 = weakHashtable27.entrySet();
    WeakHashtable weakHashtable31 = new WeakHashtable();
    java.util.Enumeration enumeration32 = weakHashtable31.keys();
    java.lang.Object obj33 = weakHashtable27.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable31);
    java.util.Collection collection34 = weakHashtable27.values();
    boolean b36 = weakHashtable27.containsKey((java.lang.Object)false);
    java.util.Enumeration enumeration37 = weakHashtable27.elements();
    java.lang.Object obj38 = weakHashtable12.get((java.lang.Object)enumeration37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}"+ "'", str16.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Set set5 = weakHashtable2.keySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    java.lang.Object obj13 = weakHashtable2.get((java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    java.util.Set set18 = weakHashtable16.entrySet();
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.util.Enumeration enumeration21 = weakHashtable20.keys();
    java.lang.Object obj22 = weakHashtable16.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable20);
    java.util.Collection collection23 = weakHashtable16.values();
    java.lang.Object obj24 = weakHashtable10.put((java.lang.Object)weakHashtable14, (java.lang.Object)weakHashtable16);
    java.util.Set set25 = weakHashtable14.keySet();
    java.util.Enumeration enumeration26 = weakHashtable14.elements();
    java.util.Enumeration enumeration27 = weakHashtable14.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration27);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    java.lang.Object obj5 = weakHashtable0.put((java.lang.Object)(short)1, (java.lang.Object)10);
    java.util.Set set6 = weakHashtable0.entrySet();
    java.util.Set set7 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Set set5 = weakHashtable2.keySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    java.lang.Object obj13 = weakHashtable2.get((java.lang.Object)weakHashtable10);
    java.lang.String str14 = weakHashtable10.toString();
    int i15 = weakHashtable10.size();
    boolean b16 = weakHashtable10.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    java.util.Set set3 = weakHashtable1.entrySet();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable1);
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    java.util.Enumeration enumeration7 = weakHashtable5.elements();
    java.lang.Object obj10 = weakHashtable5.put((java.lang.Object)(short)1, (java.lang.Object)10);
    weakHashtable1.putAll((java.util.Map)weakHashtable5);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b14 = weakHashtable13.isEmpty();
    java.util.Set set15 = weakHashtable13.entrySet();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.util.Enumeration enumeration18 = weakHashtable17.keys();
    java.lang.Object obj19 = weakHashtable13.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable17);
    java.util.Collection collection20 = weakHashtable13.values();
    boolean b22 = weakHashtable13.containsKey((java.lang.Object)false);
    java.util.Set set23 = weakHashtable13.entrySet();
    java.lang.Object obj24 = weakHashtable5.put((java.lang.Object)100.0d, (java.lang.Object)set23);
    WeakHashtable weakHashtable25 = new WeakHashtable();
    boolean b26 = weakHashtable25.isEmpty();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    boolean b28 = weakHashtable27.isEmpty();
    weakHashtable25.putAll((java.util.Map)weakHashtable27);
    java.util.Set set30 = weakHashtable27.keySet();
    WeakHashtable weakHashtable31 = new WeakHashtable();
    boolean b32 = weakHashtable31.isEmpty();
    java.util.Set set33 = weakHashtable31.entrySet();
    WeakHashtable weakHashtable35 = new WeakHashtable();
    java.util.Enumeration enumeration36 = weakHashtable35.keys();
    java.lang.Object obj37 = weakHashtable31.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable35);
    java.lang.Object obj38 = weakHashtable27.get((java.lang.Object)weakHashtable35);
    WeakHashtable weakHashtable39 = new WeakHashtable();
    weakHashtable35.putAll((java.util.Map)weakHashtable39);
    java.lang.Object obj41 = weakHashtable5.remove((java.lang.Object)weakHashtable39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable7.elements();
    java.util.Enumeration enumeration10 = weakHashtable7.elements();
    java.lang.Object obj11 = weakHashtable4.get((java.lang.Object)weakHashtable7);
    java.lang.Object obj13 = weakHashtable4.remove((java.lang.Object)1);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    weakHashtable14.putAll((java.util.Map)weakHashtable16);
    java.util.Set set19 = weakHashtable16.keySet();
    java.lang.Object obj20 = weakHashtable4.remove((java.lang.Object)set19);
    java.util.Enumeration enumeration21 = weakHashtable4.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    boolean b4 = weakHashtable3.isEmpty();
    java.util.Enumeration enumeration5 = weakHashtable3.elements();
    boolean b6 = weakHashtable3.isEmpty();
    java.lang.String str7 = weakHashtable3.toString();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b9 = weakHashtable8.isEmpty();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    boolean b11 = weakHashtable10.isEmpty();
    weakHashtable8.putAll((java.util.Map)weakHashtable10);
    java.util.Set set13 = weakHashtable10.keySet();
    boolean b14 = weakHashtable3.containsKey((java.lang.Object)weakHashtable10);
    boolean b15 = weakHashtable3.isEmpty();
    boolean b16 = weakHashtable0.containsKey((java.lang.Object)b15);
    java.util.Collection collection17 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}"+ "'", str7.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    boolean b4 = weakHashtable3.isEmpty();
    java.util.Enumeration enumeration5 = weakHashtable3.elements();
    java.lang.Object obj8 = weakHashtable3.put((java.lang.Object)(short)1, (java.lang.Object)10);
    java.lang.Object obj9 = weakHashtable0.get((java.lang.Object)(short)1);
    int i10 = weakHashtable0.size();
    int i11 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Enumeration enumeration5 = weakHashtable4.keys();
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable4);
    java.util.Collection collection7 = weakHashtable0.values();
    int i8 = weakHashtable0.size();
    java.util.Set set9 = weakHashtable0.entrySet();
    boolean b10 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Set set5 = weakHashtable2.keySet();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    boolean b7 = weakHashtable6.isEmpty();
    java.util.Set set8 = weakHashtable6.entrySet();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Enumeration enumeration11 = weakHashtable10.keys();
    java.lang.Object obj12 = weakHashtable6.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable10);
    java.lang.Object obj13 = weakHashtable2.get((java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    java.util.Set set18 = weakHashtable16.entrySet();
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.util.Enumeration enumeration21 = weakHashtable20.keys();
    java.lang.Object obj22 = weakHashtable16.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable20);
    java.util.Collection collection23 = weakHashtable16.values();
    java.lang.Object obj24 = weakHashtable10.put((java.lang.Object)weakHashtable14, (java.lang.Object)weakHashtable16);
    WeakHashtable weakHashtable25 = new WeakHashtable();
    boolean b26 = weakHashtable25.isEmpty();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    boolean b28 = weakHashtable27.isEmpty();
    WeakHashtable weakHashtable29 = new WeakHashtable();
    boolean b30 = weakHashtable29.isEmpty();
    weakHashtable27.putAll((java.util.Map)weakHashtable29);
    java.util.Set set32 = weakHashtable29.keySet();
    WeakHashtable weakHashtable33 = new WeakHashtable();
    boolean b34 = weakHashtable33.isEmpty();
    java.util.Set set35 = weakHashtable33.entrySet();
    WeakHashtable weakHashtable37 = new WeakHashtable();
    java.util.Enumeration enumeration38 = weakHashtable37.keys();
    java.lang.Object obj39 = weakHashtable33.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable37);
    java.lang.Object obj40 = weakHashtable29.get((java.lang.Object)weakHashtable37);
    weakHashtable25.putAll((java.util.Map)weakHashtable37);
    java.util.Collection collection42 = weakHashtable25.values();
    WeakHashtable weakHashtable43 = new WeakHashtable();
    boolean b44 = weakHashtable43.isEmpty();
    java.util.Set set45 = weakHashtable43.entrySet();
    WeakHashtable weakHashtable47 = new WeakHashtable();
    java.util.Enumeration enumeration48 = weakHashtable47.keys();
    java.lang.Object obj49 = weakHashtable43.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable47);
    java.util.Collection collection50 = weakHashtable43.values();
    boolean b52 = weakHashtable43.containsKey((java.lang.Object)false);
    java.lang.Object obj53 = weakHashtable25.remove((java.lang.Object)weakHashtable43);
    WeakHashtable weakHashtable54 = new WeakHashtable();
    boolean b55 = weakHashtable54.isEmpty();
    java.util.Set set56 = weakHashtable54.entrySet();
    WeakHashtable weakHashtable58 = new WeakHashtable();
    java.util.Enumeration enumeration59 = weakHashtable58.keys();
    java.lang.Object obj60 = weakHashtable54.put((java.lang.Object)(byte)10, (java.lang.Object)weakHashtable58);
    weakHashtable25.putAll((java.util.Map)weakHashtable54);
    boolean b62 = weakHashtable16.containsKey((java.lang.Object)weakHashtable25);
    java.util.Enumeration enumeration63 = weakHashtable25.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration63);

  }

}
