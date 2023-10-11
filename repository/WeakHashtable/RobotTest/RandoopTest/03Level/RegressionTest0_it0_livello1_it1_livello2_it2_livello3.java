
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
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.util.Collection collection4 = weakHashtable3.values();
    java.util.Collection collection5 = weakHashtable3.values();
    java.util.Enumeration enumeration6 = weakHashtable3.elements();
    boolean b7 = weakHashtable0.containsKey((java.lang.Object)enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Set set2 = weakHashtable0.keySet();
    java.util.Enumeration enumeration3 = weakHashtable0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.Object obj3 = weakHashtable0.remove((java.lang.Object)(-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    java.util.Set set3 = weakHashtable0.keySet();
    java.lang.Object obj5 = weakHashtable0.get((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.remove((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    java.util.Set set3 = weakHashtable0.keySet();
    java.util.Enumeration enumeration4 = weakHashtable0.elements();
    java.lang.Object obj6 = weakHashtable0.remove((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.remove((java.lang.Object)false);
    java.util.Set set3 = weakHashtable0.entrySet();
    java.util.Set set4 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)(byte)10);
    java.lang.String str5 = weakHashtable0.toString();
    java.util.Map map6 = null;
    weakHashtable0.putAll(map6);
    boolean b9 = weakHashtable0.containsKey((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.remove((java.lang.Object)false);
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.util.Collection collection4 = weakHashtable3.values();
    java.util.Set set5 = weakHashtable3.keySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    int i7 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.remove((java.lang.Object)false);
    java.util.Set set3 = weakHashtable0.entrySet();
    java.util.Set set4 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)(byte)10);
    java.lang.String str5 = weakHashtable0.toString();
    java.util.Map map6 = null;
    weakHashtable0.putAll(map6);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.util.Collection collection9 = weakHashtable8.values();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    boolean b12 = weakHashtable10.containsKey((java.lang.Object)(short)1);
    java.util.Set set13 = weakHashtable10.keySet();
    java.util.Enumeration enumeration14 = weakHashtable10.elements();
    java.lang.Object obj15 = weakHashtable8.remove((java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Collection collection17 = weakHashtable16.values();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    boolean b20 = weakHashtable18.containsKey((java.lang.Object)(short)1);
    java.util.Set set21 = weakHashtable18.keySet();
    java.util.Enumeration enumeration22 = weakHashtable18.elements();
    java.lang.Object obj23 = weakHashtable16.remove((java.lang.Object)weakHashtable18);
    java.util.Enumeration enumeration24 = weakHashtable16.keys();
    java.util.Enumeration enumeration25 = weakHashtable16.elements();
    java.lang.Object obj26 = weakHashtable0.put((java.lang.Object)weakHashtable10, (java.lang.Object)weakHashtable16);
    boolean b27 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Collection collection5 = weakHashtable4.values();
    java.util.Collection collection6 = weakHashtable4.values();
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable4);
    java.lang.String str8 = weakHashtable0.toString();
    boolean b9 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{-1.0={}}"+ "'", str8.equals("{-1.0={}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    boolean b5 = weakHashtable3.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Collection collection8 = weakHashtable7.values();
    java.util.Collection collection9 = weakHashtable7.values();
    java.lang.Object obj10 = weakHashtable3.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable7);
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    java.util.Collection collection12 = weakHashtable3.values();
    WeakHashtable weakHashtable14 = new WeakHashtable();
    boolean b16 = weakHashtable14.containsKey((java.lang.Object)(short)1);
    java.util.Set set17 = weakHashtable14.keySet();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    boolean b20 = weakHashtable18.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Collection collection23 = weakHashtable22.values();
    java.util.Collection collection24 = weakHashtable22.values();
    java.lang.Object obj25 = weakHashtable18.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable22);
    java.lang.Object obj27 = weakHashtable14.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    java.util.Set set28 = weakHashtable14.entrySet();
    java.lang.Object obj29 = weakHashtable3.put((java.lang.Object)(byte)0, (java.lang.Object)weakHashtable14);
    WeakHashtable weakHashtable30 = new WeakHashtable();
    java.util.Collection collection31 = weakHashtable30.values();
    java.util.Collection collection32 = weakHashtable30.values();
    WeakHashtable weakHashtable33 = new WeakHashtable();
    java.util.Collection collection34 = weakHashtable33.values();
    java.util.Collection collection35 = weakHashtable33.values();
    java.lang.Object obj37 = weakHashtable33.get((java.lang.Object)(byte)10);
    java.lang.String str38 = weakHashtable33.toString();
    java.util.Map map39 = null;
    weakHashtable33.putAll(map39);
    WeakHashtable weakHashtable41 = new WeakHashtable();
    java.util.Collection collection42 = weakHashtable41.values();
    WeakHashtable weakHashtable43 = new WeakHashtable();
    boolean b45 = weakHashtable43.containsKey((java.lang.Object)(short)1);
    java.util.Set set46 = weakHashtable43.keySet();
    java.util.Enumeration enumeration47 = weakHashtable43.elements();
    java.lang.Object obj48 = weakHashtable41.remove((java.lang.Object)weakHashtable43);
    WeakHashtable weakHashtable49 = new WeakHashtable();
    java.util.Collection collection50 = weakHashtable49.values();
    WeakHashtable weakHashtable51 = new WeakHashtable();
    boolean b53 = weakHashtable51.containsKey((java.lang.Object)(short)1);
    java.util.Set set54 = weakHashtable51.keySet();
    java.util.Enumeration enumeration55 = weakHashtable51.elements();
    java.lang.Object obj56 = weakHashtable49.remove((java.lang.Object)weakHashtable51);
    java.util.Enumeration enumeration57 = weakHashtable49.keys();
    java.util.Enumeration enumeration58 = weakHashtable49.elements();
    java.lang.Object obj59 = weakHashtable33.put((java.lang.Object)weakHashtable43, (java.lang.Object)weakHashtable49);
    java.lang.Object obj60 = weakHashtable3.put((java.lang.Object)collection32, (java.lang.Object)weakHashtable49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}"+ "'", str38.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj60);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Collection collection5 = weakHashtable4.values();
    java.util.Collection collection6 = weakHashtable4.values();
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable4);
    java.lang.String str8 = weakHashtable0.toString();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    boolean b11 = weakHashtable9.containsKey((java.lang.Object)(short)1);
    java.util.Set set12 = weakHashtable9.keySet();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b15 = weakHashtable13.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.util.Collection collection18 = weakHashtable17.values();
    java.util.Collection collection19 = weakHashtable17.values();
    java.lang.Object obj20 = weakHashtable13.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable17);
    java.lang.Object obj22 = weakHashtable9.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    java.lang.Object obj25 = weakHashtable9.put((java.lang.Object)"{-1.0={}}", (java.lang.Object)10.0f);
    java.lang.Object obj26 = weakHashtable0.remove((java.lang.Object)weakHashtable9);
    WeakHashtable weakHashtable27 = new WeakHashtable();
    boolean b29 = weakHashtable27.containsKey((java.lang.Object)(short)1);
    java.util.Set set30 = weakHashtable27.keySet();
    WeakHashtable weakHashtable31 = new WeakHashtable();
    boolean b33 = weakHashtable31.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable35 = new WeakHashtable();
    java.util.Collection collection36 = weakHashtable35.values();
    java.util.Collection collection37 = weakHashtable35.values();
    java.lang.Object obj38 = weakHashtable31.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable35);
    java.lang.Object obj40 = weakHashtable27.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    java.util.Enumeration enumeration41 = weakHashtable27.keys();
    java.lang.Object obj42 = weakHashtable9.remove((java.lang.Object)enumeration41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{-1.0={}}"+ "'", str8.equals("{-1.0={}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Collection collection5 = weakHashtable4.values();
    java.util.Collection collection6 = weakHashtable4.values();
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable4);
    java.lang.String str8 = weakHashtable0.toString();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    boolean b11 = weakHashtable9.containsKey((java.lang.Object)(short)1);
    java.util.Set set12 = weakHashtable9.keySet();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b15 = weakHashtable13.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.util.Collection collection18 = weakHashtable17.values();
    java.util.Collection collection19 = weakHashtable17.values();
    java.lang.Object obj20 = weakHashtable13.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable17);
    java.lang.Object obj22 = weakHashtable9.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    java.lang.Object obj25 = weakHashtable9.put((java.lang.Object)"{-1.0={}}", (java.lang.Object)10.0f);
    java.lang.Object obj26 = weakHashtable0.remove((java.lang.Object)weakHashtable9);
    java.lang.Object obj28 = weakHashtable9.remove((java.lang.Object)100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{-1.0={}}"+ "'", str8.equals("{-1.0={}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    boolean b3 = weakHashtable0.isEmpty();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b5 = weakHashtable4.isEmpty();
    java.lang.Object obj8 = weakHashtable4.put((java.lang.Object)"", (java.lang.Object)(short)100);
    weakHashtable0.putAll((java.util.Map)weakHashtable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)(byte)10);
    java.lang.String str5 = weakHashtable0.toString();
    java.util.Map map6 = null;
    weakHashtable0.putAll(map6);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.util.Collection collection9 = weakHashtable8.values();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    boolean b12 = weakHashtable10.containsKey((java.lang.Object)(short)1);
    java.util.Set set13 = weakHashtable10.keySet();
    java.util.Enumeration enumeration14 = weakHashtable10.elements();
    java.lang.Object obj15 = weakHashtable8.remove((java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Collection collection17 = weakHashtable16.values();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    boolean b20 = weakHashtable18.containsKey((java.lang.Object)(short)1);
    java.util.Set set21 = weakHashtable18.keySet();
    java.util.Enumeration enumeration22 = weakHashtable18.elements();
    java.lang.Object obj23 = weakHashtable16.remove((java.lang.Object)weakHashtable18);
    java.util.Enumeration enumeration24 = weakHashtable16.keys();
    java.util.Enumeration enumeration25 = weakHashtable16.elements();
    java.lang.Object obj26 = weakHashtable0.put((java.lang.Object)weakHashtable10, (java.lang.Object)weakHashtable16);
    java.util.Enumeration enumeration27 = weakHashtable10.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration27);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b1 = weakHashtable0.isEmpty();
    java.util.Collection collection2 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Map map1 = null;
    weakHashtable0.putAll(map1);
    java.lang.String str3 = weakHashtable0.toString();
    java.util.Set set4 = weakHashtable0.keySet();
    java.lang.String str5 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}"+ "'", str3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    boolean b5 = weakHashtable3.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Collection collection8 = weakHashtable7.values();
    java.util.Collection collection9 = weakHashtable7.values();
    java.lang.Object obj10 = weakHashtable3.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable7);
    java.lang.String str11 = weakHashtable3.toString();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{-1.0={}}"+ "'", str11.equals("{-1.0={}}"));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)(byte)10);
    java.lang.String str5 = weakHashtable0.toString();
    java.util.Map map6 = null;
    weakHashtable0.putAll(map6);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.util.Collection collection9 = weakHashtable8.values();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    boolean b12 = weakHashtable10.containsKey((java.lang.Object)(short)1);
    java.util.Set set13 = weakHashtable10.keySet();
    java.util.Enumeration enumeration14 = weakHashtable10.elements();
    java.lang.Object obj15 = weakHashtable8.remove((java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Collection collection17 = weakHashtable16.values();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    boolean b20 = weakHashtable18.containsKey((java.lang.Object)(short)1);
    java.util.Set set21 = weakHashtable18.keySet();
    java.util.Enumeration enumeration22 = weakHashtable18.elements();
    java.lang.Object obj23 = weakHashtable16.remove((java.lang.Object)weakHashtable18);
    java.util.Enumeration enumeration24 = weakHashtable16.keys();
    java.util.Enumeration enumeration25 = weakHashtable16.elements();
    java.lang.Object obj26 = weakHashtable0.put((java.lang.Object)weakHashtable10, (java.lang.Object)weakHashtable16);
    WeakHashtable weakHashtable27 = new WeakHashtable();
    boolean b29 = weakHashtable27.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable31 = new WeakHashtable();
    java.util.Collection collection32 = weakHashtable31.values();
    java.util.Collection collection33 = weakHashtable31.values();
    java.lang.Object obj34 = weakHashtable27.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable31);
    java.lang.String str35 = weakHashtable27.toString();
    WeakHashtable weakHashtable36 = new WeakHashtable();
    java.lang.Object obj38 = weakHashtable36.remove((java.lang.Object)false);
    WeakHashtable weakHashtable39 = new WeakHashtable();
    java.util.Collection collection40 = weakHashtable39.values();
    java.util.Set set41 = weakHashtable39.keySet();
    weakHashtable36.putAll((java.util.Map)weakHashtable39);
    java.lang.Object obj43 = weakHashtable16.put((java.lang.Object)str35, (java.lang.Object)weakHashtable36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{-1.0={}}"+ "'", str35.equals("{-1.0={}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.remove((java.lang.Object)false);
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.util.Collection collection4 = weakHashtable3.values();
    java.util.Set set5 = weakHashtable3.keySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    java.lang.Object obj8 = weakHashtable3.remove((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    boolean b5 = weakHashtable3.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Collection collection8 = weakHashtable7.values();
    java.util.Collection collection9 = weakHashtable7.values();
    java.lang.Object obj10 = weakHashtable3.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable7);
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    int i12 = weakHashtable0.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.remove((java.lang.Object)false);
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.util.Collection collection4 = weakHashtable3.values();
    java.util.Collection collection5 = weakHashtable3.values();
    java.util.Enumeration enumeration6 = weakHashtable3.elements();
    java.lang.Object obj8 = weakHashtable3.get((java.lang.Object)0);
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    WeakHashtable weakHashtable10 = new WeakHashtable();
    boolean b12 = weakHashtable10.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable14 = new WeakHashtable();
    java.util.Collection collection15 = weakHashtable14.values();
    java.util.Collection collection16 = weakHashtable14.values();
    java.lang.Object obj17 = weakHashtable10.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable14);
    boolean b18 = weakHashtable3.containsKey((java.lang.Object)weakHashtable10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.String str2 = weakHashtable0.toString();
    java.util.Enumeration enumeration3 = weakHashtable0.keys();
    boolean b4 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}"+ "'", str2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Collection collection5 = weakHashtable4.values();
    java.util.Collection collection6 = weakHashtable4.values();
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable4);
    java.lang.String str8 = weakHashtable0.toString();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    boolean b11 = weakHashtable9.containsKey((java.lang.Object)(short)1);
    java.util.Set set12 = weakHashtable9.keySet();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b15 = weakHashtable13.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.util.Collection collection18 = weakHashtable17.values();
    java.util.Collection collection19 = weakHashtable17.values();
    java.lang.Object obj20 = weakHashtable13.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable17);
    java.lang.Object obj22 = weakHashtable9.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    java.lang.Object obj25 = weakHashtable9.put((java.lang.Object)"{-1.0={}}", (java.lang.Object)10.0f);
    java.lang.Object obj26 = weakHashtable0.remove((java.lang.Object)weakHashtable9);
    WeakHashtable weakHashtable27 = new WeakHashtable();
    boolean b29 = weakHashtable27.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable31 = new WeakHashtable();
    java.util.Collection collection32 = weakHashtable31.values();
    java.util.Collection collection33 = weakHashtable31.values();
    java.lang.Object obj34 = weakHashtable27.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable31);
    WeakHashtable weakHashtable35 = new WeakHashtable();
    java.lang.Object obj37 = weakHashtable35.remove((java.lang.Object)false);
    WeakHashtable weakHashtable38 = new WeakHashtable();
    java.util.Collection collection39 = weakHashtable38.values();
    java.util.Set set40 = weakHashtable38.keySet();
    weakHashtable35.putAll((java.util.Map)weakHashtable38);
    WeakHashtable weakHashtable42 = new WeakHashtable();
    java.util.Collection collection43 = weakHashtable42.values();
    java.util.Collection collection44 = weakHashtable42.values();
    java.lang.Object obj46 = weakHashtable42.get((java.lang.Object)(byte)10);
    java.lang.String str47 = weakHashtable42.toString();
    java.util.Map map48 = null;
    weakHashtable42.putAll(map48);
    WeakHashtable weakHashtable51 = new WeakHashtable();
    java.util.Collection collection52 = weakHashtable51.values();
    java.util.Set set53 = weakHashtable51.entrySet();
    java.lang.Object obj54 = weakHashtable42.put((java.lang.Object)(-1L), (java.lang.Object)set53);
    java.lang.Object obj55 = weakHashtable35.get((java.lang.Object)weakHashtable42);
    weakHashtable27.putAll((java.util.Map)weakHashtable35);
    WeakHashtable weakHashtable57 = new WeakHashtable();
    java.lang.Object obj59 = weakHashtable57.remove((java.lang.Object)false);
    WeakHashtable weakHashtable60 = new WeakHashtable();
    java.util.Collection collection61 = weakHashtable60.values();
    java.util.Set set62 = weakHashtable60.keySet();
    weakHashtable57.putAll((java.util.Map)weakHashtable60);
    boolean b64 = weakHashtable35.containsKey((java.lang.Object)weakHashtable60);
    java.util.Enumeration enumeration65 = weakHashtable60.keys();
    weakHashtable9.putAll((java.util.Map)weakHashtable60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{-1.0={}}"+ "'", str8.equals("{-1.0={}}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}"+ "'", str47.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration65);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    java.util.Set set3 = weakHashtable0.keySet();
    java.util.Set set4 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable5 = new WeakHashtable();
    java.util.Collection collection6 = weakHashtable5.values();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b9 = weakHashtable7.containsKey((java.lang.Object)(short)1);
    java.util.Set set10 = weakHashtable7.keySet();
    java.util.Enumeration enumeration11 = weakHashtable7.elements();
    java.lang.Object obj12 = weakHashtable5.remove((java.lang.Object)weakHashtable7);
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = weakHashtable0.containsKey(obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    java.util.Set set3 = weakHashtable0.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b6 = weakHashtable4.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.util.Collection collection9 = weakHashtable8.values();
    java.util.Collection collection10 = weakHashtable8.values();
    java.lang.Object obj11 = weakHashtable4.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable8);
    java.lang.Object obj13 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    java.util.Enumeration enumeration14 = weakHashtable0.keys();
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.lang.Object obj17 = weakHashtable15.remove((java.lang.Object)false);
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = weakHashtable0.containsKey(obj17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.remove((java.lang.Object)false);
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.util.Collection collection4 = weakHashtable3.values();
    java.util.Set set5 = weakHashtable3.keySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    java.util.Enumeration enumeration7 = weakHashtable0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration7);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    java.util.Set set3 = weakHashtable0.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b6 = weakHashtable4.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.util.Collection collection9 = weakHashtable8.values();
    java.util.Collection collection10 = weakHashtable8.values();
    java.lang.Object obj11 = weakHashtable4.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable8);
    java.lang.Object obj13 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    java.util.Enumeration enumeration14 = weakHashtable0.keys();
    java.util.Enumeration enumeration15 = weakHashtable0.elements();
    java.lang.String str16 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{-1.0=-1}"+ "'", str16.equals("{-1.0=-1}"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Collection collection5 = weakHashtable4.values();
    java.util.Collection collection6 = weakHashtable4.values();
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.lang.Object obj10 = weakHashtable8.remove((java.lang.Object)false);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.util.Set set13 = weakHashtable11.keySet();
    weakHashtable8.putAll((java.util.Map)weakHashtable11);
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Collection collection16 = weakHashtable15.values();
    java.util.Collection collection17 = weakHashtable15.values();
    java.lang.Object obj19 = weakHashtable15.get((java.lang.Object)(byte)10);
    java.lang.String str20 = weakHashtable15.toString();
    java.util.Map map21 = null;
    weakHashtable15.putAll(map21);
    WeakHashtable weakHashtable24 = new WeakHashtable();
    java.util.Collection collection25 = weakHashtable24.values();
    java.util.Set set26 = weakHashtable24.entrySet();
    java.lang.Object obj27 = weakHashtable15.put((java.lang.Object)(-1L), (java.lang.Object)set26);
    java.lang.Object obj28 = weakHashtable8.get((java.lang.Object)weakHashtable15);
    weakHashtable0.putAll((java.util.Map)weakHashtable8);
    WeakHashtable weakHashtable30 = new WeakHashtable();
    java.lang.Object obj32 = weakHashtable30.remove((java.lang.Object)false);
    WeakHashtable weakHashtable33 = new WeakHashtable();
    java.util.Collection collection34 = weakHashtable33.values();
    java.util.Set set35 = weakHashtable33.keySet();
    weakHashtable30.putAll((java.util.Map)weakHashtable33);
    boolean b37 = weakHashtable8.containsKey((java.lang.Object)weakHashtable33);
    java.lang.Object obj39 = weakHashtable33.remove((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}"+ "'", str20.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Collection collection5 = weakHashtable4.values();
    java.util.Collection collection6 = weakHashtable4.values();
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.lang.Object obj10 = weakHashtable8.remove((java.lang.Object)false);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.util.Set set13 = weakHashtable11.keySet();
    weakHashtable8.putAll((java.util.Map)weakHashtable11);
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Collection collection16 = weakHashtable15.values();
    java.util.Collection collection17 = weakHashtable15.values();
    java.lang.Object obj19 = weakHashtable15.get((java.lang.Object)(byte)10);
    java.lang.String str20 = weakHashtable15.toString();
    java.util.Map map21 = null;
    weakHashtable15.putAll(map21);
    WeakHashtable weakHashtable24 = new WeakHashtable();
    java.util.Collection collection25 = weakHashtable24.values();
    java.util.Set set26 = weakHashtable24.entrySet();
    java.lang.Object obj27 = weakHashtable15.put((java.lang.Object)(-1L), (java.lang.Object)set26);
    java.lang.Object obj28 = weakHashtable8.get((java.lang.Object)weakHashtable15);
    weakHashtable0.putAll((java.util.Map)weakHashtable8);
    WeakHashtable weakHashtable30 = new WeakHashtable();
    java.lang.Object obj32 = weakHashtable30.remove((java.lang.Object)false);
    WeakHashtable weakHashtable33 = new WeakHashtable();
    java.util.Collection collection34 = weakHashtable33.values();
    java.util.Set set35 = weakHashtable33.keySet();
    weakHashtable30.putAll((java.util.Map)weakHashtable33);
    boolean b37 = weakHashtable8.containsKey((java.lang.Object)weakHashtable33);
    java.util.Collection collection38 = weakHashtable8.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}"+ "'", str20.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection38);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Collection collection5 = weakHashtable4.values();
    java.util.Collection collection6 = weakHashtable4.values();
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.lang.Object obj10 = weakHashtable8.remove((java.lang.Object)false);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.util.Set set13 = weakHashtable11.keySet();
    weakHashtable8.putAll((java.util.Map)weakHashtable11);
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Collection collection16 = weakHashtable15.values();
    java.util.Collection collection17 = weakHashtable15.values();
    java.lang.Object obj19 = weakHashtable15.get((java.lang.Object)(byte)10);
    java.lang.String str20 = weakHashtable15.toString();
    java.util.Map map21 = null;
    weakHashtable15.putAll(map21);
    WeakHashtable weakHashtable24 = new WeakHashtable();
    java.util.Collection collection25 = weakHashtable24.values();
    java.util.Set set26 = weakHashtable24.entrySet();
    java.lang.Object obj27 = weakHashtable15.put((java.lang.Object)(-1L), (java.lang.Object)set26);
    java.lang.Object obj28 = weakHashtable8.get((java.lang.Object)weakHashtable15);
    weakHashtable0.putAll((java.util.Map)weakHashtable8);
    WeakHashtable weakHashtable30 = new WeakHashtable();
    java.lang.Object obj32 = weakHashtable30.remove((java.lang.Object)false);
    WeakHashtable weakHashtable33 = new WeakHashtable();
    java.util.Collection collection34 = weakHashtable33.values();
    java.util.Set set35 = weakHashtable33.keySet();
    weakHashtable30.putAll((java.util.Map)weakHashtable33);
    boolean b37 = weakHashtable8.containsKey((java.lang.Object)weakHashtable33);
    java.util.Enumeration enumeration38 = weakHashtable33.keys();
    java.util.Enumeration enumeration39 = weakHashtable33.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}"+ "'", str20.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration39);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)(byte)10);
    java.lang.String str5 = weakHashtable0.toString();
    java.util.Map map6 = null;
    weakHashtable0.putAll(map6);
    java.lang.String str8 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}"+ "'", str8.equals("{}"));

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Set set2 = weakHashtable0.entrySet();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.util.Collection collection4 = weakHashtable3.values();
    java.util.Collection collection5 = weakHashtable3.values();
    java.util.Set set6 = weakHashtable3.entrySet();
    java.lang.Object obj7 = weakHashtable0.remove((java.lang.Object)set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Collection collection5 = weakHashtable4.values();
    java.util.Collection collection6 = weakHashtable4.values();
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.lang.Object obj10 = weakHashtable8.remove((java.lang.Object)false);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.util.Set set13 = weakHashtable11.keySet();
    weakHashtable8.putAll((java.util.Map)weakHashtable11);
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Collection collection16 = weakHashtable15.values();
    java.util.Collection collection17 = weakHashtable15.values();
    java.lang.Object obj19 = weakHashtable15.get((java.lang.Object)(byte)10);
    java.lang.String str20 = weakHashtable15.toString();
    java.util.Map map21 = null;
    weakHashtable15.putAll(map21);
    WeakHashtable weakHashtable24 = new WeakHashtable();
    java.util.Collection collection25 = weakHashtable24.values();
    java.util.Set set26 = weakHashtable24.entrySet();
    java.lang.Object obj27 = weakHashtable15.put((java.lang.Object)(-1L), (java.lang.Object)set26);
    java.lang.Object obj28 = weakHashtable8.get((java.lang.Object)weakHashtable15);
    weakHashtable0.putAll((java.util.Map)weakHashtable8);
    WeakHashtable weakHashtable30 = new WeakHashtable();
    java.lang.Object obj32 = weakHashtable30.remove((java.lang.Object)false);
    WeakHashtable weakHashtable33 = new WeakHashtable();
    java.util.Collection collection34 = weakHashtable33.values();
    java.util.Set set35 = weakHashtable33.keySet();
    weakHashtable30.putAll((java.util.Map)weakHashtable33);
    boolean b37 = weakHashtable8.containsKey((java.lang.Object)weakHashtable33);
    WeakHashtable weakHashtable38 = new WeakHashtable();
    java.util.Collection collection39 = weakHashtable38.values();
    WeakHashtable weakHashtable40 = new WeakHashtable();
    boolean b42 = weakHashtable40.containsKey((java.lang.Object)(short)1);
    java.util.Set set43 = weakHashtable40.keySet();
    java.util.Enumeration enumeration44 = weakHashtable40.elements();
    java.lang.Object obj45 = weakHashtable38.remove((java.lang.Object)weakHashtable40);
    java.util.Enumeration enumeration46 = weakHashtable38.keys();
    java.util.Enumeration enumeration47 = weakHashtable38.elements();
    WeakHashtable weakHashtable48 = new WeakHashtable();
    boolean b50 = weakHashtable48.containsKey((java.lang.Object)(short)1);
    java.util.Set set51 = weakHashtable48.keySet();
    java.util.Set set52 = weakHashtable48.entrySet();
    weakHashtable38.putAll((java.util.Map)weakHashtable48);
    boolean b54 = weakHashtable33.containsKey((java.lang.Object)weakHashtable48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}"+ "'", str20.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    java.util.Enumeration enumeration3 = weakHashtable0.elements();
    java.util.Collection collection4 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection4);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    boolean b5 = weakHashtable3.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable7 = new WeakHashtable();
    java.util.Collection collection8 = weakHashtable7.values();
    java.util.Collection collection9 = weakHashtable7.values();
    java.lang.Object obj10 = weakHashtable3.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable7);
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    java.util.Enumeration enumeration12 = weakHashtable0.keys();
    java.util.Set set13 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    boolean b3 = weakHashtable0.isEmpty();
    java.lang.String str4 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}"+ "'", str4.equals("{}"));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b4 = weakHashtable2.containsKey((java.lang.Object)(short)1);
    java.util.Set set5 = weakHashtable2.keySet();
    java.util.Enumeration enumeration6 = weakHashtable2.elements();
    java.lang.Object obj7 = weakHashtable0.remove((java.lang.Object)weakHashtable2);
    java.lang.String str8 = weakHashtable2.toString();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.util.Collection collection10 = weakHashtable9.values();
    java.util.Collection collection11 = weakHashtable9.values();
    WeakHashtable weakHashtable12 = new WeakHashtable();
    boolean b14 = weakHashtable12.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Collection collection17 = weakHashtable16.values();
    java.util.Collection collection18 = weakHashtable16.values();
    java.lang.Object obj19 = weakHashtable12.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable16);
    weakHashtable9.putAll((java.util.Map)weakHashtable12);
    java.util.Enumeration enumeration21 = weakHashtable9.keys();
    weakHashtable2.putAll((java.util.Map)weakHashtable9);
    java.util.Collection collection23 = weakHashtable9.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}"+ "'", str8.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection23);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    java.util.Set set3 = weakHashtable0.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b6 = weakHashtable4.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.util.Collection collection9 = weakHashtable8.values();
    java.util.Collection collection10 = weakHashtable8.values();
    java.lang.Object obj11 = weakHashtable4.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable8);
    java.lang.Object obj13 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    java.util.Enumeration enumeration14 = weakHashtable0.keys();
    java.util.Enumeration enumeration15 = weakHashtable0.elements();
    java.util.Set set16 = weakHashtable0.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set16);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b4 = weakHashtable2.containsKey((java.lang.Object)(short)1);
    java.util.Set set5 = weakHashtable2.keySet();
    java.util.Enumeration enumeration6 = weakHashtable2.elements();
    java.lang.Object obj7 = weakHashtable0.remove((java.lang.Object)weakHashtable2);
    java.util.Enumeration enumeration8 = weakHashtable0.keys();
    java.util.Enumeration enumeration9 = weakHashtable0.elements();
    java.lang.String str10 = weakHashtable0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}"+ "'", str10.equals("{}"));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    java.util.Enumeration enumeration3 = weakHashtable0.elements();
    java.lang.Object obj5 = weakHashtable0.get((java.lang.Object)0);
    WeakHashtable weakHashtable6 = new WeakHashtable();
    java.lang.Object obj8 = weakHashtable6.remove((java.lang.Object)false);
    WeakHashtable weakHashtable9 = new WeakHashtable();
    java.util.Collection collection10 = weakHashtable9.values();
    java.util.Set set11 = weakHashtable9.keySet();
    weakHashtable6.putAll((java.util.Map)weakHashtable9);
    WeakHashtable weakHashtable13 = new WeakHashtable();
    java.util.Collection collection14 = weakHashtable13.values();
    java.util.Collection collection15 = weakHashtable13.values();
    java.lang.Object obj17 = weakHashtable13.get((java.lang.Object)(byte)10);
    java.lang.String str18 = weakHashtable13.toString();
    java.util.Map map19 = null;
    weakHashtable13.putAll(map19);
    WeakHashtable weakHashtable22 = new WeakHashtable();
    java.util.Collection collection23 = weakHashtable22.values();
    java.util.Set set24 = weakHashtable22.entrySet();
    java.lang.Object obj25 = weakHashtable13.put((java.lang.Object)(-1L), (java.lang.Object)set24);
    java.lang.Object obj26 = weakHashtable6.get((java.lang.Object)weakHashtable13);
    java.util.Set set27 = weakHashtable13.entrySet();
    java.lang.Object obj28 = weakHashtable0.get((java.lang.Object)weakHashtable13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}"+ "'", str18.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Collection collection5 = weakHashtable4.values();
    java.util.Collection collection6 = weakHashtable4.values();
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.lang.Object obj10 = weakHashtable8.remove((java.lang.Object)false);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.util.Set set13 = weakHashtable11.keySet();
    weakHashtable8.putAll((java.util.Map)weakHashtable11);
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Collection collection16 = weakHashtable15.values();
    java.util.Collection collection17 = weakHashtable15.values();
    java.lang.Object obj19 = weakHashtable15.get((java.lang.Object)(byte)10);
    java.lang.String str20 = weakHashtable15.toString();
    java.util.Map map21 = null;
    weakHashtable15.putAll(map21);
    WeakHashtable weakHashtable24 = new WeakHashtable();
    java.util.Collection collection25 = weakHashtable24.values();
    java.util.Set set26 = weakHashtable24.entrySet();
    java.lang.Object obj27 = weakHashtable15.put((java.lang.Object)(-1L), (java.lang.Object)set26);
    java.lang.Object obj28 = weakHashtable8.get((java.lang.Object)weakHashtable15);
    weakHashtable0.putAll((java.util.Map)weakHashtable8);
    WeakHashtable weakHashtable30 = new WeakHashtable();
    java.lang.Object obj32 = weakHashtable30.remove((java.lang.Object)false);
    WeakHashtable weakHashtable33 = new WeakHashtable();
    java.util.Collection collection34 = weakHashtable33.values();
    java.util.Set set35 = weakHashtable33.keySet();
    weakHashtable30.putAll((java.util.Map)weakHashtable33);
    boolean b37 = weakHashtable8.containsKey((java.lang.Object)weakHashtable33);
    WeakHashtable weakHashtable38 = new WeakHashtable();
    java.lang.Object obj40 = weakHashtable38.remove((java.lang.Object)false);
    WeakHashtable weakHashtable41 = new WeakHashtable();
    java.util.Collection collection42 = weakHashtable41.values();
    java.util.Collection collection43 = weakHashtable41.values();
    java.util.Enumeration enumeration44 = weakHashtable41.elements();
    java.lang.Object obj46 = weakHashtable41.get((java.lang.Object)0);
    weakHashtable38.putAll((java.util.Map)weakHashtable41);
    java.util.Enumeration enumeration48 = weakHashtable38.elements();
    weakHashtable8.putAll((java.util.Map)weakHashtable38);
    java.util.Collection collection50 = weakHashtable38.values();
    java.util.Set set51 = weakHashtable38.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}"+ "'", str20.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set51);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    java.lang.Object obj4 = weakHashtable0.get((java.lang.Object)(byte)10);
    java.lang.String str5 = weakHashtable0.toString();
    java.util.Map map6 = null;
    weakHashtable0.putAll(map6);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.util.Collection collection9 = weakHashtable8.values();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    boolean b12 = weakHashtable10.containsKey((java.lang.Object)(short)1);
    java.util.Set set13 = weakHashtable10.keySet();
    java.util.Enumeration enumeration14 = weakHashtable10.elements();
    java.lang.Object obj15 = weakHashtable8.remove((java.lang.Object)weakHashtable10);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    java.util.Collection collection17 = weakHashtable16.values();
    WeakHashtable weakHashtable18 = new WeakHashtable();
    boolean b20 = weakHashtable18.containsKey((java.lang.Object)(short)1);
    java.util.Set set21 = weakHashtable18.keySet();
    java.util.Enumeration enumeration22 = weakHashtable18.elements();
    java.lang.Object obj23 = weakHashtable16.remove((java.lang.Object)weakHashtable18);
    java.util.Enumeration enumeration24 = weakHashtable16.keys();
    java.util.Enumeration enumeration25 = weakHashtable16.elements();
    java.lang.Object obj26 = weakHashtable0.put((java.lang.Object)weakHashtable10, (java.lang.Object)weakHashtable16);
    java.util.Collection collection27 = weakHashtable10.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}"+ "'", str5.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection27);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.remove((java.lang.Object)false);
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.util.Collection collection4 = weakHashtable3.values();
    java.util.Set set5 = weakHashtable3.keySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    java.util.Set set7 = weakHashtable0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Collection collection5 = weakHashtable4.values();
    java.util.Collection collection6 = weakHashtable4.values();
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.lang.Object obj10 = weakHashtable8.remove((java.lang.Object)false);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.util.Set set13 = weakHashtable11.keySet();
    weakHashtable8.putAll((java.util.Map)weakHashtable11);
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Collection collection16 = weakHashtable15.values();
    java.util.Collection collection17 = weakHashtable15.values();
    java.lang.Object obj19 = weakHashtable15.get((java.lang.Object)(byte)10);
    java.lang.String str20 = weakHashtable15.toString();
    java.util.Map map21 = null;
    weakHashtable15.putAll(map21);
    WeakHashtable weakHashtable24 = new WeakHashtable();
    java.util.Collection collection25 = weakHashtable24.values();
    java.util.Set set26 = weakHashtable24.entrySet();
    java.lang.Object obj27 = weakHashtable15.put((java.lang.Object)(-1L), (java.lang.Object)set26);
    java.lang.Object obj28 = weakHashtable8.get((java.lang.Object)weakHashtable15);
    weakHashtable0.putAll((java.util.Map)weakHashtable8);
    WeakHashtable weakHashtable30 = new WeakHashtable();
    java.util.Collection collection31 = weakHashtable30.values();
    java.lang.String str32 = weakHashtable30.toString();
    java.util.Set set33 = weakHashtable30.entrySet();
    boolean b34 = weakHashtable0.containsKey((java.lang.Object)set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}"+ "'", str20.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}"+ "'", str32.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    java.util.Set set3 = weakHashtable0.keySet();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b6 = weakHashtable4.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.util.Collection collection9 = weakHashtable8.values();
    java.util.Collection collection10 = weakHashtable8.values();
    java.lang.Object obj11 = weakHashtable4.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable8);
    java.lang.Object obj13 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    java.lang.Object obj16 = weakHashtable0.put((java.lang.Object)"{-1.0={}}", (java.lang.Object)10.0f);
    boolean b17 = weakHashtable0.isEmpty();
    java.lang.String str18 = weakHashtable0.toString();
    WeakHashtable weakHashtable19 = new WeakHashtable();
    java.util.Collection collection20 = weakHashtable19.values();
    WeakHashtable weakHashtable21 = new WeakHashtable();
    boolean b23 = weakHashtable21.containsKey((java.lang.Object)(short)1);
    java.util.Set set24 = weakHashtable21.keySet();
    java.util.Enumeration enumeration25 = weakHashtable21.elements();
    java.lang.Object obj26 = weakHashtable19.remove((java.lang.Object)weakHashtable21);
    java.lang.Object obj28 = weakHashtable21.remove((java.lang.Object)1.0d);
    WeakHashtable weakHashtable29 = new WeakHashtable();
    java.util.Collection collection30 = weakHashtable29.values();
    java.util.Collection collection31 = weakHashtable29.values();
    WeakHashtable weakHashtable32 = new WeakHashtable();
    boolean b34 = weakHashtable32.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable36 = new WeakHashtable();
    java.util.Collection collection37 = weakHashtable36.values();
    java.util.Collection collection38 = weakHashtable36.values();
    java.lang.Object obj39 = weakHashtable32.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable36);
    weakHashtable29.putAll((java.util.Map)weakHashtable32);
    weakHashtable21.putAll((java.util.Map)weakHashtable29);
    weakHashtable0.putAll((java.util.Map)weakHashtable29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{-1.0=-1, {-1.0={}}=10.0}"+ "'", str18.equals("{-1.0=-1, {-1.0={}}=10.0}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj39);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b4 = weakHashtable2.containsKey((java.lang.Object)(short)1);
    java.util.Set set5 = weakHashtable2.keySet();
    java.util.Enumeration enumeration6 = weakHashtable2.elements();
    java.lang.Object obj7 = weakHashtable0.remove((java.lang.Object)weakHashtable2);
    java.lang.Object obj9 = weakHashtable2.remove((java.lang.Object)1.0d);
    WeakHashtable weakHashtable10 = new WeakHashtable();
    java.util.Collection collection11 = weakHashtable10.values();
    java.util.Collection collection12 = weakHashtable10.values();
    WeakHashtable weakHashtable13 = new WeakHashtable();
    boolean b15 = weakHashtable13.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable17 = new WeakHashtable();
    java.util.Collection collection18 = weakHashtable17.values();
    java.util.Collection collection19 = weakHashtable17.values();
    java.lang.Object obj20 = weakHashtable13.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable17);
    weakHashtable10.putAll((java.util.Map)weakHashtable13);
    weakHashtable2.putAll((java.util.Map)weakHashtable10);
    WeakHashtable weakHashtable23 = new WeakHashtable();
    boolean b25 = weakHashtable23.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.util.Collection collection28 = weakHashtable27.values();
    java.util.Collection collection29 = weakHashtable27.values();
    java.lang.Object obj30 = weakHashtable23.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable27);
    WeakHashtable weakHashtable31 = new WeakHashtable();
    java.util.Collection collection32 = weakHashtable31.values();
    java.util.Set set33 = weakHashtable31.keySet();
    weakHashtable27.putAll((java.util.Map)weakHashtable31);
    WeakHashtable weakHashtable35 = new WeakHashtable();
    boolean b37 = weakHashtable35.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable39 = new WeakHashtable();
    java.util.Collection collection40 = weakHashtable39.values();
    java.util.Collection collection41 = weakHashtable39.values();
    java.lang.Object obj42 = weakHashtable35.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable39);
    WeakHashtable weakHashtable43 = new WeakHashtable();
    java.util.Collection collection44 = weakHashtable43.values();
    java.util.Set set45 = weakHashtable43.keySet();
    weakHashtable39.putAll((java.util.Map)weakHashtable43);
    java.lang.Object obj47 = weakHashtable27.get((java.lang.Object)weakHashtable39);
    boolean b48 = weakHashtable27.isEmpty();
    java.util.Collection collection49 = weakHashtable27.values();
    boolean b50 = weakHashtable10.containsKey((java.lang.Object)collection49);
    int i51 = weakHashtable10.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.util.Collection collection2 = weakHashtable0.values();
    java.util.Set set3 = weakHashtable0.entrySet();
    int i4 = weakHashtable0.size();
    java.util.Enumeration enumeration5 = weakHashtable0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration5);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b4 = weakHashtable2.containsKey((java.lang.Object)(short)1);
    java.util.Set set5 = weakHashtable2.keySet();
    java.util.Enumeration enumeration6 = weakHashtable2.elements();
    java.lang.Object obj7 = weakHashtable0.remove((java.lang.Object)weakHashtable2);
    java.util.Enumeration enumeration8 = weakHashtable0.keys();
    WeakHashtable weakHashtable9 = new WeakHashtable();
    boolean b10 = weakHashtable9.isEmpty();
    java.lang.Object obj13 = weakHashtable9.put((java.lang.Object)"", (java.lang.Object)(short)100);
    weakHashtable0.putAll((java.util.Map)weakHashtable9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.lang.Object obj2 = weakHashtable0.remove((java.lang.Object)false);
    WeakHashtable weakHashtable3 = new WeakHashtable();
    java.util.Collection collection4 = weakHashtable3.values();
    java.util.Collection collection5 = weakHashtable3.values();
    java.util.Enumeration enumeration6 = weakHashtable3.elements();
    java.lang.Object obj8 = weakHashtable3.get((java.lang.Object)0);
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    java.util.Enumeration enumeration10 = weakHashtable0.elements();
    java.util.Collection collection11 = weakHashtable0.values();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection11);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.String str2 = weakHashtable0.toString();
    boolean b3 = weakHashtable0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}"+ "'", str2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    java.util.Enumeration enumeration3 = weakHashtable0.elements();
    WeakHashtable weakHashtable4 = new WeakHashtable();
    boolean b6 = weakHashtable4.containsKey((java.lang.Object)(short)1);
    java.util.Set set7 = weakHashtable4.keySet();
    WeakHashtable weakHashtable8 = new WeakHashtable();
    boolean b10 = weakHashtable8.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable12 = new WeakHashtable();
    java.util.Collection collection13 = weakHashtable12.values();
    java.util.Collection collection14 = weakHashtable12.values();
    java.lang.Object obj15 = weakHashtable8.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable12);
    java.lang.Object obj17 = weakHashtable4.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    weakHashtable0.putAll((java.util.Map)weakHashtable4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    WeakHashtable weakHashtable2 = new WeakHashtable();
    boolean b4 = weakHashtable2.containsKey((java.lang.Object)(short)1);
    java.util.Set set5 = weakHashtable2.keySet();
    java.util.Enumeration enumeration6 = weakHashtable2.elements();
    java.lang.Object obj7 = weakHashtable0.remove((java.lang.Object)weakHashtable2);
    java.util.Enumeration enumeration8 = weakHashtable0.keys();
    java.util.Enumeration enumeration9 = weakHashtable0.elements();
    WeakHashtable weakHashtable10 = new WeakHashtable();
    boolean b12 = weakHashtable10.containsKey((java.lang.Object)(short)1);
    java.util.Set set13 = weakHashtable10.keySet();
    java.util.Set set14 = weakHashtable10.entrySet();
    weakHashtable0.putAll((java.util.Map)weakHashtable10);
    WeakHashtable weakHashtable16 = new WeakHashtable();
    boolean b18 = weakHashtable16.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable20 = new WeakHashtable();
    java.util.Collection collection21 = weakHashtable20.values();
    java.util.Collection collection22 = weakHashtable20.values();
    java.lang.Object obj23 = weakHashtable16.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable20);
    WeakHashtable weakHashtable24 = new WeakHashtable();
    java.lang.Object obj26 = weakHashtable24.remove((java.lang.Object)false);
    WeakHashtable weakHashtable27 = new WeakHashtable();
    java.util.Collection collection28 = weakHashtable27.values();
    java.util.Set set29 = weakHashtable27.keySet();
    weakHashtable24.putAll((java.util.Map)weakHashtable27);
    WeakHashtable weakHashtable31 = new WeakHashtable();
    java.util.Collection collection32 = weakHashtable31.values();
    java.util.Collection collection33 = weakHashtable31.values();
    java.lang.Object obj35 = weakHashtable31.get((java.lang.Object)(byte)10);
    java.lang.String str36 = weakHashtable31.toString();
    java.util.Map map37 = null;
    weakHashtable31.putAll(map37);
    WeakHashtable weakHashtable40 = new WeakHashtable();
    java.util.Collection collection41 = weakHashtable40.values();
    java.util.Set set42 = weakHashtable40.entrySet();
    java.lang.Object obj43 = weakHashtable31.put((java.lang.Object)(-1L), (java.lang.Object)set42);
    java.lang.Object obj44 = weakHashtable24.get((java.lang.Object)weakHashtable31);
    weakHashtable16.putAll((java.util.Map)weakHashtable24);
    WeakHashtable weakHashtable46 = new WeakHashtable();
    boolean b48 = weakHashtable46.containsKey((java.lang.Object)(short)1);
    java.util.Set set49 = weakHashtable46.keySet();
    WeakHashtable weakHashtable50 = new WeakHashtable();
    boolean b52 = weakHashtable50.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable54 = new WeakHashtable();
    java.util.Collection collection55 = weakHashtable54.values();
    java.util.Collection collection56 = weakHashtable54.values();
    java.lang.Object obj57 = weakHashtable50.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable54);
    java.lang.Object obj59 = weakHashtable46.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    java.lang.Object obj62 = weakHashtable46.put((java.lang.Object)"{-1.0={}}", (java.lang.Object)10.0f);
    boolean b63 = weakHashtable46.isEmpty();
    java.lang.String str64 = weakHashtable46.toString();
    java.lang.Object obj65 = weakHashtable24.get((java.lang.Object)weakHashtable46);
    // The following exception was thrown during execution in test generation
    try {
    boolean b66 = weakHashtable0.containsKey(obj65);
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
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}"+ "'", str36.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{-1.0=-1, {-1.0={}}=10.0}"+ "'", str64.equals("{-1.0=-1, {-1.0={}}=10.0}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj65);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    java.util.Collection collection1 = weakHashtable0.values();
    java.lang.String str2 = weakHashtable0.toString();
    WeakHashtable weakHashtable3 = new WeakHashtable();
    boolean b5 = weakHashtable3.containsKey((java.lang.Object)(short)1);
    java.util.Set set6 = weakHashtable3.keySet();
    WeakHashtable weakHashtable7 = new WeakHashtable();
    boolean b9 = weakHashtable7.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.util.Collection collection13 = weakHashtable11.values();
    java.lang.Object obj14 = weakHashtable7.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable11);
    java.lang.Object obj16 = weakHashtable3.put((java.lang.Object)(-1.0d), (java.lang.Object)(-1));
    java.lang.Object obj19 = weakHashtable3.put((java.lang.Object)"{-1.0={}}", (java.lang.Object)10.0f);
    boolean b20 = weakHashtable3.isEmpty();
    java.lang.String str21 = weakHashtable3.toString();
    weakHashtable0.putAll((java.util.Map)weakHashtable3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}"+ "'", str2.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{-1.0=-1, {-1.0={}}=10.0}"+ "'", str21.equals("{-1.0=-1, {-1.0={}}=10.0}"));

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    WeakHashtable weakHashtable0 = new WeakHashtable();
    boolean b2 = weakHashtable0.containsKey((java.lang.Object)(short)1);
    WeakHashtable weakHashtable4 = new WeakHashtable();
    java.util.Collection collection5 = weakHashtable4.values();
    java.util.Collection collection6 = weakHashtable4.values();
    java.lang.Object obj7 = weakHashtable0.put((java.lang.Object)(-1.0d), (java.lang.Object)weakHashtable4);
    WeakHashtable weakHashtable8 = new WeakHashtable();
    java.lang.Object obj10 = weakHashtable8.remove((java.lang.Object)false);
    WeakHashtable weakHashtable11 = new WeakHashtable();
    java.util.Collection collection12 = weakHashtable11.values();
    java.util.Set set13 = weakHashtable11.keySet();
    weakHashtable8.putAll((java.util.Map)weakHashtable11);
    WeakHashtable weakHashtable15 = new WeakHashtable();
    java.util.Collection collection16 = weakHashtable15.values();
    java.util.Collection collection17 = weakHashtable15.values();
    java.lang.Object obj19 = weakHashtable15.get((java.lang.Object)(byte)10);
    java.lang.String str20 = weakHashtable15.toString();
    java.util.Map map21 = null;
    weakHashtable15.putAll(map21);
    WeakHashtable weakHashtable24 = new WeakHashtable();
    java.util.Collection collection25 = weakHashtable24.values();
    java.util.Set set26 = weakHashtable24.entrySet();
    java.lang.Object obj27 = weakHashtable15.put((java.lang.Object)(-1L), (java.lang.Object)set26);
    java.lang.Object obj28 = weakHashtable8.get((java.lang.Object)weakHashtable15);
    weakHashtable0.putAll((java.util.Map)weakHashtable8);
    java.util.Enumeration enumeration30 = weakHashtable8.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}"+ "'", str20.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration30);

  }

}
