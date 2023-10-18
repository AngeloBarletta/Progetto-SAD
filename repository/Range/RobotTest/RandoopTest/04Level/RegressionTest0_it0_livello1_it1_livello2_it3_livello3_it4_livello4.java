package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it0_livello1_it1_livello2_it3_livello3_it4_livello4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)1.0d, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)10, (java.lang.Object)(short)100, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'#', comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'4', comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)1.0f, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(-1L), (java.lang.Object)(short)1, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)100);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.between((java.lang.Object)range_i1, (java.lang.Object)(byte)0, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)0L, (java.lang.Object)10.0d, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_long2, (java.lang.Object)10L, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)100.0d, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)0.0d, (java.lang.Object)100.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)(byte)100, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)100.0d, (java.lang.Object)range_obj8, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)1, (java.lang.Object)(byte)1, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    java.lang.Object obj0 = new java.lang.Object();
    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj2 = Range.is(obj0, comparator_obj1);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)100.0d, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'#', comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)100.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)'#', (java.lang.Object)range_obj5, comparator_obj6);
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

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)100.0d, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)0.0d, (java.lang.Object)100.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)range_obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)false, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)0L, (java.lang.Object)false, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)100.0d, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)0.0d, (java.lang.Object)100.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)10, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)range_obj5, (java.lang.Object)comparator_obj7, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)0);
    Range<java.lang.Long> range_long4 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)range_i1, (java.lang.Object)range_long4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long4);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between(obj0, (java.lang.Object)1.0d, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)-1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(byte)-1, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(byte)-1, (java.lang.Object)range_obj5, comparator_obj6);
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

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)100, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)0.0d, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)0L, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(short)0, (java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'a', comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)0, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)100);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1.0f, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)range_i1, (java.lang.Object)1.0f, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between(obj0, (java.lang.Object)0.0f, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)100, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(-1L), (java.lang.Object)100, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)100L, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(byte)-1, (java.lang.Object)10L, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)100L, (java.lang.Object)0.0d, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)0L, (java.lang.Object)false, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


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
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(-1), (java.lang.Object)range_long3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1, comparator_obj1);
    java.lang.Object obj3 = null;
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)comparator_obj1, obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between(obj0, (java.lang.Object)1L, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(-1), (java.lang.Object)(short)10, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)100.0d, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(byte)1, (java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(-1.0d), (java.lang.Object)1, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(short)10, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between(obj0, (java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(short)0, (java.lang.Object)"hi!", comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)false, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)100L, (java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1.0f, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)(short)1, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)1, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(short)1, (java.lang.Object)0L, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)range_long2, (java.lang.Object)(byte)-1, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    java.lang.Object obj0 = new java.lang.Object();
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(byte)10, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.between(obj0, (java.lang.Object)(byte)10, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)1.0f, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)1.0f, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)100, (java.lang.Object)range_obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100.0d, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)100.0d, (java.lang.Object)10L, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)1, comparator_obj1);
    java.lang.Object obj3 = null;
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)comparator_obj1, obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(byte)1, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(byte)-1, (java.lang.Object)range_obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)(-1.0f), comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)100.0d, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)0.0d, (java.lang.Object)100.0d, comparator_obj4);
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)comparator_obj4, (java.lang.Object)10L, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)10.0d, (java.lang.Object)0L, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)false, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)1.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)range_obj5, comparator_obj6);
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

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1.0f, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(byte)-1, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)comparator_obj6, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)100, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(byte)100, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    java.lang.Object obj1 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(short)1, obj1, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)10.0d, (java.lang.Object)range_long3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)100);
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)range_i1, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_long2, (java.lang.Object)0L, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)10, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)10, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)100, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)false, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)false, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)comparator_obj8, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)"hi!", (java.lang.Object)1L, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)100, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)10L, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)false, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)false, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)10L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)10L, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0L, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"hi!", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)"hi!", comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)(-1L), comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)10);
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)range_i1, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"hi!", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)"hi!", comparator_obj3);
    java.lang.Object obj5 = null;
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)comparator_obj3, obj5, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)range_long2, (java.lang.Object)0.0f, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(byte)1, (java.lang.Object)10L, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)'a', (java.lang.Object)range_long3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)100L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(short)10, (java.lang.Object)comparator_obj4, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)100L, (java.lang.Object)(byte)0, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"hi!", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)"hi!", comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    java.lang.Object obj1 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)0.0d, obj1, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)0L, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)10.0d, (java.lang.Object)comparator_obj4, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"hi!", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)(byte)-1, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)100, comparator_obj1);
    java.lang.Object obj3 = null;
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)comparator_obj1, obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)0L, (java.lang.Object)(byte)100, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)range_obj10, comparator_obj11);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)1.0f, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between(obj0, (java.lang.Object)1.0f, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)10, (java.lang.Object)100L, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)0L, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between(obj0, (java.lang.Object)true, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"hi!", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)10L, (java.lang.Object)(short)0, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)1.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(-1L), (java.lang.Object)1.0d, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(short)100, (java.lang.Object)true, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)10, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)(short)-1, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)(short)0, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)10L, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)(-1), comparator_obj7);
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
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0d), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1.0d), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0d), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)10.0d, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"hi!", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)"hi!", (java.lang.Object)(short)10, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)1L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(-1L), (java.lang.Object)1L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)range_obj9, comparator_obj10);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)0);
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)range_i1, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    java.lang.Object obj0 = null;
    java.lang.Object obj1 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between(obj0, obj1, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)0);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1.0f, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)1.0f, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)0, (java.lang.Object)range_obj6, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    Range<java.lang.Integer> range_i2 = Range.is((java.lang.Integer)10);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.between((java.lang.Object)' ', (java.lang.Object)range_i2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    java.lang.Object obj0 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between(obj0, (java.lang.Object)range_obj8, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)-1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    Range<java.lang.Integer> range_i2 = Range.is((java.lang.Integer)1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.between((java.lang.Object)false, (java.lang.Object)range_i2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(byte)10, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)(byte)10, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)(short)1, (java.lang.Object)range_obj8, comparator_obj9);
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
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)false, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)false, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between(obj0, (java.lang.Object)false, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)10, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)10, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)'4', (java.lang.Object)comparator_obj4, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"hi!", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)10, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)10, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)range_obj7, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)100);
    Range<java.lang.Long> range_long4 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)range_i1, (java.lang.Object)100L, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long4);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(-1.0d), (java.lang.Object)(-1L), comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)10, (java.lang.Object)100, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)1L, (java.lang.Object)10, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)10L);
    Range<java.lang.Integer> range_i4 = Range.is((java.lang.Integer)(-1));
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)10L, (java.lang.Object)range_i4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i4);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)1, comparator_obj1);
    Range<java.lang.Integer> range_i4 = Range.is((java.lang.Integer)(-1));
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)(-1), comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_i4);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0d), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)(short)0, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(short)-1, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)100L, (java.lang.Object)(short)-1, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(-1L), comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)10.0d, (java.lang.Object)(-1L), comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)false, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)false, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100.0d, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)0.0d, (java.lang.Object)100.0d, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)0.0d, comparator_obj9);
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
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0d), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1.0d), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)100, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(-1.0d), (java.lang.Object)range_obj7, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.lang.Object obj3 = null;
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)10L, obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)0L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)10L, (java.lang.Object)0L, comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.is((java.lang.Object)comparator_obj10, comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)100, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)10L, (java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)"", comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(byte)10, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(byte)10, comparator_obj4);
    java.lang.Object obj6 = null;
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)comparator_obj4, obj6, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)1, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(short)100, (java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100L, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)100L, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0d), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)"hi!", comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)"hi!", comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)1.0d, (java.lang.Object)"hi!", comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    java.lang.Object obj0 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between(obj0, (java.lang.Object)0L, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)100L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(-1L), (java.lang.Object)range_obj7, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)0, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)' ', (java.lang.Object)range_obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'a', comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(byte)10, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)range_obj6, comparator_obj7);
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
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_long2, (java.lang.Object)range_long5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1L, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)1, (java.lang.Object)10, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0d), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1.0d), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)(byte)1, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    java.lang.Object obj0 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between(obj0, (java.lang.Object)10L, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(-1L), (java.lang.Object)100.0f, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between(obj0, (java.lang.Object)100L, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between(obj0, (java.lang.Object)' ', comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(byte)10, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(byte)10, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(byte)10, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)range_obj7, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)0, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)1.0f, (java.lang.Object)(byte)10, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)100, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)100, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    java.lang.Object obj0 = null;
    Range<java.lang.Integer> range_i2 = Range.is((java.lang.Integer)10);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.between(obj0, (java.lang.Object)10, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)' ', comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(-1L), (java.lang.Object)range_obj7, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)1);
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)1, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)range_obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    Range<java.lang.Integer> range_i2 = Range.is((java.lang.Integer)(-1));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.between((java.lang.Object)0, (java.lang.Object)range_i2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1.0f, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)range_long7, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(-1.0f), (java.lang.Object)100.0d, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)100.0d, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)0.0d, (java.lang.Object)100.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)(short)1, (java.lang.Object)(-1), comparator_obj7);
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
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)'#', comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)1L, (java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1L), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1L), comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)range_long2, (java.lang.Object)comparator_obj6, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)1L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(-1L), (java.lang.Object)1L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)comparator_obj8, comparator_obj10);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(-1L), (java.lang.Object)0L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)range_obj7, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(short)0, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)0.0d, (java.lang.Object)range_obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)0.0f, (java.lang.Object)0L, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'4', comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)10, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)'4', (java.lang.Object)10, comparator_obj6);
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

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1L), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)(-1L), comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)(-1L), (java.lang.Object)(-1L), comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)10.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj18 = Range.between((java.lang.Object)(-1L), (java.lang.Object)comparator_obj15, comparator_obj17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1L), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)range_obj6, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)100L, (java.lang.Object)1, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)100, (java.lang.Object)1L, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1L), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)comparator_obj4, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)1L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)comparator_obj8, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"hi!", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)1L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_long2, (java.lang.Object)0L, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)100L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)0.0f, (java.lang.Object)range_obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)1.0f, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)1.0f, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)range_obj9, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(short)-1, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_long2, (java.lang.Object)(short)-1, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(byte)10, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(byte)10, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)range_obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)(-1L), comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)1L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)comparator_obj8, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)100, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(-1L), (java.lang.Object)100, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'a', comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0d), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1.0d), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)10L, (java.lang.Object)10.0d, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"hi!", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)"hi!", comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)10L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)(-1L), (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(-1L), (java.lang.Object)range_long5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)1.0f, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)' ', (java.lang.Object)1.0f, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.lang.Object obj5 = null;
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)10L, obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj14 = Range.between((java.lang.Object)10L, (java.lang.Object)comparator_obj11, comparator_obj13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)'a', comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_long2, (java.lang.Object)range_obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10.0f, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)10L, comparator_obj6);
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)0L, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    Range<java.lang.Object> range_obj14 = Range.between((java.lang.Object)10L, (java.lang.Object)0L, comparator_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj16 = Range.between((java.lang.Object)10.0f, (java.lang.Object)comparator_obj13, comparator_obj15);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj14);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    java.lang.Object obj0 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)1L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between(obj0, (java.lang.Object)1L, comparator_obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)1.0f, (java.lang.Object)(-1.0f), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)(-1.0f), comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)1.0f, (java.lang.Object)range_obj8, comparator_obj9);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)10L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)comparator_obj6, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(byte)10, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(byte)10, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)comparator_obj4, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100L, comparator_obj5);
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)100L, comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)comparator_obj5, (java.lang.Object)range_obj11, comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    java.lang.Object obj0 = new java.lang.Object();
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)1L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between(obj0, (java.lang.Object)1L, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1L, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1L), comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)1L, (java.lang.Object)comparator_obj6, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)10L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)range_obj6, (java.lang.Object)(-1), comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)false, comparator_obj1);
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)comparator_obj7, comparator_obj9);
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
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)1, (java.lang.Object)' ', comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(byte)100, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(short)-1, (java.lang.Object)(byte)100, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)100L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)100L, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)10, (java.lang.Object)100, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)100L, (java.lang.Object)10, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(byte)10, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)range_obj3, (java.lang.Object)(-1.0f), comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)comparator_obj5, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(-1L), (java.lang.Object)0L, comparator_obj6);
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)range_obj7, (java.lang.Object)100L, comparator_obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)10.0f, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)range_obj7, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    java.lang.Object obj0 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)(-1L), (java.lang.Object)0L, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between(obj0, (java.lang.Object)(-1L), comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)100L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_long2, (java.lang.Object)1L, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)10.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)10.0d, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)10L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)10L, comparator_obj7);
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj18 = Range.between((java.lang.Object)range_obj8, (java.lang.Object)comparator_obj15, comparator_obj17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(byte)-1, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)'#', (java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    Range<java.lang.Integer> range_i6 = Range.is((java.lang.Integer)10);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)10, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i6);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)1.0f, (java.lang.Object)(-1.0f), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)0, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)1.0f, (java.lang.Object)range_obj10, comparator_obj11);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1), comparator_obj4);
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)(-1), (java.lang.Object)1L, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)10L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(-1L), (java.lang.Object)1L, comparator_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0f), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1.0f), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(-1L), (java.lang.Object)0L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)comparator_obj6, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1L, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)1L, (java.lang.Object)range_long5, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1L), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1L), comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)comparator_obj6, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)range_long2, (java.lang.Object)"hi!", comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0.0d, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_long2, (java.lang.Object)range_obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj5);
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)10L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)(byte)1, (java.lang.Object)comparator_obj10, comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100L, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)10, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)10, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)10, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)10, (java.lang.Object)100, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    Range<java.lang.Integer> range_i2 = Range.is((java.lang.Integer)100);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)100.0d, (java.lang.Object)100, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)(-1L), comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)100.0f, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)comparator_obj6, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)1L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)1L, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj4);
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)10L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.is((java.lang.Object)(byte)100, comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)(byte)100, comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj16 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj17 = Range.between((java.lang.Object)10L, (java.lang.Object)comparator_obj14, comparator_obj16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj7);
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)10L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj15 = Range.between((java.lang.Object)10L, (java.lang.Object)range_obj13, comparator_obj14);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)0L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)10L, (java.lang.Object)0L, comparator_obj10);
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long17 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    Range<java.lang.Object> range_obj21 = Range.is((java.lang.Object)1L, comparator_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj23 = Range.between((java.lang.Object)0L, (java.lang.Object)comparator_obj20, comparator_obj22);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)false, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)10, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1L), comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)(short)10, (java.lang.Object)range_obj9, comparator_obj10);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)(-1));
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)range_i1, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(short)100, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(-1.0d), (java.lang.Object)range_obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)false, (java.lang.Object)range_long3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    Range<java.lang.Long> range_long4 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)(byte)1, (java.lang.Object)1L, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)0L, (java.lang.Object)(byte)0, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(-1.0d), comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1.0d), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between(obj0, (java.lang.Object)range_obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0d), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1.0d), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)range_obj5, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1L), comparator_obj6);
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)1L, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    Range<java.lang.Object> range_obj14 = Range.between((java.lang.Object)(-1L), (java.lang.Object)1L, comparator_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)(-1L), comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj18 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)comparator_obj15, comparator_obj17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)0, (java.lang.Object)100, comparator_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)-1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(byte)-1, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)0L, (java.lang.Object)"hi!", comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)(-1.0d), comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)1L, (java.lang.Object)comparator_obj9, comparator_obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    java.lang.Object obj5 = null;
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)comparator_obj3, obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)100L, (java.lang.Object)1.0f, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(byte)100, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)0L, (java.lang.Object)(byte)100, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1), comparator_obj4);
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)10L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)(-1), (java.lang.Object)range_obj10, comparator_obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)(-1L), (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(-1L), (java.lang.Object)10L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)(-1L), (java.lang.Object)"", comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    Range<java.lang.Integer> range_i6 = Range.is((java.lang.Integer)1);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)range_i6, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i6);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)0, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)true, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)range_obj5, comparator_obj6);
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

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)100L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)100L, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between(obj0, (java.lang.Object)100.0d, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)1L, (java.lang.Object)0.0f, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)(-1), comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)range_obj5, (java.lang.Object)(-1), comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    Range<java.lang.Integer> range_i6 = Range.is((java.lang.Integer)100);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)range_i6, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i6);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)true, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)100L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)100L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)true, (java.lang.Object)comparator_obj8, comparator_obj10);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    java.lang.Object obj0 = new java.lang.Object();
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between(obj0, (java.lang.Object)(short)0, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0f), comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1L), comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)(-1.0f), (java.lang.Object)range_obj9, comparator_obj10);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)1);
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)1, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0d), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1L), comparator_obj5);
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)100L, comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)(-1L), (java.lang.Object)comparator_obj10, comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)comparator_obj6, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)1L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)comparator_obj4, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0L, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)100L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)range_obj9, comparator_obj10);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)100L, (java.lang.Object)10L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)range_obj10, comparator_obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)1, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)(short)-1, (java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0f, comparator_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(byte)100, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(byte)100, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)(byte)100, comparator_obj8);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)100, comparator_obj1);
    Range<java.lang.Integer> range_i4 = Range.is((java.lang.Integer)100);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)comparator_obj5, comparator_obj7);
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
    org.junit.Assert.assertNotNull(range_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10.0d, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)1L, (java.lang.Object)(-1L), comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)10.0d, (java.lang.Object)range_obj10, comparator_obj11);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'a', comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)'a', (java.lang.Object)100, comparator_obj7);
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
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0f), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1.0f), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1.0f), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    Range<java.lang.Object> range_obj14 = Range.is((java.lang.Object)1L, comparator_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.between((java.lang.Object)(-1L), (java.lang.Object)1L, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj18 = Range.between((java.lang.Object)range_obj6, (java.lang.Object)(-1L), comparator_obj17);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)100, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)1L, (java.lang.Object)range_obj7, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)100, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1L), comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(-1L), comparator_obj10);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0f), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1.0f), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1.0f), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)comparator_obj5, comparator_obj7);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)false, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)10L, (java.lang.Object)range_obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)10, comparator_obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)10, (java.lang.Object)100, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)10, comparator_obj7);
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
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1), comparator_obj6);
    Range<java.lang.Integer> range_i9 = Range.is((java.lang.Integer)100);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)range_obj7, (java.lang.Object)100, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i9);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)(-1L), (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(-1L), (java.lang.Object)10L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)range_obj9, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)0L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)0L, (java.lang.Object)true, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(short)0, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)'4', (java.lang.Object)(short)0, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    java.lang.Object obj0 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)10L, comparator_obj4);
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)0L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)10L, (java.lang.Object)0L, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj14 = Range.between(obj0, (java.lang.Object)10L, comparator_obj13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)100);
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)100, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)range_obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)10, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(short)10, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0.0d, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(short)10, (java.lang.Object)comparator_obj6, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_long2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    java.lang.Object obj1 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)-1, obj1, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)1, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)1L, (java.lang.Object)(-1L), comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)range_obj10, comparator_obj11);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)10L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)true, (java.lang.Object)range_obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)' ', comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)' ', (java.lang.Object)comparator_obj6, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)0L, (java.lang.Object)10L, comparator_obj6);
    java.lang.Object obj8 = null;
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)comparator_obj6, obj8, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'#', comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)'#', (java.lang.Object)10.0d, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0f), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1.0f), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)1.0f, (java.lang.Object)comparator_obj5, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)true, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)10L, comparator_obj8);
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    Range<java.lang.Object> range_obj14 = Range.is((java.lang.Object)0L, comparator_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.between((java.lang.Object)10L, (java.lang.Object)0L, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    Range<java.lang.Object> range_obj18 = Range.is((java.lang.Object)10L, comparator_obj17);
    java.util.Comparator<java.lang.Object> comparator_obj19 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj20 = Range.between((java.lang.Object)(-1L), (java.lang.Object)comparator_obj17, comparator_obj19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj18);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'4', comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)100L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)100L, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1L, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)0L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)range_obj9, comparator_obj10);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)100);
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)100, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)range_i1, (java.lang.Object)comparator_obj3, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100L, comparator_obj5);
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)100L, (java.lang.Object)range_long9, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1L), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)(-1L), comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)(-1L), (java.lang.Object)(-1L), comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)(-1L), comparator_obj14);
    java.util.Comparator<java.lang.Object> comparator_obj16 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj17 = Range.is((java.lang.Object)comparator_obj14, comparator_obj16);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj15);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj6);
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)(-1L), comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    Range<java.lang.Object> range_obj14 = Range.is((java.lang.Object)(-1L), comparator_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj16 = Range.between((java.lang.Object)1L, (java.lang.Object)comparator_obj13, comparator_obj15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj14);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1L), comparator_obj5);
    Range<java.lang.Integer> range_i8 = Range.is((java.lang.Integer)(-1));
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)comparator_obj5, (java.lang.Object)(-1), comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i8);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj4);
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)10L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)10L, comparator_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(-1), (java.lang.Object)'a', comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(byte)10, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(byte)10, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)(short)0, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)comparator_obj4, (java.lang.Object)comparator_obj7, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(-1L), (java.lang.Object)range_long7, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)0L, (java.lang.Object)(short)-1, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1), comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)true, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)range_obj7, (java.lang.Object)true, comparator_obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)10, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)10, (java.lang.Object)range_obj5, comparator_obj6);
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

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)1L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)1L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(byte)1, (java.lang.Object)1L, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)(-1L), comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)(-1L), comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100L, comparator_obj5);
    java.lang.Object obj7 = null;
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)100L, obj7, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)'a', (java.lang.Object)(-1L), comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1), comparator_obj6);
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)100L, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    Range<java.lang.Object> range_obj14 = Range.is((java.lang.Object)100L, comparator_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj16 = Range.between((java.lang.Object)(-1), (java.lang.Object)comparator_obj13, comparator_obj15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj14);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)range_obj6, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)1L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)1L, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(byte)-1, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(byte)-1, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)0L, (java.lang.Object)(byte)-1, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)100L, (java.lang.Object)10L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)100L, (java.lang.Object)"", comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(-1.0d), comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)'a', (java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(short)1, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)comparator_obj6, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)1L, (java.lang.Object)(-1L), comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)100.0f, (java.lang.Object)1L, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1L), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)(-1L), comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)(-1L), (java.lang.Object)(-1L), comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)10.0d, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj18 = Range.between((java.lang.Object)comparator_obj12, (java.lang.Object)10.0d, comparator_obj17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10L, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)10L, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)"", comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)"", comparator_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)false, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(byte)100, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(byte)100, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)false, (java.lang.Object)(byte)100, comparator_obj8);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)1L, (java.lang.Object)(-1L), comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)comparator_obj6, (java.lang.Object)10L, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)10, (java.lang.Object)100, comparator_obj2);
    java.lang.Object obj4 = null;
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)range_obj3, obj4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)(-1L), (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)(-1L), (java.lang.Object)10L, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)(-1L), comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)"hi!", (java.lang.Object)range_obj10, comparator_obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(byte)100, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(byte)100, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(-1L), comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1L), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj5, (java.lang.Object)'4', comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    java.lang.Object obj0 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between(obj0, (java.lang.Object)range_long3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.lang.Object obj5 = null;
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_obj4, obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)100, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)100, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)range_obj9, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)100L, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)(-1), comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)comparator_obj7, (java.lang.Object)(-1), comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)1.0f, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)1.0f, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)1.0f, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)1L, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj14 = Range.between((java.lang.Object)range_long2, (java.lang.Object)1L, comparator_obj13);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    java.lang.Object obj0 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)100L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between(obj0, (java.lang.Object)100L, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'#', comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1L), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)comparator_obj5, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10L, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)0L, comparator_obj6);
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
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)1L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj5, (java.lang.Object)(short)0, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(-1L), (java.lang.Object)(byte)0, comparator_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)10L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)range_obj7, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)1L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)range_obj6, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1L), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1L), comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(short)10, (java.lang.Object)range_obj7, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)10L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj5, (java.lang.Object)"", comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)'4', comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)'4', comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)100L, (java.lang.Object)range_obj11, comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)(-1), comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)(-1), comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)(-1), comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj14 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)range_obj12, comparator_obj13);
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
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)100L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)'a', (java.lang.Object)range_obj5, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)0, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)1L, (java.lang.Object)1L, comparator_obj6);
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)0L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)comparator_obj6, (java.lang.Object)1L, comparator_obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)0L, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)0L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)false, (java.lang.Object)range_obj7, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)-1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)1L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(-1L), (java.lang.Object)1L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)1L, comparator_obj10);
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj16 = Range.between((java.lang.Object)comparator_obj10, (java.lang.Object)100L, comparator_obj15);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)0L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)10L, (java.lang.Object)0L, comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.is((java.lang.Object)10L, comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj15 = Range.is((java.lang.Object)comparator_obj12, comparator_obj14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)(-1));
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(-1), comparator_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)'4', (java.lang.Object)0L, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)(-1), comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)(-1), comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)(-1), comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj14 = Range.between((java.lang.Object)range_obj2, (java.lang.Object)comparator_obj11, comparator_obj13);
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
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)100, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(short)100, comparator_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)1.0f, (java.lang.Object)(-1.0f), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)range_obj5, comparator_obj6);
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

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)10L, comparator_obj5);
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)100L, comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    Range<java.lang.Object> range_obj13 = Range.is((java.lang.Object)100L, comparator_obj12);
    java.util.Comparator<java.lang.Object> comparator_obj14 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj15 = Range.between((java.lang.Object)range_obj6, (java.lang.Object)100L, comparator_obj14);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj13);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    Range<java.lang.Integer> range_i6 = Range.is((java.lang.Integer)100);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)100, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)comparator_obj7, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)(-1L), (java.lang.Object)0L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)0L, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj14 = Range.between((java.lang.Object)(-1L), (java.lang.Object)comparator_obj11, comparator_obj13);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    java.lang.Object obj0 = null;
    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(-1), comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between(obj0, (java.lang.Object)comparator_obj2, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    java.lang.Object obj0 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between(obj0, (java.lang.Object)10L, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)10L, (java.lang.Object)0L, comparator_obj6);
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)1L, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    Range<java.lang.Object> range_obj14 = Range.between((java.lang.Object)0L, (java.lang.Object)1L, comparator_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.is((java.lang.Object)1L, comparator_obj15);
    java.util.Comparator<java.lang.Object> comparator_obj17 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj18 = Range.is((java.lang.Object)range_obj16, comparator_obj17);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)0.0d, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)range_obj2, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1L), comparator_obj5);
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)10L, comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)(-1L), (java.lang.Object)range_obj11, comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(byte)10, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.is((java.lang.Object)(byte)10, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)(byte)10, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj14 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)range_obj12, comparator_obj13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(short)1, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(short)10, comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(short)10, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)(short)1, (java.lang.Object)range_obj7, comparator_obj8);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)1L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)0L, (java.lang.Object)0L, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)1L, (java.lang.Object)0L, comparator_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)0L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)10L, (java.lang.Object)0L, comparator_obj11);
    Range<java.lang.Long> range_long15 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj16 = null;
    Range<java.lang.Object> range_obj17 = Range.is((java.lang.Object)1L, comparator_obj16);
    java.util.Comparator<java.lang.Object> comparator_obj18 = null;
    Range<java.lang.Object> range_obj19 = Range.between((java.lang.Object)0L, (java.lang.Object)1L, comparator_obj18);
    java.util.Comparator<java.lang.Object> comparator_obj20 = null;
    Range<java.lang.Object> range_obj21 = Range.is((java.lang.Object)1L, comparator_obj20);
    java.util.Comparator<java.lang.Object> comparator_obj22 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj23 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)1L, comparator_obj22);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj21);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)comparator_obj5, comparator_obj7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)(byte)100, (java.lang.Object)(byte)10, comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)range_obj3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)(-1L), (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)(-1L), (java.lang.Object)10L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)(-1L), comparator_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)'a', comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)'a', comparator_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)1L, (java.lang.Object)(byte)1, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)0L, (java.lang.Object)false, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1.0f), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)(-1L), comparator_obj5);
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)1L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)range_obj6, (java.lang.Object)1L, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10.0f, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)10.0f, (java.lang.Object)0L, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1L), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)1.0f, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)1.0f, (java.lang.Object)(-1.0f), comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj12 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)1.0f, comparator_obj11);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1.0f, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)comparator_obj3, comparator_obj5);
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
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)10L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)10L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)false, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)comparator_obj5, (java.lang.Object)false, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)(-1L), (java.lang.Object)0L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)0L, comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    Range<java.lang.Object> range_obj14 = Range.is((java.lang.Object)0L, comparator_obj13);
    java.util.Comparator<java.lang.Object> comparator_obj15 = null;
    Range<java.lang.Object> range_obj16 = Range.between((java.lang.Object)10L, (java.lang.Object)0L, comparator_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj16);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.is((java.lang.Object)(-1L), comparator_obj2);
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)100L, (java.lang.Long)1L);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.is((java.lang.Object)1L, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)(-1L), (java.lang.Object)1L, comparator_obj9);
    java.util.Comparator<java.lang.Object> comparator_obj11 = null;
    Range<java.lang.Object> range_obj12 = Range.is((java.lang.Object)(-1L), comparator_obj11);
    java.util.Comparator<java.lang.Object> comparator_obj13 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj14 = Range.between((java.lang.Object)(short)100, (java.lang.Object)range_obj12, comparator_obj13);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj12);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)(-1), comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)comparator_obj1, comparator_obj3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)1.0f, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1.0f, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1L), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)1.0f, (java.lang.Object)range_obj9, comparator_obj10);
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
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    java.util.Comparator<java.lang.Object> comparator_obj2 = null;
    Range<java.lang.Object> range_obj3 = Range.between((java.lang.Object)100, (java.lang.Object)(-1), comparator_obj2);
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    Range<java.lang.Object> range_obj5 = Range.is((java.lang.Object)(-1), comparator_obj4);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)(-1), comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)(-1), comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)comparator_obj8, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L));
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj7 = null;
    Range<java.lang.Object> range_obj8 = Range.between((java.lang.Object)0L, (java.lang.Object)10L, comparator_obj7);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)(-1.0f), (java.lang.Object)comparator_obj7, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj8);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)1L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)1L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)1L, comparator_obj5);
    Range<java.lang.Integer> range_i8 = Range.is((java.lang.Integer)10);
    java.util.Comparator<java.lang.Object> comparator_obj9 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj10 = Range.between((java.lang.Object)comparator_obj5, (java.lang.Object)range_i8, comparator_obj9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i8);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)100L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj7 = Range.between((java.lang.Object)range_long2, (java.lang.Object)100L, comparator_obj6);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)10, comparator_obj1);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)100L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)comparator_obj1, (java.lang.Object)100L, comparator_obj8);
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
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100L, comparator_obj5);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)"", comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)100L, (java.lang.Object)"", comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)10, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)10, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)range_obj4, (java.lang.Object)comparator_obj8, comparator_obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)100L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)100L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)100L, comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)(-1L), (java.lang.Object)range_obj11, comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)(-1L), (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100L, comparator_obj3);
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)100L, (java.lang.Long)0L);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    Range<java.lang.Object> range_obj9 = Range.is((java.lang.Object)100L, comparator_obj8);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.is((java.lang.Object)100L, comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)comparator_obj3, (java.lang.Object)comparator_obj10, comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    java.util.Comparator<java.lang.Object> comparator_obj1 = null;
    Range<java.lang.Object> range_obj2 = Range.is((java.lang.Object)100, comparator_obj1);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)100, comparator_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)10L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj5);
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)10L, (java.lang.Long)100L);
    java.util.Comparator<java.lang.Object> comparator_obj10 = null;
    Range<java.lang.Object> range_obj11 = Range.between((java.lang.Object)10L, (java.lang.Object)10L, comparator_obj10);
    java.util.Comparator<java.lang.Object> comparator_obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj13 = Range.between((java.lang.Object)(short)100, (java.lang.Object)10L, comparator_obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj11);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)100);
    Range<java.lang.Integer> range_i3 = Range.is((java.lang.Integer)(-1));
    java.util.Comparator<java.lang.Object> comparator_obj4 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj5 = Range.between((java.lang.Object)range_i1, (java.lang.Object)range_i3, comparator_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i3);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)0);
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)100, comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    Range<java.lang.Object> range_obj6 = Range.between((java.lang.Object)0, (java.lang.Object)100, comparator_obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj6);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)100L, (java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Object> comparator_obj3 = null;
    Range<java.lang.Object> range_obj4 = Range.is((java.lang.Object)(-1L), comparator_obj3);
    java.util.Comparator<java.lang.Object> comparator_obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj6 = Range.is((java.lang.Object)range_obj4, comparator_obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj4);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    Range<java.lang.Long> range_long2 = Range.between((java.lang.Long)0L, (java.lang.Long)100L);
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)10L);
    java.util.Comparator<java.lang.Object> comparator_obj6 = null;
    Range<java.lang.Object> range_obj7 = Range.is((java.lang.Object)10L, comparator_obj6);
    java.util.Comparator<java.lang.Object> comparator_obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.Object> range_obj9 = Range.between((java.lang.Object)0L, (java.lang.Object)range_obj7, comparator_obj8);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ClassCastException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_obj7);

  }

}
