package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it6_livello5 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = range_obj5.isAfter((java.lang.Object)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.lang.Object obj22 = range_obj19.getMaximum();
    Range<java.lang.Object> range_obj23 = range_obj2.intersectionWith(range_obj19);
    // The following exception was thrown during execution in test generation
    try {
    boolean b25 = range_obj23.isAfter((java.lang.Object)(-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d+ "'", obj22.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    boolean b31 = range_obj29.isNaturalOrdering();
    Range<java.lang.Object> range_obj32 = range_obj2.intersectionWith(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    Range<java.lang.Object> range_obj35 = Range.is((java.lang.Object)0.0d, comparator_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj37 = null;
    Range<java.lang.Object> range_obj38 = Range.is((java.lang.Object)0.0d, comparator_obj37);
    java.util.Comparator<java.lang.Object> comparator_obj39 = range_obj38.getComparator();
    Range<java.lang.Object> range_obj40 = range_obj35.intersectionWith(range_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj42 = null;
    Range<java.lang.Object> range_obj43 = Range.is((java.lang.Object)0.0d, comparator_obj42);
    java.util.Comparator<java.lang.Object> comparator_obj45 = null;
    Range<java.lang.Object> range_obj46 = Range.is((java.lang.Object)0.0d, comparator_obj45);
    java.util.Comparator<java.lang.Object> comparator_obj47 = range_obj46.getComparator();
    Range<java.lang.Object> range_obj48 = range_obj43.intersectionWith(range_obj46);
    boolean b49 = range_obj40.isBeforeRange(range_obj48);
    boolean b50 = range_obj48.isNaturalOrdering();
    Range<java.lang.Object> range_obj51 = null;
    boolean b52 = range_obj48.isAfterRange(range_obj51);
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj53 = range_obj29.intersectionWith(range_obj51);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    org.junit.Assert.assertTrue("'" + comparator_obj39 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj39.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj46);
    org.junit.Assert.assertTrue("'" + comparator_obj47 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj47.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.is((java.lang.Object)0.0d, comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = range_obj13.getComparator();
    Range<java.lang.Object> range_obj15 = range_obj10.intersectionWith(range_obj13);
    boolean b16 = range_obj7.isBeforeRange(range_obj15);
    java.lang.String str18 = range_obj7.toString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);
    org.junit.Assert.assertTrue("'" + comparator_obj14 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj14.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.equals((java.lang.Object)range_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    Range<java.lang.Object> range_obj36 = Range.is((java.lang.Object)0.0d, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = range_obj36.getComparator();
    Range<java.lang.Object> range_obj38 = range_obj33.intersectionWith(range_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj40 = null;
    Range<java.lang.Object> range_obj41 = Range.is((java.lang.Object)0.0d, comparator_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj43 = null;
    Range<java.lang.Object> range_obj44 = Range.is((java.lang.Object)0.0d, comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj45 = range_obj44.getComparator();
    Range<java.lang.Object> range_obj46 = range_obj41.intersectionWith(range_obj44);
    boolean b47 = range_obj38.isBeforeRange(range_obj46);
    boolean b48 = range_obj46.isNaturalOrdering();
    Range<java.lang.Object> range_obj49 = null;
    boolean b50 = range_obj46.isAfterRange(range_obj49);
    boolean b51 = range_obj29.containsRange(range_obj46);
    boolean b52 = range_obj7.isOverlappedBy(range_obj29);
    // The following exception was thrown during execution in test generation
    try {
    boolean b54 = range_obj7.isAfter((java.lang.Object)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    org.junit.Assert.assertTrue("'" + comparator_obj37 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj37.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    org.junit.Assert.assertTrue("'" + comparator_obj45 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj45.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = range_obj2.getComparator();
    java.lang.Object obj4 = range_obj2.getMinimum();
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    Range<java.lang.Object> range_obj18 = Range.is((java.lang.Object)0.0d, comparator_obj17);
    java.util.Comparator<java.lang.Object> comparator_obj19 = range_obj18.getComparator();
    Range<java.lang.Object> range_obj20 = range_obj15.intersectionWith(range_obj18);
    boolean b21 = range_obj12.isBeforeRange(range_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    java.util.Comparator<java.lang.Object> comparator_obj31 = null;
    Range<java.lang.Object> range_obj32 = Range.is((java.lang.Object)0.0d, comparator_obj31);
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    Range<java.lang.Object> range_obj35 = Range.is((java.lang.Object)0.0d, comparator_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj36 = range_obj35.getComparator();
    Range<java.lang.Object> range_obj37 = range_obj32.intersectionWith(range_obj35);
    boolean b38 = range_obj29.isBeforeRange(range_obj37);
    boolean b39 = range_obj12.containsRange(range_obj37);
    boolean b40 = range_obj2.equals((java.lang.Object)b39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    org.junit.Assert.assertTrue("'" + comparator_obj3 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj3.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0d+ "'", obj4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj18);
    org.junit.Assert.assertTrue("'" + comparator_obj19 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj19.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    org.junit.Assert.assertTrue("'" + comparator_obj36 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj36.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.is((java.lang.Object)0.0d, comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = range_obj13.getComparator();
    Range<java.lang.Object> range_obj15 = range_obj10.intersectionWith(range_obj13);
    boolean b16 = range_obj7.isBeforeRange(range_obj15);
    boolean b17 = range_obj15.isNaturalOrdering();
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = range_obj15.isStartedBy((java.lang.Object)1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);
    org.junit.Assert.assertTrue("'" + comparator_obj14 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj14.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.lang.Object obj22 = range_obj19.getMaximum();
    Range<java.lang.Object> range_obj23 = range_obj2.intersectionWith(range_obj19);
    int i25 = range_obj2.elementCompareTo((java.lang.Object)0.0d);
    // The following exception was thrown during execution in test generation
    try {
    boolean b27 = range_obj2.isEndedBy((java.lang.Object)(-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d+ "'", obj22.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = range_obj2.getComparator();
    // The following exception was thrown during execution in test generation
    try {
    boolean b5 = range_obj2.isAfter((java.lang.Object)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    org.junit.Assert.assertTrue("'" + comparator_obj3 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj3.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)(-1), (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    java.lang.String str8 = range_obj2.toString();
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)0.0d, comparator_obj10);
    boolean b13 = range_obj11.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    boolean b22 = range_obj11.equals((java.lang.Object)range_obj16);
    java.util.Comparator<java.lang.Object> comparator_obj24 = null;
    Range<java.lang.Object> range_obj25 = Range.is((java.lang.Object)0.0d, comparator_obj24);
    java.util.Comparator<java.lang.Object> comparator_obj27 = null;
    Range<java.lang.Object> range_obj28 = Range.is((java.lang.Object)0.0d, comparator_obj27);
    java.util.Comparator<java.lang.Object> comparator_obj29 = range_obj28.getComparator();
    Range<java.lang.Object> range_obj30 = range_obj25.intersectionWith(range_obj28);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    Range<java.lang.Object> range_obj36 = Range.is((java.lang.Object)0.0d, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = range_obj36.getComparator();
    Range<java.lang.Object> range_obj38 = range_obj33.intersectionWith(range_obj36);
    boolean b39 = range_obj30.isBeforeRange(range_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    Range<java.lang.Object> range_obj42 = Range.is((java.lang.Object)0.0d, comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj44 = null;
    Range<java.lang.Object> range_obj45 = Range.is((java.lang.Object)0.0d, comparator_obj44);
    java.util.Comparator<java.lang.Object> comparator_obj46 = range_obj45.getComparator();
    Range<java.lang.Object> range_obj47 = range_obj42.intersectionWith(range_obj45);
    java.util.Comparator<java.lang.Object> comparator_obj49 = null;
    Range<java.lang.Object> range_obj50 = Range.is((java.lang.Object)0.0d, comparator_obj49);
    java.util.Comparator<java.lang.Object> comparator_obj52 = null;
    Range<java.lang.Object> range_obj53 = Range.is((java.lang.Object)0.0d, comparator_obj52);
    java.util.Comparator<java.lang.Object> comparator_obj54 = range_obj53.getComparator();
    Range<java.lang.Object> range_obj55 = range_obj50.intersectionWith(range_obj53);
    boolean b56 = range_obj47.isBeforeRange(range_obj55);
    boolean b57 = range_obj30.containsRange(range_obj55);
    boolean b58 = range_obj16.isAfterRange(range_obj55);
    // The following exception was thrown during execution in test generation
    try {
    int i59 = range_obj2.elementCompareTo((java.lang.Object)b58);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0.0..0.0]"+ "'", str8.equals("[0.0..0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj28);
    org.junit.Assert.assertTrue("'" + comparator_obj29 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj29.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    org.junit.Assert.assertTrue("'" + comparator_obj37 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj37.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj45);
    org.junit.Assert.assertTrue("'" + comparator_obj46 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj46.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj53);
    org.junit.Assert.assertTrue("'" + comparator_obj54 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj54.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    boolean b31 = range_obj29.isNaturalOrdering();
    Range<java.lang.Object> range_obj32 = range_obj2.intersectionWith(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    Range<java.lang.Object> range_obj35 = Range.is((java.lang.Object)0.0d, comparator_obj34);
    boolean b37 = range_obj35.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj39 = null;
    Range<java.lang.Object> range_obj40 = Range.is((java.lang.Object)0.0d, comparator_obj39);
    java.util.Comparator<java.lang.Object> comparator_obj42 = null;
    Range<java.lang.Object> range_obj43 = Range.is((java.lang.Object)0.0d, comparator_obj42);
    java.util.Comparator<java.lang.Object> comparator_obj44 = range_obj43.getComparator();
    Range<java.lang.Object> range_obj45 = range_obj40.intersectionWith(range_obj43);
    boolean b46 = range_obj35.equals((java.lang.Object)range_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj48 = null;
    Range<java.lang.Object> range_obj49 = Range.is((java.lang.Object)0.0d, comparator_obj48);
    java.util.Comparator<java.lang.Object> comparator_obj51 = null;
    Range<java.lang.Object> range_obj52 = Range.is((java.lang.Object)0.0d, comparator_obj51);
    java.util.Comparator<java.lang.Object> comparator_obj53 = range_obj52.getComparator();
    Range<java.lang.Object> range_obj54 = range_obj49.intersectionWith(range_obj52);
    java.util.Comparator<java.lang.Object> comparator_obj56 = null;
    Range<java.lang.Object> range_obj57 = Range.is((java.lang.Object)0.0d, comparator_obj56);
    java.util.Comparator<java.lang.Object> comparator_obj59 = null;
    Range<java.lang.Object> range_obj60 = Range.is((java.lang.Object)0.0d, comparator_obj59);
    java.util.Comparator<java.lang.Object> comparator_obj61 = range_obj60.getComparator();
    Range<java.lang.Object> range_obj62 = range_obj57.intersectionWith(range_obj60);
    boolean b63 = range_obj54.isBeforeRange(range_obj62);
    java.util.Comparator<java.lang.Object> comparator_obj65 = null;
    Range<java.lang.Object> range_obj66 = Range.is((java.lang.Object)0.0d, comparator_obj65);
    java.util.Comparator<java.lang.Object> comparator_obj68 = null;
    Range<java.lang.Object> range_obj69 = Range.is((java.lang.Object)0.0d, comparator_obj68);
    java.util.Comparator<java.lang.Object> comparator_obj70 = range_obj69.getComparator();
    Range<java.lang.Object> range_obj71 = range_obj66.intersectionWith(range_obj69);
    java.util.Comparator<java.lang.Object> comparator_obj73 = null;
    Range<java.lang.Object> range_obj74 = Range.is((java.lang.Object)0.0d, comparator_obj73);
    java.util.Comparator<java.lang.Object> comparator_obj76 = null;
    Range<java.lang.Object> range_obj77 = Range.is((java.lang.Object)0.0d, comparator_obj76);
    java.util.Comparator<java.lang.Object> comparator_obj78 = range_obj77.getComparator();
    Range<java.lang.Object> range_obj79 = range_obj74.intersectionWith(range_obj77);
    boolean b80 = range_obj71.isBeforeRange(range_obj79);
    boolean b81 = range_obj79.isNaturalOrdering();
    Range<java.lang.Object> range_obj82 = null;
    boolean b83 = range_obj79.isAfterRange(range_obj82);
    boolean b84 = range_obj62.containsRange(range_obj79);
    boolean b85 = range_obj40.isOverlappedBy(range_obj62);
    // The following exception was thrown during execution in test generation
    try {
    boolean b86 = range_obj29.isEndedBy((java.lang.Object)b85);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj43);
    org.junit.Assert.assertTrue("'" + comparator_obj44 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj44.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj52);
    org.junit.Assert.assertTrue("'" + comparator_obj53 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj53.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj60);
    org.junit.Assert.assertTrue("'" + comparator_obj61 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj61.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj69);
    org.junit.Assert.assertTrue("'" + comparator_obj70 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj70.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj77);
    org.junit.Assert.assertTrue("'" + comparator_obj78 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj78.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    java.lang.String str8 = range_obj2.toString();
    java.lang.String str10 = range_obj2.toString("");
    // The following exception was thrown during execution in test generation
    try {
    boolean b12 = range_obj2.contains((java.lang.Object)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0.0..0.0]"+ "'", str8.equals("[0.0..0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)1, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = range_obj7.isStartedBy((java.lang.Object)100.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.is((java.lang.Object)0.0d, comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = range_obj13.getComparator();
    Range<java.lang.Object> range_obj15 = range_obj10.intersectionWith(range_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    Range<java.lang.Object> range_obj18 = Range.is((java.lang.Object)0.0d, comparator_obj17);
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    Range<java.lang.Object> range_obj21 = Range.is((java.lang.Object)0.0d, comparator_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj22 = range_obj21.getComparator();
    Range<java.lang.Object> range_obj23 = range_obj18.intersectionWith(range_obj21);
    boolean b24 = range_obj15.isBeforeRange(range_obj23);
    boolean b25 = range_obj23.isNaturalOrdering();
    Range<java.lang.Object> range_obj26 = null;
    boolean b27 = range_obj23.isAfterRange(range_obj26);
    Range<java.lang.Object> range_obj28 = range_obj5.intersectionWith(range_obj23);
    java.lang.Object obj29 = range_obj5.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);
    org.junit.Assert.assertTrue("'" + comparator_obj14 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj14.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    org.junit.Assert.assertTrue("'" + comparator_obj22 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj22.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0.0d+ "'", obj29.equals(0.0d));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.lang.Object obj22 = range_obj19.getMaximum();
    Range<java.lang.Object> range_obj23 = range_obj2.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj24 = range_obj19.getComparator();
    java.lang.String str26 = range_obj19.toString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d+ "'", obj22.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    org.junit.Assert.assertTrue("'" + comparator_obj24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.equals((java.lang.Object)range_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    Range<java.lang.Object> range_obj36 = Range.is((java.lang.Object)0.0d, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = range_obj36.getComparator();
    Range<java.lang.Object> range_obj38 = range_obj33.intersectionWith(range_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj40 = null;
    Range<java.lang.Object> range_obj41 = Range.is((java.lang.Object)0.0d, comparator_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj43 = null;
    Range<java.lang.Object> range_obj44 = Range.is((java.lang.Object)0.0d, comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj45 = range_obj44.getComparator();
    Range<java.lang.Object> range_obj46 = range_obj41.intersectionWith(range_obj44);
    boolean b47 = range_obj38.isBeforeRange(range_obj46);
    boolean b48 = range_obj46.isNaturalOrdering();
    Range<java.lang.Object> range_obj49 = null;
    boolean b50 = range_obj46.isAfterRange(range_obj49);
    boolean b51 = range_obj29.containsRange(range_obj46);
    boolean b52 = range_obj7.isOverlappedBy(range_obj29);
    java.lang.String str53 = range_obj7.toString();
    java.lang.Object obj54 = range_obj7.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    org.junit.Assert.assertTrue("'" + comparator_obj37 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj37.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    org.junit.Assert.assertTrue("'" + comparator_obj45 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj45.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[0.0..0.0]"+ "'", str53.equals("[0.0..0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0.0d+ "'", obj54.equals(0.0d));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.equals((java.lang.Object)range_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    java.util.Comparator<java.lang.Object> comparator_obj31 = null;
    Range<java.lang.Object> range_obj32 = Range.is((java.lang.Object)0.0d, comparator_obj31);
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    Range<java.lang.Object> range_obj35 = Range.is((java.lang.Object)0.0d, comparator_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj36 = range_obj35.getComparator();
    Range<java.lang.Object> range_obj37 = range_obj32.intersectionWith(range_obj35);
    boolean b38 = range_obj29.isBeforeRange(range_obj37);
    boolean b39 = range_obj37.isNaturalOrdering();
    Range<java.lang.Object> range_obj40 = null;
    boolean b41 = range_obj37.isAfterRange(range_obj40);
    Range<java.lang.Object> range_obj42 = range_obj19.intersectionWith(range_obj37);
    java.util.Comparator<java.lang.Object> comparator_obj44 = null;
    Range<java.lang.Object> range_obj45 = Range.is((java.lang.Object)0.0d, comparator_obj44);
    java.util.Comparator<java.lang.Object> comparator_obj47 = null;
    Range<java.lang.Object> range_obj48 = Range.is((java.lang.Object)0.0d, comparator_obj47);
    java.util.Comparator<java.lang.Object> comparator_obj49 = range_obj48.getComparator();
    Range<java.lang.Object> range_obj50 = range_obj45.intersectionWith(range_obj48);
    java.util.Comparator<java.lang.Object> comparator_obj52 = null;
    Range<java.lang.Object> range_obj53 = Range.is((java.lang.Object)0.0d, comparator_obj52);
    java.util.Comparator<java.lang.Object> comparator_obj55 = null;
    Range<java.lang.Object> range_obj56 = Range.is((java.lang.Object)0.0d, comparator_obj55);
    java.util.Comparator<java.lang.Object> comparator_obj57 = range_obj56.getComparator();
    Range<java.lang.Object> range_obj58 = range_obj53.intersectionWith(range_obj56);
    boolean b59 = range_obj50.isBeforeRange(range_obj58);
    java.util.Comparator<java.lang.Object> comparator_obj61 = null;
    Range<java.lang.Object> range_obj62 = Range.is((java.lang.Object)0.0d, comparator_obj61);
    java.util.Comparator<java.lang.Object> comparator_obj64 = null;
    Range<java.lang.Object> range_obj65 = Range.is((java.lang.Object)0.0d, comparator_obj64);
    java.util.Comparator<java.lang.Object> comparator_obj66 = range_obj65.getComparator();
    Range<java.lang.Object> range_obj67 = range_obj62.intersectionWith(range_obj65);
    java.util.Comparator<java.lang.Object> comparator_obj69 = null;
    Range<java.lang.Object> range_obj70 = Range.is((java.lang.Object)0.0d, comparator_obj69);
    java.util.Comparator<java.lang.Object> comparator_obj72 = null;
    Range<java.lang.Object> range_obj73 = Range.is((java.lang.Object)0.0d, comparator_obj72);
    java.util.Comparator<java.lang.Object> comparator_obj74 = range_obj73.getComparator();
    Range<java.lang.Object> range_obj75 = range_obj70.intersectionWith(range_obj73);
    boolean b76 = range_obj67.isBeforeRange(range_obj75);
    boolean b77 = range_obj75.isNaturalOrdering();
    Range<java.lang.Object> range_obj78 = null;
    boolean b79 = range_obj75.isAfterRange(range_obj78);
    boolean b80 = range_obj58.containsRange(range_obj75);
    boolean b81 = range_obj37.isOverlappedBy(range_obj75);
    // The following exception was thrown during execution in test generation
    try {
    boolean b82 = range_obj7.isAfter((java.lang.Object)b81);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    org.junit.Assert.assertTrue("'" + comparator_obj36 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj36.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj48);
    org.junit.Assert.assertTrue("'" + comparator_obj49 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj49.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj56);
    org.junit.Assert.assertTrue("'" + comparator_obj57 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj57.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj65);
    org.junit.Assert.assertTrue("'" + comparator_obj66 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj66.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj73);
    org.junit.Assert.assertTrue("'" + comparator_obj74 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj74.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    boolean b9 = range_obj7.equals((java.lang.Object)0.0d);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)0.0d, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj16 = range_obj15.getComparator();
    Range<java.lang.Object> range_obj17 = range_obj12.intersectionWith(range_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    Range<java.lang.Object> range_obj20 = Range.is((java.lang.Object)0.0d, comparator_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    Range<java.lang.Object> range_obj23 = Range.is((java.lang.Object)0.0d, comparator_obj22);
    java.util.Comparator<java.lang.Object> comparator_obj24 = range_obj23.getComparator();
    Range<java.lang.Object> range_obj25 = range_obj20.intersectionWith(range_obj23);
    boolean b26 = range_obj17.isBeforeRange(range_obj25);
    boolean b27 = range_obj25.isNaturalOrdering();
    boolean b28 = range_obj7.isBeforeRange(range_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    Range<java.lang.Object> range_obj31 = Range.is((java.lang.Object)0.0d, comparator_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    Range<java.lang.Object> range_obj34 = Range.is((java.lang.Object)0.0d, comparator_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj35 = range_obj34.getComparator();
    Range<java.lang.Object> range_obj36 = range_obj31.intersectionWith(range_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    Range<java.lang.Object> range_obj39 = Range.is((java.lang.Object)0.0d, comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    Range<java.lang.Object> range_obj42 = Range.is((java.lang.Object)0.0d, comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj43 = range_obj42.getComparator();
    Range<java.lang.Object> range_obj44 = range_obj39.intersectionWith(range_obj42);
    boolean b45 = range_obj36.isBeforeRange(range_obj44);
    boolean b46 = range_obj25.isBeforeRange(range_obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    org.junit.Assert.assertTrue("'" + comparator_obj16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    org.junit.Assert.assertTrue("'" + comparator_obj24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj34);
    org.junit.Assert.assertTrue("'" + comparator_obj35 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj35.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    org.junit.Assert.assertTrue("'" + comparator_obj43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    java.util.Comparator<java.lang.Integer> comparator_i2 = null;
    Range<java.lang.Integer> range_i3 = Range.between((java.lang.Integer)(-1), (java.lang.Integer)(-1), comparator_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i3);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = range_obj2.getComparator();
    java.lang.Object obj4 = range_obj2.getMinimum();
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    Range<java.lang.Object> range_obj18 = Range.is((java.lang.Object)0.0d, comparator_obj17);
    java.util.Comparator<java.lang.Object> comparator_obj19 = range_obj18.getComparator();
    Range<java.lang.Object> range_obj20 = range_obj15.intersectionWith(range_obj18);
    boolean b21 = range_obj12.isBeforeRange(range_obj20);
    java.lang.String str23 = range_obj20.toString("");
    Range<java.lang.Object> range_obj24 = range_obj2.intersectionWith(range_obj20);
    Range<java.lang.Object> range_obj25 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj26 = range_obj20.intersectionWith(range_obj25);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    org.junit.Assert.assertTrue("'" + comparator_obj3 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj3.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0d+ "'", obj4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj18);
    org.junit.Assert.assertTrue("'" + comparator_obj19 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj19.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    boolean b9 = range_obj7.equals((java.lang.Object)0.0d);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)0.0d, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj16 = range_obj15.getComparator();
    Range<java.lang.Object> range_obj17 = range_obj12.intersectionWith(range_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    Range<java.lang.Object> range_obj20 = Range.is((java.lang.Object)0.0d, comparator_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    Range<java.lang.Object> range_obj23 = Range.is((java.lang.Object)0.0d, comparator_obj22);
    java.util.Comparator<java.lang.Object> comparator_obj24 = range_obj23.getComparator();
    Range<java.lang.Object> range_obj25 = range_obj20.intersectionWith(range_obj23);
    boolean b26 = range_obj17.isBeforeRange(range_obj25);
    boolean b27 = range_obj25.isNaturalOrdering();
    boolean b28 = range_obj7.isBeforeRange(range_obj25);
    java.lang.Object obj29 = range_obj7.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    org.junit.Assert.assertTrue("'" + comparator_obj16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    org.junit.Assert.assertTrue("'" + comparator_obj24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0.0d+ "'", obj29.equals(0.0d));

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    boolean b9 = range_obj7.equals((java.lang.Object)0.0d);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)0.0d, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj16 = range_obj15.getComparator();
    Range<java.lang.Object> range_obj17 = range_obj12.intersectionWith(range_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    Range<java.lang.Object> range_obj20 = Range.is((java.lang.Object)0.0d, comparator_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    Range<java.lang.Object> range_obj23 = Range.is((java.lang.Object)0.0d, comparator_obj22);
    java.util.Comparator<java.lang.Object> comparator_obj24 = range_obj23.getComparator();
    Range<java.lang.Object> range_obj25 = range_obj20.intersectionWith(range_obj23);
    boolean b26 = range_obj17.isBeforeRange(range_obj25);
    boolean b27 = range_obj25.isNaturalOrdering();
    boolean b28 = range_obj7.isAfterRange(range_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    Range<java.lang.Object> range_obj31 = Range.is((java.lang.Object)0.0d, comparator_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    Range<java.lang.Object> range_obj34 = Range.is((java.lang.Object)0.0d, comparator_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj35 = range_obj34.getComparator();
    Range<java.lang.Object> range_obj36 = range_obj31.intersectionWith(range_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    Range<java.lang.Object> range_obj39 = Range.is((java.lang.Object)0.0d, comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    Range<java.lang.Object> range_obj42 = Range.is((java.lang.Object)0.0d, comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj43 = range_obj42.getComparator();
    Range<java.lang.Object> range_obj44 = range_obj39.intersectionWith(range_obj42);
    boolean b45 = range_obj36.isBeforeRange(range_obj44);
    boolean b46 = range_obj44.isNaturalOrdering();
    Range<java.lang.Object> range_obj47 = null;
    boolean b48 = range_obj44.isAfterRange(range_obj47);
    boolean b49 = range_obj25.isAfterRange(range_obj44);
    java.lang.Object obj50 = range_obj44.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    org.junit.Assert.assertTrue("'" + comparator_obj16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    org.junit.Assert.assertTrue("'" + comparator_obj24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj34);
    org.junit.Assert.assertTrue("'" + comparator_obj35 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj35.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    org.junit.Assert.assertTrue("'" + comparator_obj43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0.0d+ "'", obj50.equals(0.0d));

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    boolean b31 = range_obj29.isNaturalOrdering();
    Range<java.lang.Object> range_obj32 = range_obj2.intersectionWith(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    Range<java.lang.Object> range_obj35 = Range.is((java.lang.Object)0.0d, comparator_obj34);
    boolean b37 = range_obj35.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj39 = null;
    Range<java.lang.Object> range_obj40 = Range.is((java.lang.Object)0.0d, comparator_obj39);
    java.util.Comparator<java.lang.Object> comparator_obj42 = null;
    Range<java.lang.Object> range_obj43 = Range.is((java.lang.Object)0.0d, comparator_obj42);
    java.util.Comparator<java.lang.Object> comparator_obj44 = range_obj43.getComparator();
    Range<java.lang.Object> range_obj45 = range_obj40.intersectionWith(range_obj43);
    boolean b46 = range_obj35.isBeforeRange(range_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj48 = null;
    Range<java.lang.Object> range_obj49 = Range.is((java.lang.Object)0.0d, comparator_obj48);
    java.util.Comparator<java.lang.Object> comparator_obj51 = null;
    Range<java.lang.Object> range_obj52 = Range.is((java.lang.Object)0.0d, comparator_obj51);
    java.util.Comparator<java.lang.Object> comparator_obj53 = range_obj52.getComparator();
    Range<java.lang.Object> range_obj54 = range_obj49.intersectionWith(range_obj52);
    java.lang.Object obj55 = range_obj52.getMaximum();
    Range<java.lang.Object> range_obj56 = range_obj35.intersectionWith(range_obj52);
    Range<java.lang.Object> range_obj57 = range_obj2.intersectionWith(range_obj56);
    java.lang.String str58 = range_obj56.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj43);
    org.junit.Assert.assertTrue("'" + comparator_obj44 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj44.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj52);
    org.junit.Assert.assertTrue("'" + comparator_obj53 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj53.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0.0d+ "'", obj55.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "[0.0..0.0]"+ "'", str58.equals("[0.0..0.0]"));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = range_obj2.getComparator();
    java.lang.Object obj4 = range_obj2.getMinimum();
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    Range<java.lang.Object> range_obj18 = Range.is((java.lang.Object)0.0d, comparator_obj17);
    java.util.Comparator<java.lang.Object> comparator_obj19 = range_obj18.getComparator();
    Range<java.lang.Object> range_obj20 = range_obj15.intersectionWith(range_obj18);
    boolean b21 = range_obj12.isBeforeRange(range_obj20);
    java.lang.String str23 = range_obj20.toString("");
    boolean b24 = range_obj2.isOverlappedBy(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    org.junit.Assert.assertTrue("'" + comparator_obj3 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj3.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0d+ "'", obj4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj18);
    org.junit.Assert.assertTrue("'" + comparator_obj19 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj19.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = range_obj2.getComparator();
    java.lang.Object obj4 = range_obj2.getMinimum();
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    Range<java.lang.Object> range_obj18 = Range.is((java.lang.Object)0.0d, comparator_obj17);
    java.util.Comparator<java.lang.Object> comparator_obj19 = range_obj18.getComparator();
    Range<java.lang.Object> range_obj20 = range_obj15.intersectionWith(range_obj18);
    boolean b21 = range_obj12.isBeforeRange(range_obj20);
    java.lang.String str23 = range_obj20.toString("");
    Range<java.lang.Object> range_obj24 = range_obj2.intersectionWith(range_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj29 = null;
    Range<java.lang.Object> range_obj30 = Range.is((java.lang.Object)0.0d, comparator_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj31 = range_obj30.getComparator();
    Range<java.lang.Object> range_obj32 = range_obj27.intersectionWith(range_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    Range<java.lang.Object> range_obj35 = Range.is((java.lang.Object)0.0d, comparator_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj37 = null;
    Range<java.lang.Object> range_obj38 = Range.is((java.lang.Object)0.0d, comparator_obj37);
    java.util.Comparator<java.lang.Object> comparator_obj39 = range_obj38.getComparator();
    Range<java.lang.Object> range_obj40 = range_obj35.intersectionWith(range_obj38);
    boolean b41 = range_obj32.isBeforeRange(range_obj40);
    boolean b42 = range_obj40.isNaturalOrdering();
    boolean b43 = range_obj2.equals((java.lang.Object)range_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    org.junit.Assert.assertTrue("'" + comparator_obj3 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj3.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0d+ "'", obj4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj18);
    org.junit.Assert.assertTrue("'" + comparator_obj19 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj19.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj30);
    org.junit.Assert.assertTrue("'" + comparator_obj31 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj31.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    org.junit.Assert.assertTrue("'" + comparator_obj39 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj39.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.lang.Object obj22 = range_obj19.getMaximum();
    Range<java.lang.Object> range_obj23 = range_obj2.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj25 = null;
    Range<java.lang.Object> range_obj26 = Range.is((java.lang.Object)0.0d, comparator_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj28 = null;
    Range<java.lang.Object> range_obj29 = Range.is((java.lang.Object)0.0d, comparator_obj28);
    java.util.Comparator<java.lang.Object> comparator_obj30 = range_obj29.getComparator();
    Range<java.lang.Object> range_obj31 = range_obj26.intersectionWith(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    Range<java.lang.Object> range_obj34 = Range.is((java.lang.Object)0.0d, comparator_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj36 = null;
    Range<java.lang.Object> range_obj37 = Range.is((java.lang.Object)0.0d, comparator_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj38 = range_obj37.getComparator();
    Range<java.lang.Object> range_obj39 = range_obj34.intersectionWith(range_obj37);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    Range<java.lang.Object> range_obj42 = Range.is((java.lang.Object)0.0d, comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj44 = null;
    Range<java.lang.Object> range_obj45 = Range.is((java.lang.Object)0.0d, comparator_obj44);
    java.util.Comparator<java.lang.Object> comparator_obj46 = range_obj45.getComparator();
    Range<java.lang.Object> range_obj47 = range_obj42.intersectionWith(range_obj45);
    boolean b48 = range_obj39.isBeforeRange(range_obj47);
    boolean b49 = range_obj47.isNaturalOrdering();
    Range<java.lang.Object> range_obj50 = null;
    boolean b51 = range_obj47.isAfterRange(range_obj50);
    Range<java.lang.Object> range_obj52 = range_obj29.intersectionWith(range_obj47);
    // The following exception was thrown during execution in test generation
    try {
    boolean b53 = range_obj2.isEndedBy((java.lang.Object)range_obj29);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d+ "'", obj22.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    org.junit.Assert.assertTrue("'" + comparator_obj30 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj30.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj37);
    org.junit.Assert.assertTrue("'" + comparator_obj38 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj38.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj45);
    org.junit.Assert.assertTrue("'" + comparator_obj46 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj46.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj52);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.is((java.lang.Object)0.0d, comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = range_obj13.getComparator();
    Range<java.lang.Object> range_obj15 = range_obj10.intersectionWith(range_obj13);
    boolean b17 = range_obj15.equals((java.lang.Object)0.0d);
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    Range<java.lang.Object> range_obj20 = Range.is((java.lang.Object)0.0d, comparator_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    Range<java.lang.Object> range_obj23 = Range.is((java.lang.Object)0.0d, comparator_obj22);
    java.util.Comparator<java.lang.Object> comparator_obj24 = range_obj23.getComparator();
    Range<java.lang.Object> range_obj25 = range_obj20.intersectionWith(range_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj27 = null;
    Range<java.lang.Object> range_obj28 = Range.is((java.lang.Object)0.0d, comparator_obj27);
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    Range<java.lang.Object> range_obj31 = Range.is((java.lang.Object)0.0d, comparator_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj32 = range_obj31.getComparator();
    Range<java.lang.Object> range_obj33 = range_obj28.intersectionWith(range_obj31);
    boolean b34 = range_obj25.isBeforeRange(range_obj33);
    boolean b35 = range_obj33.isNaturalOrdering();
    boolean b36 = range_obj15.isAfterRange(range_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    Range<java.lang.Object> range_obj39 = Range.is((java.lang.Object)0.0d, comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    Range<java.lang.Object> range_obj42 = Range.is((java.lang.Object)0.0d, comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj43 = range_obj42.getComparator();
    Range<java.lang.Object> range_obj44 = range_obj39.intersectionWith(range_obj42);
    java.util.Comparator<java.lang.Object> comparator_obj46 = null;
    Range<java.lang.Object> range_obj47 = Range.is((java.lang.Object)0.0d, comparator_obj46);
    java.util.Comparator<java.lang.Object> comparator_obj49 = null;
    Range<java.lang.Object> range_obj50 = Range.is((java.lang.Object)0.0d, comparator_obj49);
    java.util.Comparator<java.lang.Object> comparator_obj51 = range_obj50.getComparator();
    Range<java.lang.Object> range_obj52 = range_obj47.intersectionWith(range_obj50);
    boolean b53 = range_obj44.isBeforeRange(range_obj52);
    boolean b54 = range_obj52.isNaturalOrdering();
    Range<java.lang.Object> range_obj55 = null;
    boolean b56 = range_obj52.isAfterRange(range_obj55);
    boolean b57 = range_obj33.isAfterRange(range_obj52);
    // The following exception was thrown during execution in test generation
    try {
    boolean b58 = range_obj5.isEndedBy((java.lang.Object)b57);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);
    org.junit.Assert.assertTrue("'" + comparator_obj14 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj14.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    org.junit.Assert.assertTrue("'" + comparator_obj24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj31);
    org.junit.Assert.assertTrue("'" + comparator_obj32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    org.junit.Assert.assertTrue("'" + comparator_obj43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj50);
    org.junit.Assert.assertTrue("'" + comparator_obj51 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj51.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.equals((java.lang.Object)range_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    Range<java.lang.Object> range_obj36 = Range.is((java.lang.Object)0.0d, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = range_obj36.getComparator();
    Range<java.lang.Object> range_obj38 = range_obj33.intersectionWith(range_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj40 = null;
    Range<java.lang.Object> range_obj41 = Range.is((java.lang.Object)0.0d, comparator_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj43 = null;
    Range<java.lang.Object> range_obj44 = Range.is((java.lang.Object)0.0d, comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj45 = range_obj44.getComparator();
    Range<java.lang.Object> range_obj46 = range_obj41.intersectionWith(range_obj44);
    boolean b47 = range_obj38.isBeforeRange(range_obj46);
    boolean b48 = range_obj46.isNaturalOrdering();
    Range<java.lang.Object> range_obj49 = null;
    boolean b50 = range_obj46.isAfterRange(range_obj49);
    boolean b51 = range_obj29.containsRange(range_obj46);
    boolean b52 = range_obj7.isOverlappedBy(range_obj29);
    java.lang.String str53 = range_obj7.toString();
    // The following exception was thrown during execution in test generation
    try {
    boolean b55 = range_obj7.isAfter((java.lang.Object)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    org.junit.Assert.assertTrue("'" + comparator_obj37 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj37.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    org.junit.Assert.assertTrue("'" + comparator_obj45 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj45.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[0.0..0.0]"+ "'", str53.equals("[0.0..0.0]"));

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    java.lang.Object obj8 = null;
    boolean b9 = range_obj5.isAfter(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.equals((java.lang.Object)range_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    Range<java.lang.Object> range_obj36 = Range.is((java.lang.Object)0.0d, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = range_obj36.getComparator();
    Range<java.lang.Object> range_obj38 = range_obj33.intersectionWith(range_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj40 = null;
    Range<java.lang.Object> range_obj41 = Range.is((java.lang.Object)0.0d, comparator_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj43 = null;
    Range<java.lang.Object> range_obj44 = Range.is((java.lang.Object)0.0d, comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj45 = range_obj44.getComparator();
    Range<java.lang.Object> range_obj46 = range_obj41.intersectionWith(range_obj44);
    boolean b47 = range_obj38.isBeforeRange(range_obj46);
    boolean b48 = range_obj46.isNaturalOrdering();
    Range<java.lang.Object> range_obj49 = null;
    boolean b50 = range_obj46.isAfterRange(range_obj49);
    boolean b51 = range_obj29.containsRange(range_obj46);
    boolean b52 = range_obj7.isOverlappedBy(range_obj29);
    java.lang.String str53 = range_obj7.toString();
    java.lang.Object obj54 = null;
    boolean b55 = range_obj7.isBefore(obj54);
    java.lang.Object obj56 = null;
    boolean b57 = range_obj7.equals(obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    org.junit.Assert.assertTrue("'" + comparator_obj37 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj37.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    org.junit.Assert.assertTrue("'" + comparator_obj45 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj45.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[0.0..0.0]"+ "'", str53.equals("[0.0..0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.lang.Object obj22 = range_obj19.getMaximum();
    Range<java.lang.Object> range_obj23 = range_obj2.intersectionWith(range_obj19);
    Range<java.lang.Object> range_obj24 = null;
    boolean b25 = range_obj19.isAfterRange(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d+ "'", obj22.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.is((java.lang.Object)0.0d, comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = range_obj13.getComparator();
    Range<java.lang.Object> range_obj15 = range_obj10.intersectionWith(range_obj13);
    boolean b16 = range_obj7.isBeforeRange(range_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj21 = null;
    Range<java.lang.Object> range_obj22 = Range.is((java.lang.Object)0.0d, comparator_obj21);
    java.util.Comparator<java.lang.Object> comparator_obj23 = range_obj22.getComparator();
    Range<java.lang.Object> range_obj24 = range_obj19.intersectionWith(range_obj22);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj29 = null;
    Range<java.lang.Object> range_obj30 = Range.is((java.lang.Object)0.0d, comparator_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj31 = range_obj30.getComparator();
    Range<java.lang.Object> range_obj32 = range_obj27.intersectionWith(range_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    Range<java.lang.Object> range_obj35 = Range.is((java.lang.Object)0.0d, comparator_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj37 = null;
    Range<java.lang.Object> range_obj38 = Range.is((java.lang.Object)0.0d, comparator_obj37);
    java.util.Comparator<java.lang.Object> comparator_obj39 = range_obj38.getComparator();
    Range<java.lang.Object> range_obj40 = range_obj35.intersectionWith(range_obj38);
    boolean b41 = range_obj32.isBeforeRange(range_obj40);
    boolean b42 = range_obj40.isNaturalOrdering();
    Range<java.lang.Object> range_obj43 = null;
    boolean b44 = range_obj40.isAfterRange(range_obj43);
    Range<java.lang.Object> range_obj45 = range_obj22.intersectionWith(range_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj47 = null;
    Range<java.lang.Object> range_obj48 = Range.is((java.lang.Object)0.0d, comparator_obj47);
    java.util.Comparator<java.lang.Object> comparator_obj50 = null;
    Range<java.lang.Object> range_obj51 = Range.is((java.lang.Object)0.0d, comparator_obj50);
    java.util.Comparator<java.lang.Object> comparator_obj52 = range_obj51.getComparator();
    Range<java.lang.Object> range_obj53 = range_obj48.intersectionWith(range_obj51);
    java.util.Comparator<java.lang.Object> comparator_obj55 = null;
    Range<java.lang.Object> range_obj56 = Range.is((java.lang.Object)0.0d, comparator_obj55);
    java.util.Comparator<java.lang.Object> comparator_obj58 = null;
    Range<java.lang.Object> range_obj59 = Range.is((java.lang.Object)0.0d, comparator_obj58);
    java.util.Comparator<java.lang.Object> comparator_obj60 = range_obj59.getComparator();
    Range<java.lang.Object> range_obj61 = range_obj56.intersectionWith(range_obj59);
    boolean b62 = range_obj53.isBeforeRange(range_obj61);
    java.util.Comparator<java.lang.Object> comparator_obj64 = null;
    Range<java.lang.Object> range_obj65 = Range.is((java.lang.Object)0.0d, comparator_obj64);
    java.util.Comparator<java.lang.Object> comparator_obj67 = null;
    Range<java.lang.Object> range_obj68 = Range.is((java.lang.Object)0.0d, comparator_obj67);
    java.util.Comparator<java.lang.Object> comparator_obj69 = range_obj68.getComparator();
    Range<java.lang.Object> range_obj70 = range_obj65.intersectionWith(range_obj68);
    java.util.Comparator<java.lang.Object> comparator_obj72 = null;
    Range<java.lang.Object> range_obj73 = Range.is((java.lang.Object)0.0d, comparator_obj72);
    java.util.Comparator<java.lang.Object> comparator_obj75 = null;
    Range<java.lang.Object> range_obj76 = Range.is((java.lang.Object)0.0d, comparator_obj75);
    java.util.Comparator<java.lang.Object> comparator_obj77 = range_obj76.getComparator();
    Range<java.lang.Object> range_obj78 = range_obj73.intersectionWith(range_obj76);
    boolean b79 = range_obj70.isBeforeRange(range_obj78);
    boolean b80 = range_obj78.isNaturalOrdering();
    Range<java.lang.Object> range_obj81 = null;
    boolean b82 = range_obj78.isAfterRange(range_obj81);
    boolean b83 = range_obj61.containsRange(range_obj78);
    boolean b84 = range_obj40.isOverlappedBy(range_obj78);
    // The following exception was thrown during execution in test generation
    try {
    boolean b85 = range_obj7.isBefore((java.lang.Object)range_obj40);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);
    org.junit.Assert.assertTrue("'" + comparator_obj14 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj14.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj22);
    org.junit.Assert.assertTrue("'" + comparator_obj23 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj23.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj30);
    org.junit.Assert.assertTrue("'" + comparator_obj31 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj31.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    org.junit.Assert.assertTrue("'" + comparator_obj39 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj39.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj51);
    org.junit.Assert.assertTrue("'" + comparator_obj52 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj52.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj59);
    org.junit.Assert.assertTrue("'" + comparator_obj60 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj60.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj68);
    org.junit.Assert.assertTrue("'" + comparator_obj69 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj69.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj76);
    org.junit.Assert.assertTrue("'" + comparator_obj77 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj77.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.equals((java.lang.Object)range_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    Range<java.lang.Object> range_obj36 = Range.is((java.lang.Object)0.0d, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = range_obj36.getComparator();
    Range<java.lang.Object> range_obj38 = range_obj33.intersectionWith(range_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj40 = null;
    Range<java.lang.Object> range_obj41 = Range.is((java.lang.Object)0.0d, comparator_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj43 = null;
    Range<java.lang.Object> range_obj44 = Range.is((java.lang.Object)0.0d, comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj45 = range_obj44.getComparator();
    Range<java.lang.Object> range_obj46 = range_obj41.intersectionWith(range_obj44);
    boolean b47 = range_obj38.isBeforeRange(range_obj46);
    boolean b48 = range_obj46.isNaturalOrdering();
    Range<java.lang.Object> range_obj49 = null;
    boolean b50 = range_obj46.isAfterRange(range_obj49);
    boolean b51 = range_obj29.containsRange(range_obj46);
    boolean b52 = range_obj7.isOverlappedBy(range_obj29);
    java.lang.String str53 = range_obj7.toString();
    java.lang.Object obj54 = null;
    boolean b55 = range_obj7.isBefore(obj54);
    java.util.Comparator<java.lang.Object> comparator_obj57 = null;
    Range<java.lang.Object> range_obj58 = Range.is((java.lang.Object)0.0d, comparator_obj57);
    java.util.Comparator<java.lang.Object> comparator_obj59 = range_obj58.getComparator();
    java.lang.Object obj60 = range_obj58.getMinimum();
    java.util.Comparator<java.lang.Object> comparator_obj62 = null;
    Range<java.lang.Object> range_obj63 = Range.is((java.lang.Object)0.0d, comparator_obj62);
    java.util.Comparator<java.lang.Object> comparator_obj65 = null;
    Range<java.lang.Object> range_obj66 = Range.is((java.lang.Object)0.0d, comparator_obj65);
    java.util.Comparator<java.lang.Object> comparator_obj67 = range_obj66.getComparator();
    Range<java.lang.Object> range_obj68 = range_obj63.intersectionWith(range_obj66);
    java.lang.Object obj69 = range_obj66.getMaximum();
    boolean b70 = range_obj58.isBeforeRange(range_obj66);
    java.util.Comparator<java.lang.Object> comparator_obj71 = range_obj58.getComparator();
    // The following exception was thrown during execution in test generation
    try {
    boolean b72 = range_obj7.isAfter((java.lang.Object)range_obj58);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    org.junit.Assert.assertTrue("'" + comparator_obj37 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj37.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    org.junit.Assert.assertTrue("'" + comparator_obj45 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj45.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[0.0..0.0]"+ "'", str53.equals("[0.0..0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj58);
    org.junit.Assert.assertTrue("'" + comparator_obj59 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj59.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0.0d+ "'", obj60.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj66);
    org.junit.Assert.assertTrue("'" + comparator_obj67 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj67.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0.0d+ "'", obj69.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    org.junit.Assert.assertTrue("'" + comparator_obj71 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj71.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.equals((java.lang.Object)range_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = range_obj16.getComparator();
    // The following exception was thrown during execution in test generation
    try {
    boolean b18 = range_obj2.contains((java.lang.Object)range_obj16);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    org.junit.Assert.assertTrue("'" + comparator_obj17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj17.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    boolean b31 = range_obj29.isNaturalOrdering();
    Range<java.lang.Object> range_obj32 = range_obj2.intersectionWith(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    Range<java.lang.Object> range_obj35 = Range.is((java.lang.Object)0.0d, comparator_obj34);
    boolean b37 = range_obj35.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj39 = null;
    Range<java.lang.Object> range_obj40 = Range.is((java.lang.Object)0.0d, comparator_obj39);
    java.util.Comparator<java.lang.Object> comparator_obj42 = null;
    Range<java.lang.Object> range_obj43 = Range.is((java.lang.Object)0.0d, comparator_obj42);
    java.util.Comparator<java.lang.Object> comparator_obj44 = range_obj43.getComparator();
    Range<java.lang.Object> range_obj45 = range_obj40.intersectionWith(range_obj43);
    boolean b46 = range_obj35.isBeforeRange(range_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj48 = null;
    Range<java.lang.Object> range_obj49 = Range.is((java.lang.Object)0.0d, comparator_obj48);
    java.util.Comparator<java.lang.Object> comparator_obj51 = null;
    Range<java.lang.Object> range_obj52 = Range.is((java.lang.Object)0.0d, comparator_obj51);
    java.util.Comparator<java.lang.Object> comparator_obj53 = range_obj52.getComparator();
    Range<java.lang.Object> range_obj54 = range_obj49.intersectionWith(range_obj52);
    java.lang.Object obj55 = range_obj52.getMaximum();
    Range<java.lang.Object> range_obj56 = range_obj35.intersectionWith(range_obj52);
    Range<java.lang.Object> range_obj57 = range_obj2.intersectionWith(range_obj56);
    java.lang.Object obj58 = range_obj56.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj43);
    org.junit.Assert.assertTrue("'" + comparator_obj44 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj44.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj52);
    org.junit.Assert.assertTrue("'" + comparator_obj53 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj53.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0.0d+ "'", obj55.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0.0d+ "'", obj58.equals(0.0d));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.equals((java.lang.Object)range_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    Range<java.lang.Object> range_obj36 = Range.is((java.lang.Object)0.0d, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = range_obj36.getComparator();
    Range<java.lang.Object> range_obj38 = range_obj33.intersectionWith(range_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj40 = null;
    Range<java.lang.Object> range_obj41 = Range.is((java.lang.Object)0.0d, comparator_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj43 = null;
    Range<java.lang.Object> range_obj44 = Range.is((java.lang.Object)0.0d, comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj45 = range_obj44.getComparator();
    Range<java.lang.Object> range_obj46 = range_obj41.intersectionWith(range_obj44);
    boolean b47 = range_obj38.isBeforeRange(range_obj46);
    boolean b48 = range_obj21.containsRange(range_obj46);
    boolean b49 = range_obj7.isAfterRange(range_obj46);
    java.util.Comparator<java.lang.Object> comparator_obj50 = range_obj46.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    org.junit.Assert.assertTrue("'" + comparator_obj37 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj37.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    org.junit.Assert.assertTrue("'" + comparator_obj45 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj45.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    org.junit.Assert.assertTrue("'" + comparator_obj50 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj50.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    boolean b9 = range_obj7.equals((java.lang.Object)0.0d);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)0.0d, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj16 = range_obj15.getComparator();
    Range<java.lang.Object> range_obj17 = range_obj12.intersectionWith(range_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    Range<java.lang.Object> range_obj20 = Range.is((java.lang.Object)0.0d, comparator_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    Range<java.lang.Object> range_obj23 = Range.is((java.lang.Object)0.0d, comparator_obj22);
    java.util.Comparator<java.lang.Object> comparator_obj24 = range_obj23.getComparator();
    Range<java.lang.Object> range_obj25 = range_obj20.intersectionWith(range_obj23);
    boolean b26 = range_obj17.isBeforeRange(range_obj25);
    boolean b27 = range_obj25.isNaturalOrdering();
    boolean b28 = range_obj7.isAfterRange(range_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    Range<java.lang.Object> range_obj31 = Range.is((java.lang.Object)0.0d, comparator_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    Range<java.lang.Object> range_obj34 = Range.is((java.lang.Object)0.0d, comparator_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj35 = range_obj34.getComparator();
    Range<java.lang.Object> range_obj36 = range_obj31.intersectionWith(range_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    Range<java.lang.Object> range_obj39 = Range.is((java.lang.Object)0.0d, comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    Range<java.lang.Object> range_obj42 = Range.is((java.lang.Object)0.0d, comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj43 = range_obj42.getComparator();
    Range<java.lang.Object> range_obj44 = range_obj39.intersectionWith(range_obj42);
    boolean b45 = range_obj36.isBeforeRange(range_obj44);
    boolean b46 = range_obj44.isNaturalOrdering();
    Range<java.lang.Object> range_obj47 = null;
    boolean b48 = range_obj44.isAfterRange(range_obj47);
    boolean b49 = range_obj25.isAfterRange(range_obj44);
    java.util.Comparator<java.lang.Object> comparator_obj51 = null;
    Range<java.lang.Object> range_obj52 = Range.is((java.lang.Object)0.0d, comparator_obj51);
    java.util.Comparator<java.lang.Object> comparator_obj54 = null;
    Range<java.lang.Object> range_obj55 = Range.is((java.lang.Object)0.0d, comparator_obj54);
    java.util.Comparator<java.lang.Object> comparator_obj56 = range_obj55.getComparator();
    Range<java.lang.Object> range_obj57 = range_obj52.intersectionWith(range_obj55);
    java.util.Comparator<java.lang.Object> comparator_obj59 = null;
    Range<java.lang.Object> range_obj60 = Range.is((java.lang.Object)0.0d, comparator_obj59);
    java.util.Comparator<java.lang.Object> comparator_obj62 = null;
    Range<java.lang.Object> range_obj63 = Range.is((java.lang.Object)0.0d, comparator_obj62);
    java.util.Comparator<java.lang.Object> comparator_obj64 = range_obj63.getComparator();
    Range<java.lang.Object> range_obj65 = range_obj60.intersectionWith(range_obj63);
    java.util.Comparator<java.lang.Object> comparator_obj67 = null;
    Range<java.lang.Object> range_obj68 = Range.is((java.lang.Object)0.0d, comparator_obj67);
    java.util.Comparator<java.lang.Object> comparator_obj70 = null;
    Range<java.lang.Object> range_obj71 = Range.is((java.lang.Object)0.0d, comparator_obj70);
    java.util.Comparator<java.lang.Object> comparator_obj72 = range_obj71.getComparator();
    Range<java.lang.Object> range_obj73 = range_obj68.intersectionWith(range_obj71);
    boolean b74 = range_obj65.isBeforeRange(range_obj73);
    boolean b75 = range_obj73.isNaturalOrdering();
    Range<java.lang.Object> range_obj76 = null;
    boolean b77 = range_obj73.isAfterRange(range_obj76);
    Range<java.lang.Object> range_obj78 = range_obj55.intersectionWith(range_obj73);
    boolean b79 = range_obj25.isBeforeRange(range_obj73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    org.junit.Assert.assertTrue("'" + comparator_obj16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    org.junit.Assert.assertTrue("'" + comparator_obj24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj34);
    org.junit.Assert.assertTrue("'" + comparator_obj35 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj35.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    org.junit.Assert.assertTrue("'" + comparator_obj43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj55);
    org.junit.Assert.assertTrue("'" + comparator_obj56 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj56.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj63);
    org.junit.Assert.assertTrue("'" + comparator_obj64 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj64.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj71);
    org.junit.Assert.assertTrue("'" + comparator_obj72 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj72.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    java.util.Comparator<java.lang.Integer> comparator_i2 = null;
    Range<java.lang.Integer> range_i3 = Range.between((java.lang.Integer)(-1), (java.lang.Integer)100, comparator_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i3);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.is((java.lang.Object)0.0d, comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = range_obj13.getComparator();
    Range<java.lang.Object> range_obj15 = range_obj10.intersectionWith(range_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    Range<java.lang.Object> range_obj18 = Range.is((java.lang.Object)0.0d, comparator_obj17);
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    Range<java.lang.Object> range_obj21 = Range.is((java.lang.Object)0.0d, comparator_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj22 = range_obj21.getComparator();
    Range<java.lang.Object> range_obj23 = range_obj18.intersectionWith(range_obj21);
    boolean b24 = range_obj15.isBeforeRange(range_obj23);
    boolean b25 = range_obj23.isNaturalOrdering();
    Range<java.lang.Object> range_obj26 = null;
    boolean b27 = range_obj23.isAfterRange(range_obj26);
    Range<java.lang.Object> range_obj28 = range_obj5.intersectionWith(range_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    Range<java.lang.Object> range_obj31 = Range.is((java.lang.Object)0.0d, comparator_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    Range<java.lang.Object> range_obj34 = Range.is((java.lang.Object)0.0d, comparator_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj35 = range_obj34.getComparator();
    Range<java.lang.Object> range_obj36 = range_obj31.intersectionWith(range_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    Range<java.lang.Object> range_obj39 = Range.is((java.lang.Object)0.0d, comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    Range<java.lang.Object> range_obj42 = Range.is((java.lang.Object)0.0d, comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj43 = range_obj42.getComparator();
    Range<java.lang.Object> range_obj44 = range_obj39.intersectionWith(range_obj42);
    boolean b45 = range_obj36.isBeforeRange(range_obj44);
    java.util.Comparator<java.lang.Object> comparator_obj47 = null;
    Range<java.lang.Object> range_obj48 = Range.is((java.lang.Object)0.0d, comparator_obj47);
    java.util.Comparator<java.lang.Object> comparator_obj50 = null;
    Range<java.lang.Object> range_obj51 = Range.is((java.lang.Object)0.0d, comparator_obj50);
    java.util.Comparator<java.lang.Object> comparator_obj52 = range_obj51.getComparator();
    Range<java.lang.Object> range_obj53 = range_obj48.intersectionWith(range_obj51);
    java.util.Comparator<java.lang.Object> comparator_obj55 = null;
    Range<java.lang.Object> range_obj56 = Range.is((java.lang.Object)0.0d, comparator_obj55);
    java.util.Comparator<java.lang.Object> comparator_obj58 = null;
    Range<java.lang.Object> range_obj59 = Range.is((java.lang.Object)0.0d, comparator_obj58);
    java.util.Comparator<java.lang.Object> comparator_obj60 = range_obj59.getComparator();
    Range<java.lang.Object> range_obj61 = range_obj56.intersectionWith(range_obj59);
    boolean b62 = range_obj53.isBeforeRange(range_obj61);
    boolean b63 = range_obj61.isNaturalOrdering();
    Range<java.lang.Object> range_obj64 = null;
    boolean b65 = range_obj61.isAfterRange(range_obj64);
    boolean b66 = range_obj44.containsRange(range_obj61);
    boolean b67 = range_obj23.isOverlappedBy(range_obj61);
    java.lang.Object obj68 = range_obj61.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);
    org.junit.Assert.assertTrue("'" + comparator_obj14 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj14.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    org.junit.Assert.assertTrue("'" + comparator_obj22 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj22.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj34);
    org.junit.Assert.assertTrue("'" + comparator_obj35 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj35.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    org.junit.Assert.assertTrue("'" + comparator_obj43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj51);
    org.junit.Assert.assertTrue("'" + comparator_obj52 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj52.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj59);
    org.junit.Assert.assertTrue("'" + comparator_obj60 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj60.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0.0d+ "'", obj68.equals(0.0d));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.equals((java.lang.Object)range_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    Range<java.lang.Object> range_obj36 = Range.is((java.lang.Object)0.0d, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = range_obj36.getComparator();
    Range<java.lang.Object> range_obj38 = range_obj33.intersectionWith(range_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj40 = null;
    Range<java.lang.Object> range_obj41 = Range.is((java.lang.Object)0.0d, comparator_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj43 = null;
    Range<java.lang.Object> range_obj44 = Range.is((java.lang.Object)0.0d, comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj45 = range_obj44.getComparator();
    Range<java.lang.Object> range_obj46 = range_obj41.intersectionWith(range_obj44);
    boolean b47 = range_obj38.isBeforeRange(range_obj46);
    boolean b48 = range_obj46.isNaturalOrdering();
    Range<java.lang.Object> range_obj49 = null;
    boolean b50 = range_obj46.isAfterRange(range_obj49);
    boolean b51 = range_obj29.containsRange(range_obj46);
    boolean b52 = range_obj7.isOverlappedBy(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj54 = null;
    Range<java.lang.Object> range_obj55 = Range.is((java.lang.Object)0.0d, comparator_obj54);
    boolean b57 = range_obj55.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj59 = null;
    Range<java.lang.Object> range_obj60 = Range.is((java.lang.Object)0.0d, comparator_obj59);
    java.util.Comparator<java.lang.Object> comparator_obj62 = null;
    Range<java.lang.Object> range_obj63 = Range.is((java.lang.Object)0.0d, comparator_obj62);
    java.util.Comparator<java.lang.Object> comparator_obj64 = range_obj63.getComparator();
    Range<java.lang.Object> range_obj65 = range_obj60.intersectionWith(range_obj63);
    boolean b66 = range_obj55.isBeforeRange(range_obj63);
    java.util.Comparator<java.lang.Object> comparator_obj68 = null;
    Range<java.lang.Object> range_obj69 = Range.is((java.lang.Object)0.0d, comparator_obj68);
    java.util.Comparator<java.lang.Object> comparator_obj71 = null;
    Range<java.lang.Object> range_obj72 = Range.is((java.lang.Object)0.0d, comparator_obj71);
    java.util.Comparator<java.lang.Object> comparator_obj73 = range_obj72.getComparator();
    Range<java.lang.Object> range_obj74 = range_obj69.intersectionWith(range_obj72);
    java.lang.Object obj75 = range_obj72.getMaximum();
    Range<java.lang.Object> range_obj76 = range_obj55.intersectionWith(range_obj72);
    java.lang.Object obj77 = range_obj55.getMinimum();
    boolean b78 = range_obj7.isBeforeRange(range_obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    org.junit.Assert.assertTrue("'" + comparator_obj37 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj37.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    org.junit.Assert.assertTrue("'" + comparator_obj45 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj45.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj63);
    org.junit.Assert.assertTrue("'" + comparator_obj64 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj64.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj72);
    org.junit.Assert.assertTrue("'" + comparator_obj73 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj73.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0.0d+ "'", obj75.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0.0d+ "'", obj77.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.lang.Object obj22 = range_obj19.getMaximum();
    Range<java.lang.Object> range_obj23 = range_obj2.intersectionWith(range_obj19);
    int i25 = range_obj2.elementCompareTo((java.lang.Object)0.0d);
    boolean b26 = range_obj2.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d+ "'", obj22.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)10, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    java.util.Comparator<java.lang.Integer> comparator_i2 = null;
    Range<java.lang.Integer> range_i3 = Range.between((java.lang.Integer)1, (java.lang.Integer)100, comparator_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i3);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.equals((java.lang.Object)range_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    boolean b18 = range_obj16.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    Range<java.lang.Object> range_obj21 = Range.is((java.lang.Object)0.0d, comparator_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj25 = range_obj24.getComparator();
    Range<java.lang.Object> range_obj26 = range_obj21.intersectionWith(range_obj24);
    boolean b27 = range_obj16.equals((java.lang.Object)range_obj21);
    java.util.Comparator<java.lang.Object> comparator_obj29 = null;
    Range<java.lang.Object> range_obj30 = Range.is((java.lang.Object)0.0d, comparator_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj34 = range_obj33.getComparator();
    Range<java.lang.Object> range_obj35 = range_obj30.intersectionWith(range_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj37 = null;
    Range<java.lang.Object> range_obj38 = Range.is((java.lang.Object)0.0d, comparator_obj37);
    java.util.Comparator<java.lang.Object> comparator_obj40 = null;
    Range<java.lang.Object> range_obj41 = Range.is((java.lang.Object)0.0d, comparator_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj42 = range_obj41.getComparator();
    Range<java.lang.Object> range_obj43 = range_obj38.intersectionWith(range_obj41);
    boolean b44 = range_obj35.isBeforeRange(range_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj46 = null;
    Range<java.lang.Object> range_obj47 = Range.is((java.lang.Object)0.0d, comparator_obj46);
    java.util.Comparator<java.lang.Object> comparator_obj49 = null;
    Range<java.lang.Object> range_obj50 = Range.is((java.lang.Object)0.0d, comparator_obj49);
    java.util.Comparator<java.lang.Object> comparator_obj51 = range_obj50.getComparator();
    Range<java.lang.Object> range_obj52 = range_obj47.intersectionWith(range_obj50);
    java.util.Comparator<java.lang.Object> comparator_obj54 = null;
    Range<java.lang.Object> range_obj55 = Range.is((java.lang.Object)0.0d, comparator_obj54);
    java.util.Comparator<java.lang.Object> comparator_obj57 = null;
    Range<java.lang.Object> range_obj58 = Range.is((java.lang.Object)0.0d, comparator_obj57);
    java.util.Comparator<java.lang.Object> comparator_obj59 = range_obj58.getComparator();
    Range<java.lang.Object> range_obj60 = range_obj55.intersectionWith(range_obj58);
    boolean b61 = range_obj52.isBeforeRange(range_obj60);
    boolean b62 = range_obj60.isNaturalOrdering();
    Range<java.lang.Object> range_obj63 = null;
    boolean b64 = range_obj60.isAfterRange(range_obj63);
    boolean b65 = range_obj43.containsRange(range_obj60);
    boolean b66 = range_obj21.isOverlappedBy(range_obj43);
    // The following exception was thrown during execution in test generation
    try {
    boolean b67 = range_obj7.contains((java.lang.Object)range_obj43);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    org.junit.Assert.assertTrue("'" + comparator_obj25 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj25.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    org.junit.Assert.assertTrue("'" + comparator_obj34 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj34.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj41);
    org.junit.Assert.assertTrue("'" + comparator_obj42 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj42.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj50);
    org.junit.Assert.assertTrue("'" + comparator_obj51 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj51.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj58);
    org.junit.Assert.assertTrue("'" + comparator_obj59 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj59.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.equals((java.lang.Object)range_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    Range<java.lang.Object> range_obj36 = Range.is((java.lang.Object)0.0d, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = range_obj36.getComparator();
    Range<java.lang.Object> range_obj38 = range_obj33.intersectionWith(range_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj40 = null;
    Range<java.lang.Object> range_obj41 = Range.is((java.lang.Object)0.0d, comparator_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj43 = null;
    Range<java.lang.Object> range_obj44 = Range.is((java.lang.Object)0.0d, comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj45 = range_obj44.getComparator();
    Range<java.lang.Object> range_obj46 = range_obj41.intersectionWith(range_obj44);
    boolean b47 = range_obj38.isBeforeRange(range_obj46);
    boolean b48 = range_obj46.isNaturalOrdering();
    Range<java.lang.Object> range_obj49 = null;
    boolean b50 = range_obj46.isAfterRange(range_obj49);
    boolean b51 = range_obj29.containsRange(range_obj46);
    boolean b52 = range_obj7.isOverlappedBy(range_obj29);
    java.lang.String str53 = range_obj7.toString();
    java.lang.Object obj54 = null;
    boolean b55 = range_obj7.isBefore(obj54);
    java.util.Comparator<java.lang.Object> comparator_obj57 = null;
    Range<java.lang.Object> range_obj58 = Range.is((java.lang.Object)0.0d, comparator_obj57);
    boolean b60 = range_obj58.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj62 = null;
    Range<java.lang.Object> range_obj63 = Range.is((java.lang.Object)0.0d, comparator_obj62);
    java.util.Comparator<java.lang.Object> comparator_obj65 = null;
    Range<java.lang.Object> range_obj66 = Range.is((java.lang.Object)0.0d, comparator_obj65);
    java.util.Comparator<java.lang.Object> comparator_obj67 = range_obj66.getComparator();
    Range<java.lang.Object> range_obj68 = range_obj63.intersectionWith(range_obj66);
    boolean b69 = range_obj58.isBeforeRange(range_obj66);
    java.util.Comparator<java.lang.Object> comparator_obj71 = null;
    Range<java.lang.Object> range_obj72 = Range.is((java.lang.Object)0.0d, comparator_obj71);
    java.util.Comparator<java.lang.Object> comparator_obj74 = null;
    Range<java.lang.Object> range_obj75 = Range.is((java.lang.Object)0.0d, comparator_obj74);
    java.util.Comparator<java.lang.Object> comparator_obj76 = range_obj75.getComparator();
    Range<java.lang.Object> range_obj77 = range_obj72.intersectionWith(range_obj75);
    java.util.Comparator<java.lang.Object> comparator_obj79 = null;
    Range<java.lang.Object> range_obj80 = Range.is((java.lang.Object)0.0d, comparator_obj79);
    java.util.Comparator<java.lang.Object> comparator_obj82 = null;
    Range<java.lang.Object> range_obj83 = Range.is((java.lang.Object)0.0d, comparator_obj82);
    java.util.Comparator<java.lang.Object> comparator_obj84 = range_obj83.getComparator();
    Range<java.lang.Object> range_obj85 = range_obj80.intersectionWith(range_obj83);
    boolean b86 = range_obj77.isBeforeRange(range_obj85);
    boolean b87 = range_obj85.isNaturalOrdering();
    Range<java.lang.Object> range_obj88 = range_obj58.intersectionWith(range_obj85);
    // The following exception was thrown during execution in test generation
    try {
    boolean b89 = range_obj7.contains((java.lang.Object)range_obj88);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    org.junit.Assert.assertTrue("'" + comparator_obj37 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj37.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    org.junit.Assert.assertTrue("'" + comparator_obj45 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj45.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[0.0..0.0]"+ "'", str53.equals("[0.0..0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj66);
    org.junit.Assert.assertTrue("'" + comparator_obj67 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj67.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj75);
    org.junit.Assert.assertTrue("'" + comparator_obj76 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj76.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj83);
    org.junit.Assert.assertTrue("'" + comparator_obj84 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj84.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj88);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    java.lang.String str8 = range_obj2.toString();
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)0.0d, comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    Range<java.lang.Object> range_obj14 = Range.is((java.lang.Object)0.0d, comparator_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj15 = range_obj14.getComparator();
    Range<java.lang.Object> range_obj16 = range_obj11.intersectionWith(range_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj21 = null;
    Range<java.lang.Object> range_obj22 = Range.is((java.lang.Object)0.0d, comparator_obj21);
    java.util.Comparator<java.lang.Object> comparator_obj23 = range_obj22.getComparator();
    Range<java.lang.Object> range_obj24 = range_obj19.intersectionWith(range_obj22);
    boolean b25 = range_obj16.isBeforeRange(range_obj24);
    boolean b26 = range_obj2.containsRange(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0.0..0.0]"+ "'", str8.equals("[0.0..0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj14);
    org.junit.Assert.assertTrue("'" + comparator_obj15 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj15.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj22);
    org.junit.Assert.assertTrue("'" + comparator_obj23 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj23.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.is((java.lang.Object)0.0d, comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = range_obj13.getComparator();
    Range<java.lang.Object> range_obj15 = range_obj10.intersectionWith(range_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    Range<java.lang.Object> range_obj18 = Range.is((java.lang.Object)0.0d, comparator_obj17);
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    Range<java.lang.Object> range_obj21 = Range.is((java.lang.Object)0.0d, comparator_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj22 = range_obj21.getComparator();
    Range<java.lang.Object> range_obj23 = range_obj18.intersectionWith(range_obj21);
    boolean b24 = range_obj15.isBeforeRange(range_obj23);
    boolean b25 = range_obj23.isNaturalOrdering();
    Range<java.lang.Object> range_obj26 = null;
    boolean b27 = range_obj23.isAfterRange(range_obj26);
    Range<java.lang.Object> range_obj28 = range_obj5.intersectionWith(range_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    Range<java.lang.Object> range_obj31 = Range.is((java.lang.Object)0.0d, comparator_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    Range<java.lang.Object> range_obj34 = Range.is((java.lang.Object)0.0d, comparator_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj35 = range_obj34.getComparator();
    Range<java.lang.Object> range_obj36 = range_obj31.intersectionWith(range_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    Range<java.lang.Object> range_obj39 = Range.is((java.lang.Object)0.0d, comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    Range<java.lang.Object> range_obj42 = Range.is((java.lang.Object)0.0d, comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj43 = range_obj42.getComparator();
    Range<java.lang.Object> range_obj44 = range_obj39.intersectionWith(range_obj42);
    boolean b45 = range_obj36.isBeforeRange(range_obj44);
    java.util.Comparator<java.lang.Object> comparator_obj47 = null;
    Range<java.lang.Object> range_obj48 = Range.is((java.lang.Object)0.0d, comparator_obj47);
    java.util.Comparator<java.lang.Object> comparator_obj50 = null;
    Range<java.lang.Object> range_obj51 = Range.is((java.lang.Object)0.0d, comparator_obj50);
    java.util.Comparator<java.lang.Object> comparator_obj52 = range_obj51.getComparator();
    Range<java.lang.Object> range_obj53 = range_obj48.intersectionWith(range_obj51);
    java.util.Comparator<java.lang.Object> comparator_obj55 = null;
    Range<java.lang.Object> range_obj56 = Range.is((java.lang.Object)0.0d, comparator_obj55);
    java.util.Comparator<java.lang.Object> comparator_obj58 = null;
    Range<java.lang.Object> range_obj59 = Range.is((java.lang.Object)0.0d, comparator_obj58);
    java.util.Comparator<java.lang.Object> comparator_obj60 = range_obj59.getComparator();
    Range<java.lang.Object> range_obj61 = range_obj56.intersectionWith(range_obj59);
    boolean b62 = range_obj53.isBeforeRange(range_obj61);
    boolean b63 = range_obj61.isNaturalOrdering();
    Range<java.lang.Object> range_obj64 = null;
    boolean b65 = range_obj61.isAfterRange(range_obj64);
    boolean b66 = range_obj44.containsRange(range_obj61);
    boolean b67 = range_obj61.isNaturalOrdering();
    // The following exception was thrown during execution in test generation
    try {
    boolean b68 = range_obj5.isBefore((java.lang.Object)range_obj61);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);
    org.junit.Assert.assertTrue("'" + comparator_obj14 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj14.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    org.junit.Assert.assertTrue("'" + comparator_obj22 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj22.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj34);
    org.junit.Assert.assertTrue("'" + comparator_obj35 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj35.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    org.junit.Assert.assertTrue("'" + comparator_obj43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj51);
    org.junit.Assert.assertTrue("'" + comparator_obj52 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj52.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj59);
    org.junit.Assert.assertTrue("'" + comparator_obj60 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj60.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = range_obj2.getComparator();
    java.lang.Object obj4 = range_obj2.getMinimum();
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    Range<java.lang.Object> range_obj18 = Range.is((java.lang.Object)0.0d, comparator_obj17);
    java.util.Comparator<java.lang.Object> comparator_obj19 = range_obj18.getComparator();
    Range<java.lang.Object> range_obj20 = range_obj15.intersectionWith(range_obj18);
    boolean b21 = range_obj12.isBeforeRange(range_obj20);
    java.lang.String str23 = range_obj20.toString("");
    Range<java.lang.Object> range_obj24 = range_obj2.intersectionWith(range_obj20);
    java.lang.Object obj25 = range_obj24.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    org.junit.Assert.assertTrue("'" + comparator_obj3 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj3.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0d+ "'", obj4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj18);
    org.junit.Assert.assertTrue("'" + comparator_obj19 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj19.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0.0d+ "'", obj25.equals(0.0d));

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    Range<java.lang.Object> range_obj36 = Range.is((java.lang.Object)0.0d, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj37 = range_obj36.getComparator();
    Range<java.lang.Object> range_obj38 = range_obj33.intersectionWith(range_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj40 = null;
    Range<java.lang.Object> range_obj41 = Range.is((java.lang.Object)0.0d, comparator_obj40);
    java.util.Comparator<java.lang.Object> comparator_obj43 = null;
    Range<java.lang.Object> range_obj44 = Range.is((java.lang.Object)0.0d, comparator_obj43);
    java.util.Comparator<java.lang.Object> comparator_obj45 = range_obj44.getComparator();
    Range<java.lang.Object> range_obj46 = range_obj41.intersectionWith(range_obj44);
    boolean b47 = range_obj38.isBeforeRange(range_obj46);
    boolean b48 = range_obj46.isNaturalOrdering();
    Range<java.lang.Object> range_obj49 = null;
    boolean b50 = range_obj46.isAfterRange(range_obj49);
    boolean b51 = range_obj29.containsRange(range_obj46);
    boolean b52 = range_obj46.isNaturalOrdering();
    boolean b53 = range_obj10.containsRange(range_obj46);
    java.lang.String str54 = range_obj10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    org.junit.Assert.assertTrue("'" + comparator_obj37 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj37.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    org.junit.Assert.assertTrue("'" + comparator_obj45 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj45.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[0.0..0.0]"+ "'", str54.equals("[0.0..0.0]"));

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.lang.Object obj22 = range_obj19.getMaximum();
    Range<java.lang.Object> range_obj23 = range_obj2.intersectionWith(range_obj19);
    java.lang.Object obj24 = range_obj2.getMinimum();
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj29 = null;
    Range<java.lang.Object> range_obj30 = Range.is((java.lang.Object)0.0d, comparator_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj31 = range_obj30.getComparator();
    Range<java.lang.Object> range_obj32 = range_obj27.intersectionWith(range_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    Range<java.lang.Object> range_obj35 = Range.is((java.lang.Object)0.0d, comparator_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj37 = null;
    Range<java.lang.Object> range_obj38 = Range.is((java.lang.Object)0.0d, comparator_obj37);
    java.util.Comparator<java.lang.Object> comparator_obj39 = range_obj38.getComparator();
    Range<java.lang.Object> range_obj40 = range_obj35.intersectionWith(range_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj42 = null;
    Range<java.lang.Object> range_obj43 = Range.is((java.lang.Object)0.0d, comparator_obj42);
    java.util.Comparator<java.lang.Object> comparator_obj45 = null;
    Range<java.lang.Object> range_obj46 = Range.is((java.lang.Object)0.0d, comparator_obj45);
    java.util.Comparator<java.lang.Object> comparator_obj47 = range_obj46.getComparator();
    Range<java.lang.Object> range_obj48 = range_obj43.intersectionWith(range_obj46);
    boolean b49 = range_obj40.isBeforeRange(range_obj48);
    boolean b50 = range_obj48.isNaturalOrdering();
    Range<java.lang.Object> range_obj51 = null;
    boolean b52 = range_obj48.isAfterRange(range_obj51);
    Range<java.lang.Object> range_obj53 = range_obj30.intersectionWith(range_obj48);
    java.util.Comparator<java.lang.Object> comparator_obj55 = null;
    Range<java.lang.Object> range_obj56 = Range.is((java.lang.Object)0.0d, comparator_obj55);
    java.util.Comparator<java.lang.Object> comparator_obj58 = null;
    Range<java.lang.Object> range_obj59 = Range.is((java.lang.Object)0.0d, comparator_obj58);
    java.util.Comparator<java.lang.Object> comparator_obj60 = range_obj59.getComparator();
    Range<java.lang.Object> range_obj61 = range_obj56.intersectionWith(range_obj59);
    java.util.Comparator<java.lang.Object> comparator_obj63 = null;
    Range<java.lang.Object> range_obj64 = Range.is((java.lang.Object)0.0d, comparator_obj63);
    java.util.Comparator<java.lang.Object> comparator_obj66 = null;
    Range<java.lang.Object> range_obj67 = Range.is((java.lang.Object)0.0d, comparator_obj66);
    java.util.Comparator<java.lang.Object> comparator_obj68 = range_obj67.getComparator();
    Range<java.lang.Object> range_obj69 = range_obj64.intersectionWith(range_obj67);
    boolean b70 = range_obj61.isBeforeRange(range_obj69);
    java.util.Comparator<java.lang.Object> comparator_obj72 = null;
    Range<java.lang.Object> range_obj73 = Range.is((java.lang.Object)0.0d, comparator_obj72);
    java.util.Comparator<java.lang.Object> comparator_obj75 = null;
    Range<java.lang.Object> range_obj76 = Range.is((java.lang.Object)0.0d, comparator_obj75);
    java.util.Comparator<java.lang.Object> comparator_obj77 = range_obj76.getComparator();
    Range<java.lang.Object> range_obj78 = range_obj73.intersectionWith(range_obj76);
    java.util.Comparator<java.lang.Object> comparator_obj80 = null;
    Range<java.lang.Object> range_obj81 = Range.is((java.lang.Object)0.0d, comparator_obj80);
    java.util.Comparator<java.lang.Object> comparator_obj83 = null;
    Range<java.lang.Object> range_obj84 = Range.is((java.lang.Object)0.0d, comparator_obj83);
    java.util.Comparator<java.lang.Object> comparator_obj85 = range_obj84.getComparator();
    Range<java.lang.Object> range_obj86 = range_obj81.intersectionWith(range_obj84);
    boolean b87 = range_obj78.isBeforeRange(range_obj86);
    boolean b88 = range_obj86.isNaturalOrdering();
    Range<java.lang.Object> range_obj89 = null;
    boolean b90 = range_obj86.isAfterRange(range_obj89);
    boolean b91 = range_obj69.containsRange(range_obj86);
    boolean b92 = range_obj48.isOverlappedBy(range_obj86);
    boolean b93 = range_obj2.containsRange(range_obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d+ "'", obj22.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d+ "'", obj24.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj30);
    org.junit.Assert.assertTrue("'" + comparator_obj31 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj31.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    org.junit.Assert.assertTrue("'" + comparator_obj39 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj39.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj46);
    org.junit.Assert.assertTrue("'" + comparator_obj47 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj47.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj59);
    org.junit.Assert.assertTrue("'" + comparator_obj60 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj60.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj67);
    org.junit.Assert.assertTrue("'" + comparator_obj68 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj68.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj76);
    org.junit.Assert.assertTrue("'" + comparator_obj77 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj77.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj84);
    org.junit.Assert.assertTrue("'" + comparator_obj85 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj85.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    boolean b18 = range_obj16.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    Range<java.lang.Object> range_obj21 = Range.is((java.lang.Object)0.0d, comparator_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj25 = range_obj24.getComparator();
    Range<java.lang.Object> range_obj26 = range_obj21.intersectionWith(range_obj24);
    boolean b27 = range_obj16.isBeforeRange(range_obj24);
    java.util.Comparator<java.lang.Object> comparator_obj29 = null;
    Range<java.lang.Object> range_obj30 = Range.is((java.lang.Object)0.0d, comparator_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj32 = null;
    Range<java.lang.Object> range_obj33 = Range.is((java.lang.Object)0.0d, comparator_obj32);
    java.util.Comparator<java.lang.Object> comparator_obj34 = range_obj33.getComparator();
    Range<java.lang.Object> range_obj35 = range_obj30.intersectionWith(range_obj33);
    java.lang.Object obj36 = range_obj33.getMaximum();
    Range<java.lang.Object> range_obj37 = range_obj16.intersectionWith(range_obj33);
    java.lang.Object obj38 = range_obj16.getMinimum();
    boolean b39 = range_obj2.isOverlappedBy(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    org.junit.Assert.assertTrue("'" + comparator_obj25 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj25.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj33);
    org.junit.Assert.assertTrue("'" + comparator_obj34 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj34.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0.0d+ "'", obj36.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0.0d+ "'", obj38.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    boolean b9 = range_obj7.equals((java.lang.Object)0.0d);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)0.0d, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj16 = range_obj15.getComparator();
    Range<java.lang.Object> range_obj17 = range_obj12.intersectionWith(range_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    Range<java.lang.Object> range_obj20 = Range.is((java.lang.Object)0.0d, comparator_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    Range<java.lang.Object> range_obj23 = Range.is((java.lang.Object)0.0d, comparator_obj22);
    java.util.Comparator<java.lang.Object> comparator_obj24 = range_obj23.getComparator();
    Range<java.lang.Object> range_obj25 = range_obj20.intersectionWith(range_obj23);
    boolean b26 = range_obj17.isBeforeRange(range_obj25);
    boolean b27 = range_obj25.isNaturalOrdering();
    boolean b28 = range_obj7.isAfterRange(range_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    Range<java.lang.Object> range_obj31 = Range.is((java.lang.Object)0.0d, comparator_obj30);
    boolean b33 = range_obj31.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj35 = null;
    Range<java.lang.Object> range_obj36 = Range.is((java.lang.Object)0.0d, comparator_obj35);
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    Range<java.lang.Object> range_obj39 = Range.is((java.lang.Object)0.0d, comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj40 = range_obj39.getComparator();
    Range<java.lang.Object> range_obj41 = range_obj36.intersectionWith(range_obj39);
    boolean b42 = range_obj31.equals((java.lang.Object)range_obj36);
    java.util.Comparator<java.lang.Object> comparator_obj44 = null;
    Range<java.lang.Object> range_obj45 = Range.is((java.lang.Object)0.0d, comparator_obj44);
    java.util.Comparator<java.lang.Object> comparator_obj47 = null;
    Range<java.lang.Object> range_obj48 = Range.is((java.lang.Object)0.0d, comparator_obj47);
    java.util.Comparator<java.lang.Object> comparator_obj49 = range_obj48.getComparator();
    Range<java.lang.Object> range_obj50 = range_obj45.intersectionWith(range_obj48);
    java.util.Comparator<java.lang.Object> comparator_obj52 = null;
    Range<java.lang.Object> range_obj53 = Range.is((java.lang.Object)0.0d, comparator_obj52);
    java.util.Comparator<java.lang.Object> comparator_obj55 = null;
    Range<java.lang.Object> range_obj56 = Range.is((java.lang.Object)0.0d, comparator_obj55);
    java.util.Comparator<java.lang.Object> comparator_obj57 = range_obj56.getComparator();
    Range<java.lang.Object> range_obj58 = range_obj53.intersectionWith(range_obj56);
    boolean b59 = range_obj50.isBeforeRange(range_obj58);
    java.util.Comparator<java.lang.Object> comparator_obj61 = null;
    Range<java.lang.Object> range_obj62 = Range.is((java.lang.Object)0.0d, comparator_obj61);
    java.util.Comparator<java.lang.Object> comparator_obj64 = null;
    Range<java.lang.Object> range_obj65 = Range.is((java.lang.Object)0.0d, comparator_obj64);
    java.util.Comparator<java.lang.Object> comparator_obj66 = range_obj65.getComparator();
    Range<java.lang.Object> range_obj67 = range_obj62.intersectionWith(range_obj65);
    java.util.Comparator<java.lang.Object> comparator_obj69 = null;
    Range<java.lang.Object> range_obj70 = Range.is((java.lang.Object)0.0d, comparator_obj69);
    java.util.Comparator<java.lang.Object> comparator_obj72 = null;
    Range<java.lang.Object> range_obj73 = Range.is((java.lang.Object)0.0d, comparator_obj72);
    java.util.Comparator<java.lang.Object> comparator_obj74 = range_obj73.getComparator();
    Range<java.lang.Object> range_obj75 = range_obj70.intersectionWith(range_obj73);
    boolean b76 = range_obj67.isBeforeRange(range_obj75);
    boolean b77 = range_obj75.isNaturalOrdering();
    Range<java.lang.Object> range_obj78 = null;
    boolean b79 = range_obj75.isAfterRange(range_obj78);
    boolean b80 = range_obj58.containsRange(range_obj75);
    boolean b81 = range_obj36.isOverlappedBy(range_obj58);
    boolean b82 = range_obj25.equals((java.lang.Object)range_obj58);
    // The following exception was thrown during execution in test generation
    try {
    boolean b84 = range_obj58.isAfter((java.lang.Object)false);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    org.junit.Assert.assertTrue("'" + comparator_obj16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    org.junit.Assert.assertTrue("'" + comparator_obj24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj39);
    org.junit.Assert.assertTrue("'" + comparator_obj40 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj40.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj48);
    org.junit.Assert.assertTrue("'" + comparator_obj49 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj49.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj56);
    org.junit.Assert.assertTrue("'" + comparator_obj57 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj57.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj65);
    org.junit.Assert.assertTrue("'" + comparator_obj66 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj66.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj73);
    org.junit.Assert.assertTrue("'" + comparator_obj74 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj74.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.lang.Object obj22 = range_obj19.getMaximum();
    Range<java.lang.Object> range_obj23 = range_obj2.intersectionWith(range_obj19);
    java.lang.Object obj24 = range_obj2.getMinimum();
    java.lang.String str26 = range_obj2.toString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0.0d+ "'", obj22.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0.0d+ "'", obj24.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    boolean b9 = range_obj7.equals((java.lang.Object)0.0d);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)0.0d, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj16 = range_obj15.getComparator();
    Range<java.lang.Object> range_obj17 = range_obj12.intersectionWith(range_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    Range<java.lang.Object> range_obj20 = Range.is((java.lang.Object)0.0d, comparator_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    Range<java.lang.Object> range_obj23 = Range.is((java.lang.Object)0.0d, comparator_obj22);
    java.util.Comparator<java.lang.Object> comparator_obj24 = range_obj23.getComparator();
    Range<java.lang.Object> range_obj25 = range_obj20.intersectionWith(range_obj23);
    boolean b26 = range_obj17.isBeforeRange(range_obj25);
    boolean b27 = range_obj25.isNaturalOrdering();
    boolean b28 = range_obj7.isAfterRange(range_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    Range<java.lang.Object> range_obj31 = Range.is((java.lang.Object)0.0d, comparator_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    Range<java.lang.Object> range_obj34 = Range.is((java.lang.Object)0.0d, comparator_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj35 = range_obj34.getComparator();
    Range<java.lang.Object> range_obj36 = range_obj31.intersectionWith(range_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    Range<java.lang.Object> range_obj39 = Range.is((java.lang.Object)0.0d, comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    Range<java.lang.Object> range_obj42 = Range.is((java.lang.Object)0.0d, comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj43 = range_obj42.getComparator();
    Range<java.lang.Object> range_obj44 = range_obj39.intersectionWith(range_obj42);
    boolean b45 = range_obj36.isBeforeRange(range_obj44);
    boolean b46 = range_obj44.isNaturalOrdering();
    Range<java.lang.Object> range_obj47 = null;
    boolean b48 = range_obj44.isAfterRange(range_obj47);
    boolean b49 = range_obj25.isAfterRange(range_obj44);
    java.lang.String str50 = range_obj44.toString();
    boolean b51 = range_obj44.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    org.junit.Assert.assertTrue("'" + comparator_obj16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    org.junit.Assert.assertTrue("'" + comparator_obj24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj34);
    org.junit.Assert.assertTrue("'" + comparator_obj35 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj35.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    org.junit.Assert.assertTrue("'" + comparator_obj43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[0.0..0.0]"+ "'", str50.equals("[0.0..0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.lang.String str6 = range_obj2.toString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    boolean b9 = range_obj7.equals((java.lang.Object)0.0d);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)0.0d, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj16 = range_obj15.getComparator();
    Range<java.lang.Object> range_obj17 = range_obj12.intersectionWith(range_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    Range<java.lang.Object> range_obj20 = Range.is((java.lang.Object)0.0d, comparator_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    Range<java.lang.Object> range_obj23 = Range.is((java.lang.Object)0.0d, comparator_obj22);
    java.util.Comparator<java.lang.Object> comparator_obj24 = range_obj23.getComparator();
    Range<java.lang.Object> range_obj25 = range_obj20.intersectionWith(range_obj23);
    boolean b26 = range_obj17.isBeforeRange(range_obj25);
    boolean b27 = range_obj25.isNaturalOrdering();
    boolean b28 = range_obj7.isAfterRange(range_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    Range<java.lang.Object> range_obj31 = Range.is((java.lang.Object)0.0d, comparator_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    Range<java.lang.Object> range_obj34 = Range.is((java.lang.Object)0.0d, comparator_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj35 = range_obj34.getComparator();
    Range<java.lang.Object> range_obj36 = range_obj31.intersectionWith(range_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    Range<java.lang.Object> range_obj39 = Range.is((java.lang.Object)0.0d, comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    Range<java.lang.Object> range_obj42 = Range.is((java.lang.Object)0.0d, comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj43 = range_obj42.getComparator();
    Range<java.lang.Object> range_obj44 = range_obj39.intersectionWith(range_obj42);
    boolean b45 = range_obj36.isBeforeRange(range_obj44);
    boolean b46 = range_obj44.isNaturalOrdering();
    Range<java.lang.Object> range_obj47 = null;
    boolean b48 = range_obj44.isAfterRange(range_obj47);
    boolean b49 = range_obj25.isAfterRange(range_obj44);
    java.lang.String str50 = range_obj44.toString();
    java.util.Comparator<java.lang.Integer> comparator_i53 = null;
    Range<java.lang.Integer> range_i54 = Range.between((java.lang.Integer)10, (java.lang.Integer)0, comparator_i53);
    // The following exception was thrown during execution in test generation
    try {
    boolean b55 = range_obj44.isAfter((java.lang.Object)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    org.junit.Assert.assertTrue("'" + comparator_obj16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    org.junit.Assert.assertTrue("'" + comparator_obj24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj34);
    org.junit.Assert.assertTrue("'" + comparator_obj35 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj35.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    org.junit.Assert.assertTrue("'" + comparator_obj43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "[0.0..0.0]"+ "'", str50.equals("[0.0..0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i54);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = range_obj2.getComparator();
    java.lang.Object obj4 = range_obj2.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    org.junit.Assert.assertTrue("'" + comparator_obj3 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj3.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0d+ "'", obj4.equals(0.0d));

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b14 = range_obj12.equals((java.lang.Object)0.0d);
    java.util.Comparator<java.lang.Object> comparator_obj16 = null;
    Range<java.lang.Object> range_obj17 = Range.is((java.lang.Object)0.0d, comparator_obj16);
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    Range<java.lang.Object> range_obj20 = Range.is((java.lang.Object)0.0d, comparator_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj21 = range_obj20.getComparator();
    Range<java.lang.Object> range_obj22 = range_obj17.intersectionWith(range_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj24 = null;
    Range<java.lang.Object> range_obj25 = Range.is((java.lang.Object)0.0d, comparator_obj24);
    java.util.Comparator<java.lang.Object> comparator_obj27 = null;
    Range<java.lang.Object> range_obj28 = Range.is((java.lang.Object)0.0d, comparator_obj27);
    java.util.Comparator<java.lang.Object> comparator_obj29 = range_obj28.getComparator();
    Range<java.lang.Object> range_obj30 = range_obj25.intersectionWith(range_obj28);
    boolean b31 = range_obj22.isBeforeRange(range_obj30);
    boolean b32 = range_obj30.isNaturalOrdering();
    boolean b33 = range_obj12.isBeforeRange(range_obj30);
    boolean b34 = range_obj2.containsRange(range_obj30);
    java.lang.String str36 = range_obj2.toString("[0.0..0.0]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    org.junit.Assert.assertTrue("'" + comparator_obj21 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj21.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj28);
    org.junit.Assert.assertTrue("'" + comparator_obj29 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj29.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[0.0..0.0]"+ "'", str36.equals("[0.0..0.0]"));

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    boolean b4 = range_obj2.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0.0d, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = range_obj10.getComparator();
    Range<java.lang.Object> range_obj12 = range_obj7.intersectionWith(range_obj10);
    boolean b13 = range_obj2.isBeforeRange(range_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)0.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.is((java.lang.Object)0.0d, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = range_obj19.getComparator();
    Range<java.lang.Object> range_obj21 = range_obj16.intersectionWith(range_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj23 = null;
    Range<java.lang.Object> range_obj24 = Range.is((java.lang.Object)0.0d, comparator_obj23);
    java.util.Comparator<java.lang.Object> comparator_obj26 = null;
    Range<java.lang.Object> range_obj27 = Range.is((java.lang.Object)0.0d, comparator_obj26);
    java.util.Comparator<java.lang.Object> comparator_obj28 = range_obj27.getComparator();
    Range<java.lang.Object> range_obj29 = range_obj24.intersectionWith(range_obj27);
    boolean b30 = range_obj21.isBeforeRange(range_obj29);
    boolean b31 = range_obj29.isNaturalOrdering();
    Range<java.lang.Object> range_obj32 = range_obj2.intersectionWith(range_obj29);
    java.util.Comparator<java.lang.Object> comparator_obj34 = null;
    Range<java.lang.Object> range_obj35 = Range.is((java.lang.Object)0.0d, comparator_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj37 = null;
    Range<java.lang.Object> range_obj38 = Range.is((java.lang.Object)0.0d, comparator_obj37);
    java.util.Comparator<java.lang.Object> comparator_obj39 = range_obj38.getComparator();
    Range<java.lang.Object> range_obj40 = range_obj35.intersectionWith(range_obj38);
    boolean b42 = range_obj40.equals((java.lang.Object)0.0d);
    java.util.Comparator<java.lang.Object> comparator_obj44 = null;
    Range<java.lang.Object> range_obj45 = Range.is((java.lang.Object)0.0d, comparator_obj44);
    java.util.Comparator<java.lang.Object> comparator_obj47 = null;
    Range<java.lang.Object> range_obj48 = Range.is((java.lang.Object)0.0d, comparator_obj47);
    java.util.Comparator<java.lang.Object> comparator_obj49 = range_obj48.getComparator();
    Range<java.lang.Object> range_obj50 = range_obj45.intersectionWith(range_obj48);
    java.util.Comparator<java.lang.Object> comparator_obj52 = null;
    Range<java.lang.Object> range_obj53 = Range.is((java.lang.Object)0.0d, comparator_obj52);
    java.util.Comparator<java.lang.Object> comparator_obj55 = null;
    Range<java.lang.Object> range_obj56 = Range.is((java.lang.Object)0.0d, comparator_obj55);
    java.util.Comparator<java.lang.Object> comparator_obj57 = range_obj56.getComparator();
    Range<java.lang.Object> range_obj58 = range_obj53.intersectionWith(range_obj56);
    boolean b59 = range_obj50.isBeforeRange(range_obj58);
    boolean b60 = range_obj58.isNaturalOrdering();
    boolean b61 = range_obj40.isAfterRange(range_obj58);
    java.util.Comparator<java.lang.Object> comparator_obj63 = null;
    Range<java.lang.Object> range_obj64 = Range.is((java.lang.Object)0.0d, comparator_obj63);
    java.util.Comparator<java.lang.Object> comparator_obj66 = null;
    Range<java.lang.Object> range_obj67 = Range.is((java.lang.Object)0.0d, comparator_obj66);
    java.util.Comparator<java.lang.Object> comparator_obj68 = range_obj67.getComparator();
    Range<java.lang.Object> range_obj69 = range_obj64.intersectionWith(range_obj67);
    boolean b71 = range_obj69.equals((java.lang.Object)0.0d);
    java.lang.String str72 = range_obj69.toString();
    boolean b73 = range_obj40.containsRange(range_obj69);
    // The following exception was thrown during execution in test generation
    try {
    boolean b74 = range_obj29.isBefore((java.lang.Object)range_obj69);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    org.junit.Assert.assertTrue("'" + comparator_obj11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    org.junit.Assert.assertTrue("'" + comparator_obj20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj27);
    org.junit.Assert.assertTrue("'" + comparator_obj28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj38);
    org.junit.Assert.assertTrue("'" + comparator_obj39 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj39.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj48);
    org.junit.Assert.assertTrue("'" + comparator_obj49 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj49.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj56);
    org.junit.Assert.assertTrue("'" + comparator_obj57 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj57.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj67);
    org.junit.Assert.assertTrue("'" + comparator_obj68 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj68.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "[0.0..0.0]"+ "'", str72.equals("[0.0..0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = range_obj5.getComparator();
    Range<java.lang.Object> range_obj7 = range_obj2.intersectionWith(range_obj5);
    boolean b9 = range_obj7.equals((java.lang.Object)0.0d);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)0.0d, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)0.0d, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj16 = range_obj15.getComparator();
    Range<java.lang.Object> range_obj17 = range_obj12.intersectionWith(range_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    Range<java.lang.Object> range_obj20 = Range.is((java.lang.Object)0.0d, comparator_obj19);
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    Range<java.lang.Object> range_obj23 = Range.is((java.lang.Object)0.0d, comparator_obj22);
    java.util.Comparator<java.lang.Object> comparator_obj24 = range_obj23.getComparator();
    Range<java.lang.Object> range_obj25 = range_obj20.intersectionWith(range_obj23);
    boolean b26 = range_obj17.isBeforeRange(range_obj25);
    boolean b27 = range_obj25.isNaturalOrdering();
    boolean b28 = range_obj7.isAfterRange(range_obj25);
    java.util.Comparator<java.lang.Object> comparator_obj30 = null;
    Range<java.lang.Object> range_obj31 = Range.is((java.lang.Object)0.0d, comparator_obj30);
    java.util.Comparator<java.lang.Object> comparator_obj33 = null;
    Range<java.lang.Object> range_obj34 = Range.is((java.lang.Object)0.0d, comparator_obj33);
    java.util.Comparator<java.lang.Object> comparator_obj35 = range_obj34.getComparator();
    Range<java.lang.Object> range_obj36 = range_obj31.intersectionWith(range_obj34);
    java.util.Comparator<java.lang.Object> comparator_obj38 = null;
    Range<java.lang.Object> range_obj39 = Range.is((java.lang.Object)0.0d, comparator_obj38);
    java.util.Comparator<java.lang.Object> comparator_obj41 = null;
    Range<java.lang.Object> range_obj42 = Range.is((java.lang.Object)0.0d, comparator_obj41);
    java.util.Comparator<java.lang.Object> comparator_obj43 = range_obj42.getComparator();
    Range<java.lang.Object> range_obj44 = range_obj39.intersectionWith(range_obj42);
    boolean b45 = range_obj36.isBeforeRange(range_obj44);
    boolean b46 = range_obj44.isNaturalOrdering();
    Range<java.lang.Object> range_obj47 = null;
    boolean b48 = range_obj44.isAfterRange(range_obj47);
    boolean b49 = range_obj25.isAfterRange(range_obj44);
    java.util.Comparator<java.lang.Object> comparator_obj51 = null;
    Range<java.lang.Object> range_obj52 = Range.is((java.lang.Object)0.0d, comparator_obj51);
    boolean b54 = range_obj52.equals((java.lang.Object)'a');
    java.util.Comparator<java.lang.Object> comparator_obj56 = null;
    Range<java.lang.Object> range_obj57 = Range.is((java.lang.Object)0.0d, comparator_obj56);
    java.util.Comparator<java.lang.Object> comparator_obj59 = null;
    Range<java.lang.Object> range_obj60 = Range.is((java.lang.Object)0.0d, comparator_obj59);
    java.util.Comparator<java.lang.Object> comparator_obj61 = range_obj60.getComparator();
    Range<java.lang.Object> range_obj62 = range_obj57.intersectionWith(range_obj60);
    boolean b63 = range_obj52.isBeforeRange(range_obj60);
    java.util.Comparator<java.lang.Object> comparator_obj65 = null;
    Range<java.lang.Object> range_obj66 = Range.is((java.lang.Object)0.0d, comparator_obj65);
    java.util.Comparator<java.lang.Object> comparator_obj68 = null;
    Range<java.lang.Object> range_obj69 = Range.is((java.lang.Object)0.0d, comparator_obj68);
    java.util.Comparator<java.lang.Object> comparator_obj70 = range_obj69.getComparator();
    Range<java.lang.Object> range_obj71 = range_obj66.intersectionWith(range_obj69);
    java.lang.Object obj72 = range_obj69.getMaximum();
    Range<java.lang.Object> range_obj73 = range_obj52.intersectionWith(range_obj69);
    java.lang.String str75 = range_obj73.toString("");
    boolean b76 = range_obj25.isOverlappedBy(range_obj73);
    java.util.Comparator<java.lang.Object> comparator_obj78 = null;
    Range<java.lang.Object> range_obj79 = Range.is((java.lang.Object)0.0d, comparator_obj78);
    java.util.Comparator<java.lang.Object> comparator_obj81 = null;
    Range<java.lang.Object> range_obj82 = Range.is((java.lang.Object)0.0d, comparator_obj81);
    java.util.Comparator<java.lang.Object> comparator_obj83 = range_obj82.getComparator();
    Range<java.lang.Object> range_obj84 = range_obj79.intersectionWith(range_obj82);
    java.util.Comparator<java.lang.Object> comparator_obj86 = null;
    Range<java.lang.Object> range_obj87 = Range.is((java.lang.Object)0.0d, comparator_obj86);
    java.util.Comparator<java.lang.Object> comparator_obj89 = null;
    Range<java.lang.Object> range_obj90 = Range.is((java.lang.Object)0.0d, comparator_obj89);
    java.util.Comparator<java.lang.Object> comparator_obj91 = range_obj90.getComparator();
    Range<java.lang.Object> range_obj92 = range_obj87.intersectionWith(range_obj90);
    boolean b93 = range_obj84.isBeforeRange(range_obj92);
    boolean b94 = range_obj92.isNaturalOrdering();
    boolean b95 = range_obj25.isBeforeRange(range_obj92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    org.junit.Assert.assertTrue("'" + comparator_obj6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);
    org.junit.Assert.assertTrue("'" + comparator_obj16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj23);
    org.junit.Assert.assertTrue("'" + comparator_obj24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj34);
    org.junit.Assert.assertTrue("'" + comparator_obj35 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj35.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj42);
    org.junit.Assert.assertTrue("'" + comparator_obj43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj60);
    org.junit.Assert.assertTrue("'" + comparator_obj61 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj61.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj69);
    org.junit.Assert.assertTrue("'" + comparator_obj70 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj70.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0.0d+ "'", obj72.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + ""+ "'", str75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj82);
    org.junit.Assert.assertTrue("'" + comparator_obj83 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj83.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj90);
    org.junit.Assert.assertTrue("'" + comparator_obj91 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_obj91.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b95 == false);

  }

}
