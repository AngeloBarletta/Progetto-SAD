
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
    java.lang.Object obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = weakHashtable0.remove(obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = weakHashtable0.get(obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    boolean b10 = weakHashtable2.containsKey((java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    boolean b13 = weakHashtable2.isEmpty();
    java.util.Set set14 = weakHashtable2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    java.util.Set set3 = weakHashtable0.keySet();
    int i4 = weakHashtable0.size();
    java.util.Collection collection5 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    java.util.Set set3 = weakHashtable0.keySet();
    java.lang.Object obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj6 = weakHashtable0.put((java.lang.Object)"hi!", obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    int i10 = weakHashtable0.size();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Set set12 = weakHashtable11.entrySet();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.String str14 = weakHashtable13.toString();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Set set16 = weakHashtable15.entrySet();
    weakHashtable13.putAll((java.util.Map)weakHashtable15);
    java.lang.Object obj19 = weakHashtable15.get((java.lang.Object)(-1L));
    java.lang.Object obj21 = weakHashtable15.get((java.lang.Object)10L);
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.lang.String str23 = weakHashtable22.toString();
    java.util.Set set24 = weakHashtable22.keySet();
    weakHashtable15.putAll((java.util.Map)weakHashtable22);
    java.lang.Object obj26 = weakHashtable0.put((java.lang.Object)weakHashtable11, (java.lang.Object)weakHashtable15);
    java.util.Set set27 = weakHashtable11.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}"+ "'", str23.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.String str14 = weakHashtable13.toString();
    java.util.Set set15 = weakHashtable13.keySet();
    java.util.Set set16 = weakHashtable13.keySet();
    int i17 = weakHashtable13.size();
    boolean b18 = weakHashtable13.isEmpty();
    weakHashtable2.putAll((java.util.Map)weakHashtable13);
    java.util.Collection collection20 = weakHashtable13.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection20);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    int i3 = weakHashtable0.size();
    java.lang.Object obj5 = weakHashtable0.get((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Set set1 = weakHashtable0.entrySet();
    java.util.Collection collection2 = weakHashtable0.values();
    java.util.Enumeration enumeration3 = weakHashtable0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.String str14 = weakHashtable13.toString();
    java.util.Set set15 = weakHashtable13.keySet();
    java.util.Set set16 = weakHashtable13.keySet();
    int i17 = weakHashtable13.size();
    boolean b18 = weakHashtable13.isEmpty();
    weakHashtable2.putAll((java.util.Map)weakHashtable13);
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.lang.String str21 = weakHashtable20.toString();
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Set set23 = weakHashtable22.entrySet();
    weakHashtable20.putAll((java.util.Map)weakHashtable22);
    WeakHashtable weakHashtable25 = new WeakHashtable();
    java.lang.String str26 = weakHashtable25.toString();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.util.Set set28 = weakHashtable27.entrySet();
    weakHashtable25.putAll((java.util.Map)weakHashtable27);
    int i30 = weakHashtable27.size();
    java.lang.Object obj31 = weakHashtable2.put((java.lang.Object)weakHashtable20, (java.lang.Object)i30);
    java.lang.Object obj32 = null;
    WeakHashtable weakHashtable33 = new WeakHashtable();
    java.util.Set set34 = weakHashtable33.entrySet();
    java.util.Collection collection35 = weakHashtable33.values();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj36 = weakHashtable2.put(obj32, (java.lang.Object)collection35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}"+ "'", str21.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}"+ "'", str26.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection35);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    int i10 = weakHashtable0.size();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.lang.String str12 = weakHashtable11.toString();
    java.util.Set set13 = weakHashtable11.keySet();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    java.lang.String str15 = weakHashtable14.toString();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Set set17 = weakHashtable16.entrySet();
    weakHashtable14.putAll((java.util.Map)weakHashtable16);
    int i19 = weakHashtable16.size();
    weakHashtable11.putAll((java.util.Map)weakHashtable16);
    java.util.Enumeration enumeration21 = weakHashtable16.keys();
    boolean b22 = weakHashtable0.containsKey((java.lang.Object)enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}"+ "'", str12.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}"+ "'", str15.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.String str7 = weakHashtable2.toString();
    java.lang.Object obj9 = weakHashtable2.get((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}"+ "'", str7.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    int i10 = weakHashtable0.size();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Set set12 = weakHashtable11.entrySet();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.String str14 = weakHashtable13.toString();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Set set16 = weakHashtable15.entrySet();
    weakHashtable13.putAll((java.util.Map)weakHashtable15);
    java.lang.Object obj19 = weakHashtable15.get((java.lang.Object)(-1L));
    java.lang.Object obj21 = weakHashtable15.get((java.lang.Object)10L);
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.lang.String str23 = weakHashtable22.toString();
    java.util.Set set24 = weakHashtable22.keySet();
    weakHashtable15.putAll((java.util.Map)weakHashtable22);
    java.lang.Object obj26 = weakHashtable0.put((java.lang.Object)weakHashtable11, (java.lang.Object)weakHashtable15);
    java.lang.String str27 = weakHashtable11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}"+ "'", str23.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}"+ "'", str27.equals("{}"));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    int i10 = weakHashtable0.size();
    java.lang.Object obj12 = weakHashtable0.remove((java.lang.Object)(-1L));
    java.util.Set set13 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Collection collection5 = weakHashtable0.values();
    boolean b6 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.String str14 = weakHashtable13.toString();
    java.util.Set set15 = weakHashtable13.keySet();
    java.util.Set set16 = weakHashtable13.keySet();
    int i17 = weakHashtable13.size();
    boolean b18 = weakHashtable13.isEmpty();
    weakHashtable2.putAll((java.util.Map)weakHashtable13);
    java.util.Enumeration enumeration20 = weakHashtable13.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration20);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Collection collection5 = weakHashtable0.values();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    boolean b8 = weakHashtable6.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable6.elements();
    weakHashtable0.putAll((java.util.Map)weakHashtable6);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.lang.String str12 = weakHashtable11.toString();
    java.util.Set set13 = weakHashtable11.keySet();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    java.lang.String str15 = weakHashtable14.toString();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Set set17 = weakHashtable16.entrySet();
    weakHashtable14.putAll((java.util.Map)weakHashtable16);
    int i19 = weakHashtable16.size();
    weakHashtable11.putAll((java.util.Map)weakHashtable16);
    java.util.Enumeration enumeration21 = weakHashtable16.keys();
    java.util.Enumeration enumeration22 = weakHashtable16.keys();
    java.lang.Object obj23 = weakHashtable6.remove((java.lang.Object)enumeration22);
    WeakHashtable weakHashtable24 = new WeakHashtable();
    java.lang.String str25 = weakHashtable24.toString();
    java.util.Enumeration enumeration26 = weakHashtable24.keys();
    java.util.Set set27 = weakHashtable24.entrySet();
    int i28 = weakHashtable24.size();
    boolean b30 = weakHashtable24.containsKey((java.lang.Object)true);
    WeakHashtable weakHashtable31 = new WeakHashtable();
    java.lang.String str32 = weakHashtable31.toString();
    WeakHashtable weakHashtable33 = new WeakHashtable();
    java.util.Set set34 = weakHashtable33.entrySet();
    weakHashtable31.putAll((java.util.Map)weakHashtable33);
    int i36 = weakHashtable33.size();
    java.util.Enumeration enumeration37 = weakHashtable33.keys();
    int i38 = weakHashtable33.size();
    java.lang.Object obj39 = weakHashtable6.put((java.lang.Object)b30, (java.lang.Object)i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}"+ "'", str12.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}"+ "'", str15.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}"+ "'", str25.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}"+ "'", str32.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    int i3 = weakHashtable0.size();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.lang.String str5 = weakHashtable4.toString();
    java.util.Set set6 = weakHashtable4.keySet();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.lang.String str8 = weakHashtable7.toString();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.util.Set set10 = weakHashtable9.entrySet();
    weakHashtable7.putAll((java.util.Map)weakHashtable9);
    int i12 = weakHashtable9.size();
    weakHashtable4.putAll((java.util.Map)weakHashtable9);
    int i14 = weakHashtable4.size();
    java.lang.Object obj15 = weakHashtable0.remove((java.lang.Object)i14);
    boolean b17 = weakHashtable0.containsKey((java.lang.Object)(short)10);
    java.util.Enumeration enumeration18 = weakHashtable0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}"+ "'", str8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration18);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.util.Set set7 = weakHashtable2.keySet();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.lang.String str9 = weakHashtable8.toString();
    java.util.Set set10 = weakHashtable8.keySet();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.lang.String str12 = weakHashtable11.toString();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.util.Set set14 = weakHashtable13.entrySet();
    weakHashtable11.putAll((java.util.Map)weakHashtable13);
    int i16 = weakHashtable13.size();
    weakHashtable8.putAll((java.util.Map)weakHashtable13);
    int i18 = weakHashtable8.size();
    java.util.Enumeration enumeration19 = weakHashtable8.keys();
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.util.Collection collection21 = weakHashtable20.values();
    java.lang.Object obj22 = weakHashtable8.get((java.lang.Object)weakHashtable20);
    WeakHashtable weakHashtable23 = new WeakHashtable();
    java.lang.String str24 = weakHashtable23.toString();
    java.util.Set set25 = weakHashtable23.keySet();
    java.util.Set set26 = weakHashtable23.keySet();
    boolean b27 = weakHashtable20.containsKey((java.lang.Object)set26);
    weakHashtable2.putAll((java.util.Map)weakHashtable20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}"+ "'", str9.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}"+ "'", str12.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}"+ "'", str24.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    boolean b2 = weakHashtable0.isEmpty();
    java.util.Set set3 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.String str14 = weakHashtable13.toString();
    java.util.Set set15 = weakHashtable13.keySet();
    java.util.Set set16 = weakHashtable13.keySet();
    int i17 = weakHashtable13.size();
    boolean b18 = weakHashtable13.isEmpty();
    weakHashtable2.putAll((java.util.Map)weakHashtable13);
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.lang.String str21 = weakHashtable20.toString();
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Set set23 = weakHashtable22.entrySet();
    weakHashtable20.putAll((java.util.Map)weakHashtable22);
    WeakHashtable weakHashtable25 = new WeakHashtable();
    java.lang.String str26 = weakHashtable25.toString();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.util.Set set28 = weakHashtable27.entrySet();
    weakHashtable25.putAll((java.util.Map)weakHashtable27);
    int i30 = weakHashtable27.size();
    java.lang.Object obj31 = weakHashtable2.put((java.lang.Object)weakHashtable20, (java.lang.Object)i30);
    java.lang.Object obj33 = weakHashtable2.remove((java.lang.Object)'#');
    java.util.Enumeration enumeration34 = weakHashtable2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}"+ "'", str21.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}"+ "'", str26.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration34);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    java.util.Set set3 = weakHashtable0.keySet();
    int i4 = weakHashtable0.size();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.lang.String str6 = weakHashtable5.toString();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Set set8 = weakHashtable7.entrySet();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.lang.Object obj11 = weakHashtable7.get((java.lang.Object)(-1L));
    java.lang.Object obj13 = weakHashtable7.get((java.lang.Object)10L);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    java.lang.String str15 = weakHashtable14.toString();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Set set17 = weakHashtable16.entrySet();
    weakHashtable14.putAll((java.util.Map)weakHashtable16);
    int i19 = weakHashtable16.size();
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.lang.String str21 = weakHashtable20.toString();
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Set set23 = weakHashtable22.entrySet();
    weakHashtable20.putAll((java.util.Map)weakHashtable22);
    weakHashtable16.putAll((java.util.Map)weakHashtable20);
    WeakHashtable weakHashtable26 = new WeakHashtable();
    java.lang.String str27 = weakHashtable26.toString();
    WeakHashtable weakHashtable28 = new WeakHashtable();
    java.util.Set set29 = weakHashtable28.entrySet();
    weakHashtable26.putAll((java.util.Map)weakHashtable28);
    java.util.Collection collection31 = weakHashtable26.values();
    java.lang.Object obj32 = weakHashtable7.put((java.lang.Object)weakHashtable20, (java.lang.Object)weakHashtable26);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj33 = weakHashtable0.remove(obj32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}"+ "'", str6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}"+ "'", str15.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}"+ "'", str21.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}"+ "'", str27.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Collection collection5 = weakHashtable0.values();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    boolean b8 = weakHashtable6.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable6.elements();
    weakHashtable0.putAll((java.util.Map)weakHashtable6);
    java.util.Collection collection11 = weakHashtable6.values();
    boolean b13 = weakHashtable6.containsKey((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    java.util.Set set10 = weakHashtable5.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.lang.Object obj3 = weakHashtable0.get((java.lang.Object)1.0d);
    java.util.Collection collection4 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection4);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    int i5 = weakHashtable2.size();
    java.util.Set set6 = weakHashtable2.keySet();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.lang.String str8 = weakHashtable7.toString();
    java.util.Set set9 = weakHashtable7.keySet();
    int i10 = weakHashtable7.size();
    weakHashtable2.putAll((java.util.Map)weakHashtable7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}"+ "'", str8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    java.util.Enumeration enumeration10 = weakHashtable0.keys();
    int i11 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.lang.String str6 = weakHashtable5.toString();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Set set8 = weakHashtable7.entrySet();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.util.Enumeration enumeration10 = weakHashtable5.keys();
    boolean b11 = weakHashtable2.containsKey((java.lang.Object)enumeration10);
    java.util.Enumeration enumeration12 = weakHashtable2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}"+ "'", str6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.String str14 = weakHashtable13.toString();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Set set16 = weakHashtable15.entrySet();
    weakHashtable13.putAll((java.util.Map)weakHashtable15);
    int i18 = weakHashtable15.size();
    java.util.Set set19 = weakHashtable15.keySet();
    java.lang.Object obj20 = weakHashtable9.get((java.lang.Object)set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Map map2 = null;
    weakHashtable0.putAll(map2);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.lang.String str5 = weakHashtable4.toString();
    java.util.Set set6 = weakHashtable4.keySet();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.lang.String str8 = weakHashtable7.toString();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.util.Set set10 = weakHashtable9.entrySet();
    weakHashtable7.putAll((java.util.Map)weakHashtable9);
    int i12 = weakHashtable9.size();
    weakHashtable4.putAll((java.util.Map)weakHashtable9);
    boolean b14 = weakHashtable0.containsKey((java.lang.Object)weakHashtable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}"+ "'", str8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Enumeration enumeration2 = weakHashtable0.keys();
    java.util.Set set3 = weakHashtable0.entrySet();
    java.lang.String str4 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    int i3 = weakHashtable0.size();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.lang.String str5 = weakHashtable4.toString();
    java.util.Set set6 = weakHashtable4.keySet();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.lang.String str8 = weakHashtable7.toString();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.util.Set set10 = weakHashtable9.entrySet();
    weakHashtable7.putAll((java.util.Map)weakHashtable9);
    int i12 = weakHashtable9.size();
    weakHashtable4.putAll((java.util.Map)weakHashtable9);
    int i14 = weakHashtable4.size();
    java.lang.Object obj15 = weakHashtable0.remove((java.lang.Object)i14);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.lang.String str17 = weakHashtable16.toString();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    java.util.Set set19 = weakHashtable18.entrySet();
    weakHashtable16.putAll((java.util.Map)weakHashtable18);
    java.lang.Object obj22 = weakHashtable18.get((java.lang.Object)(-1L));
    java.lang.Object obj24 = weakHashtable18.get((java.lang.Object)10L);
    WeakHashtable weakHashtable25 = new WeakHashtable();
    java.lang.String str26 = weakHashtable25.toString();
    java.util.Set set27 = weakHashtable25.keySet();
    weakHashtable18.putAll((java.util.Map)weakHashtable25);
    java.lang.String str29 = weakHashtable18.toString();
    WeakHashtable weakHashtable30 = new WeakHashtable();
    java.lang.String str31 = weakHashtable30.toString();
    java.util.Set set32 = weakHashtable30.keySet();
    java.util.Set set33 = weakHashtable30.keySet();
    int i34 = weakHashtable30.size();
    java.lang.Object obj35 = weakHashtable18.get((java.lang.Object)i34);
    weakHashtable0.putAll((java.util.Map)weakHashtable18);
    WeakHashtable weakHashtable37 = new WeakHashtable();
    java.lang.String str38 = weakHashtable37.toString();
    java.util.Enumeration enumeration39 = weakHashtable37.keys();
    java.util.Set set40 = weakHashtable37.entrySet();
    int i41 = weakHashtable37.size();
    boolean b43 = weakHashtable37.containsKey((java.lang.Object)true);
    WeakHashtable weakHashtable44 = new WeakHashtable();
    java.lang.String str45 = weakHashtable44.toString();
    java.util.Enumeration enumeration46 = weakHashtable44.keys();
    java.util.Set set47 = weakHashtable44.entrySet();
    int i48 = weakHashtable44.size();
    boolean b50 = weakHashtable44.containsKey((java.lang.Object)true);
    java.lang.Object obj51 = weakHashtable37.remove((java.lang.Object)true);
    java.util.Set set52 = weakHashtable37.entrySet();
    java.lang.Object obj53 = weakHashtable0.get((java.lang.Object)set52);
    java.util.Enumeration enumeration54 = weakHashtable0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}"+ "'", str8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}"+ "'", str17.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}"+ "'", str26.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}"+ "'", str29.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}"+ "'", str31.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}"+ "'", str38.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}"+ "'", str45.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration54);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Map map2 = null;
    weakHashtable0.putAll(map2);
    int i4 = weakHashtable0.size();
    java.util.Set set5 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    java.util.Set set3 = weakHashtable0.keySet();
    int i4 = weakHashtable0.size();
    java.util.Set set5 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    int i10 = weakHashtable0.size();
    java.util.Enumeration enumeration11 = weakHashtable0.keys();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.util.Collection collection13 = weakHashtable12.values();
    java.lang.Object obj14 = weakHashtable0.get((java.lang.Object)weakHashtable12);
    java.util.Enumeration enumeration15 = weakHashtable0.keys();
    java.util.Set set16 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.lang.String str6 = weakHashtable5.toString();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Set set8 = weakHashtable7.entrySet();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.util.Enumeration enumeration10 = weakHashtable5.keys();
    boolean b11 = weakHashtable2.containsKey((java.lang.Object)enumeration10);
    java.util.Set set12 = weakHashtable2.entrySet();
    java.util.Enumeration enumeration13 = weakHashtable2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}"+ "'", str6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Enumeration enumeration2 = weakHashtable0.keys();
    java.util.Set set3 = weakHashtable0.entrySet();
    int i4 = weakHashtable0.size();
    boolean b6 = weakHashtable0.containsKey((java.lang.Object)true);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.lang.String str8 = weakHashtable7.toString();
    java.util.Enumeration enumeration9 = weakHashtable7.keys();
    java.util.Set set10 = weakHashtable7.entrySet();
    int i11 = weakHashtable7.size();
    boolean b13 = weakHashtable7.containsKey((java.lang.Object)true);
    java.lang.Object obj14 = weakHashtable0.remove((java.lang.Object)true);
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.lang.String str16 = weakHashtable15.toString();
    java.util.Set set17 = weakHashtable15.keySet();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    java.lang.String str19 = weakHashtable18.toString();
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.util.Set set21 = weakHashtable20.entrySet();
    weakHashtable18.putAll((java.util.Map)weakHashtable20);
    int i23 = weakHashtable20.size();
    weakHashtable15.putAll((java.util.Map)weakHashtable20);
    int i25 = weakHashtable15.size();
    java.lang.Object obj27 = weakHashtable15.remove((java.lang.Object)(-1L));
    boolean b28 = weakHashtable0.containsKey((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}"+ "'", str8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}"+ "'", str16.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}"+ "'", str19.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Enumeration enumeration2 = weakHashtable0.keys();
    java.util.Set set3 = weakHashtable0.entrySet();
    int i4 = weakHashtable0.size();
    java.util.Enumeration enumeration5 = weakHashtable0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    java.lang.Object obj14 = weakHashtable2.remove((java.lang.Object)true);
    java.util.Collection collection15 = weakHashtable2.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection15);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    int i10 = weakHashtable0.size();
    java.lang.Object obj12 = weakHashtable0.remove((java.lang.Object)(-1L));
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.String str14 = weakHashtable13.toString();
    java.util.Set set15 = weakHashtable13.keySet();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.lang.String str17 = weakHashtable16.toString();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    java.util.Set set19 = weakHashtable18.entrySet();
    weakHashtable16.putAll((java.util.Map)weakHashtable18);
    int i21 = weakHashtable18.size();
    weakHashtable13.putAll((java.util.Map)weakHashtable18);
    int i23 = weakHashtable13.size();
    WeakHashtable weakHashtable24 = new WeakHashtable();
    java.util.Set set25 = weakHashtable24.entrySet();
    WeakHashtable weakHashtable26 = new WeakHashtable();
    java.lang.String str27 = weakHashtable26.toString();
    WeakHashtable weakHashtable28 = new WeakHashtable();
    java.util.Set set29 = weakHashtable28.entrySet();
    weakHashtable26.putAll((java.util.Map)weakHashtable28);
    java.lang.Object obj32 = weakHashtable28.get((java.lang.Object)(-1L));
    java.lang.Object obj34 = weakHashtable28.get((java.lang.Object)10L);
    WeakHashtable weakHashtable35 = new WeakHashtable();
    java.lang.String str36 = weakHashtable35.toString();
    java.util.Set set37 = weakHashtable35.keySet();
    weakHashtable28.putAll((java.util.Map)weakHashtable35);
    java.lang.Object obj39 = weakHashtable13.put((java.lang.Object)weakHashtable24, (java.lang.Object)weakHashtable28);
    java.util.Enumeration enumeration40 = weakHashtable28.elements();
    WeakHashtable weakHashtable41 = new WeakHashtable();
    java.lang.String str42 = weakHashtable41.toString();
    WeakHashtable weakHashtable43 = new WeakHashtable();
    java.util.Set set44 = weakHashtable43.entrySet();
    weakHashtable41.putAll((java.util.Map)weakHashtable43);
    int i46 = weakHashtable43.size();
    WeakHashtable weakHashtable47 = new WeakHashtable();
    java.lang.String str48 = weakHashtable47.toString();
    WeakHashtable weakHashtable49 = new WeakHashtable();
    java.util.Set set50 = weakHashtable49.entrySet();
    weakHashtable47.putAll((java.util.Map)weakHashtable49);
    weakHashtable43.putAll((java.util.Map)weakHashtable47);
    java.lang.Object obj53 = weakHashtable0.put((java.lang.Object)weakHashtable28, (java.lang.Object)weakHashtable47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}"+ "'", str17.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}"+ "'", str27.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}"+ "'", str36.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}"+ "'", str42.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}"+ "'", str48.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj53);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    java.lang.String str13 = weakHashtable2.toString();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    java.lang.String str15 = weakHashtable14.toString();
    java.util.Set set16 = weakHashtable14.keySet();
    java.util.Set set17 = weakHashtable14.keySet();
    int i18 = weakHashtable14.size();
    java.lang.Object obj19 = weakHashtable2.get((java.lang.Object)i18);
    boolean b20 = weakHashtable2.isEmpty();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    java.lang.String str22 = weakHashtable21.toString();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    java.util.Set set24 = weakHashtable23.entrySet();
    weakHashtable21.putAll((java.util.Map)weakHashtable23);
    int i26 = weakHashtable23.size();
    java.util.Enumeration enumeration27 = weakHashtable23.keys();
    java.lang.Object obj29 = weakHashtable23.get((java.lang.Object)(-1.0f));
    int i30 = weakHashtable23.size();
    java.lang.Object obj31 = weakHashtable2.remove((java.lang.Object)i30);
    java.util.Enumeration enumeration32 = weakHashtable2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}"+ "'", str13.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}"+ "'", str15.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}"+ "'", str22.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration32);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.String str14 = weakHashtable13.toString();
    java.util.Set set15 = weakHashtable13.keySet();
    java.util.Set set16 = weakHashtable13.keySet();
    int i17 = weakHashtable13.size();
    boolean b18 = weakHashtable13.isEmpty();
    weakHashtable2.putAll((java.util.Map)weakHashtable13);
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.lang.String str21 = weakHashtable20.toString();
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Set set23 = weakHashtable22.entrySet();
    weakHashtable20.putAll((java.util.Map)weakHashtable22);
    WeakHashtable weakHashtable25 = new WeakHashtable();
    java.lang.String str26 = weakHashtable25.toString();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.util.Set set28 = weakHashtable27.entrySet();
    weakHashtable25.putAll((java.util.Map)weakHashtable27);
    int i30 = weakHashtable27.size();
    java.lang.Object obj31 = weakHashtable2.put((java.lang.Object)weakHashtable20, (java.lang.Object)i30);
    java.util.Collection collection32 = weakHashtable20.values();
    boolean b33 = weakHashtable20.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}"+ "'", str21.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}"+ "'", str26.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.String str7 = weakHashtable2.toString();
    java.util.Enumeration enumeration8 = weakHashtable2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}"+ "'", str7.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    int i10 = weakHashtable0.size();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Set set12 = weakHashtable11.entrySet();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.String str14 = weakHashtable13.toString();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Set set16 = weakHashtable15.entrySet();
    weakHashtable13.putAll((java.util.Map)weakHashtable15);
    java.lang.Object obj19 = weakHashtable15.get((java.lang.Object)(-1L));
    java.lang.Object obj21 = weakHashtable15.get((java.lang.Object)10L);
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.lang.String str23 = weakHashtable22.toString();
    java.util.Set set24 = weakHashtable22.keySet();
    weakHashtable15.putAll((java.util.Map)weakHashtable22);
    java.lang.Object obj26 = weakHashtable0.put((java.lang.Object)weakHashtable11, (java.lang.Object)weakHashtable15);
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.lang.String str28 = weakHashtable27.toString();
    WeakHashtable weakHashtable29 = new WeakHashtable();
    java.util.Set set30 = weakHashtable29.entrySet();
    weakHashtable27.putAll((java.util.Map)weakHashtable29);
    java.util.Collection collection32 = weakHashtable27.values();
    WeakHashtable weakHashtable33 = new WeakHashtable();
    java.util.Collection collection34 = weakHashtable33.values();
    boolean b35 = weakHashtable33.isEmpty();
    java.util.Enumeration enumeration36 = weakHashtable33.elements();
    weakHashtable27.putAll((java.util.Map)weakHashtable33);
    java.util.Set set38 = weakHashtable33.keySet();
    weakHashtable11.putAll((java.util.Map)weakHashtable33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}"+ "'", str23.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}"+ "'", str28.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set38);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Enumeration enumeration5 = weakHashtable0.keys();
    java.util.Set set6 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    int i5 = weakHashtable2.size();
    java.util.Enumeration enumeration6 = weakHashtable2.keys();
    int i7 = weakHashtable2.size();
    java.util.Set set8 = weakHashtable2.entrySet();
    java.util.Collection collection9 = weakHashtable2.values();
    java.util.Enumeration enumeration10 = weakHashtable2.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    java.util.Enumeration enumeration10 = weakHashtable0.keys();
    java.lang.String str11 = weakHashtable0.toString();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.lang.String str13 = weakHashtable12.toString();
    java.util.Set set14 = weakHashtable12.keySet();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.lang.String str16 = weakHashtable15.toString();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.util.Set set18 = weakHashtable17.entrySet();
    weakHashtable15.putAll((java.util.Map)weakHashtable17);
    int i20 = weakHashtable17.size();
    weakHashtable12.putAll((java.util.Map)weakHashtable17);
    java.util.Enumeration enumeration22 = weakHashtable17.keys();
    boolean b23 = weakHashtable0.containsKey((java.lang.Object)enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}"+ "'", str11.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}"+ "'", str13.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}"+ "'", str16.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Collection collection5 = weakHashtable0.values();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    boolean b8 = weakHashtable6.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable6.elements();
    weakHashtable0.putAll((java.util.Map)weakHashtable6);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.lang.String str12 = weakHashtable11.toString();
    java.util.Set set13 = weakHashtable11.keySet();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    java.lang.String str15 = weakHashtable14.toString();
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Set set17 = weakHashtable16.entrySet();
    weakHashtable14.putAll((java.util.Map)weakHashtable16);
    int i19 = weakHashtable16.size();
    weakHashtable11.putAll((java.util.Map)weakHashtable16);
    java.util.Enumeration enumeration21 = weakHashtable16.keys();
    java.util.Enumeration enumeration22 = weakHashtable16.keys();
    java.lang.Object obj23 = weakHashtable6.remove((java.lang.Object)enumeration22);
    WeakHashtable weakHashtable24 = new WeakHashtable();
    java.lang.String str25 = weakHashtable24.toString();
    java.util.Set set26 = weakHashtable24.keySet();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.lang.String str28 = weakHashtable27.toString();
    WeakHashtable weakHashtable29 = new WeakHashtable();
    java.util.Set set30 = weakHashtable29.entrySet();
    weakHashtable27.putAll((java.util.Map)weakHashtable29);
    int i32 = weakHashtable29.size();
    weakHashtable24.putAll((java.util.Map)weakHashtable29);
    java.util.Enumeration enumeration34 = weakHashtable24.keys();
    java.util.Enumeration enumeration35 = weakHashtable24.elements();
    java.lang.Object obj36 = weakHashtable6.remove((java.lang.Object)enumeration35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}"+ "'", str12.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}"+ "'", str15.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}"+ "'", str25.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}"+ "'", str28.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    java.util.Collection collection10 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection10);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.lang.String str6 = weakHashtable5.toString();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Set set8 = weakHashtable7.entrySet();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.util.Enumeration enumeration10 = weakHashtable5.keys();
    boolean b11 = weakHashtable2.containsKey((java.lang.Object)enumeration10);
    java.util.Set set12 = weakHashtable2.entrySet();
    java.util.Set set13 = weakHashtable2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}"+ "'", str6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    int i10 = weakHashtable0.size();
    java.util.Enumeration enumeration11 = weakHashtable0.keys();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.util.Collection collection13 = weakHashtable12.values();
    java.lang.Object obj14 = weakHashtable0.get((java.lang.Object)weakHashtable12);
    java.util.Enumeration enumeration15 = weakHashtable0.keys();
    java.util.Enumeration enumeration16 = weakHashtable0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration16);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Set set12 = weakHashtable11.entrySet();
    weakHashtable9.putAll((java.util.Map)weakHashtable11);
    int i14 = weakHashtable11.size();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.lang.String str16 = weakHashtable15.toString();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.util.Set set18 = weakHashtable17.entrySet();
    weakHashtable15.putAll((java.util.Map)weakHashtable17);
    weakHashtable11.putAll((java.util.Map)weakHashtable15);
    WeakHashtable weakHashtable21 = new WeakHashtable();
    java.lang.String str22 = weakHashtable21.toString();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    java.util.Set set24 = weakHashtable23.entrySet();
    weakHashtable21.putAll((java.util.Map)weakHashtable23);
    java.util.Collection collection26 = weakHashtable21.values();
    java.lang.Object obj27 = weakHashtable2.put((java.lang.Object)weakHashtable15, (java.lang.Object)weakHashtable21);
    java.util.Enumeration enumeration28 = weakHashtable15.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}"+ "'", str16.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}"+ "'", str22.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration28);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.lang.String str6 = weakHashtable5.toString();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Set set8 = weakHashtable7.entrySet();
    weakHashtable5.putAll((java.util.Map)weakHashtable7);
    java.util.Enumeration enumeration10 = weakHashtable5.keys();
    boolean b11 = weakHashtable2.containsKey((java.lang.Object)enumeration10);
    java.util.Set set12 = weakHashtable2.entrySet();
    java.util.Set set13 = weakHashtable2.entrySet();
    boolean b14 = weakHashtable2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}"+ "'", str6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    java.lang.Object obj14 = weakHashtable2.remove((java.lang.Object)true);
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.lang.String str16 = weakHashtable15.toString();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.util.Set set18 = weakHashtable17.entrySet();
    weakHashtable15.putAll((java.util.Map)weakHashtable17);
    int i20 = weakHashtable17.size();
    java.util.Enumeration enumeration21 = weakHashtable17.keys();
    java.lang.Object obj23 = weakHashtable17.get((java.lang.Object)(-1.0f));
    int i24 = weakHashtable17.size();
    boolean b25 = weakHashtable2.containsKey((java.lang.Object)i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}"+ "'", str16.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    WeakHashtable weakHashtable1 = new WeakHashtable();
    java.lang.String str2 = weakHashtable1.toString();
    java.util.Set set3 = weakHashtable1.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.lang.String str5 = weakHashtable4.toString();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Set set7 = weakHashtable6.entrySet();
    weakHashtable4.putAll((java.util.Map)weakHashtable6);
    int i9 = weakHashtable6.size();
    weakHashtable1.putAll((java.util.Map)weakHashtable6);
    int i11 = weakHashtable1.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable1);
    boolean b13 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}"+ "'", str2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    int i5 = weakHashtable2.size();
    java.util.Collection collection6 = weakHashtable2.values();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.lang.String str8 = weakHashtable7.toString();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.util.Set set10 = weakHashtable9.entrySet();
    weakHashtable7.putAll((java.util.Map)weakHashtable9);
    java.lang.Object obj13 = weakHashtable9.get((java.lang.Object)(-1L));
    java.lang.Object obj15 = weakHashtable9.get((java.lang.Object)10L);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.lang.String str17 = weakHashtable16.toString();
    java.util.Set set18 = weakHashtable16.keySet();
    weakHashtable9.putAll((java.util.Map)weakHashtable16);
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.lang.String str21 = weakHashtable20.toString();
    java.util.Set set22 = weakHashtable20.keySet();
    java.util.Set set23 = weakHashtable20.keySet();
    int i24 = weakHashtable20.size();
    boolean b25 = weakHashtable20.isEmpty();
    weakHashtable9.putAll((java.util.Map)weakHashtable20);
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    boolean b28 = weakHashtable2.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}"+ "'", str8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}"+ "'", str17.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}"+ "'", str21.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    java.util.Set set2 = weakHashtable0.keySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.lang.String str4 = weakHashtable3.toString();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Set set6 = weakHashtable5.entrySet();
    weakHashtable3.putAll((java.util.Map)weakHashtable5);
    int i8 = weakHashtable5.size();
    weakHashtable0.putAll((java.util.Map)weakHashtable5);
    int i10 = weakHashtable0.size();
    java.util.Enumeration enumeration11 = weakHashtable0.keys();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.lang.String str13 = weakHashtable12.toString();
    java.util.Set set14 = weakHashtable12.keySet();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.lang.String str16 = weakHashtable15.toString();
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.util.Set set18 = weakHashtable17.entrySet();
    weakHashtable15.putAll((java.util.Map)weakHashtable17);
    int i20 = weakHashtable17.size();
    weakHashtable12.putAll((java.util.Map)weakHashtable17);
    int i22 = weakHashtable12.size();
    WeakHashtable weakHashtable23 = new WeakHashtable();
    java.util.Set set24 = weakHashtable23.entrySet();
    WeakHashtable weakHashtable25 = new WeakHashtable();
    java.lang.String str26 = weakHashtable25.toString();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.util.Set set28 = weakHashtable27.entrySet();
    weakHashtable25.putAll((java.util.Map)weakHashtable27);
    java.lang.Object obj31 = weakHashtable27.get((java.lang.Object)(-1L));
    java.lang.Object obj33 = weakHashtable27.get((java.lang.Object)10L);
    WeakHashtable weakHashtable34 = new WeakHashtable();
    java.lang.String str35 = weakHashtable34.toString();
    java.util.Set set36 = weakHashtable34.keySet();
    weakHashtable27.putAll((java.util.Map)weakHashtable34);
    java.lang.Object obj38 = weakHashtable12.put((java.lang.Object)weakHashtable23, (java.lang.Object)weakHashtable27);
    java.lang.Object obj39 = weakHashtable0.remove((java.lang.Object)weakHashtable27);
    WeakHashtable weakHashtable40 = new WeakHashtable();
    java.lang.String str41 = weakHashtable40.toString();
    WeakHashtable weakHashtable42 = new WeakHashtable();
    java.util.Set set43 = weakHashtable42.entrySet();
    weakHashtable40.putAll((java.util.Map)weakHashtable42);
    java.lang.Object obj46 = weakHashtable42.get((java.lang.Object)(-1L));
    java.lang.Object obj48 = weakHashtable42.get((java.lang.Object)10L);
    WeakHashtable weakHashtable49 = new WeakHashtable();
    java.lang.String str50 = weakHashtable49.toString();
    java.util.Set set51 = weakHashtable49.keySet();
    weakHashtable42.putAll((java.util.Map)weakHashtable49);
    java.lang.Object obj54 = weakHashtable42.remove((java.lang.Object)true);
    int i55 = weakHashtable42.size();
    boolean b56 = weakHashtable27.containsKey((java.lang.Object)weakHashtable42);
    java.util.Set set57 = weakHashtable27.entrySet();
    boolean b58 = weakHashtable27.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}"+ "'", str13.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}"+ "'", str16.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}"+ "'", str26.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}"+ "'", str35.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}"+ "'", str41.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}"+ "'", str50.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    int i5 = weakHashtable2.size();
    java.util.Enumeration enumeration6 = weakHashtable2.keys();
    int i7 = weakHashtable2.size();
    java.util.Set set8 = weakHashtable2.entrySet();
    java.util.Collection collection9 = weakHashtable2.values();
    java.util.Set set10 = weakHashtable2.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.util.Collection collection5 = weakHashtable0.values();
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.util.Collection collection7 = weakHashtable6.values();
    boolean b8 = weakHashtable6.isEmpty();
    java.util.Enumeration enumeration9 = weakHashtable6.elements();
    weakHashtable0.putAll((java.util.Map)weakHashtable6);
    java.util.Set set11 = weakHashtable6.keySet();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.lang.String str13 = weakHashtable12.toString();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    java.util.Set set15 = weakHashtable14.entrySet();
    weakHashtable12.putAll((java.util.Map)weakHashtable14);
    int i17 = weakHashtable14.size();
    java.util.Collection collection18 = weakHashtable14.values();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    java.lang.String str20 = weakHashtable19.toString();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    java.util.Set set22 = weakHashtable21.entrySet();
    weakHashtable19.putAll((java.util.Map)weakHashtable21);
    java.lang.Object obj25 = weakHashtable21.get((java.lang.Object)(-1L));
    java.lang.Object obj27 = weakHashtable21.get((java.lang.Object)10L);
    WeakHashtable weakHashtable28 = new WeakHashtable();
    java.lang.String str29 = weakHashtable28.toString();
    java.util.Set set30 = weakHashtable28.keySet();
    weakHashtable21.putAll((java.util.Map)weakHashtable28);
    WeakHashtable weakHashtable32 = new WeakHashtable();
    java.lang.String str33 = weakHashtable32.toString();
    java.util.Set set34 = weakHashtable32.keySet();
    java.util.Set set35 = weakHashtable32.keySet();
    int i36 = weakHashtable32.size();
    boolean b37 = weakHashtable32.isEmpty();
    weakHashtable21.putAll((java.util.Map)weakHashtable32);
    weakHashtable14.putAll((java.util.Map)weakHashtable21);
    WeakHashtable weakHashtable40 = new WeakHashtable();
    java.lang.String str41 = weakHashtable40.toString();
    java.util.Set set42 = weakHashtable40.keySet();
    WeakHashtable weakHashtable43 = new WeakHashtable();
    java.lang.String str44 = weakHashtable43.toString();
    WeakHashtable weakHashtable45 = new WeakHashtable();
    java.util.Set set46 = weakHashtable45.entrySet();
    weakHashtable43.putAll((java.util.Map)weakHashtable45);
    int i48 = weakHashtable45.size();
    weakHashtable40.putAll((java.util.Map)weakHashtable45);
    java.util.Enumeration enumeration50 = weakHashtable40.keys();
    java.util.Enumeration enumeration51 = weakHashtable40.elements();
    WeakHashtable weakHashtable52 = new WeakHashtable();
    java.lang.String str53 = weakHashtable52.toString();
    WeakHashtable weakHashtable54 = new WeakHashtable();
    java.util.Set set55 = weakHashtable54.entrySet();
    weakHashtable52.putAll((java.util.Map)weakHashtable54);
    WeakHashtable weakHashtable57 = new WeakHashtable();
    java.lang.String str58 = weakHashtable57.toString();
    WeakHashtable weakHashtable59 = new WeakHashtable();
    java.util.Set set60 = weakHashtable59.entrySet();
    weakHashtable57.putAll((java.util.Map)weakHashtable59);
    java.util.Enumeration enumeration62 = weakHashtable57.keys();
    boolean b63 = weakHashtable54.containsKey((java.lang.Object)enumeration62);
    java.util.Set set64 = weakHashtable54.entrySet();
    java.util.Set set65 = weakHashtable54.entrySet();
    WeakHashtable weakHashtable66 = new WeakHashtable();
    java.lang.String str67 = weakHashtable66.toString();
    WeakHashtable weakHashtable68 = new WeakHashtable();
    java.util.Set set69 = weakHashtable68.entrySet();
    weakHashtable66.putAll((java.util.Map)weakHashtable68);
    boolean b71 = weakHashtable54.containsKey((java.lang.Object)weakHashtable66);
    boolean b72 = weakHashtable40.containsKey((java.lang.Object)weakHashtable54);
    java.lang.Object obj73 = weakHashtable6.put((java.lang.Object)weakHashtable14, (java.lang.Object)weakHashtable40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}"+ "'", str13.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}"+ "'", str20.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}"+ "'", str29.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}"+ "'", str33.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}"+ "'", str41.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}"+ "'", str44.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}"+ "'", str53.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}"+ "'", str58.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}"+ "'", str67.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj73);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    java.lang.String str13 = weakHashtable2.toString();
    java.util.Enumeration enumeration14 = weakHashtable2.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}"+ "'", str13.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.String str1 = weakHashtable0.toString();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    java.util.Set set3 = weakHashtable2.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable2);
    java.lang.Object obj6 = weakHashtable2.get((java.lang.Object)(-1L));
    java.lang.Object obj8 = weakHashtable2.get((java.lang.Object)10L);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.lang.String str10 = weakHashtable9.toString();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.lang.String str14 = weakHashtable13.toString();
    java.util.Set set15 = weakHashtable13.keySet();
    java.util.Set set16 = weakHashtable13.keySet();
    int i17 = weakHashtable13.size();
    boolean b18 = weakHashtable13.isEmpty();
    weakHashtable2.putAll((java.util.Map)weakHashtable13);
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.lang.String str21 = weakHashtable20.toString();
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Set set23 = weakHashtable22.entrySet();
    weakHashtable20.putAll((java.util.Map)weakHashtable22);
    WeakHashtable weakHashtable25 = new WeakHashtable();
    java.lang.String str26 = weakHashtable25.toString();
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.util.Set set28 = weakHashtable27.entrySet();
    weakHashtable25.putAll((java.util.Map)weakHashtable27);
    int i30 = weakHashtable27.size();
    java.lang.Object obj31 = weakHashtable2.put((java.lang.Object)weakHashtable20, (java.lang.Object)i30);
    java.util.Collection collection32 = weakHashtable20.values();
    WeakHashtable weakHashtable33 = new WeakHashtable();
    java.lang.String str34 = weakHashtable33.toString();
    WeakHashtable weakHashtable35 = new WeakHashtable();
    java.util.Set set36 = weakHashtable35.entrySet();
    weakHashtable33.putAll((java.util.Map)weakHashtable35);
    int i38 = weakHashtable35.size();
    java.util.Collection collection39 = weakHashtable35.values();
    java.lang.Object obj40 = weakHashtable20.get((java.lang.Object)weakHashtable35);
    java.util.Set set41 = weakHashtable35.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{}"+ "'", str1.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}"+ "'", str14.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}"+ "'", str21.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}"+ "'", str26.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}"+ "'", str34.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);

  }

}
