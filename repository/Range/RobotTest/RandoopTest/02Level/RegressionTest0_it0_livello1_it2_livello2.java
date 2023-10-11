
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    java.util.Comparator<java.lang.Long> comparator_long1 = null;
    Range<java.lang.Long> range_long2 = Range.is((java.lang.Long)100L, comparator_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    java.util.Comparator<java.lang.Long> comparator_long1 = null;
    Range<java.lang.Long> range_long2 = Range.is((java.lang.Long)0L, comparator_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    java.util.Comparator<java.lang.Long> comparator_long1 = null;
    Range<java.lang.Long> range_long2 = Range.is((java.lang.Long)10L, comparator_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    java.util.Comparator<java.lang.Long> comparator_long1 = null;
    Range<java.lang.Long> range_long2 = Range.is((java.lang.Long)1L, comparator_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    java.util.Comparator<java.lang.Long> comparator_long1 = null;
    Range<java.lang.Long> range_long2 = Range.is((java.lang.Long)(-1L), comparator_long1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

}
