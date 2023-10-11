
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
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)weakHashtable4);
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Enumeration enumeration8 = weakHashtable0.keys();
    java.lang.Object obj10 = weakHashtable0.remove((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    java.util.Enumeration enumeration5 = weakHashtable2.keys();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable6.putAll((java.util.Map)weakHashtable7);
    java.lang.Object obj11 = weakHashtable2.put((java.lang.Object)weakHashtable7, (java.lang.Object)(short)0);
    java.lang.Object obj13 = weakHashtable7.get((java.lang.Object)10);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    java.util.Set set15 = weakHashtable14.keySet();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    java.lang.Object obj18 = weakHashtable14.get((java.lang.Object)weakHashtable16);
    java.util.Collection collection19 = weakHashtable14.values();
    java.lang.Object obj21 = weakHashtable7.put((java.lang.Object)weakHashtable14, (java.lang.Object)false);
    int i22 = weakHashtable14.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable1);
    java.lang.Object obj6 = weakHashtable1.put((java.lang.Object)0, (java.lang.Object)'4');
    java.util.Set set7 = weakHashtable1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable1);
    java.util.Enumeration enumeration4 = weakHashtable1.elements();
    java.util.Enumeration enumeration5 = weakHashtable1.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    java.util.Set set3 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Enumeration enumeration2 = weakHashtable0.elements();
    int i3 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)weakHashtable4);
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Enumeration enumeration8 = weakHashtable0.keys();
    int i9 = weakHashtable0.size();
    int i10 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    java.util.Collection collection5 = weakHashtable0.values();
    java.util.Set set6 = weakHashtable0.entrySet();
    int i7 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    java.util.Enumeration enumeration5 = weakHashtable2.keys();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable6.putAll((java.util.Map)weakHashtable7);
    java.lang.Object obj11 = weakHashtable2.put((java.lang.Object)weakHashtable7, (java.lang.Object)(short)0);
    java.lang.Object obj13 = weakHashtable7.get((java.lang.Object)10);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    java.util.Set set15 = weakHashtable14.keySet();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    java.lang.Object obj18 = weakHashtable14.get((java.lang.Object)weakHashtable16);
    java.util.Collection collection19 = weakHashtable14.values();
    java.lang.Object obj21 = weakHashtable7.put((java.lang.Object)weakHashtable14, (java.lang.Object)false);
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Set set23 = weakHashtable22.keySet();
    WeakHashtable weakHashtable24 = new WeakHashtable();
    boolean b25 = weakHashtable24.isEmpty();
    java.lang.Object obj26 = weakHashtable22.get((java.lang.Object)weakHashtable24);
    java.lang.Object obj27 = weakHashtable7.remove((java.lang.Object)weakHashtable24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false+ "'", obj27.equals(false));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)100.0f);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.util.Set set10 = weakHashtable9.keySet();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    boolean b12 = weakHashtable11.isEmpty();
    java.lang.Object obj13 = weakHashtable9.get((java.lang.Object)weakHashtable11);
    weakHashtable7.putAll((java.util.Map)weakHashtable9);
    weakHashtable0.putAll((java.util.Map)weakHashtable9);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    boolean b18 = weakHashtable17.isEmpty();
    weakHashtable16.putAll((java.util.Map)weakHashtable17);
    java.util.Enumeration enumeration20 = weakHashtable17.elements();
    weakHashtable0.putAll((java.util.Map)weakHashtable17);
    java.util.Collection collection22 = weakHashtable17.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection22);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.util.Set set4 = weakHashtable3.keySet();
    java.lang.Object obj5 = weakHashtable0.get((java.lang.Object)set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable1);
    boolean b4 = weakHashtable1.isEmpty();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Set set8 = weakHashtable7.keySet();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    boolean b10 = weakHashtable9.isEmpty();
    java.lang.Object obj11 = weakHashtable7.get((java.lang.Object)weakHashtable9);
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.util.Set set14 = weakHashtable13.keySet();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    boolean b16 = weakHashtable15.isEmpty();
    java.lang.Object obj17 = weakHashtable13.get((java.lang.Object)weakHashtable15);
    java.util.Enumeration enumeration18 = weakHashtable15.keys();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    WeakHashtable weakHashtable20 = new WeakHashtable();
    boolean b21 = weakHashtable20.isEmpty();
    weakHashtable19.putAll((java.util.Map)weakHashtable20);
    java.lang.Object obj24 = weakHashtable15.put((java.lang.Object)weakHashtable20, (java.lang.Object)(short)0);
    java.lang.Object obj26 = weakHashtable20.get((java.lang.Object)10);
    java.lang.String str27 = weakHashtable20.toString();
    boolean b28 = weakHashtable20.isEmpty();
    WeakHashtable weakHashtable29 = new WeakHashtable();
    java.util.Set set30 = weakHashtable29.keySet();
    WeakHashtable weakHashtable31 = new WeakHashtable();
    boolean b32 = weakHashtable31.isEmpty();
    java.lang.Object obj33 = weakHashtable29.get((java.lang.Object)weakHashtable31);
    java.util.Set set34 = weakHashtable31.keySet();
    java.lang.Object obj35 = weakHashtable20.get((java.lang.Object)weakHashtable31);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj36 = weakHashtable1.put((java.lang.Object)weakHashtable5, obj35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}"+ "'", str27.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)weakHashtable4);
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Enumeration enumeration8 = weakHashtable0.keys();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    boolean b10 = weakHashtable9.isEmpty();
    java.util.Set set11 = weakHashtable9.entrySet();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.util.Set set13 = weakHashtable12.keySet();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    java.lang.Object obj16 = weakHashtable12.get((java.lang.Object)weakHashtable14);
    boolean b18 = weakHashtable12.containsKey((java.lang.Object)100.0f);
    java.lang.Object obj19 = weakHashtable0.put((java.lang.Object)set11, (java.lang.Object)b18);
    int i20 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)weakHashtable4);
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Enumeration enumeration8 = weakHashtable0.keys();
    java.util.Set set9 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    boolean b2 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Set set7 = weakHashtable6.keySet();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b9 = weakHashtable8.isEmpty();
    java.lang.Object obj10 = weakHashtable6.get((java.lang.Object)weakHashtable8);
    weakHashtable4.putAll((java.util.Map)weakHashtable6);
    java.lang.Object obj12 = weakHashtable0.put((java.lang.Object)100.0d, (java.lang.Object)weakHashtable4);
    int i13 = weakHashtable4.size();
    java.util.Enumeration enumeration14 = weakHashtable4.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)100.0f);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b9 = weakHashtable8.isEmpty();
    weakHashtable7.putAll((java.util.Map)weakHashtable8);
    java.lang.Object obj13 = weakHashtable8.put((java.lang.Object)0, (java.lang.Object)'4');
    boolean b14 = weakHashtable0.containsKey((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)100.0f);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.util.Set set10 = weakHashtable9.keySet();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    boolean b12 = weakHashtable11.isEmpty();
    java.lang.Object obj13 = weakHashtable9.get((java.lang.Object)weakHashtable11);
    weakHashtable7.putAll((java.util.Map)weakHashtable9);
    java.util.Enumeration enumeration15 = weakHashtable7.keys();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    java.util.Set set18 = weakHashtable16.entrySet();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    java.util.Set set20 = weakHashtable19.keySet();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    boolean b22 = weakHashtable21.isEmpty();
    java.lang.Object obj23 = weakHashtable19.get((java.lang.Object)weakHashtable21);
    boolean b25 = weakHashtable19.containsKey((java.lang.Object)100.0f);
    java.lang.Object obj26 = weakHashtable7.put((java.lang.Object)set18, (java.lang.Object)b25);
    java.lang.Object obj27 = weakHashtable0.get((java.lang.Object)weakHashtable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)weakHashtable4);
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Enumeration enumeration8 = weakHashtable0.keys();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    boolean b10 = weakHashtable9.isEmpty();
    java.util.Set set11 = weakHashtable9.entrySet();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.util.Set set13 = weakHashtable12.keySet();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    java.lang.Object obj16 = weakHashtable12.get((java.lang.Object)weakHashtable14);
    boolean b18 = weakHashtable12.containsKey((java.lang.Object)100.0f);
    java.lang.Object obj19 = weakHashtable0.put((java.lang.Object)set11, (java.lang.Object)b18);
    boolean b21 = weakHashtable0.containsKey((java.lang.Object)10L);
    WeakHashtable weakHashtable22 = new WeakHashtable();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    boolean b24 = weakHashtable23.isEmpty();
    weakHashtable22.putAll((java.util.Map)weakHashtable23);
    int i26 = weakHashtable22.size();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.util.Set set28 = weakHashtable27.keySet();
    WeakHashtable weakHashtable29 = new WeakHashtable();
    boolean b30 = weakHashtable29.isEmpty();
    java.lang.Object obj31 = weakHashtable27.get((java.lang.Object)weakHashtable29);
    java.util.Enumeration enumeration32 = weakHashtable29.keys();
    WeakHashtable weakHashtable33 = new WeakHashtable();
    WeakHashtable weakHashtable34 = new WeakHashtable();
    boolean b35 = weakHashtable34.isEmpty();
    weakHashtable33.putAll((java.util.Map)weakHashtable34);
    java.lang.Object obj38 = weakHashtable29.put((java.lang.Object)weakHashtable34, (java.lang.Object)(short)0);
    java.lang.Object obj40 = weakHashtable34.get((java.lang.Object)10);
    weakHashtable22.putAll((java.util.Map)weakHashtable34);
    weakHashtable0.putAll((java.util.Map)weakHashtable22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable1);
    java.lang.Object obj6 = weakHashtable1.put((java.lang.Object)0, (java.lang.Object)'4');
    java.lang.String str7 = weakHashtable1.toString();
    java.util.Set set8 = weakHashtable1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{0=4}"+ "'", str7.equals("{0=4}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)weakHashtable4);
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Enumeration enumeration8 = weakHashtable0.keys();
    int i9 = weakHashtable0.size();
    java.lang.Object obj11 = weakHashtable0.remove((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)weakHashtable4);
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.String str8 = weakHashtable0.toString();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.util.Set set10 = weakHashtable9.keySet();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    boolean b12 = weakHashtable11.isEmpty();
    java.lang.Object obj13 = weakHashtable9.get((java.lang.Object)weakHashtable11);
    java.util.Enumeration enumeration14 = weakHashtable11.keys();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    weakHashtable15.putAll((java.util.Map)weakHashtable16);
    java.lang.Object obj20 = weakHashtable11.put((java.lang.Object)weakHashtable16, (java.lang.Object)(short)0);
    java.lang.Object obj22 = weakHashtable16.get((java.lang.Object)10);
    java.lang.String str23 = weakHashtable16.toString();
    boolean b24 = weakHashtable16.isEmpty();
    WeakHashtable weakHashtable25 = new WeakHashtable();
    java.util.Set set26 = weakHashtable25.keySet();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    boolean b28 = weakHashtable27.isEmpty();
    java.lang.Object obj29 = weakHashtable25.get((java.lang.Object)weakHashtable27);
    java.util.Set set30 = weakHashtable27.keySet();
    java.lang.Object obj31 = weakHashtable16.get((java.lang.Object)weakHashtable27);
    WeakHashtable weakHashtable32 = new WeakHashtable();
    WeakHashtable weakHashtable33 = new WeakHashtable();
    boolean b34 = weakHashtable33.isEmpty();
    weakHashtable32.putAll((java.util.Map)weakHashtable33);
    java.util.Enumeration enumeration36 = weakHashtable33.elements();
    java.lang.Object obj37 = weakHashtable0.put((java.lang.Object)weakHashtable16, (java.lang.Object)weakHashtable33);
    WeakHashtable weakHashtable38 = new WeakHashtable();
    WeakHashtable weakHashtable39 = new WeakHashtable();
    boolean b40 = weakHashtable39.isEmpty();
    weakHashtable38.putAll((java.util.Map)weakHashtable39);
    java.util.Enumeration enumeration42 = weakHashtable39.elements();
    java.lang.String str43 = weakHashtable39.toString();
    java.lang.Object obj44 = weakHashtable16.get((java.lang.Object)weakHashtable39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}"+ "'", str8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}"+ "'", str23.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}"+ "'", str43.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)weakHashtable4);
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Enumeration enumeration8 = weakHashtable0.keys();
    int i9 = weakHashtable0.size();
    java.util.Enumeration enumeration10 = weakHashtable0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)100, (java.lang.Object)(short)10);
    java.lang.Object obj8 = null;
    WeakHashtable weakHashtable9 = new WeakHashtable();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    boolean b11 = weakHashtable10.isEmpty();
    weakHashtable9.putAll((java.util.Map)weakHashtable10);
    java.lang.Object obj15 = weakHashtable10.put((java.lang.Object)0, (java.lang.Object)'4');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj16 = weakHashtable0.put(obj8, obj15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    java.util.Collection collection5 = weakHashtable2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable1);
    boolean b4 = weakHashtable0.isEmpty();
    java.util.Set set5 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    java.util.Enumeration enumeration5 = weakHashtable2.keys();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable6.putAll((java.util.Map)weakHashtable7);
    java.lang.Object obj11 = weakHashtable2.put((java.lang.Object)weakHashtable7, (java.lang.Object)(short)0);
    java.lang.Object obj13 = weakHashtable7.get((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)100.0f);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.util.Set set10 = weakHashtable9.keySet();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    boolean b12 = weakHashtable11.isEmpty();
    java.lang.Object obj13 = weakHashtable9.get((java.lang.Object)weakHashtable11);
    weakHashtable7.putAll((java.util.Map)weakHashtable9);
    weakHashtable0.putAll((java.util.Map)weakHashtable9);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    boolean b18 = weakHashtable17.isEmpty();
    weakHashtable16.putAll((java.util.Map)weakHashtable17);
    java.util.Enumeration enumeration20 = weakHashtable17.elements();
    weakHashtable0.putAll((java.util.Map)weakHashtable17);
    java.util.Collection collection22 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection22);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable1);
    int i4 = weakHashtable0.size();
    java.util.Set set5 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable1);
    int i4 = weakHashtable0.size();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.keySet();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.lang.Object obj9 = weakHashtable5.get((java.lang.Object)weakHashtable7);
    java.util.Enumeration enumeration10 = weakHashtable7.keys();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    boolean b13 = weakHashtable12.isEmpty();
    weakHashtable11.putAll((java.util.Map)weakHashtable12);
    java.lang.Object obj16 = weakHashtable7.put((java.lang.Object)weakHashtable12, (java.lang.Object)(short)0);
    java.lang.Object obj18 = weakHashtable12.get((java.lang.Object)10);
    weakHashtable0.putAll((java.util.Map)weakHashtable12);
    java.util.Collection collection20 = weakHashtable12.values();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    boolean b22 = weakHashtable21.isEmpty();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    java.util.Set set24 = weakHashtable23.keySet();
    WeakHashtable weakHashtable25 = new WeakHashtable();
    boolean b26 = weakHashtable25.isEmpty();
    java.lang.Object obj27 = weakHashtable23.get((java.lang.Object)weakHashtable25);
    weakHashtable21.putAll((java.util.Map)weakHashtable23);
    boolean b29 = weakHashtable23.isEmpty();
    boolean b30 = weakHashtable12.containsKey((java.lang.Object)b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)100.0f);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.util.Set set10 = weakHashtable9.keySet();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    boolean b12 = weakHashtable11.isEmpty();
    java.lang.Object obj13 = weakHashtable9.get((java.lang.Object)weakHashtable11);
    weakHashtable7.putAll((java.util.Map)weakHashtable9);
    weakHashtable0.putAll((java.util.Map)weakHashtable9);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    boolean b18 = weakHashtable17.isEmpty();
    weakHashtable16.putAll((java.util.Map)weakHashtable17);
    java.util.Enumeration enumeration20 = weakHashtable17.elements();
    weakHashtable0.putAll((java.util.Map)weakHashtable17);
    int i22 = weakHashtable17.size();
    boolean b23 = weakHashtable17.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    weakHashtable3.putAll((java.util.Map)weakHashtable4);
    java.lang.Object obj9 = weakHashtable4.put((java.lang.Object)0, (java.lang.Object)'4');
    java.lang.String str10 = weakHashtable4.toString();
    java.lang.Object obj11 = weakHashtable0.put((java.lang.Object)0.0f, (java.lang.Object)weakHashtable4);
    java.util.Set set12 = weakHashtable4.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{0=4}"+ "'", str10.equals("{0=4}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)100, (java.lang.Object)(short)10);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b9 = weakHashtable8.isEmpty();
    boolean b10 = weakHashtable8.isEmpty();
    java.lang.Object obj12 = weakHashtable8.remove((java.lang.Object)10.0d);
    boolean b13 = weakHashtable0.containsKey((java.lang.Object)10.0d);
    int i14 = weakHashtable0.size();
    java.lang.Object obj15 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj16 = weakHashtable0.get(obj15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.keySet();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b3 = weakHashtable2.isEmpty();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)weakHashtable2);
    java.util.Enumeration enumeration5 = weakHashtable2.keys();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    weakHashtable6.putAll((java.util.Map)weakHashtable7);
    java.lang.Object obj11 = weakHashtable2.put((java.lang.Object)weakHashtable7, (java.lang.Object)(short)0);
    java.lang.Object obj13 = weakHashtable7.get((java.lang.Object)10);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Set set17 = weakHashtable16.keySet();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    boolean b19 = weakHashtable18.isEmpty();
    java.lang.Object obj20 = weakHashtable16.get((java.lang.Object)weakHashtable18);
    weakHashtable14.putAll((java.util.Map)weakHashtable16);
    java.util.Collection collection22 = weakHashtable14.values();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    java.util.Set set24 = weakHashtable23.keySet();
    WeakHashtable weakHashtable25 = new WeakHashtable();
    boolean b26 = weakHashtable25.isEmpty();
    java.lang.Object obj27 = weakHashtable23.get((java.lang.Object)weakHashtable25);
    java.util.Collection collection28 = weakHashtable23.values();
    java.lang.Object obj29 = weakHashtable7.put((java.lang.Object)collection22, (java.lang.Object)collection28);
    java.util.Set set30 = weakHashtable7.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    boolean b2 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Set set7 = weakHashtable6.keySet();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b9 = weakHashtable8.isEmpty();
    java.lang.Object obj10 = weakHashtable6.get((java.lang.Object)weakHashtable8);
    weakHashtable4.putAll((java.util.Map)weakHashtable6);
    java.lang.Object obj12 = weakHashtable0.put((java.lang.Object)100.0d, (java.lang.Object)weakHashtable4);
    java.lang.String str13 = weakHashtable4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}"+ "'", str13.equals("{}"));

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable1);
    int i4 = weakHashtable0.size();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.keySet();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b8 = weakHashtable7.isEmpty();
    java.lang.Object obj9 = weakHashtable5.get((java.lang.Object)weakHashtable7);
    java.util.Enumeration enumeration10 = weakHashtable7.keys();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    boolean b13 = weakHashtable12.isEmpty();
    weakHashtable11.putAll((java.util.Map)weakHashtable12);
    java.lang.Object obj16 = weakHashtable7.put((java.lang.Object)weakHashtable12, (java.lang.Object)(short)0);
    java.lang.Object obj18 = weakHashtable12.get((java.lang.Object)10);
    weakHashtable0.putAll((java.util.Map)weakHashtable12);
    WeakHashtable weakHashtable20 = new WeakHashtable();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    boolean b22 = weakHashtable21.isEmpty();
    weakHashtable20.putAll((java.util.Map)weakHashtable21);
    boolean b24 = weakHashtable21.isEmpty();
    java.lang.Object obj25 = weakHashtable12.get((java.lang.Object)weakHashtable21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    boolean b2 = weakHashtable1.isEmpty();
    weakHashtable0.putAll((java.util.Map)weakHashtable1);
    java.util.Enumeration enumeration4 = weakHashtable1.elements();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    boolean b6 = weakHashtable5.isEmpty();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Set set8 = weakHashtable7.keySet();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    boolean b10 = weakHashtable9.isEmpty();
    java.lang.Object obj11 = weakHashtable7.get((java.lang.Object)weakHashtable9);
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b15 = weakHashtable14.isEmpty();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Set set17 = weakHashtable16.keySet();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    boolean b19 = weakHashtable18.isEmpty();
    java.lang.Object obj20 = weakHashtable16.get((java.lang.Object)weakHashtable18);
    weakHashtable14.putAll((java.util.Map)weakHashtable16);
    java.util.Enumeration enumeration22 = weakHashtable14.keys();
    int i23 = weakHashtable14.size();
    java.lang.Object obj24 = weakHashtable7.put((java.lang.Object)0L, (java.lang.Object)i23);
    java.util.Collection collection25 = weakHashtable7.values();
    boolean b26 = weakHashtable1.containsKey((java.lang.Object)collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    boolean b2 = weakHashtable0.isEmpty();
    java.lang.Object obj4 = weakHashtable0.remove((java.lang.Object)10.0d);
    boolean b5 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)weakHashtable4);
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b9 = weakHashtable8.isEmpty();
    boolean b10 = weakHashtable8.isEmpty();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    boolean b13 = weakHashtable12.isEmpty();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    java.util.Set set15 = weakHashtable14.keySet();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b17 = weakHashtable16.isEmpty();
    java.lang.Object obj18 = weakHashtable14.get((java.lang.Object)weakHashtable16);
    weakHashtable12.putAll((java.util.Map)weakHashtable14);
    java.lang.Object obj20 = weakHashtable8.put((java.lang.Object)100.0d, (java.lang.Object)weakHashtable12);
    java.util.Collection collection21 = weakHashtable8.values();
    java.lang.Object obj22 = weakHashtable2.remove((java.lang.Object)weakHashtable8);
    WeakHashtable weakHashtable23 = new WeakHashtable();
    boolean b24 = weakHashtable23.isEmpty();
    boolean b25 = weakHashtable23.isEmpty();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    boolean b28 = weakHashtable27.isEmpty();
    WeakHashtable weakHashtable29 = new WeakHashtable();
    java.util.Set set30 = weakHashtable29.keySet();
    WeakHashtable weakHashtable31 = new WeakHashtable();
    boolean b32 = weakHashtable31.isEmpty();
    java.lang.Object obj33 = weakHashtable29.get((java.lang.Object)weakHashtable31);
    weakHashtable27.putAll((java.util.Map)weakHashtable29);
    java.lang.Object obj35 = weakHashtable23.put((java.lang.Object)100.0d, (java.lang.Object)weakHashtable27);
    int i36 = weakHashtable27.size();
    weakHashtable8.putAll((java.util.Map)weakHashtable27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);

  }

}
