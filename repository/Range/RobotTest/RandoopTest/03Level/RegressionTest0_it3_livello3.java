package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it3_livello3 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj2 = Range.is(obj0, comparator_obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b12);
    java.lang.Boolean b14 = range_b13.getMinimum();
    boolean b15 = range_b8.containsRange(range_b13);
    boolean b16 = range_b3.containsRange(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b14 + "' != '" + false+ "'", b14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    java.lang.Boolean b6 = range_b5.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = null;
    Range<java.lang.Boolean> range_b10 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b9);
    java.lang.Boolean b11 = range_b10.getMinimum();
    boolean b12 = range_b5.containsRange(range_b10);
    java.util.Comparator<java.lang.Boolean> comparator_b13 = range_b5.getComparator();
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + false+ "'", b6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + false+ "'", b11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    org.junit.Assert.assertTrue("'" + comparator_b13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    int i5 = range_b3.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b6 = range_b3.getMaximum();
    boolean b8 = range_b3.isAfter((java.lang.Boolean)true);
    boolean b9 = range_b3.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + true+ "'", b6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b12);
    java.lang.Boolean b14 = range_b13.getMinimum();
    boolean b15 = range_b8.containsRange(range_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = range_b8.getComparator();
    boolean b18 = range_b8.isStartedBy((java.lang.Boolean)true);
    boolean b19 = range_b3.containsRange(range_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b22);
    java.lang.Boolean b24 = range_b23.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b27 = null;
    Range<java.lang.Boolean> range_b28 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b27);
    boolean b29 = range_b23.containsRange(range_b28);
    Range<java.lang.Boolean> range_b30 = range_b8.intersectionWith(range_b23);
    boolean b32 = range_b8.isAfter((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b14 + "' != '" + false+ "'", b14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    org.junit.Assert.assertTrue("'" + comparator_b16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b24 + "' != '" + false+ "'", b24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)true);
    boolean b3 = range_b1.isAfter((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b3.getComparator();
    boolean b11 = range_b3.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"hi!", comparator_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    java.lang.Boolean b6 = range_b5.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = null;
    Range<java.lang.Boolean> range_b10 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b9);
    java.lang.Boolean b11 = range_b10.getMinimum();
    boolean b12 = range_b5.containsRange(range_b10);
    java.util.Comparator<java.lang.Boolean> comparator_b13 = range_b5.getComparator();
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b17 = null;
    Range<java.lang.Boolean> range_b18 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b17);
    java.lang.Boolean b19 = range_b18.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b22);
    java.lang.Boolean b24 = range_b23.getMinimum();
    boolean b25 = range_b18.containsRange(range_b23);
    boolean b26 = range_b14.isOverlappedBy(range_b18);
    java.lang.String str27 = range_b14.toString();
    boolean b28 = range_b14.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + false+ "'", b6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + false+ "'", b11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    org.junit.Assert.assertTrue("'" + comparator_b13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b19 + "' != '" + false+ "'", b19.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b24 + "' != '" + false+ "'", b24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[true..true]"+ "'", str27.equals("[true..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    java.lang.Boolean b6 = range_b5.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = null;
    Range<java.lang.Boolean> range_b10 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b9);
    java.lang.Boolean b11 = range_b10.getMinimum();
    boolean b12 = range_b5.containsRange(range_b10);
    java.util.Comparator<java.lang.Boolean> comparator_b13 = range_b5.getComparator();
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b17 = null;
    Range<java.lang.Boolean> range_b18 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b17);
    java.lang.Boolean b19 = range_b18.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b22);
    java.lang.Boolean b24 = range_b23.getMinimum();
    boolean b25 = range_b18.containsRange(range_b23);
    boolean b26 = range_b14.isOverlappedBy(range_b18);
    java.lang.String str27 = range_b14.toString();
    java.util.Comparator<java.lang.Boolean> comparator_b28 = range_b14.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + false+ "'", b6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + false+ "'", b11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    org.junit.Assert.assertTrue("'" + comparator_b13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b19 + "' != '" + false+ "'", b19.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b24 + "' != '" + false+ "'", b24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[true..true]"+ "'", str27.equals("[true..true]"));
    org.junit.Assert.assertTrue("'" + comparator_b28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b28.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    boolean b5 = range_b3.isBefore((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    boolean b10 = range_b3.containsRange(range_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b11 = range_b3.getComparator();
    boolean b13 = range_b3.isStartedBy((java.lang.Boolean)true);
    boolean b15 = range_b3.isEndedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b18 = null;
    Range<java.lang.Boolean> range_b19 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b18);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b22);
    java.lang.Boolean b24 = range_b23.getMinimum();
    boolean b25 = range_b19.isOverlappedBy(range_b23);
    boolean b27 = range_b23.isBefore((java.lang.Boolean)true);
    boolean b28 = range_b3.isBeforeRange(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    org.junit.Assert.assertTrue("'" + comparator_b11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b24 + "' != '" + false+ "'", b24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    boolean b10 = range_b3.containsRange(range_b8);
    int i12 = range_b3.elementCompareTo((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    boolean b10 = range_b3.containsRange(range_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b11 = range_b3.getComparator();
    boolean b12 = range_b3.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    org.junit.Assert.assertTrue("'" + comparator_b11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    boolean b10 = range_b3.containsRange(range_b8);
    java.lang.Boolean b11 = range_b3.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + false+ "'", b11.equals(false));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    boolean b9 = range_b3.containsRange(range_b8);
    java.lang.String str11 = range_b3.toString("");
    boolean b13 = range_b3.contains((java.lang.Boolean)true);
    boolean b15 = range_b3.isEndedBy((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b14 = null;
    Range<java.lang.Boolean> range_b15 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b14);
    java.lang.Boolean b16 = range_b15.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b19);
    java.lang.Boolean b21 = range_b20.getMinimum();
    boolean b22 = range_b15.containsRange(range_b20);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = range_b15.getComparator();
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b23);
    java.util.Comparator<java.lang.Boolean> comparator_b27 = null;
    Range<java.lang.Boolean> range_b28 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b27);
    java.lang.Boolean b29 = range_b28.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b32 = null;
    Range<java.lang.Boolean> range_b33 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b32);
    java.lang.Boolean b34 = range_b33.getMinimum();
    boolean b35 = range_b28.containsRange(range_b33);
    boolean b36 = range_b24.isOverlappedBy(range_b28);
    boolean b38 = range_b24.contains((java.lang.Boolean)true);
    boolean b39 = range_b7.isOverlappedBy(range_b24);
    boolean b40 = range_b7.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b16 + "' != '" + false+ "'", b16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b21 + "' != '" + false+ "'", b21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    org.junit.Assert.assertTrue("'" + comparator_b23 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b23.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b29 + "' != '" + false+ "'", b29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b34 + "' != '" + false+ "'", b34.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    boolean b5 = range_b3.contains((java.lang.Boolean)true);
    boolean b7 = range_b3.isStartedBy((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b3.getComparator();
    int i12 = range_b3.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b13 = range_b3.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b13 + "' != '" + false+ "'", b13.equals(false));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    int i5 = range_b3.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b6 = range_b3.getMaximum();
    boolean b8 = range_b3.isAfter((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b9 = range_b3.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + true+ "'", b6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    org.junit.Assert.assertTrue("'" + comparator_b9 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b9.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.lang.Boolean b5 = range_b3.getMaximum();
    java.util.Comparator<java.lang.Boolean> comparator_b8 = null;
    Range<java.lang.Boolean> range_b9 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b8);
    boolean b11 = range_b9.contains((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = null;
    Range<java.lang.Boolean> range_b17 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b16);
    java.lang.Boolean b18 = range_b17.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b21 = null;
    Range<java.lang.Boolean> range_b22 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b21);
    java.lang.Boolean b23 = range_b22.getMinimum();
    boolean b24 = range_b17.containsRange(range_b22);
    java.util.Comparator<java.lang.Boolean> comparator_b25 = range_b17.getComparator();
    Range<java.lang.Boolean> range_b26 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b25);
    java.util.Comparator<java.lang.Boolean> comparator_b29 = null;
    Range<java.lang.Boolean> range_b30 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b29);
    java.lang.Boolean b31 = range_b30.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b34 = null;
    Range<java.lang.Boolean> range_b35 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b34);
    java.lang.Boolean b36 = range_b35.getMinimum();
    boolean b37 = range_b30.containsRange(range_b35);
    boolean b38 = range_b26.isOverlappedBy(range_b30);
    boolean b39 = range_b9.containsRange(range_b30);
    boolean b40 = range_b3.isAfterRange(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b5 + "' != '" + false+ "'", b5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b18 + "' != '" + false+ "'", b18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b23 + "' != '" + false+ "'", b23.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    org.junit.Assert.assertTrue("'" + comparator_b25 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b25.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b31 + "' != '" + false+ "'", b31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b36 + "' != '" + false+ "'", b36.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b4 = range_b3.getComparator();
    java.lang.String str5 = range_b3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    org.junit.Assert.assertTrue("'" + comparator_b4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[false..false]"+ "'", str5.equals("[false..false]"));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    boolean b9 = range_b3.containsRange(range_b8);
    java.lang.String str11 = range_b3.toString("");
    java.lang.Boolean b12 = range_b3.getMaximum();
    java.lang.String str14 = range_b3.toString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b12 + "' != '" + true+ "'", b12.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    int i5 = range_b3.elementCompareTo((java.lang.Boolean)true);
    boolean b7 = range_b3.isBefore((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b3.getComparator();
    int i12 = range_b3.elementCompareTo((java.lang.Boolean)true);
    java.lang.String str13 = range_b3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[false..true]"+ "'", str13.equals("[false..true]"));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.lang.Boolean b5 = range_b3.getMaximum();
    java.lang.String str7 = range_b3.toString("[false..false]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b5 + "' != '" + false+ "'", b5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[false..false]"+ "'", str7.equals("[false..false]"));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b4);
    java.lang.Boolean b6 = range_b5.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = null;
    Range<java.lang.Boolean> range_b10 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b9);
    java.lang.Boolean b11 = range_b10.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b14 = null;
    Range<java.lang.Boolean> range_b15 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b14);
    java.lang.Boolean b16 = range_b15.getMinimum();
    boolean b17 = range_b10.containsRange(range_b15);
    java.util.Comparator<java.lang.Boolean> comparator_b18 = range_b10.getComparator();
    boolean b20 = range_b10.isStartedBy((java.lang.Boolean)true);
    boolean b21 = range_b5.containsRange(range_b10);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = range_b5.getComparator();
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + false+ "'", b6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + false+ "'", b11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b16 + "' != '" + false+ "'", b16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    org.junit.Assert.assertTrue("'" + comparator_b18 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b18.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    org.junit.Assert.assertTrue("'" + comparator_b22 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b22.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    boolean b11 = range_b7.isBefore((java.lang.Boolean)true);
    boolean b12 = range_b7.isNaturalOrdering();
    java.util.Comparator<java.lang.Boolean> comparator_b15 = null;
    Range<java.lang.Boolean> range_b16 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b15);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b19);
    java.lang.Boolean b21 = range_b20.getMinimum();
    boolean b22 = range_b16.isOverlappedBy(range_b20);
    boolean b24 = range_b20.isStartedBy((java.lang.Boolean)false);
    boolean b25 = range_b7.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b21 + "' != '" + false+ "'", b21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)false);
    Range<java.lang.Boolean> range_b3 = Range.is((java.lang.Boolean)false);
    boolean b4 = range_b1.equals((java.lang.Object)false);
    java.lang.String str5 = range_b1.toString();
    boolean b7 = range_b1.isBefore((java.lang.Boolean)false);
    java.lang.Boolean b8 = range_b1.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[false..false]"+ "'", str5.equals("[false..false]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    java.util.Comparator<java.lang.Boolean> comparator_b8 = null;
    Range<java.lang.Boolean> range_b9 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b8);
    java.lang.Boolean b10 = range_b9.getMinimum();
    boolean b11 = range_b5.isOverlappedBy(range_b9);
    java.util.Comparator<java.lang.Boolean> comparator_b12 = range_b5.getComparator();
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b12);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = null;
    Range<java.lang.Boolean> range_b17 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b16);
    java.lang.Boolean b18 = range_b17.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b21 = null;
    Range<java.lang.Boolean> range_b22 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b21);
    java.lang.Boolean b23 = range_b22.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b26 = null;
    Range<java.lang.Boolean> range_b27 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b26);
    java.lang.Boolean b28 = range_b27.getMinimum();
    boolean b29 = range_b22.containsRange(range_b27);
    java.util.Comparator<java.lang.Boolean> comparator_b30 = range_b22.getComparator();
    boolean b32 = range_b22.isStartedBy((java.lang.Boolean)true);
    boolean b33 = range_b17.containsRange(range_b22);
    boolean b34 = range_b13.isAfterRange(range_b17);
    java.lang.Boolean b35 = range_b13.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b10 + "' != '" + false+ "'", b10.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    org.junit.Assert.assertTrue("'" + comparator_b12 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b12.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b18 + "' != '" + false+ "'", b18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b23 + "' != '" + false+ "'", b23.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b28 + "' != '" + false+ "'", b28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    org.junit.Assert.assertTrue("'" + comparator_b30 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b30.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b35 + "' != '" + true+ "'", b35.equals(true));

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    java.lang.Boolean b6 = range_b5.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = null;
    Range<java.lang.Boolean> range_b10 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b9);
    java.lang.Boolean b11 = range_b10.getMinimum();
    boolean b12 = range_b5.containsRange(range_b10);
    java.util.Comparator<java.lang.Boolean> comparator_b13 = range_b5.getComparator();
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b19);
    java.lang.Boolean b21 = range_b20.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b24 = null;
    Range<java.lang.Boolean> range_b25 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b24);
    java.lang.Boolean b26 = range_b25.getMinimum();
    boolean b27 = range_b20.containsRange(range_b25);
    java.util.Comparator<java.lang.Boolean> comparator_b28 = range_b20.getComparator();
    Range<java.lang.Boolean> range_b29 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b28);
    java.lang.String str31 = range_b29.toString("");
    Range<java.lang.Boolean> range_b32 = range_b14.intersectionWith(range_b29);
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj34 = Range.is((java.lang.Object)range_b29, comparator_obj33);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + false+ "'", b6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + false+ "'", b11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    org.junit.Assert.assertTrue("'" + comparator_b13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b21 + "' != '" + false+ "'", b21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b26 + "' != '" + false+ "'", b26.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    org.junit.Assert.assertTrue("'" + comparator_b28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b32);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b3.getComparator();
    int i12 = range_b3.elementCompareTo((java.lang.Boolean)true);
    boolean b14 = range_b3.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b17 = null;
    Range<java.lang.Boolean> range_b18 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b17);
    int i20 = range_b18.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b21 = range_b18.getMaximum();
    boolean b23 = range_b18.isAfter((java.lang.Boolean)true);
    java.lang.Boolean b24 = range_b18.getMaximum();
    boolean b25 = range_b3.isOverlappedBy(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b21 + "' != '" + true+ "'", b21.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b24 + "' != '" + true+ "'", b24.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    boolean b9 = range_b3.containsRange(range_b8);
    java.lang.String str11 = range_b3.toString("");
    boolean b13 = range_b3.contains((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = null;
    Range<java.lang.Boolean> range_b17 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b16);
    java.lang.Boolean b18 = range_b17.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b21 = null;
    Range<java.lang.Boolean> range_b22 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b21);
    boolean b23 = range_b17.containsRange(range_b22);
    java.util.Comparator<java.lang.Boolean> comparator_b24 = range_b22.getComparator();
    boolean b26 = range_b22.isAfter((java.lang.Boolean)true);
    Range<java.lang.Boolean> range_b27 = range_b3.intersectionWith(range_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b18 + "' != '" + false+ "'", b18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    org.junit.Assert.assertTrue("'" + comparator_b24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b27);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    boolean b9 = range_b3.containsRange(range_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b8.getComparator();
    boolean b12 = range_b8.isAfter((java.lang.Boolean)true);
    boolean b14 = range_b8.isBefore((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    java.util.Comparator<java.lang.Boolean> comparator_b8 = null;
    Range<java.lang.Boolean> range_b9 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b8);
    java.lang.Boolean b10 = range_b9.getMinimum();
    boolean b11 = range_b5.isOverlappedBy(range_b9);
    java.util.Comparator<java.lang.Boolean> comparator_b12 = range_b5.getComparator();
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b12);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = null;
    Range<java.lang.Boolean> range_b17 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b16);
    java.lang.Boolean b18 = range_b17.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b21 = null;
    Range<java.lang.Boolean> range_b22 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b21);
    java.lang.Boolean b23 = range_b22.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b26 = null;
    Range<java.lang.Boolean> range_b27 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b26);
    java.lang.Boolean b28 = range_b27.getMinimum();
    boolean b29 = range_b22.containsRange(range_b27);
    java.util.Comparator<java.lang.Boolean> comparator_b30 = range_b22.getComparator();
    boolean b32 = range_b22.isStartedBy((java.lang.Boolean)true);
    boolean b33 = range_b17.containsRange(range_b22);
    boolean b34 = range_b13.isAfterRange(range_b17);
    java.util.Comparator<java.lang.Boolean> comparator_b37 = null;
    Range<java.lang.Boolean> range_b38 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b37);
    java.lang.Boolean b39 = range_b38.getMinimum();
    java.lang.Boolean b40 = range_b38.getMaximum();
    boolean b41 = range_b17.isBeforeRange(range_b38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b10 + "' != '" + false+ "'", b10.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    org.junit.Assert.assertTrue("'" + comparator_b12 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b12.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b18 + "' != '" + false+ "'", b18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b23 + "' != '" + false+ "'", b23.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b28 + "' != '" + false+ "'", b28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    org.junit.Assert.assertTrue("'" + comparator_b30 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b30.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b39 + "' != '" + false+ "'", b39.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b40 + "' != '" + false+ "'", b40.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b3.getComparator();
    int i12 = range_b3.elementCompareTo((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    Range<java.lang.Object> range_obj14 = Range.is((java.lang.Object)i12, comparator_obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj14);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    boolean b10 = range_b3.containsRange(range_b8);
    boolean b12 = range_b8.isStartedBy((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    boolean b5 = range_b3.isBefore((java.lang.Boolean)false);
    java.lang.String str6 = range_b3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[false..false]"+ "'", str6.equals("[false..false]"));

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)false);
    int i3 = range_b1.elementCompareTo((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    int i5 = range_b3.elementCompareTo((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b8 = null;
    Range<java.lang.Boolean> range_b9 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b12);
    java.lang.Boolean b14 = range_b13.getMinimum();
    boolean b15 = range_b9.isOverlappedBy(range_b13);
    boolean b16 = range_b3.isOverlappedBy(range_b9);
    boolean b18 = range_b3.isEndedBy((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b14 + "' != '" + false+ "'", b14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b12);
    java.lang.Boolean b14 = range_b13.getMinimum();
    boolean b15 = range_b8.containsRange(range_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = range_b8.getComparator();
    boolean b18 = range_b8.isStartedBy((java.lang.Boolean)true);
    boolean b19 = range_b3.containsRange(range_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b22);
    java.lang.Boolean b24 = range_b23.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b27 = null;
    Range<java.lang.Boolean> range_b28 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b27);
    boolean b29 = range_b23.containsRange(range_b28);
    Range<java.lang.Boolean> range_b30 = range_b8.intersectionWith(range_b23);
    boolean b32 = range_b23.isStartedBy((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b14 + "' != '" + false+ "'", b14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    org.junit.Assert.assertTrue("'" + comparator_b16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b24 + "' != '" + false+ "'", b24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    java.lang.Boolean b6 = range_b5.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = null;
    Range<java.lang.Boolean> range_b10 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b9);
    java.lang.Boolean b11 = range_b10.getMinimum();
    boolean b12 = range_b5.containsRange(range_b10);
    java.util.Comparator<java.lang.Boolean> comparator_b13 = range_b5.getComparator();
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b13);
    java.lang.String str16 = range_b14.toString("");
    boolean b18 = range_b14.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b23);
    java.lang.Boolean b25 = range_b24.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b28 = null;
    Range<java.lang.Boolean> range_b29 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b28);
    java.lang.Boolean b30 = range_b29.getMinimum();
    boolean b31 = range_b24.containsRange(range_b29);
    java.util.Comparator<java.lang.Boolean> comparator_b32 = range_b24.getComparator();
    Range<java.lang.Boolean> range_b33 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b32);
    java.util.Comparator<java.lang.Boolean> comparator_b36 = null;
    Range<java.lang.Boolean> range_b37 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b36);
    java.lang.Boolean b38 = range_b37.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b41 = null;
    Range<java.lang.Boolean> range_b42 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b41);
    java.lang.Boolean b43 = range_b42.getMinimum();
    boolean b44 = range_b37.containsRange(range_b42);
    boolean b45 = range_b33.isOverlappedBy(range_b37);
    boolean b46 = range_b14.isBeforeRange(range_b33);
    java.util.Comparator<java.lang.Object> comparator_obj48 = null;
    Range<java.lang.Object> range_obj49 = Range.is((java.lang.Object)100.0f, comparator_obj48);
    java.util.Comparator<java.lang.Object> comparator_obj50 = null;
    Range<java.lang.Object> range_obj51 = Range.is((java.lang.Object)100.0f, comparator_obj50);
    boolean b52 = range_b33.equals((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + false+ "'", b6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + false+ "'", b11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    org.junit.Assert.assertTrue("'" + comparator_b13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b25 + "' != '" + false+ "'", b25.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b30 + "' != '" + false+ "'", b30.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    org.junit.Assert.assertTrue("'" + comparator_b32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b38 + "' != '" + false+ "'", b38.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b43 + "' != '" + false+ "'", b43.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    boolean b9 = range_b3.containsRange(range_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b8.getComparator();
    boolean b12 = range_b8.isAfter((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b15 = null;
    Range<java.lang.Boolean> range_b16 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b15);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b19);
    java.lang.Boolean b21 = range_b20.getMinimum();
    boolean b22 = range_b16.isOverlappedBy(range_b20);
    java.lang.String str23 = range_b20.toString();
    java.lang.String str24 = range_b20.toString();
    boolean b25 = range_b8.isAfterRange(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b21 + "' != '" + false+ "'", b21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[false..true]"+ "'", str23.equals("[false..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[false..true]"+ "'", str24.equals("[false..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    int i5 = range_b3.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b6 = range_b3.getMaximum();
    boolean b8 = range_b3.isEndedBy((java.lang.Boolean)false);
    java.lang.Boolean b9 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b3.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + true+ "'", b6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    int i7 = range_b5.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b8 = range_b5.getMaximum();
    boolean b10 = range_b5.isAfter((java.lang.Boolean)true);
    java.lang.Boolean b11 = range_b5.getMaximum();
    boolean b12 = range_b1.isAfterRange(range_b5);
    java.util.Comparator<java.lang.Boolean> comparator_b15 = null;
    Range<java.lang.Boolean> range_b16 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b15);
    int i18 = range_b16.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b19 = range_b16.getMaximum();
    boolean b21 = range_b16.isEndedBy((java.lang.Boolean)false);
    boolean b23 = range_b16.isAfter((java.lang.Boolean)false);
    Range<java.lang.Boolean> range_b24 = range_b5.intersectionWith(range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + true+ "'", b11.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b19 + "' != '" + true+ "'", b19.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    java.lang.Boolean b6 = range_b5.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = null;
    Range<java.lang.Boolean> range_b10 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b9);
    java.lang.Boolean b11 = range_b10.getMinimum();
    boolean b12 = range_b5.containsRange(range_b10);
    java.util.Comparator<java.lang.Boolean> comparator_b13 = range_b5.getComparator();
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b13);
    java.lang.String str16 = range_b14.toString("");
    boolean b18 = range_b14.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b23);
    java.lang.Boolean b25 = range_b24.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b28 = null;
    Range<java.lang.Boolean> range_b29 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b28);
    java.lang.Boolean b30 = range_b29.getMinimum();
    boolean b31 = range_b24.containsRange(range_b29);
    java.util.Comparator<java.lang.Boolean> comparator_b32 = range_b24.getComparator();
    Range<java.lang.Boolean> range_b33 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b32);
    java.util.Comparator<java.lang.Boolean> comparator_b36 = null;
    Range<java.lang.Boolean> range_b37 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b36);
    java.lang.Boolean b38 = range_b37.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b41 = null;
    Range<java.lang.Boolean> range_b42 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b41);
    java.lang.Boolean b43 = range_b42.getMinimum();
    boolean b44 = range_b37.containsRange(range_b42);
    boolean b45 = range_b33.isOverlappedBy(range_b37);
    boolean b46 = range_b14.isBeforeRange(range_b33);
    java.lang.Boolean b47 = range_b14.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + false+ "'", b6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + false+ "'", b11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    org.junit.Assert.assertTrue("'" + comparator_b13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b25 + "' != '" + false+ "'", b25.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b30 + "' != '" + false+ "'", b30.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    org.junit.Assert.assertTrue("'" + comparator_b32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b38 + "' != '" + false+ "'", b38.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b43 + "' != '" + false+ "'", b43.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b47 + "' != '" + true+ "'", b47.equals(true));

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    java.util.Comparator<java.lang.Boolean> comparator_b8 = null;
    Range<java.lang.Boolean> range_b9 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b8);
    java.lang.Boolean b10 = range_b9.getMinimum();
    boolean b11 = range_b5.isOverlappedBy(range_b9);
    java.util.Comparator<java.lang.Boolean> comparator_b12 = range_b5.getComparator();
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b10 + "' != '" + false+ "'", b10.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    org.junit.Assert.assertTrue("'" + comparator_b12 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b12.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    int i7 = range_b5.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b8 = range_b5.getMaximum();
    boolean b10 = range_b5.isAfter((java.lang.Boolean)true);
    java.lang.Boolean b11 = range_b5.getMaximum();
    boolean b12 = range_b1.isAfterRange(range_b5);
    java.util.Comparator<java.lang.Boolean> comparator_b15 = null;
    Range<java.lang.Boolean> range_b16 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b15);
    boolean b18 = range_b16.contains((java.lang.Boolean)true);
    boolean b20 = range_b16.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b23);
    java.util.Comparator<java.lang.Boolean> comparator_b27 = null;
    Range<java.lang.Boolean> range_b28 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b27);
    java.lang.Boolean b29 = range_b28.getMinimum();
    boolean b30 = range_b24.isOverlappedBy(range_b28);
    java.util.Comparator<java.lang.Boolean> comparator_b35 = null;
    Range<java.lang.Boolean> range_b36 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b35);
    java.lang.Boolean b37 = range_b36.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b40 = null;
    Range<java.lang.Boolean> range_b41 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b40);
    java.lang.Boolean b42 = range_b41.getMinimum();
    boolean b43 = range_b36.containsRange(range_b41);
    java.util.Comparator<java.lang.Boolean> comparator_b44 = range_b36.getComparator();
    Range<java.lang.Boolean> range_b45 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b44);
    java.util.Comparator<java.lang.Boolean> comparator_b48 = null;
    Range<java.lang.Boolean> range_b49 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b48);
    java.lang.Boolean b50 = range_b49.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b53 = null;
    Range<java.lang.Boolean> range_b54 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b53);
    java.lang.Boolean b55 = range_b54.getMinimum();
    boolean b56 = range_b49.containsRange(range_b54);
    boolean b57 = range_b45.isOverlappedBy(range_b49);
    boolean b59 = range_b45.contains((java.lang.Boolean)true);
    boolean b60 = range_b28.isOverlappedBy(range_b45);
    boolean b61 = range_b16.isBeforeRange(range_b45);
    boolean b62 = range_b5.equals((java.lang.Object)range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + true+ "'", b8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + true+ "'", b11.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b29 + "' != '" + false+ "'", b29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b37 + "' != '" + false+ "'", b37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b42 + "' != '" + false+ "'", b42.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    org.junit.Assert.assertTrue("'" + comparator_b44 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b44.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b50 + "' != '" + false+ "'", b50.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b55 + "' != '" + false+ "'", b55.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b14 = null;
    Range<java.lang.Boolean> range_b15 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b14);
    java.lang.Boolean b16 = range_b15.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b19);
    java.lang.Boolean b21 = range_b20.getMinimum();
    boolean b22 = range_b15.containsRange(range_b20);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = range_b15.getComparator();
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b23);
    java.util.Comparator<java.lang.Boolean> comparator_b27 = null;
    Range<java.lang.Boolean> range_b28 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b27);
    java.lang.Boolean b29 = range_b28.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b32 = null;
    Range<java.lang.Boolean> range_b33 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b32);
    java.lang.Boolean b34 = range_b33.getMinimum();
    boolean b35 = range_b28.containsRange(range_b33);
    boolean b36 = range_b24.isOverlappedBy(range_b28);
    boolean b38 = range_b24.contains((java.lang.Boolean)true);
    boolean b39 = range_b7.isOverlappedBy(range_b24);
    java.util.Comparator<java.lang.Boolean> comparator_b42 = null;
    Range<java.lang.Boolean> range_b43 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b42);
    java.lang.Boolean b44 = range_b43.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b47 = null;
    Range<java.lang.Boolean> range_b48 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b47);
    java.lang.Boolean b49 = range_b48.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b52 = null;
    Range<java.lang.Boolean> range_b53 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b52);
    java.lang.Boolean b54 = range_b53.getMinimum();
    boolean b55 = range_b48.containsRange(range_b53);
    java.util.Comparator<java.lang.Boolean> comparator_b56 = range_b48.getComparator();
    boolean b58 = range_b48.isStartedBy((java.lang.Boolean)true);
    boolean b59 = range_b43.containsRange(range_b48);
    java.util.Comparator<java.lang.Boolean> comparator_b62 = null;
    Range<java.lang.Boolean> range_b63 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b62);
    java.util.Comparator<java.lang.Boolean> comparator_b66 = null;
    Range<java.lang.Boolean> range_b67 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b66);
    java.lang.Boolean b68 = range_b67.getMinimum();
    boolean b69 = range_b63.isOverlappedBy(range_b67);
    java.util.Comparator<java.lang.Boolean> comparator_b70 = range_b63.getComparator();
    boolean b71 = range_b43.isOverlappedBy(range_b63);
    Range<java.lang.Boolean> range_b72 = range_b7.intersectionWith(range_b43);
    boolean b74 = range_b43.isEndedBy((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b16 + "' != '" + false+ "'", b16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b21 + "' != '" + false+ "'", b21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    org.junit.Assert.assertTrue("'" + comparator_b23 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b23.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b29 + "' != '" + false+ "'", b29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b34 + "' != '" + false+ "'", b34.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b44 + "' != '" + false+ "'", b44.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b49 + "' != '" + false+ "'", b49.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b54 + "' != '" + false+ "'", b54.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    org.junit.Assert.assertTrue("'" + comparator_b56 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b56.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b68 + "' != '" + false+ "'", b68.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    org.junit.Assert.assertTrue("'" + comparator_b70 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b70.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    int i5 = range_b3.elementCompareTo((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b8 = null;
    Range<java.lang.Boolean> range_b9 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b12);
    java.lang.Boolean b14 = range_b13.getMinimum();
    boolean b15 = range_b9.isOverlappedBy(range_b13);
    boolean b16 = range_b3.isOverlappedBy(range_b9);
    boolean b18 = range_b3.isAfter((java.lang.Boolean)false);
    int i20 = range_b3.elementCompareTo((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b14 + "' != '" + false+ "'", b14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.lang.Boolean b5 = range_b3.getMaximum();
    java.util.Comparator<java.lang.Boolean> comparator_b8 = null;
    Range<java.lang.Boolean> range_b9 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b8);
    int i11 = range_b9.elementCompareTo((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b14 = null;
    Range<java.lang.Boolean> range_b15 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b14);
    java.util.Comparator<java.lang.Boolean> comparator_b18 = null;
    Range<java.lang.Boolean> range_b19 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b18);
    java.lang.Boolean b20 = range_b19.getMinimum();
    boolean b21 = range_b15.isOverlappedBy(range_b19);
    boolean b22 = range_b9.isOverlappedBy(range_b15);
    boolean b23 = range_b3.isOverlappedBy(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b5 + "' != '" + false+ "'", b5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b20 + "' != '" + false+ "'", b20.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    boolean b9 = range_b3.containsRange(range_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b8.getComparator();
    boolean b12 = range_b8.isAfter((java.lang.Boolean)true);
    boolean b14 = range_b8.isStartedBy((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b12);
    java.lang.Boolean b14 = range_b13.getMinimum();
    boolean b15 = range_b8.containsRange(range_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = range_b8.getComparator();
    boolean b18 = range_b8.isStartedBy((java.lang.Boolean)true);
    boolean b19 = range_b3.containsRange(range_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b22);
    java.lang.Boolean b24 = range_b23.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b27 = null;
    Range<java.lang.Boolean> range_b28 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b27);
    boolean b29 = range_b23.containsRange(range_b28);
    Range<java.lang.Boolean> range_b30 = range_b8.intersectionWith(range_b23);
    java.util.Comparator<java.lang.Boolean> comparator_b33 = null;
    Range<java.lang.Boolean> range_b34 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b33);
    int i36 = range_b34.elementCompareTo((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b39 = null;
    Range<java.lang.Boolean> range_b40 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b39);
    java.util.Comparator<java.lang.Boolean> comparator_b43 = null;
    Range<java.lang.Boolean> range_b44 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b43);
    java.lang.Boolean b45 = range_b44.getMinimum();
    boolean b46 = range_b40.isOverlappedBy(range_b44);
    boolean b47 = range_b34.isOverlappedBy(range_b40);
    boolean b49 = range_b34.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b50 = range_b34.getComparator();
    boolean b51 = range_b8.isAfterRange(range_b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b14 + "' != '" + false+ "'", b14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    org.junit.Assert.assertTrue("'" + comparator_b16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b24 + "' != '" + false+ "'", b24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b45 + "' != '" + false+ "'", b45.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    org.junit.Assert.assertTrue("'" + comparator_b50 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b50.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    boolean b11 = range_b7.isBefore((java.lang.Boolean)true);
    boolean b12 = range_b7.isNaturalOrdering();
    boolean b14 = range_b7.contains((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    boolean b10 = range_b3.containsRange(range_b8);
    boolean b12 = range_b3.isBefore((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    boolean b10 = range_b3.containsRange(range_b8);
    java.lang.Boolean b11 = range_b8.getMaximum();
    java.util.Comparator<java.lang.Boolean> comparator_b14 = null;
    Range<java.lang.Boolean> range_b15 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b14);
    int i17 = range_b15.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b18 = range_b15.getMaximum();
    boolean b20 = range_b15.isEndedBy((java.lang.Boolean)false);
    java.lang.Boolean b21 = range_b15.getMinimum();
    boolean b22 = range_b8.equals((java.lang.Object)range_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + true+ "'", b11.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b18 + "' != '" + true+ "'", b18.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b21 + "' != '" + false+ "'", b21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    int i5 = range_b3.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b6 = range_b3.getMaximum();
    boolean b8 = range_b3.isEndedBy((java.lang.Boolean)false);
    java.lang.String str10 = range_b3.toString("");
    boolean b11 = range_b3.isNaturalOrdering();
    boolean b13 = range_b3.isEndedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = null;
    Range<java.lang.Boolean> range_b17 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b16);
    java.lang.Boolean b18 = range_b17.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b21 = null;
    Range<java.lang.Boolean> range_b22 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b21);
    boolean b23 = range_b17.containsRange(range_b22);
    java.lang.Boolean b24 = range_b17.getMaximum();
    Range<java.lang.Boolean> range_b26 = Range.is((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b29 = null;
    Range<java.lang.Boolean> range_b30 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b29);
    int i32 = range_b30.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b33 = range_b30.getMaximum();
    boolean b35 = range_b30.isAfter((java.lang.Boolean)true);
    java.lang.Boolean b36 = range_b30.getMaximum();
    boolean b37 = range_b26.isAfterRange(range_b30);
    boolean b38 = range_b17.isBeforeRange(range_b30);
    Range<java.lang.Boolean> range_b39 = range_b3.intersectionWith(range_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + true+ "'", b6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b18 + "' != '" + false+ "'", b18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b24 + "' != '" + true+ "'", b24.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b33 + "' != '" + true+ "'", b33.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b36 + "' != '" + true+ "'", b36.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b39);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    java.lang.Boolean b10 = range_b3.getMaximum();
    boolean b11 = range_b3.isNaturalOrdering();
    java.lang.Boolean b12 = range_b3.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b10 + "' != '" + true+ "'", b10.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b12 + "' != '" + true+ "'", b12.equals(true));

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    boolean b9 = range_b3.containsRange(range_b8);
    java.lang.Boolean b10 = range_b3.getMaximum();
    java.util.Comparator<java.lang.Boolean> comparator_b15 = null;
    Range<java.lang.Boolean> range_b16 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b15);
    java.lang.Boolean b17 = range_b16.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b20 = null;
    Range<java.lang.Boolean> range_b21 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b20);
    java.lang.Boolean b22 = range_b21.getMinimum();
    boolean b23 = range_b16.containsRange(range_b21);
    java.util.Comparator<java.lang.Boolean> comparator_b24 = range_b16.getComparator();
    Range<java.lang.Boolean> range_b25 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b24);
    java.util.Comparator<java.lang.Boolean> comparator_b28 = null;
    Range<java.lang.Boolean> range_b29 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b28);
    java.lang.Boolean b30 = range_b29.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b33 = null;
    Range<java.lang.Boolean> range_b34 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b33);
    java.lang.Boolean b35 = range_b34.getMinimum();
    boolean b36 = range_b29.containsRange(range_b34);
    boolean b37 = range_b25.isOverlappedBy(range_b29);
    java.lang.String str39 = range_b25.toString("hi!");
    boolean b40 = range_b3.isAfterRange(range_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b10 + "' != '" + true+ "'", b10.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b17 + "' != '" + false+ "'", b17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b22 + "' != '" + false+ "'", b22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    org.junit.Assert.assertTrue("'" + comparator_b24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b30 + "' != '" + false+ "'", b30.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b35 + "' != '" + false+ "'", b35.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.lang.String str5 = range_b3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[false..false]"+ "'", str5.equals("[false..false]"));

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b4);
    java.lang.Boolean b6 = range_b5.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b9 = null;
    Range<java.lang.Boolean> range_b10 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b9);
    java.lang.Boolean b11 = range_b10.getMinimum();
    boolean b12 = range_b5.containsRange(range_b10);
    java.util.Comparator<java.lang.Boolean> comparator_b13 = range_b5.getComparator();
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b19);
    java.lang.Boolean b21 = range_b20.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b24 = null;
    Range<java.lang.Boolean> range_b25 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b24);
    java.lang.Boolean b26 = range_b25.getMinimum();
    boolean b27 = range_b20.containsRange(range_b25);
    java.util.Comparator<java.lang.Boolean> comparator_b28 = range_b20.getComparator();
    Range<java.lang.Boolean> range_b29 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b28);
    java.lang.String str31 = range_b29.toString("");
    Range<java.lang.Boolean> range_b32 = range_b14.intersectionWith(range_b29);
    java.lang.Boolean b33 = range_b29.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b6 + "' != '" + false+ "'", b6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b11 + "' != '" + false+ "'", b11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    org.junit.Assert.assertTrue("'" + comparator_b13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b21 + "' != '" + false+ "'", b21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b26 + "' != '" + false+ "'", b26.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    org.junit.Assert.assertTrue("'" + comparator_b28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b33 + "' != '" + true+ "'", b33.equals(true));

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    boolean b10 = range_b3.containsRange(range_b8);
    boolean b11 = range_b3.isNaturalOrdering();
    java.lang.String str12 = range_b3.toString();
    boolean b14 = range_b3.isBefore((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[false..true]"+ "'", str12.equals("[false..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    boolean b5 = range_b3.contains((java.lang.Boolean)true);
    boolean b7 = range_b3.isEndedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b10);
    java.util.Comparator<java.lang.Boolean> comparator_b14 = null;
    Range<java.lang.Boolean> range_b15 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b14);
    java.lang.Boolean b16 = range_b15.getMinimum();
    boolean b17 = range_b11.isOverlappedBy(range_b15);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b22);
    java.lang.Boolean b24 = range_b23.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b27 = null;
    Range<java.lang.Boolean> range_b28 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b27);
    java.lang.Boolean b29 = range_b28.getMinimum();
    boolean b30 = range_b23.containsRange(range_b28);
    java.util.Comparator<java.lang.Boolean> comparator_b31 = range_b23.getComparator();
    Range<java.lang.Boolean> range_b32 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b31);
    java.util.Comparator<java.lang.Boolean> comparator_b35 = null;
    Range<java.lang.Boolean> range_b36 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b35);
    java.lang.Boolean b37 = range_b36.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b40 = null;
    Range<java.lang.Boolean> range_b41 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b40);
    java.lang.Boolean b42 = range_b41.getMinimum();
    boolean b43 = range_b36.containsRange(range_b41);
    boolean b44 = range_b32.isOverlappedBy(range_b36);
    boolean b46 = range_b32.contains((java.lang.Boolean)true);
    boolean b47 = range_b15.isOverlappedBy(range_b32);
    boolean b48 = range_b3.isAfterRange(range_b15);
    boolean b50 = range_b3.isEndedBy((java.lang.Boolean)true);
    java.lang.String str51 = range_b3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b16 + "' != '" + false+ "'", b16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b24 + "' != '" + false+ "'", b24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b29 + "' != '" + false+ "'", b29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    org.junit.Assert.assertTrue("'" + comparator_b31 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b31.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b37 + "' != '" + false+ "'", b37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b42 + "' != '" + false+ "'", b42.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[false..true]"+ "'", str51.equals("[false..true]"));

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b12);
    java.lang.Boolean b14 = range_b13.getMinimum();
    boolean b15 = range_b8.containsRange(range_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = range_b8.getComparator();
    boolean b18 = range_b8.isStartedBy((java.lang.Boolean)true);
    boolean b19 = range_b3.containsRange(range_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b22);
    java.util.Comparator<java.lang.Boolean> comparator_b26 = null;
    Range<java.lang.Boolean> range_b27 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b26);
    java.lang.Boolean b28 = range_b27.getMinimum();
    boolean b29 = range_b23.isOverlappedBy(range_b27);
    java.util.Comparator<java.lang.Boolean> comparator_b30 = range_b23.getComparator();
    boolean b31 = range_b3.isOverlappedBy(range_b23);
    java.lang.String str33 = range_b23.toString("[false..true]");
    java.util.Comparator<java.lang.Boolean> comparator_b38 = null;
    Range<java.lang.Boolean> range_b39 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b38);
    java.lang.Boolean b40 = range_b39.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b43 = null;
    Range<java.lang.Boolean> range_b44 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b43);
    java.lang.Boolean b45 = range_b44.getMinimum();
    boolean b46 = range_b39.containsRange(range_b44);
    java.util.Comparator<java.lang.Boolean> comparator_b47 = range_b39.getComparator();
    Range<java.lang.Boolean> range_b48 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b47);
    java.lang.String str50 = range_b48.toString("");
    boolean b52 = range_b48.isEndedBy((java.lang.Boolean)true);
    Range<java.lang.Boolean> range_b53 = range_b23.intersectionWith(range_b48);
    boolean b55 = range_b23.isEndedBy((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b14 + "' != '" + false+ "'", b14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    org.junit.Assert.assertTrue("'" + comparator_b16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b28 + "' != '" + false+ "'", b28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    org.junit.Assert.assertTrue("'" + comparator_b30 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b30.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[false..true]"+ "'", str33.equals("[false..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b40 + "' != '" + false+ "'", b40.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b45 + "' != '" + false+ "'", b45.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    org.junit.Assert.assertTrue("'" + comparator_b47 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b47.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    boolean b11 = range_b7.contains((java.lang.Boolean)true);
    boolean b13 = range_b7.contains((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    boolean b5 = range_b3.contains((java.lang.Boolean)true);
    boolean b7 = range_b3.isEndedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b10);
    java.util.Comparator<java.lang.Boolean> comparator_b14 = null;
    Range<java.lang.Boolean> range_b15 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b14);
    java.lang.Boolean b16 = range_b15.getMinimum();
    boolean b17 = range_b11.isOverlappedBy(range_b15);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b22);
    java.lang.Boolean b24 = range_b23.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b27 = null;
    Range<java.lang.Boolean> range_b28 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b27);
    java.lang.Boolean b29 = range_b28.getMinimum();
    boolean b30 = range_b23.containsRange(range_b28);
    java.util.Comparator<java.lang.Boolean> comparator_b31 = range_b23.getComparator();
    Range<java.lang.Boolean> range_b32 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b31);
    java.util.Comparator<java.lang.Boolean> comparator_b35 = null;
    Range<java.lang.Boolean> range_b36 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b35);
    java.lang.Boolean b37 = range_b36.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b40 = null;
    Range<java.lang.Boolean> range_b41 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b40);
    java.lang.Boolean b42 = range_b41.getMinimum();
    boolean b43 = range_b36.containsRange(range_b41);
    boolean b44 = range_b32.isOverlappedBy(range_b36);
    boolean b46 = range_b32.contains((java.lang.Boolean)true);
    boolean b47 = range_b15.isOverlappedBy(range_b32);
    boolean b48 = range_b3.isAfterRange(range_b15);
    java.util.Comparator<java.lang.Boolean> comparator_b51 = null;
    Range<java.lang.Boolean> range_b52 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b51);
    java.util.Comparator<java.lang.Boolean> comparator_b55 = null;
    Range<java.lang.Boolean> range_b56 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b55);
    java.lang.Boolean b57 = range_b56.getMinimum();
    boolean b58 = range_b52.isOverlappedBy(range_b56);
    java.util.Comparator<java.lang.Boolean> comparator_b63 = null;
    Range<java.lang.Boolean> range_b64 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b63);
    java.lang.Boolean b65 = range_b64.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b68 = null;
    Range<java.lang.Boolean> range_b69 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b68);
    java.lang.Boolean b70 = range_b69.getMinimum();
    boolean b71 = range_b64.containsRange(range_b69);
    java.util.Comparator<java.lang.Boolean> comparator_b72 = range_b64.getComparator();
    Range<java.lang.Boolean> range_b73 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b72);
    java.util.Comparator<java.lang.Boolean> comparator_b76 = null;
    Range<java.lang.Boolean> range_b77 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b76);
    java.lang.Boolean b78 = range_b77.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b81 = null;
    Range<java.lang.Boolean> range_b82 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b81);
    java.lang.Boolean b83 = range_b82.getMinimum();
    boolean b84 = range_b77.containsRange(range_b82);
    boolean b85 = range_b73.isOverlappedBy(range_b77);
    boolean b87 = range_b73.contains((java.lang.Boolean)true);
    boolean b88 = range_b56.isOverlappedBy(range_b73);
    boolean b89 = range_b3.equals((java.lang.Object)range_b73);
    boolean b91 = range_b3.isAfter((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b16 + "' != '" + false+ "'", b16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b24 + "' != '" + false+ "'", b24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b29 + "' != '" + false+ "'", b29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    org.junit.Assert.assertTrue("'" + comparator_b31 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b31.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b37 + "' != '" + false+ "'", b37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b42 + "' != '" + false+ "'", b42.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b57 + "' != '" + false+ "'", b57.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b65 + "' != '" + false+ "'", b65.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b70 + "' != '" + false+ "'", b70.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    org.junit.Assert.assertTrue("'" + comparator_b72 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b72.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b78 + "' != '" + false+ "'", b78.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b83 + "' != '" + false+ "'", b83.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    boolean b11 = range_b3.isStartedBy((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)false);
    Range<java.lang.Boolean> range_b3 = Range.is((java.lang.Boolean)false);
    boolean b4 = range_b1.equals((java.lang.Object)false);
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b12);
    java.lang.Boolean b14 = range_b13.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b17 = null;
    Range<java.lang.Boolean> range_b18 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b17);
    java.lang.Boolean b19 = range_b18.getMinimum();
    boolean b20 = range_b13.containsRange(range_b18);
    java.util.Comparator<java.lang.Boolean> comparator_b21 = range_b13.getComparator();
    boolean b23 = range_b13.isStartedBy((java.lang.Boolean)true);
    boolean b24 = range_b8.containsRange(range_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b27 = null;
    Range<java.lang.Boolean> range_b28 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b27);
    java.lang.Boolean b29 = range_b28.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b32 = null;
    Range<java.lang.Boolean> range_b33 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b32);
    boolean b34 = range_b28.containsRange(range_b33);
    Range<java.lang.Boolean> range_b35 = range_b13.intersectionWith(range_b28);
    java.util.Comparator<java.lang.Boolean> comparator_b38 = null;
    Range<java.lang.Boolean> range_b39 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b38);
    int i41 = range_b39.elementCompareTo((java.lang.Boolean)true);
    java.lang.Boolean b42 = range_b39.getMaximum();
    boolean b44 = range_b39.isEndedBy((java.lang.Boolean)false);
    java.lang.String str46 = range_b39.toString("");
    boolean b47 = range_b39.isNaturalOrdering();
    boolean b48 = range_b35.isAfterRange(range_b39);
    java.util.Comparator<java.lang.Boolean> comparator_b51 = null;
    Range<java.lang.Boolean> range_b52 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b51);
    java.lang.Boolean b53 = range_b52.getMinimum();
    java.lang.Boolean b54 = range_b52.getMaximum();
    Range<java.lang.Boolean> range_b56 = Range.is((java.lang.Boolean)false);
    Range<java.lang.Boolean> range_b58 = Range.is((java.lang.Boolean)false);
    boolean b59 = range_b56.equals((java.lang.Object)false);
    java.lang.String str60 = range_b56.toString();
    java.lang.String str61 = range_b56.toString();
    boolean b62 = range_b52.equals((java.lang.Object)range_b56);
    boolean b63 = range_b39.isOverlappedBy(range_b56);
    boolean b64 = range_b1.equals((java.lang.Object)b63);
    int i66 = range_b1.elementCompareTo((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b14 + "' != '" + false+ "'", b14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b19 + "' != '" + false+ "'", b19.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    org.junit.Assert.assertTrue("'" + comparator_b21 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b21.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b29 + "' != '" + false+ "'", b29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b42 + "' != '" + true+ "'", b42.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + ""+ "'", str46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b53 + "' != '" + false+ "'", b53.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b54 + "' != '" + false+ "'", b54.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "[false..false]"+ "'", str60.equals("[false..false]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "[false..false]"+ "'", str61.equals("[false..false]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b2);
    java.lang.Boolean b4 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b7 = null;
    Range<java.lang.Boolean> range_b8 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b7);
    java.lang.Boolean b9 = range_b8.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b12);
    java.lang.Boolean b14 = range_b13.getMinimum();
    boolean b15 = range_b8.containsRange(range_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = range_b8.getComparator();
    boolean b18 = range_b8.isStartedBy((java.lang.Boolean)true);
    boolean b19 = range_b3.containsRange(range_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b22);
    java.util.Comparator<java.lang.Boolean> comparator_b26 = null;
    Range<java.lang.Boolean> range_b27 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b26);
    java.lang.Boolean b28 = range_b27.getMinimum();
    boolean b29 = range_b23.isOverlappedBy(range_b27);
    java.util.Comparator<java.lang.Boolean> comparator_b30 = range_b23.getComparator();
    boolean b31 = range_b3.isOverlappedBy(range_b23);
    java.lang.String str33 = range_b23.toString("[false..true]");
    java.util.Comparator<java.lang.Boolean> comparator_b38 = null;
    Range<java.lang.Boolean> range_b39 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b38);
    java.lang.Boolean b40 = range_b39.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b43 = null;
    Range<java.lang.Boolean> range_b44 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b43);
    java.lang.Boolean b45 = range_b44.getMinimum();
    boolean b46 = range_b39.containsRange(range_b44);
    java.util.Comparator<java.lang.Boolean> comparator_b47 = range_b39.getComparator();
    Range<java.lang.Boolean> range_b48 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b47);
    java.lang.String str50 = range_b48.toString("");
    boolean b52 = range_b48.isEndedBy((java.lang.Boolean)true);
    Range<java.lang.Boolean> range_b53 = range_b23.intersectionWith(range_b48);
    boolean b55 = range_b53.isStartedBy((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b4 + "' != '" + false+ "'", b4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b14 + "' != '" + false+ "'", b14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    org.junit.Assert.assertTrue("'" + comparator_b16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b28 + "' != '" + false+ "'", b28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    org.junit.Assert.assertTrue("'" + comparator_b30 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b30.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "[false..true]"+ "'", str33.equals("[false..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b40 + "' != '" + false+ "'", b40.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b45 + "' != '" + false+ "'", b45.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    org.junit.Assert.assertTrue("'" + comparator_b47 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b47.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b6);
    java.lang.Boolean b8 = range_b7.getMinimum();
    boolean b9 = range_b3.isOverlappedBy(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b14 = null;
    Range<java.lang.Boolean> range_b15 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b14);
    java.lang.Boolean b16 = range_b15.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b19);
    java.lang.Boolean b21 = range_b20.getMinimum();
    boolean b22 = range_b15.containsRange(range_b20);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = range_b15.getComparator();
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)true, comparator_b23);
    java.util.Comparator<java.lang.Boolean> comparator_b27 = null;
    Range<java.lang.Boolean> range_b28 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b27);
    java.lang.Boolean b29 = range_b28.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b32 = null;
    Range<java.lang.Boolean> range_b33 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b32);
    java.lang.Boolean b34 = range_b33.getMinimum();
    boolean b35 = range_b28.containsRange(range_b33);
    boolean b36 = range_b24.isOverlappedBy(range_b28);
    boolean b38 = range_b24.contains((java.lang.Boolean)true);
    boolean b39 = range_b7.isOverlappedBy(range_b24);
    java.util.Comparator<java.lang.Boolean> comparator_b42 = null;
    Range<java.lang.Boolean> range_b43 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b42);
    java.lang.Boolean b44 = range_b43.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b47 = null;
    Range<java.lang.Boolean> range_b48 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b47);
    java.lang.Boolean b49 = range_b48.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b52 = null;
    Range<java.lang.Boolean> range_b53 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b52);
    java.lang.Boolean b54 = range_b53.getMinimum();
    boolean b55 = range_b48.containsRange(range_b53);
    java.util.Comparator<java.lang.Boolean> comparator_b56 = range_b48.getComparator();
    boolean b58 = range_b48.isStartedBy((java.lang.Boolean)true);
    boolean b59 = range_b43.containsRange(range_b48);
    java.util.Comparator<java.lang.Boolean> comparator_b62 = null;
    Range<java.lang.Boolean> range_b63 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b62);
    java.util.Comparator<java.lang.Boolean> comparator_b66 = null;
    Range<java.lang.Boolean> range_b67 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b66);
    java.lang.Boolean b68 = range_b67.getMinimum();
    boolean b69 = range_b63.isOverlappedBy(range_b67);
    java.util.Comparator<java.lang.Boolean> comparator_b70 = range_b63.getComparator();
    boolean b71 = range_b43.isOverlappedBy(range_b63);
    Range<java.lang.Boolean> range_b72 = range_b7.intersectionWith(range_b43);
    java.util.Comparator<java.lang.Boolean> comparator_b75 = null;
    Range<java.lang.Boolean> range_b76 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b75);
    int i78 = range_b76.elementCompareTo((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b79 = range_b76.getComparator();
    boolean b81 = range_b76.isBefore((java.lang.Boolean)false);
    boolean b82 = range_b72.containsRange(range_b76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b8 + "' != '" + false+ "'", b8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b16 + "' != '" + false+ "'", b16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b21 + "' != '" + false+ "'", b21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    org.junit.Assert.assertTrue("'" + comparator_b23 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b23.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b29 + "' != '" + false+ "'", b29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b34 + "' != '" + false+ "'", b34.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b44 + "' != '" + false+ "'", b44.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b49 + "' != '" + false+ "'", b49.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b54 + "' != '" + false+ "'", b54.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    org.junit.Assert.assertTrue("'" + comparator_b56 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b56.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b68 + "' != '" + false+ "'", b68.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    org.junit.Assert.assertTrue("'" + comparator_b70 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b70.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    org.junit.Assert.assertTrue("'" + comparator_b79 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b79.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);

  }

}
