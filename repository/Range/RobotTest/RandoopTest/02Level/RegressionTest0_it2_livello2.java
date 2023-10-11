
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)100, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)1, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    boolean b14 = range_long9.isEndedBy((java.lang.Long)10L);
    java.lang.String str15 = range_long9.toString();
    boolean b17 = range_long9.isEndedBy((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1..0]"+ "'", str15.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    boolean b14 = range_long9.equals((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long3.getComparator();
    boolean b15 = range_long3.isBefore((java.lang.Long)10L);
    boolean b16 = range_long3.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)0, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    boolean b35 = range_long33.isAfter((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)(-1), (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long3.getComparator();
    boolean b15 = range_long3.isBefore((java.lang.Long)10L);
    boolean b17 = range_long3.contains((java.lang.Long)0L);
    java.util.Comparator<java.lang.Long> comparator_long18 = range_long3.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    org.junit.Assert.assertTrue("'" + comparator_long18 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long18.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)1, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)10, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)(-1), (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.lang.Object obj13 = null;
    boolean b14 = range_long12.equals(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    java.lang.Long long38 = range_long37.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long41 = null;
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long41);
    java.util.Comparator<java.lang.Long> comparator_long45 = null;
    Range<java.lang.Long> range_long46 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long45);
    boolean b47 = range_long46.isNaturalOrdering();
    boolean b48 = range_long46.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long51 = null;
    Range<java.lang.Long> range_long52 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long51);
    boolean b53 = range_long52.isNaturalOrdering();
    boolean b54 = range_long52.isNaturalOrdering();
    Range<java.lang.Long> range_long55 = range_long46.intersectionWith(range_long52);
    java.util.Comparator<java.lang.Long> comparator_long58 = null;
    Range<java.lang.Long> range_long59 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long58);
    boolean b60 = range_long52.containsRange(range_long59);
    boolean b61 = range_long42.containsRange(range_long52);
    boolean b62 = range_long37.containsRange(range_long42);
    java.util.Comparator<java.lang.Long> comparator_long65 = null;
    Range<java.lang.Long> range_long66 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long65);
    java.util.Comparator<java.lang.Long> comparator_long69 = null;
    Range<java.lang.Long> range_long70 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long69);
    boolean b71 = range_long70.isNaturalOrdering();
    boolean b72 = range_long70.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long75 = null;
    Range<java.lang.Long> range_long76 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long75);
    boolean b77 = range_long76.isNaturalOrdering();
    boolean b78 = range_long76.isNaturalOrdering();
    Range<java.lang.Long> range_long79 = range_long70.intersectionWith(range_long76);
    java.util.Comparator<java.lang.Long> comparator_long82 = null;
    Range<java.lang.Long> range_long83 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long82);
    boolean b84 = range_long76.containsRange(range_long83);
    boolean b85 = range_long66.isBeforeRange(range_long76);
    boolean b86 = range_long42.isOverlappedBy(range_long66);
    boolean b87 = range_long33.isAfterRange(range_long66);
    boolean b89 = range_long33.isEndedBy((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L)+ "'", long38.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long13.containsRange(range_long20);
    boolean b22 = range_long3.isBeforeRange(range_long13);
    java.lang.String str23 = range_long3.toString();
    boolean b25 = range_long3.isEndedBy((java.lang.Long)10L);
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long33.isNaturalOrdering();
    boolean b35 = range_long33.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long38 = null;
    Range<java.lang.Long> range_long39 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long38);
    boolean b40 = range_long39.isNaturalOrdering();
    boolean b41 = range_long39.isNaturalOrdering();
    Range<java.lang.Long> range_long42 = range_long33.intersectionWith(range_long39);
    java.util.Comparator<java.lang.Long> comparator_long43 = range_long33.getComparator();
    Range<java.lang.Long> range_long44 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long43);
    Range<java.lang.Long> range_long45 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long43);
    Range<java.lang.Long> range_long46 = range_long3.intersectionWith(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[-1..0]"+ "'", str23.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    org.junit.Assert.assertTrue("'" + comparator_long43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    boolean b14 = range_long9.isEndedBy((java.lang.Long)10L);
    boolean b16 = range_long9.isAfter((java.lang.Long)1L);
    boolean b18 = range_long9.isAfter((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)(-1), (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long3.getComparator();
    boolean b15 = range_long3.isBefore((java.lang.Long)10L);
    java.lang.Long long16 = range_long3.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L+ "'", long16.equals(0L));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    java.lang.Long long34 = range_long27.getMinimum();
    boolean b36 = range_long27.isEndedBy((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L)+ "'", long34.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)10, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long12.getComparator();
    java.lang.Long long14 = range_long12.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    java.lang.Long long19 = range_long18.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long33.isNaturalOrdering();
    boolean b35 = range_long33.isNaturalOrdering();
    Range<java.lang.Long> range_long36 = range_long27.intersectionWith(range_long33);
    java.util.Comparator<java.lang.Long> comparator_long39 = null;
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long39);
    boolean b41 = range_long33.containsRange(range_long40);
    boolean b42 = range_long23.containsRange(range_long33);
    boolean b43 = range_long18.containsRange(range_long23);
    java.util.Comparator<java.lang.Long> comparator_long46 = null;
    Range<java.lang.Long> range_long47 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long46);
    java.util.Comparator<java.lang.Long> comparator_long50 = null;
    Range<java.lang.Long> range_long51 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long50);
    boolean b52 = range_long51.isNaturalOrdering();
    boolean b53 = range_long51.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long57.isNaturalOrdering();
    boolean b59 = range_long57.isNaturalOrdering();
    Range<java.lang.Long> range_long60 = range_long51.intersectionWith(range_long57);
    java.util.Comparator<java.lang.Long> comparator_long63 = null;
    Range<java.lang.Long> range_long64 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long63);
    boolean b65 = range_long57.containsRange(range_long64);
    boolean b66 = range_long47.isBeforeRange(range_long57);
    Range<java.lang.Long> range_long67 = range_long23.intersectionWith(range_long57);
    Range<java.lang.Long> range_long68 = range_long12.intersectionWith(range_long67);
    java.lang.Long long69 = range_long68.getMaximum();
    boolean b71 = range_long68.contains((java.lang.Long)1L);
    boolean b73 = range_long68.isStartedBy((java.lang.Long)1L);
    java.util.Comparator<java.lang.Long> comparator_long76 = null;
    Range<java.lang.Long> range_long77 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long76);
    boolean b78 = range_long77.isNaturalOrdering();
    boolean b79 = range_long77.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long82 = null;
    Range<java.lang.Long> range_long83 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long82);
    boolean b84 = range_long83.isNaturalOrdering();
    boolean b85 = range_long83.isNaturalOrdering();
    Range<java.lang.Long> range_long86 = range_long77.intersectionWith(range_long83);
    java.util.Comparator<java.lang.Long> comparator_long87 = range_long77.getComparator();
    boolean b88 = range_long77.isNaturalOrdering();
    boolean b89 = range_long68.isBeforeRange(range_long77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L+ "'", long14.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L)+ "'", long19.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L+ "'", long69.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long86);
    org.junit.Assert.assertTrue("'" + comparator_long87 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long87.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long12.getComparator();
    java.lang.Long long14 = range_long12.getMaximum();
    java.lang.String str16 = range_long12.toString("[1..1]");
    boolean b18 = range_long12.isStartedBy((java.lang.Long)(-1L));
    boolean b19 = range_long12.isNaturalOrdering();
    boolean b20 = range_long12.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L+ "'", long14.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[1..1]"+ "'", str16.equals("[1..1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    java.util.Comparator<java.lang.Long> comparator_long5 = null;
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long5);
    boolean b7 = range_long6.isNaturalOrdering();
    boolean b8 = range_long6.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long11 = null;
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long11);
    boolean b13 = range_long12.isNaturalOrdering();
    boolean b14 = range_long12.isNaturalOrdering();
    Range<java.lang.Long> range_long15 = range_long6.intersectionWith(range_long12);
    java.util.Comparator<java.lang.Long> comparator_long16 = range_long15.getComparator();
    Range<java.lang.Long> range_long17 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long16);
    Range<java.lang.Long> range_long18 = Range.is((java.lang.Long)0L, comparator_long16);
    Range<java.lang.Long> range_long19 = null;
    boolean b20 = range_long18.isOverlappedBy(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    org.junit.Assert.assertTrue("'" + comparator_long16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    boolean b14 = range_long9.isEndedBy((java.lang.Long)10L);
    java.lang.String str15 = range_long9.toString();
    boolean b17 = range_long9.isBefore((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1..0]"+ "'", str15.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    boolean b14 = range_long9.isEndedBy((java.lang.Long)10L);
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    java.util.Comparator<java.lang.Long> comparator_long21 = null;
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long21);
    boolean b23 = range_long22.isNaturalOrdering();
    boolean b24 = range_long22.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    boolean b29 = range_long28.isNaturalOrdering();
    boolean b30 = range_long28.isNaturalOrdering();
    Range<java.lang.Long> range_long31 = range_long22.intersectionWith(range_long28);
    java.util.Comparator<java.lang.Long> comparator_long34 = null;
    Range<java.lang.Long> range_long35 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long34);
    boolean b36 = range_long28.containsRange(range_long35);
    boolean b37 = range_long18.containsRange(range_long28);
    java.util.Comparator<java.lang.Long> comparator_long40 = null;
    Range<java.lang.Long> range_long41 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long40);
    java.util.Comparator<java.lang.Long> comparator_long44 = null;
    Range<java.lang.Long> range_long45 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long44);
    boolean b46 = range_long45.isNaturalOrdering();
    boolean b47 = range_long45.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long50 = null;
    Range<java.lang.Long> range_long51 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long50);
    boolean b52 = range_long51.isNaturalOrdering();
    boolean b53 = range_long51.isNaturalOrdering();
    Range<java.lang.Long> range_long54 = range_long45.intersectionWith(range_long51);
    java.util.Comparator<java.lang.Long> comparator_long57 = null;
    Range<java.lang.Long> range_long58 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long57);
    boolean b59 = range_long51.containsRange(range_long58);
    boolean b60 = range_long41.isBeforeRange(range_long51);
    java.lang.String str61 = range_long41.toString();
    boolean b63 = range_long41.isEndedBy((java.lang.Long)10L);
    boolean b64 = range_long18.isOverlappedBy(range_long41);
    Range<java.lang.Long> range_long65 = range_long9.intersectionWith(range_long18);
    boolean b67 = range_long65.contains((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "[-1..0]"+ "'", str61.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)(-1), (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    boolean b7 = range_long3.isStartedBy((java.lang.Long)10L);
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    java.lang.Long long12 = range_long11.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long20.isNaturalOrdering();
    boolean b22 = range_long20.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long25 = null;
    Range<java.lang.Long> range_long26 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long25);
    boolean b27 = range_long26.isNaturalOrdering();
    boolean b28 = range_long26.isNaturalOrdering();
    Range<java.lang.Long> range_long29 = range_long20.intersectionWith(range_long26);
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long26.containsRange(range_long33);
    boolean b35 = range_long16.containsRange(range_long26);
    boolean b36 = range_long11.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long39 = null;
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long39);
    java.util.Comparator<java.lang.Long> comparator_long43 = null;
    Range<java.lang.Long> range_long44 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long43);
    boolean b45 = range_long44.isNaturalOrdering();
    boolean b46 = range_long44.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    boolean b51 = range_long50.isNaturalOrdering();
    boolean b52 = range_long50.isNaturalOrdering();
    Range<java.lang.Long> range_long53 = range_long44.intersectionWith(range_long50);
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long50.containsRange(range_long57);
    boolean b59 = range_long40.isBeforeRange(range_long50);
    Range<java.lang.Long> range_long60 = range_long16.intersectionWith(range_long50);
    boolean b61 = range_long3.equals((java.lang.Object)range_long60);
    int i63 = range_long60.elementCompareTo((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L)+ "'", long12.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    boolean b7 = range_long3.isStartedBy((java.lang.Long)10L);
    java.lang.String str9 = range_long3.toString("");
    boolean b10 = range_long3.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long2);
    java.lang.Long long4 = range_long3.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    boolean b9 = range_long8.isNaturalOrdering();
    boolean b10 = range_long8.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long13 = null;
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long13);
    boolean b15 = range_long14.isNaturalOrdering();
    boolean b16 = range_long14.isNaturalOrdering();
    Range<java.lang.Long> range_long17 = range_long8.intersectionWith(range_long14);
    java.util.Comparator<java.lang.Long> comparator_long18 = range_long17.getComparator();
    java.lang.Long long19 = range_long17.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.lang.Long long24 = range_long23.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    boolean b33 = range_long32.isNaturalOrdering();
    boolean b34 = range_long32.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long37 = null;
    Range<java.lang.Long> range_long38 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long37);
    boolean b39 = range_long38.isNaturalOrdering();
    boolean b40 = range_long38.isNaturalOrdering();
    Range<java.lang.Long> range_long41 = range_long32.intersectionWith(range_long38);
    java.util.Comparator<java.lang.Long> comparator_long44 = null;
    Range<java.lang.Long> range_long45 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long44);
    boolean b46 = range_long38.containsRange(range_long45);
    boolean b47 = range_long28.containsRange(range_long38);
    boolean b48 = range_long23.containsRange(range_long28);
    java.util.Comparator<java.lang.Long> comparator_long51 = null;
    Range<java.lang.Long> range_long52 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long51);
    java.util.Comparator<java.lang.Long> comparator_long55 = null;
    Range<java.lang.Long> range_long56 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long55);
    boolean b57 = range_long56.isNaturalOrdering();
    boolean b58 = range_long56.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long61 = null;
    Range<java.lang.Long> range_long62 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long61);
    boolean b63 = range_long62.isNaturalOrdering();
    boolean b64 = range_long62.isNaturalOrdering();
    Range<java.lang.Long> range_long65 = range_long56.intersectionWith(range_long62);
    java.util.Comparator<java.lang.Long> comparator_long68 = null;
    Range<java.lang.Long> range_long69 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long68);
    boolean b70 = range_long62.containsRange(range_long69);
    boolean b71 = range_long52.isBeforeRange(range_long62);
    Range<java.lang.Long> range_long72 = range_long28.intersectionWith(range_long62);
    Range<java.lang.Long> range_long73 = range_long17.intersectionWith(range_long72);
    java.lang.Long long74 = range_long73.getMaximum();
    boolean b75 = range_long3.containsRange(range_long73);
    boolean b76 = range_long73.isNaturalOrdering();
    java.lang.Long long77 = range_long73.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L+ "'", long4.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    org.junit.Assert.assertTrue("'" + comparator_long18 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long18.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L+ "'", long19.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L)+ "'", long24.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L+ "'", long74.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L+ "'", long77.equals(0L));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    boolean b9 = range_long8.isNaturalOrdering();
    boolean b10 = range_long8.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long13 = null;
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long13);
    boolean b15 = range_long14.isNaturalOrdering();
    boolean b16 = range_long14.isNaturalOrdering();
    Range<java.lang.Long> range_long17 = range_long8.intersectionWith(range_long14);
    java.util.Comparator<java.lang.Long> comparator_long18 = range_long8.getComparator();
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long18);
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long18);
    Range<java.lang.Long> range_long21 = Range.is((java.lang.Long)100L, comparator_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    org.junit.Assert.assertTrue("'" + comparator_long18 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long18.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long12.getComparator();
    java.lang.Long long14 = range_long12.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    java.lang.Long long19 = range_long18.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long33.isNaturalOrdering();
    boolean b35 = range_long33.isNaturalOrdering();
    Range<java.lang.Long> range_long36 = range_long27.intersectionWith(range_long33);
    java.util.Comparator<java.lang.Long> comparator_long39 = null;
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long39);
    boolean b41 = range_long33.containsRange(range_long40);
    boolean b42 = range_long23.containsRange(range_long33);
    boolean b43 = range_long18.containsRange(range_long23);
    java.util.Comparator<java.lang.Long> comparator_long46 = null;
    Range<java.lang.Long> range_long47 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long46);
    java.util.Comparator<java.lang.Long> comparator_long50 = null;
    Range<java.lang.Long> range_long51 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long50);
    boolean b52 = range_long51.isNaturalOrdering();
    boolean b53 = range_long51.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long57.isNaturalOrdering();
    boolean b59 = range_long57.isNaturalOrdering();
    Range<java.lang.Long> range_long60 = range_long51.intersectionWith(range_long57);
    java.util.Comparator<java.lang.Long> comparator_long63 = null;
    Range<java.lang.Long> range_long64 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long63);
    boolean b65 = range_long57.containsRange(range_long64);
    boolean b66 = range_long47.isBeforeRange(range_long57);
    Range<java.lang.Long> range_long67 = range_long23.intersectionWith(range_long57);
    Range<java.lang.Long> range_long68 = range_long12.intersectionWith(range_long67);
    java.lang.Long long69 = range_long68.getMaximum();
    boolean b71 = range_long68.contains((java.lang.Long)1L);
    boolean b73 = range_long68.isStartedBy((java.lang.Long)1L);
    java.lang.Long long74 = range_long68.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L+ "'", long14.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L)+ "'", long19.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L+ "'", long69.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L+ "'", long74.equals(0L));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long2);
    java.lang.Long long4 = range_long3.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    boolean b9 = range_long8.isNaturalOrdering();
    boolean b10 = range_long8.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long13 = null;
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long13);
    boolean b15 = range_long14.isNaturalOrdering();
    boolean b16 = range_long14.isNaturalOrdering();
    Range<java.lang.Long> range_long17 = range_long8.intersectionWith(range_long14);
    java.util.Comparator<java.lang.Long> comparator_long18 = range_long17.getComparator();
    java.lang.Long long19 = range_long17.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.lang.Long long24 = range_long23.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    boolean b33 = range_long32.isNaturalOrdering();
    boolean b34 = range_long32.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long37 = null;
    Range<java.lang.Long> range_long38 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long37);
    boolean b39 = range_long38.isNaturalOrdering();
    boolean b40 = range_long38.isNaturalOrdering();
    Range<java.lang.Long> range_long41 = range_long32.intersectionWith(range_long38);
    java.util.Comparator<java.lang.Long> comparator_long44 = null;
    Range<java.lang.Long> range_long45 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long44);
    boolean b46 = range_long38.containsRange(range_long45);
    boolean b47 = range_long28.containsRange(range_long38);
    boolean b48 = range_long23.containsRange(range_long28);
    java.util.Comparator<java.lang.Long> comparator_long51 = null;
    Range<java.lang.Long> range_long52 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long51);
    java.util.Comparator<java.lang.Long> comparator_long55 = null;
    Range<java.lang.Long> range_long56 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long55);
    boolean b57 = range_long56.isNaturalOrdering();
    boolean b58 = range_long56.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long61 = null;
    Range<java.lang.Long> range_long62 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long61);
    boolean b63 = range_long62.isNaturalOrdering();
    boolean b64 = range_long62.isNaturalOrdering();
    Range<java.lang.Long> range_long65 = range_long56.intersectionWith(range_long62);
    java.util.Comparator<java.lang.Long> comparator_long68 = null;
    Range<java.lang.Long> range_long69 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long68);
    boolean b70 = range_long62.containsRange(range_long69);
    boolean b71 = range_long52.isBeforeRange(range_long62);
    Range<java.lang.Long> range_long72 = range_long28.intersectionWith(range_long62);
    Range<java.lang.Long> range_long73 = range_long17.intersectionWith(range_long72);
    java.lang.Long long74 = range_long73.getMaximum();
    boolean b75 = range_long3.containsRange(range_long73);
    int i77 = range_long3.elementCompareTo((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L+ "'", long4.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    org.junit.Assert.assertTrue("'" + comparator_long18 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long18.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L+ "'", long19.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L)+ "'", long24.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L+ "'", long74.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == (-1));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    boolean b6 = range_long5.isNaturalOrdering();
    boolean b7 = range_long5.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    boolean b12 = range_long11.isNaturalOrdering();
    boolean b13 = range_long11.isNaturalOrdering();
    Range<java.lang.Long> range_long14 = range_long5.intersectionWith(range_long11);
    java.util.Comparator<java.lang.Long> comparator_long15 = range_long5.getComparator();
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    java.util.Comparator<java.lang.Long> comparator_long23 = null;
    Range<java.lang.Long> range_long24 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long23);
    boolean b25 = range_long24.isNaturalOrdering();
    boolean b26 = range_long24.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long29 = null;
    Range<java.lang.Long> range_long30 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long29);
    boolean b31 = range_long30.isNaturalOrdering();
    boolean b32 = range_long30.isNaturalOrdering();
    Range<java.lang.Long> range_long33 = range_long24.intersectionWith(range_long30);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long30.containsRange(range_long37);
    boolean b39 = range_long20.isBeforeRange(range_long30);
    Range<java.lang.Long> range_long40 = range_long16.intersectionWith(range_long30);
    java.lang.Long long41 = range_long16.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    org.junit.Assert.assertTrue("'" + comparator_long15 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long15.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L+ "'", long41.equals(0L));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long2);
    java.lang.Long long4 = range_long3.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    boolean b9 = range_long8.isNaturalOrdering();
    boolean b10 = range_long8.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long13 = null;
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long13);
    boolean b15 = range_long14.isNaturalOrdering();
    boolean b16 = range_long14.isNaturalOrdering();
    Range<java.lang.Long> range_long17 = range_long8.intersectionWith(range_long14);
    java.util.Comparator<java.lang.Long> comparator_long18 = range_long17.getComparator();
    java.lang.Long long19 = range_long17.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.lang.Long long24 = range_long23.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    boolean b33 = range_long32.isNaturalOrdering();
    boolean b34 = range_long32.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long37 = null;
    Range<java.lang.Long> range_long38 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long37);
    boolean b39 = range_long38.isNaturalOrdering();
    boolean b40 = range_long38.isNaturalOrdering();
    Range<java.lang.Long> range_long41 = range_long32.intersectionWith(range_long38);
    java.util.Comparator<java.lang.Long> comparator_long44 = null;
    Range<java.lang.Long> range_long45 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long44);
    boolean b46 = range_long38.containsRange(range_long45);
    boolean b47 = range_long28.containsRange(range_long38);
    boolean b48 = range_long23.containsRange(range_long28);
    java.util.Comparator<java.lang.Long> comparator_long51 = null;
    Range<java.lang.Long> range_long52 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long51);
    java.util.Comparator<java.lang.Long> comparator_long55 = null;
    Range<java.lang.Long> range_long56 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long55);
    boolean b57 = range_long56.isNaturalOrdering();
    boolean b58 = range_long56.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long61 = null;
    Range<java.lang.Long> range_long62 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long61);
    boolean b63 = range_long62.isNaturalOrdering();
    boolean b64 = range_long62.isNaturalOrdering();
    Range<java.lang.Long> range_long65 = range_long56.intersectionWith(range_long62);
    java.util.Comparator<java.lang.Long> comparator_long68 = null;
    Range<java.lang.Long> range_long69 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long68);
    boolean b70 = range_long62.containsRange(range_long69);
    boolean b71 = range_long52.isBeforeRange(range_long62);
    Range<java.lang.Long> range_long72 = range_long28.intersectionWith(range_long62);
    Range<java.lang.Long> range_long73 = range_long17.intersectionWith(range_long72);
    java.lang.Long long74 = range_long73.getMaximum();
    boolean b75 = range_long3.containsRange(range_long73);
    boolean b77 = range_long3.isEndedBy((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L+ "'", long4.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    org.junit.Assert.assertTrue("'" + comparator_long18 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long18.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L+ "'", long19.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L)+ "'", long24.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L+ "'", long74.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long17 = range_long7.getComparator();
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long17);
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long17);
    boolean b21 = range_long19.contains((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    org.junit.Assert.assertTrue("'" + comparator_long17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long2);
    java.lang.String str4 = range_long3.toString();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    boolean b9 = range_long8.isNaturalOrdering();
    boolean b10 = range_long8.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long13 = null;
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long13);
    boolean b15 = range_long14.isNaturalOrdering();
    boolean b16 = range_long14.isNaturalOrdering();
    Range<java.lang.Long> range_long17 = range_long8.intersectionWith(range_long14);
    boolean b19 = range_long14.isEndedBy((java.lang.Long)10L);
    boolean b21 = range_long14.isAfter((java.lang.Long)1L);
    boolean b22 = range_long3.equals((java.lang.Object)b21);
    int i24 = range_long3.elementCompareTo((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[1..1]"+ "'", str4.equals("[1..1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long20.isNaturalOrdering();
    boolean b22 = range_long20.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long25 = null;
    Range<java.lang.Long> range_long26 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long25);
    boolean b27 = range_long26.isNaturalOrdering();
    boolean b28 = range_long26.isNaturalOrdering();
    Range<java.lang.Long> range_long29 = range_long20.intersectionWith(range_long26);
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long26.containsRange(range_long33);
    boolean b35 = range_long16.isBeforeRange(range_long26);
    java.lang.String str36 = range_long16.toString();
    Range<java.lang.Long> range_long37 = range_long9.intersectionWith(range_long16);
    int i39 = range_long37.elementCompareTo((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[-1..0]"+ "'", str36.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    boolean b6 = range_long5.isNaturalOrdering();
    boolean b7 = range_long5.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    boolean b12 = range_long11.isNaturalOrdering();
    boolean b13 = range_long11.isNaturalOrdering();
    Range<java.lang.Long> range_long14 = range_long5.intersectionWith(range_long11);
    java.util.Comparator<java.lang.Long> comparator_long15 = range_long5.getComparator();
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long15);
    boolean b18 = range_long16.isAfter((java.lang.Long)0L);
    Range<java.lang.Long> range_long19 = null;
    boolean b20 = range_long16.containsRange(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    org.junit.Assert.assertTrue("'" + comparator_long15 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long15.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long20.isNaturalOrdering();
    boolean b22 = range_long20.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long25 = null;
    Range<java.lang.Long> range_long26 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long25);
    boolean b27 = range_long26.isNaturalOrdering();
    boolean b28 = range_long26.isNaturalOrdering();
    Range<java.lang.Long> range_long29 = range_long20.intersectionWith(range_long26);
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long26.containsRange(range_long33);
    boolean b35 = range_long16.isBeforeRange(range_long26);
    java.lang.String str36 = range_long16.toString();
    Range<java.lang.Long> range_long37 = range_long9.intersectionWith(range_long16);
    boolean b39 = range_long9.isBefore((java.lang.Long)1L);
    boolean b41 = range_long9.isBefore((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[-1..0]"+ "'", str36.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long14 = null;
    Range<java.lang.Long> range_long15 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long14);
    boolean b16 = range_long15.isNaturalOrdering();
    boolean b17 = range_long15.isNaturalOrdering();
    Range<java.lang.Long> range_long18 = range_long9.intersectionWith(range_long15);
    java.util.Comparator<java.lang.Long> comparator_long21 = null;
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long21);
    boolean b23 = range_long15.containsRange(range_long22);
    boolean b24 = range_long5.isBeforeRange(range_long15);
    java.lang.String str25 = range_long5.toString();
    java.util.Comparator<java.lang.Long> comparator_long26 = range_long5.getComparator();
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long26);
    java.util.Comparator<java.lang.Long> comparator_long30 = null;
    Range<java.lang.Long> range_long31 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long30);
    boolean b32 = range_long31.isNaturalOrdering();
    boolean b33 = range_long31.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long38 = null;
    Range<java.lang.Long> range_long39 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long38);
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long43.isNaturalOrdering();
    boolean b45 = range_long43.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long48 = null;
    Range<java.lang.Long> range_long49 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long48);
    boolean b50 = range_long49.isNaturalOrdering();
    boolean b51 = range_long49.isNaturalOrdering();
    Range<java.lang.Long> range_long52 = range_long43.intersectionWith(range_long49);
    java.util.Comparator<java.lang.Long> comparator_long55 = null;
    Range<java.lang.Long> range_long56 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long55);
    boolean b57 = range_long49.containsRange(range_long56);
    boolean b58 = range_long39.isBeforeRange(range_long49);
    java.lang.String str59 = range_long39.toString();
    java.util.Comparator<java.lang.Long> comparator_long60 = range_long39.getComparator();
    Range<java.lang.Long> range_long61 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long60);
    java.util.Comparator<java.lang.Long> comparator_long64 = null;
    Range<java.lang.Long> range_long65 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long64);
    boolean b66 = range_long65.isNaturalOrdering();
    boolean b67 = range_long65.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long70 = null;
    Range<java.lang.Long> range_long71 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long70);
    boolean b72 = range_long71.isNaturalOrdering();
    boolean b73 = range_long71.isNaturalOrdering();
    Range<java.lang.Long> range_long74 = range_long65.intersectionWith(range_long71);
    java.util.Comparator<java.lang.Long> comparator_long77 = null;
    Range<java.lang.Long> range_long78 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long77);
    boolean b79 = range_long71.containsRange(range_long78);
    boolean b80 = range_long61.containsRange(range_long71);
    Range<java.lang.Long> range_long81 = range_long31.intersectionWith(range_long71);
    boolean b82 = range_long27.isOverlappedBy(range_long81);
    java.util.Comparator<java.lang.Long> comparator_long85 = null;
    Range<java.lang.Long> range_long86 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long85);
    boolean b87 = range_long86.isNaturalOrdering();
    boolean b88 = range_long86.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long91 = null;
    Range<java.lang.Long> range_long92 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long91);
    boolean b93 = range_long92.isNaturalOrdering();
    boolean b94 = range_long92.isNaturalOrdering();
    Range<java.lang.Long> range_long95 = range_long86.intersectionWith(range_long92);
    boolean b96 = range_long27.equals((java.lang.Object)range_long86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[-1..0]"+ "'", str25.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long26 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long26.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "[-1..0]"+ "'", str59.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long60 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long60.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    boolean b35 = range_long27.isBefore((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long20.isNaturalOrdering();
    boolean b22 = range_long20.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long25 = null;
    Range<java.lang.Long> range_long26 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long25);
    boolean b27 = range_long26.isNaturalOrdering();
    boolean b28 = range_long26.isNaturalOrdering();
    Range<java.lang.Long> range_long29 = range_long20.intersectionWith(range_long26);
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long26.containsRange(range_long33);
    boolean b35 = range_long16.isBeforeRange(range_long26);
    java.lang.String str36 = range_long16.toString();
    Range<java.lang.Long> range_long37 = range_long9.intersectionWith(range_long16);
    int i39 = range_long16.elementCompareTo((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[-1..0]"+ "'", str36.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    boolean b14 = range_long9.isEndedBy((java.lang.Long)10L);
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    java.util.Comparator<java.lang.Long> comparator_long21 = null;
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long21);
    boolean b23 = range_long22.isNaturalOrdering();
    boolean b24 = range_long22.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    boolean b29 = range_long28.isNaturalOrdering();
    boolean b30 = range_long28.isNaturalOrdering();
    Range<java.lang.Long> range_long31 = range_long22.intersectionWith(range_long28);
    java.util.Comparator<java.lang.Long> comparator_long34 = null;
    Range<java.lang.Long> range_long35 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long34);
    boolean b36 = range_long28.containsRange(range_long35);
    boolean b37 = range_long18.containsRange(range_long28);
    java.util.Comparator<java.lang.Long> comparator_long40 = null;
    Range<java.lang.Long> range_long41 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long40);
    java.util.Comparator<java.lang.Long> comparator_long44 = null;
    Range<java.lang.Long> range_long45 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long44);
    boolean b46 = range_long45.isNaturalOrdering();
    boolean b47 = range_long45.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long50 = null;
    Range<java.lang.Long> range_long51 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long50);
    boolean b52 = range_long51.isNaturalOrdering();
    boolean b53 = range_long51.isNaturalOrdering();
    Range<java.lang.Long> range_long54 = range_long45.intersectionWith(range_long51);
    java.util.Comparator<java.lang.Long> comparator_long57 = null;
    Range<java.lang.Long> range_long58 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long57);
    boolean b59 = range_long51.containsRange(range_long58);
    boolean b60 = range_long41.isBeforeRange(range_long51);
    java.lang.String str61 = range_long41.toString();
    boolean b63 = range_long41.isEndedBy((java.lang.Long)10L);
    boolean b64 = range_long18.isOverlappedBy(range_long41);
    Range<java.lang.Long> range_long65 = range_long9.intersectionWith(range_long18);
    java.util.Comparator<java.lang.Long> comparator_long68 = null;
    Range<java.lang.Long> range_long69 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long68);
    boolean b70 = range_long69.isNaturalOrdering();
    boolean b71 = range_long69.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long74 = null;
    Range<java.lang.Long> range_long75 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long74);
    boolean b76 = range_long75.isNaturalOrdering();
    boolean b77 = range_long75.isNaturalOrdering();
    Range<java.lang.Long> range_long78 = range_long69.intersectionWith(range_long75);
    java.util.Comparator<java.lang.Long> comparator_long79 = range_long69.getComparator();
    boolean b81 = range_long69.isBefore((java.lang.Long)10L);
    int i83 = range_long69.elementCompareTo((java.lang.Long)1L);
    java.util.Comparator<java.lang.Long> comparator_long86 = null;
    Range<java.lang.Long> range_long87 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long86);
    java.lang.Long long88 = range_long87.getMinimum();
    boolean b89 = range_long69.isBeforeRange(range_long87);
    boolean b90 = range_long9.isBeforeRange(range_long87);
    java.lang.Long long91 = range_long87.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "[-1..0]"+ "'", str61.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long78);
    org.junit.Assert.assertTrue("'" + comparator_long79 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long79.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-1L)+ "'", long88.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L+ "'", long91.equals(0L));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)10, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    java.util.Comparator<java.lang.Long> comparator_long14 = null;
    Range<java.lang.Long> range_long15 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long14);
    boolean b16 = range_long15.isNaturalOrdering();
    boolean b17 = range_long15.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    Range<java.lang.Long> range_long24 = range_long15.intersectionWith(range_long21);
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    boolean b29 = range_long21.containsRange(range_long28);
    boolean b30 = range_long11.isBeforeRange(range_long21);
    java.lang.String str31 = range_long11.toString();
    java.util.Comparator<java.lang.Long> comparator_long32 = range_long11.getComparator();
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long32);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long43.isNaturalOrdering();
    boolean b45 = range_long43.isNaturalOrdering();
    Range<java.lang.Long> range_long46 = range_long37.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    boolean b51 = range_long43.containsRange(range_long50);
    boolean b52 = range_long33.containsRange(range_long43);
    Range<java.lang.Long> range_long53 = range_long3.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long57.isNaturalOrdering();
    boolean b59 = range_long57.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long62 = null;
    Range<java.lang.Long> range_long63 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long62);
    boolean b64 = range_long63.isNaturalOrdering();
    boolean b65 = range_long63.isNaturalOrdering();
    Range<java.lang.Long> range_long66 = range_long57.intersectionWith(range_long63);
    java.util.Comparator<java.lang.Long> comparator_long69 = null;
    Range<java.lang.Long> range_long70 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long69);
    java.util.Comparator<java.lang.Long> comparator_long73 = null;
    Range<java.lang.Long> range_long74 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long73);
    boolean b75 = range_long74.isNaturalOrdering();
    boolean b76 = range_long74.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long79 = null;
    Range<java.lang.Long> range_long80 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long79);
    boolean b81 = range_long80.isNaturalOrdering();
    boolean b82 = range_long80.isNaturalOrdering();
    Range<java.lang.Long> range_long83 = range_long74.intersectionWith(range_long80);
    java.util.Comparator<java.lang.Long> comparator_long86 = null;
    Range<java.lang.Long> range_long87 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long86);
    boolean b88 = range_long80.containsRange(range_long87);
    boolean b89 = range_long70.isBeforeRange(range_long80);
    java.lang.String str90 = range_long70.toString();
    Range<java.lang.Long> range_long91 = range_long63.intersectionWith(range_long70);
    boolean b92 = range_long43.equals((java.lang.Object)range_long63);
    java.lang.Long long93 = range_long63.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[-1..0]"+ "'", str31.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "[-1..0]"+ "'", str90.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long93 + "' != '" + 0L+ "'", long93.equals(0L));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    boolean b14 = range_long9.isEndedBy((java.lang.Long)10L);
    java.lang.String str15 = range_long9.toString();
    boolean b17 = range_long9.isAfter((java.lang.Long)100L);
    boolean b19 = range_long9.isAfter((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1..0]"+ "'", str15.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long43.isNaturalOrdering();
    boolean b45 = range_long43.isNaturalOrdering();
    Range<java.lang.Long> range_long46 = range_long37.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    java.util.Comparator<java.lang.Long> comparator_long53 = null;
    Range<java.lang.Long> range_long54 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long53);
    boolean b55 = range_long54.isNaturalOrdering();
    boolean b56 = range_long54.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long59 = null;
    Range<java.lang.Long> range_long60 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long59);
    boolean b61 = range_long60.isNaturalOrdering();
    boolean b62 = range_long60.isNaturalOrdering();
    Range<java.lang.Long> range_long63 = range_long54.intersectionWith(range_long60);
    java.util.Comparator<java.lang.Long> comparator_long66 = null;
    Range<java.lang.Long> range_long67 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long66);
    boolean b68 = range_long60.containsRange(range_long67);
    boolean b69 = range_long50.isBeforeRange(range_long60);
    java.lang.String str70 = range_long50.toString();
    Range<java.lang.Long> range_long71 = range_long43.intersectionWith(range_long50);
    boolean b73 = range_long43.isBefore((java.lang.Long)1L);
    boolean b74 = range_long27.isOverlappedBy(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long75 = range_long43.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "[-1..0]"+ "'", str70.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    org.junit.Assert.assertTrue("'" + comparator_long75 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long75.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long3.getComparator();
    int i15 = range_long3.elementCompareTo((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long17 = range_long7.getComparator();
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long17);
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long17);
    boolean b21 = range_long19.isBefore((java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Long> comparator_long28 = null;
    Range<java.lang.Long> range_long29 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long28);
    boolean b30 = range_long29.isNaturalOrdering();
    boolean b31 = range_long29.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long34 = null;
    Range<java.lang.Long> range_long35 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long34);
    boolean b36 = range_long35.isNaturalOrdering();
    boolean b37 = range_long35.isNaturalOrdering();
    Range<java.lang.Long> range_long38 = range_long29.intersectionWith(range_long35);
    java.util.Comparator<java.lang.Long> comparator_long39 = range_long29.getComparator();
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long39);
    Range<java.lang.Long> range_long41 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long39);
    int i43 = range_long41.elementCompareTo((java.lang.Long)(-1L));
    boolean b44 = range_long19.containsRange(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    org.junit.Assert.assertTrue("'" + comparator_long17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long38);
    org.junit.Assert.assertTrue("'" + comparator_long39 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long39.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long20.isNaturalOrdering();
    boolean b22 = range_long20.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long25 = null;
    Range<java.lang.Long> range_long26 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long25);
    boolean b27 = range_long26.isNaturalOrdering();
    boolean b28 = range_long26.isNaturalOrdering();
    Range<java.lang.Long> range_long29 = range_long20.intersectionWith(range_long26);
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long26.containsRange(range_long33);
    boolean b35 = range_long16.isBeforeRange(range_long26);
    java.lang.String str36 = range_long16.toString();
    Range<java.lang.Long> range_long37 = range_long9.intersectionWith(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long40 = null;
    Range<java.lang.Long> range_long41 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long40);
    boolean b42 = range_long41.isNaturalOrdering();
    boolean b43 = range_long41.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long46 = null;
    Range<java.lang.Long> range_long47 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long46);
    boolean b48 = range_long47.isNaturalOrdering();
    boolean b49 = range_long47.isNaturalOrdering();
    Range<java.lang.Long> range_long50 = range_long41.intersectionWith(range_long47);
    boolean b52 = range_long47.isEndedBy((java.lang.Long)10L);
    java.lang.String str53 = range_long47.toString();
    boolean b54 = range_long16.containsRange(range_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[-1..0]"+ "'", str36.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[-1..0]"+ "'", str53.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long12.getComparator();
    java.lang.Long long14 = range_long12.getMaximum();
    java.lang.String str16 = range_long12.toString("[1..1]");
    java.util.Comparator<java.lang.Long> comparator_long17 = range_long12.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L+ "'", long14.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[1..1]"+ "'", str16.equals("[1..1]"));
    org.junit.Assert.assertTrue("'" + comparator_long17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long17.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.lang.Long long4 = range_long3.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    java.util.Comparator<java.lang.Long> comparator_long11 = null;
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long11);
    boolean b13 = range_long12.isNaturalOrdering();
    boolean b14 = range_long12.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    boolean b19 = range_long18.isNaturalOrdering();
    boolean b20 = range_long18.isNaturalOrdering();
    Range<java.lang.Long> range_long21 = range_long12.intersectionWith(range_long18);
    java.util.Comparator<java.lang.Long> comparator_long24 = null;
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long24);
    boolean b26 = range_long18.containsRange(range_long25);
    boolean b27 = range_long8.containsRange(range_long18);
    boolean b28 = range_long3.containsRange(range_long8);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    java.util.Comparator<java.lang.Long> comparator_long35 = null;
    Range<java.lang.Long> range_long36 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long35);
    boolean b37 = range_long36.isNaturalOrdering();
    boolean b38 = range_long36.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long41 = null;
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long41);
    boolean b43 = range_long42.isNaturalOrdering();
    boolean b44 = range_long42.isNaturalOrdering();
    Range<java.lang.Long> range_long45 = range_long36.intersectionWith(range_long42);
    java.util.Comparator<java.lang.Long> comparator_long48 = null;
    Range<java.lang.Long> range_long49 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long48);
    boolean b50 = range_long42.containsRange(range_long49);
    boolean b51 = range_long32.isBeforeRange(range_long42);
    Range<java.lang.Long> range_long52 = range_long8.intersectionWith(range_long42);
    boolean b54 = range_long8.isBefore((java.lang.Long)1L);
    boolean b55 = range_long8.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L)+ "'", long4.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long14 = null;
    Range<java.lang.Long> range_long15 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long14);
    boolean b16 = range_long15.isNaturalOrdering();
    boolean b17 = range_long15.isNaturalOrdering();
    Range<java.lang.Long> range_long18 = range_long9.intersectionWith(range_long15);
    java.util.Comparator<java.lang.Long> comparator_long21 = null;
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long21);
    boolean b23 = range_long15.containsRange(range_long22);
    boolean b24 = range_long5.isBeforeRange(range_long15);
    java.lang.String str25 = range_long5.toString();
    java.util.Comparator<java.lang.Long> comparator_long26 = range_long5.getComparator();
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long26);
    boolean b29 = range_long27.isStartedBy((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[-1..0]"+ "'", str25.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long26 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long26.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    java.util.Comparator<java.lang.Long> comparator_long14 = null;
    Range<java.lang.Long> range_long15 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long14);
    boolean b16 = range_long15.isNaturalOrdering();
    boolean b17 = range_long15.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    Range<java.lang.Long> range_long24 = range_long15.intersectionWith(range_long21);
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    boolean b29 = range_long21.containsRange(range_long28);
    boolean b30 = range_long11.isBeforeRange(range_long21);
    java.lang.String str31 = range_long11.toString();
    java.util.Comparator<java.lang.Long> comparator_long32 = range_long11.getComparator();
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long32);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long43.isNaturalOrdering();
    boolean b45 = range_long43.isNaturalOrdering();
    Range<java.lang.Long> range_long46 = range_long37.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    boolean b51 = range_long43.containsRange(range_long50);
    boolean b52 = range_long33.containsRange(range_long43);
    Range<java.lang.Long> range_long53 = range_long3.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long57.isNaturalOrdering();
    boolean b59 = range_long57.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long62 = null;
    Range<java.lang.Long> range_long63 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long62);
    boolean b64 = range_long63.isNaturalOrdering();
    boolean b65 = range_long63.isNaturalOrdering();
    Range<java.lang.Long> range_long66 = range_long57.intersectionWith(range_long63);
    java.util.Comparator<java.lang.Long> comparator_long69 = null;
    Range<java.lang.Long> range_long70 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long69);
    java.util.Comparator<java.lang.Long> comparator_long73 = null;
    Range<java.lang.Long> range_long74 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long73);
    boolean b75 = range_long74.isNaturalOrdering();
    boolean b76 = range_long74.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long79 = null;
    Range<java.lang.Long> range_long80 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long79);
    boolean b81 = range_long80.isNaturalOrdering();
    boolean b82 = range_long80.isNaturalOrdering();
    Range<java.lang.Long> range_long83 = range_long74.intersectionWith(range_long80);
    java.util.Comparator<java.lang.Long> comparator_long86 = null;
    Range<java.lang.Long> range_long87 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long86);
    boolean b88 = range_long80.containsRange(range_long87);
    boolean b89 = range_long70.isBeforeRange(range_long80);
    java.lang.String str90 = range_long70.toString();
    Range<java.lang.Long> range_long91 = range_long63.intersectionWith(range_long70);
    boolean b92 = range_long43.equals((java.lang.Object)range_long63);
    boolean b94 = range_long63.isEndedBy((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[-1..0]"+ "'", str31.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "[-1..0]"+ "'", str90.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    boolean b7 = range_long3.isStartedBy((java.lang.Long)10L);
    java.lang.String str8 = range_long3.toString();
    int i10 = range_long3.elementCompareTo((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1..0]"+ "'", str8.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long3.getComparator();
    boolean b15 = range_long3.isBefore((java.lang.Long)10L);
    int i17 = range_long3.elementCompareTo((java.lang.Long)1L);
    int i19 = range_long3.elementCompareTo((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    boolean b9 = range_long8.isNaturalOrdering();
    boolean b10 = range_long8.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long13 = null;
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long13);
    boolean b15 = range_long14.isNaturalOrdering();
    boolean b16 = range_long14.isNaturalOrdering();
    Range<java.lang.Long> range_long17 = range_long8.intersectionWith(range_long14);
    java.util.Comparator<java.lang.Long> comparator_long18 = range_long8.getComparator();
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long18);
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long18);
    Range<java.lang.Long> range_long21 = Range.is((java.lang.Long)0L, comparator_long18);
    boolean b23 = range_long21.contains((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    org.junit.Assert.assertTrue("'" + comparator_long18 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long18.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long13.containsRange(range_long20);
    boolean b22 = range_long3.containsRange(range_long13);
    java.lang.String str24 = range_long3.toString("[-1..0]");
    int i26 = range_long3.elementCompareTo((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[-1..0]"+ "'", str24.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)1L, comparator_long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long5 = range_long3.getComparator();
    boolean b7 = range_long3.isEndedBy((java.lang.Long)0L);
    java.util.Comparator<java.lang.Long> comparator_long8 = range_long3.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    org.junit.Assert.assertTrue("'" + comparator_long5 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long5.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    org.junit.Assert.assertTrue("'" + comparator_long8 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long8.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    boolean b34 = range_long9.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long37 = null;
    Range<java.lang.Long> range_long38 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long37);
    boolean b39 = range_long38.isNaturalOrdering();
    boolean b40 = range_long38.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long43 = null;
    Range<java.lang.Long> range_long44 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long43);
    boolean b45 = range_long44.isNaturalOrdering();
    boolean b46 = range_long44.isNaturalOrdering();
    Range<java.lang.Long> range_long47 = range_long38.intersectionWith(range_long44);
    java.util.Comparator<java.lang.Long> comparator_long48 = range_long38.getComparator();
    int i50 = range_long38.elementCompareTo((java.lang.Long)100L);
    java.util.Comparator<java.lang.Long> comparator_long53 = null;
    Range<java.lang.Long> range_long54 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long53);
    boolean b55 = range_long54.isNaturalOrdering();
    boolean b56 = range_long54.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long59 = null;
    Range<java.lang.Long> range_long60 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long59);
    boolean b61 = range_long60.isNaturalOrdering();
    boolean b62 = range_long60.isNaturalOrdering();
    Range<java.lang.Long> range_long63 = range_long54.intersectionWith(range_long60);
    java.util.Comparator<java.lang.Long> comparator_long66 = null;
    Range<java.lang.Long> range_long67 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long66);
    boolean b68 = range_long60.containsRange(range_long67);
    java.util.Comparator<java.lang.Long> comparator_long71 = null;
    Range<java.lang.Long> range_long72 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long71);
    boolean b73 = range_long72.isNaturalOrdering();
    boolean b74 = range_long72.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long77 = null;
    Range<java.lang.Long> range_long78 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long77);
    boolean b79 = range_long78.isNaturalOrdering();
    boolean b80 = range_long78.isNaturalOrdering();
    Range<java.lang.Long> range_long81 = range_long72.intersectionWith(range_long78);
    boolean b83 = range_long78.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long84 = range_long60.intersectionWith(range_long78);
    java.util.Comparator<java.lang.Long> comparator_long85 = range_long60.getComparator();
    boolean b86 = range_long38.isOverlappedBy(range_long60);
    boolean b87 = range_long9.isOverlappedBy(range_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long47);
    org.junit.Assert.assertTrue("'" + comparator_long48 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long48.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long84);
    org.junit.Assert.assertTrue("'" + comparator_long85 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long85.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long12.getComparator();
    java.lang.Long long14 = range_long12.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    java.lang.Long long19 = range_long18.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long33.isNaturalOrdering();
    boolean b35 = range_long33.isNaturalOrdering();
    Range<java.lang.Long> range_long36 = range_long27.intersectionWith(range_long33);
    java.util.Comparator<java.lang.Long> comparator_long39 = null;
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long39);
    boolean b41 = range_long33.containsRange(range_long40);
    boolean b42 = range_long23.containsRange(range_long33);
    boolean b43 = range_long18.containsRange(range_long23);
    java.util.Comparator<java.lang.Long> comparator_long46 = null;
    Range<java.lang.Long> range_long47 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long46);
    java.util.Comparator<java.lang.Long> comparator_long50 = null;
    Range<java.lang.Long> range_long51 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long50);
    boolean b52 = range_long51.isNaturalOrdering();
    boolean b53 = range_long51.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long57.isNaturalOrdering();
    boolean b59 = range_long57.isNaturalOrdering();
    Range<java.lang.Long> range_long60 = range_long51.intersectionWith(range_long57);
    java.util.Comparator<java.lang.Long> comparator_long63 = null;
    Range<java.lang.Long> range_long64 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long63);
    boolean b65 = range_long57.containsRange(range_long64);
    boolean b66 = range_long47.isBeforeRange(range_long57);
    Range<java.lang.Long> range_long67 = range_long23.intersectionWith(range_long57);
    Range<java.lang.Long> range_long68 = range_long12.intersectionWith(range_long67);
    java.util.Comparator<java.lang.Long> comparator_long69 = range_long68.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L+ "'", long14.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L)+ "'", long19.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long68);
    org.junit.Assert.assertTrue("'" + comparator_long69 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long69.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long12.getComparator();
    java.lang.Long long14 = range_long12.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    java.lang.Long long19 = range_long18.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long33.isNaturalOrdering();
    boolean b35 = range_long33.isNaturalOrdering();
    Range<java.lang.Long> range_long36 = range_long27.intersectionWith(range_long33);
    java.util.Comparator<java.lang.Long> comparator_long39 = null;
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long39);
    boolean b41 = range_long33.containsRange(range_long40);
    boolean b42 = range_long23.containsRange(range_long33);
    boolean b43 = range_long18.containsRange(range_long23);
    java.util.Comparator<java.lang.Long> comparator_long46 = null;
    Range<java.lang.Long> range_long47 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long46);
    java.util.Comparator<java.lang.Long> comparator_long50 = null;
    Range<java.lang.Long> range_long51 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long50);
    boolean b52 = range_long51.isNaturalOrdering();
    boolean b53 = range_long51.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long57.isNaturalOrdering();
    boolean b59 = range_long57.isNaturalOrdering();
    Range<java.lang.Long> range_long60 = range_long51.intersectionWith(range_long57);
    java.util.Comparator<java.lang.Long> comparator_long63 = null;
    Range<java.lang.Long> range_long64 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long63);
    boolean b65 = range_long57.containsRange(range_long64);
    boolean b66 = range_long47.isBeforeRange(range_long57);
    Range<java.lang.Long> range_long67 = range_long23.intersectionWith(range_long57);
    Range<java.lang.Long> range_long68 = range_long12.intersectionWith(range_long67);
    java.lang.Long long69 = range_long68.getMaximum();
    java.lang.Long long70 = range_long68.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L+ "'", long14.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L)+ "'", long19.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L+ "'", long69.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L)+ "'", long70.equals((-1L)));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long43.isNaturalOrdering();
    boolean b45 = range_long43.isNaturalOrdering();
    Range<java.lang.Long> range_long46 = range_long37.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    java.util.Comparator<java.lang.Long> comparator_long53 = null;
    Range<java.lang.Long> range_long54 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long53);
    boolean b55 = range_long54.isNaturalOrdering();
    boolean b56 = range_long54.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long59 = null;
    Range<java.lang.Long> range_long60 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long59);
    boolean b61 = range_long60.isNaturalOrdering();
    boolean b62 = range_long60.isNaturalOrdering();
    Range<java.lang.Long> range_long63 = range_long54.intersectionWith(range_long60);
    java.util.Comparator<java.lang.Long> comparator_long66 = null;
    Range<java.lang.Long> range_long67 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long66);
    boolean b68 = range_long60.containsRange(range_long67);
    boolean b69 = range_long50.isBeforeRange(range_long60);
    java.lang.String str70 = range_long50.toString();
    Range<java.lang.Long> range_long71 = range_long43.intersectionWith(range_long50);
    boolean b73 = range_long43.isBefore((java.lang.Long)1L);
    boolean b74 = range_long27.isOverlappedBy(range_long43);
    java.lang.Long long75 = range_long27.getMaximum();
    java.lang.String str77 = range_long27.toString("[-1..0]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "[-1..0]"+ "'", str70.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L+ "'", long75.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "[-1..0]"+ "'", str77.equals("[-1..0]"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    boolean b7 = range_long3.isStartedBy((java.lang.Long)10L);
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    java.lang.Long long12 = range_long11.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long20.isNaturalOrdering();
    boolean b22 = range_long20.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long25 = null;
    Range<java.lang.Long> range_long26 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long25);
    boolean b27 = range_long26.isNaturalOrdering();
    boolean b28 = range_long26.isNaturalOrdering();
    Range<java.lang.Long> range_long29 = range_long20.intersectionWith(range_long26);
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long26.containsRange(range_long33);
    boolean b35 = range_long16.containsRange(range_long26);
    boolean b36 = range_long11.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long39 = null;
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long39);
    java.util.Comparator<java.lang.Long> comparator_long43 = null;
    Range<java.lang.Long> range_long44 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long43);
    boolean b45 = range_long44.isNaturalOrdering();
    boolean b46 = range_long44.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    boolean b51 = range_long50.isNaturalOrdering();
    boolean b52 = range_long50.isNaturalOrdering();
    Range<java.lang.Long> range_long53 = range_long44.intersectionWith(range_long50);
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long50.containsRange(range_long57);
    boolean b59 = range_long40.isBeforeRange(range_long50);
    Range<java.lang.Long> range_long60 = range_long16.intersectionWith(range_long50);
    boolean b61 = range_long3.equals((java.lang.Object)range_long60);
    java.util.Comparator<java.lang.Long> comparator_long64 = null;
    Range<java.lang.Long> range_long65 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long64);
    boolean b66 = range_long65.isNaturalOrdering();
    boolean b67 = range_long65.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long70 = null;
    Range<java.lang.Long> range_long71 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long70);
    boolean b72 = range_long71.isNaturalOrdering();
    boolean b73 = range_long71.isNaturalOrdering();
    Range<java.lang.Long> range_long74 = range_long65.intersectionWith(range_long71);
    java.util.Comparator<java.lang.Long> comparator_long75 = range_long74.getComparator();
    java.lang.Long long76 = range_long74.getMaximum();
    java.lang.String str78 = range_long74.toString("[1..1]");
    boolean b80 = range_long74.isStartedBy((java.lang.Long)(-1L));
    java.lang.String str81 = range_long74.toString();
    boolean b82 = range_long60.isOverlappedBy(range_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L)+ "'", long12.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long74);
    org.junit.Assert.assertTrue("'" + comparator_long75 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long75.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L+ "'", long76.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "[1..1]"+ "'", str78.equals("[1..1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "[-1..0]"+ "'", str81.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    boolean b35 = range_long27.contains((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long17 = range_long16.getComparator();
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long17);
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)0L, (java.lang.Long)1L, comparator_long17);
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    boolean b24 = range_long23.isNaturalOrdering();
    boolean b25 = range_long23.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long28 = null;
    Range<java.lang.Long> range_long29 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long28);
    boolean b30 = range_long29.isNaturalOrdering();
    boolean b31 = range_long29.isNaturalOrdering();
    Range<java.lang.Long> range_long32 = range_long23.intersectionWith(range_long29);
    boolean b34 = range_long32.isAfter((java.lang.Long)(-1L));
    boolean b35 = range_long19.containsRange(range_long32);
    boolean b37 = range_long32.isEndedBy((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    org.junit.Assert.assertTrue("'" + comparator_long17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long17 = range_long16.getComparator();
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long17);
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)0L, (java.lang.Long)1L, comparator_long17);
    java.lang.Long long20 = range_long19.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    org.junit.Assert.assertTrue("'" + comparator_long17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L+ "'", long20.equals(0L));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long3.getComparator();
    boolean b15 = range_long3.isBefore((java.lang.Long)10L);
    java.lang.String str17 = range_long3.toString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long13.containsRange(range_long20);
    boolean b22 = range_long3.isBeforeRange(range_long13);
    java.lang.String str23 = range_long3.toString();
    java.util.Comparator<java.lang.Long> comparator_long24 = range_long3.getComparator();
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    boolean b29 = range_long28.isNaturalOrdering();
    boolean b30 = range_long28.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long33 = null;
    Range<java.lang.Long> range_long34 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long33);
    boolean b35 = range_long34.isNaturalOrdering();
    boolean b36 = range_long34.isNaturalOrdering();
    Range<java.lang.Long> range_long37 = range_long28.intersectionWith(range_long34);
    boolean b39 = range_long34.isEndedBy((java.lang.Long)10L);
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    java.util.Comparator<java.lang.Long> comparator_long46 = null;
    Range<java.lang.Long> range_long47 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long46);
    boolean b48 = range_long47.isNaturalOrdering();
    boolean b49 = range_long47.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long52 = null;
    Range<java.lang.Long> range_long53 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long52);
    boolean b54 = range_long53.isNaturalOrdering();
    boolean b55 = range_long53.isNaturalOrdering();
    Range<java.lang.Long> range_long56 = range_long47.intersectionWith(range_long53);
    java.util.Comparator<java.lang.Long> comparator_long59 = null;
    Range<java.lang.Long> range_long60 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long59);
    boolean b61 = range_long53.containsRange(range_long60);
    boolean b62 = range_long43.containsRange(range_long53);
    java.util.Comparator<java.lang.Long> comparator_long65 = null;
    Range<java.lang.Long> range_long66 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long65);
    java.util.Comparator<java.lang.Long> comparator_long69 = null;
    Range<java.lang.Long> range_long70 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long69);
    boolean b71 = range_long70.isNaturalOrdering();
    boolean b72 = range_long70.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long75 = null;
    Range<java.lang.Long> range_long76 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long75);
    boolean b77 = range_long76.isNaturalOrdering();
    boolean b78 = range_long76.isNaturalOrdering();
    Range<java.lang.Long> range_long79 = range_long70.intersectionWith(range_long76);
    java.util.Comparator<java.lang.Long> comparator_long82 = null;
    Range<java.lang.Long> range_long83 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long82);
    boolean b84 = range_long76.containsRange(range_long83);
    boolean b85 = range_long66.isBeforeRange(range_long76);
    java.lang.String str86 = range_long66.toString();
    boolean b88 = range_long66.isEndedBy((java.lang.Long)10L);
    boolean b89 = range_long43.isOverlappedBy(range_long66);
    Range<java.lang.Long> range_long90 = range_long34.intersectionWith(range_long43);
    boolean b91 = range_long3.isBeforeRange(range_long43);
    java.lang.String str92 = range_long3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[-1..0]"+ "'", str23.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "[-1..0]"+ "'", str86.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str92 + "' != '" + "[-1..0]"+ "'", str92.equals("[-1..0]"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long17 = range_long16.getComparator();
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long17);
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)0L, (java.lang.Long)1L, comparator_long17);
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    boolean b24 = range_long23.isNaturalOrdering();
    boolean b25 = range_long23.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long28 = null;
    Range<java.lang.Long> range_long29 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long28);
    boolean b30 = range_long29.isNaturalOrdering();
    boolean b31 = range_long29.isNaturalOrdering();
    Range<java.lang.Long> range_long32 = range_long23.intersectionWith(range_long29);
    boolean b34 = range_long32.isAfter((java.lang.Long)(-1L));
    boolean b35 = range_long19.containsRange(range_long32);
    int i37 = range_long32.elementCompareTo((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    org.junit.Assert.assertTrue("'" + comparator_long17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long12.getComparator();
    java.lang.Long long14 = range_long12.getMaximum();
    java.lang.String str16 = range_long12.toString("[1..1]");
    boolean b18 = range_long12.isStartedBy((java.lang.Long)(-1L));
    java.lang.String str19 = range_long12.toString();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    boolean b24 = range_long23.isNaturalOrdering();
    boolean b25 = range_long23.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long28 = null;
    Range<java.lang.Long> range_long29 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long28);
    boolean b30 = range_long29.isNaturalOrdering();
    boolean b31 = range_long29.isNaturalOrdering();
    Range<java.lang.Long> range_long32 = range_long23.intersectionWith(range_long29);
    java.util.Comparator<java.lang.Long> comparator_long35 = null;
    Range<java.lang.Long> range_long36 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long35);
    boolean b37 = range_long29.containsRange(range_long36);
    java.util.Comparator<java.lang.Long> comparator_long40 = null;
    Range<java.lang.Long> range_long41 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long40);
    boolean b42 = range_long41.isNaturalOrdering();
    boolean b43 = range_long36.containsRange(range_long41);
    java.lang.String str45 = range_long36.toString("");
    boolean b46 = range_long12.isAfterRange(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L+ "'", long14.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[1..1]"+ "'", str16.equals("[1..1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[-1..0]"+ "'", str19.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long17 = range_long16.getComparator();
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long17);
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)0L, (java.lang.Long)1L, comparator_long17);
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    boolean b24 = range_long23.isNaturalOrdering();
    boolean b25 = range_long23.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long28 = null;
    Range<java.lang.Long> range_long29 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long28);
    boolean b30 = range_long29.isNaturalOrdering();
    boolean b31 = range_long29.isNaturalOrdering();
    Range<java.lang.Long> range_long32 = range_long23.intersectionWith(range_long29);
    boolean b34 = range_long32.isAfter((java.lang.Long)(-1L));
    boolean b35 = range_long19.containsRange(range_long32);
    java.util.Comparator<java.lang.Long> comparator_long36 = range_long19.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    org.junit.Assert.assertTrue("'" + comparator_long17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    org.junit.Assert.assertTrue("'" + comparator_long36 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long36.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long13.containsRange(range_long20);
    boolean b22 = range_long3.isBeforeRange(range_long13);
    int i24 = range_long13.elementCompareTo((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    boolean b14 = range_long9.isEndedBy((java.lang.Long)10L);
    java.lang.String str15 = range_long9.toString();
    java.lang.Long long16 = range_long9.getMaximum();
    boolean b18 = range_long9.isAfter((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1..0]"+ "'", str15.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L+ "'", long16.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long3.getComparator();
    boolean b15 = range_long3.isBefore((java.lang.Long)10L);
    int i17 = range_long3.elementCompareTo((java.lang.Long)1L);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    java.lang.Long long22 = range_long21.getMinimum();
    boolean b23 = range_long3.isBeforeRange(range_long21);
    boolean b25 = range_long21.isEndedBy((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L)+ "'", long22.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    java.lang.String str5 = range_long3.toString();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long18 = null;
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long18);
    boolean b20 = range_long19.isNaturalOrdering();
    boolean b21 = range_long19.isNaturalOrdering();
    Range<java.lang.Long> range_long22 = range_long13.intersectionWith(range_long19);
    java.util.Comparator<java.lang.Long> comparator_long23 = range_long13.getComparator();
    Range<java.lang.Long> range_long24 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long23);
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long23);
    boolean b26 = range_long3.equals((java.lang.Object)(-1L));
    java.util.Comparator<java.lang.Long> comparator_long29 = null;
    Range<java.lang.Long> range_long30 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long29);
    boolean b31 = range_long30.isNaturalOrdering();
    boolean b32 = range_long30.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long35 = null;
    Range<java.lang.Long> range_long36 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long35);
    boolean b37 = range_long36.isNaturalOrdering();
    boolean b38 = range_long36.isNaturalOrdering();
    Range<java.lang.Long> range_long39 = range_long30.intersectionWith(range_long36);
    java.util.Comparator<java.lang.Long> comparator_long40 = range_long39.getComparator();
    java.lang.Long long41 = range_long39.getMaximum();
    java.lang.String str43 = range_long39.toString("[1..1]");
    boolean b45 = range_long39.isStartedBy((java.lang.Long)(-1L));
    java.lang.String str46 = range_long39.toString();
    boolean b47 = range_long3.containsRange(range_long39);
    java.lang.Long long48 = range_long3.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1..0]"+ "'", str5.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    org.junit.Assert.assertTrue("'" + comparator_long23 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long23.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long39);
    org.junit.Assert.assertTrue("'" + comparator_long40 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long40.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L+ "'", long41.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[1..1]"+ "'", str43.equals("[1..1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[-1..0]"+ "'", str46.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L+ "'", long48.equals(0L));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long3.getComparator();
    int i15 = range_long3.elementCompareTo((java.lang.Long)100L);
    boolean b17 = range_long3.isBefore((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.lang.Long long4 = range_long3.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    java.util.Comparator<java.lang.Long> comparator_long11 = null;
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long11);
    boolean b13 = range_long12.isNaturalOrdering();
    boolean b14 = range_long12.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    boolean b19 = range_long18.isNaturalOrdering();
    boolean b20 = range_long18.isNaturalOrdering();
    Range<java.lang.Long> range_long21 = range_long12.intersectionWith(range_long18);
    java.util.Comparator<java.lang.Long> comparator_long24 = null;
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long24);
    boolean b26 = range_long18.containsRange(range_long25);
    boolean b27 = range_long8.containsRange(range_long18);
    boolean b28 = range_long3.containsRange(range_long8);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    java.util.Comparator<java.lang.Long> comparator_long35 = null;
    Range<java.lang.Long> range_long36 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long35);
    boolean b37 = range_long36.isNaturalOrdering();
    boolean b38 = range_long36.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long41 = null;
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long41);
    boolean b43 = range_long42.isNaturalOrdering();
    boolean b44 = range_long42.isNaturalOrdering();
    Range<java.lang.Long> range_long45 = range_long36.intersectionWith(range_long42);
    java.util.Comparator<java.lang.Long> comparator_long48 = null;
    Range<java.lang.Long> range_long49 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long48);
    boolean b50 = range_long42.containsRange(range_long49);
    boolean b51 = range_long32.isBeforeRange(range_long42);
    Range<java.lang.Long> range_long52 = range_long8.intersectionWith(range_long42);
    java.util.Comparator<java.lang.Long> comparator_long53 = range_long8.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L)+ "'", long4.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    org.junit.Assert.assertTrue("'" + comparator_long53 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long53.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    java.lang.Long long38 = range_long37.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long41 = null;
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long41);
    java.util.Comparator<java.lang.Long> comparator_long45 = null;
    Range<java.lang.Long> range_long46 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long45);
    boolean b47 = range_long46.isNaturalOrdering();
    boolean b48 = range_long46.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long51 = null;
    Range<java.lang.Long> range_long52 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long51);
    boolean b53 = range_long52.isNaturalOrdering();
    boolean b54 = range_long52.isNaturalOrdering();
    Range<java.lang.Long> range_long55 = range_long46.intersectionWith(range_long52);
    java.util.Comparator<java.lang.Long> comparator_long58 = null;
    Range<java.lang.Long> range_long59 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long58);
    boolean b60 = range_long52.containsRange(range_long59);
    boolean b61 = range_long42.containsRange(range_long52);
    boolean b62 = range_long37.containsRange(range_long42);
    java.util.Comparator<java.lang.Long> comparator_long65 = null;
    Range<java.lang.Long> range_long66 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long65);
    java.util.Comparator<java.lang.Long> comparator_long69 = null;
    Range<java.lang.Long> range_long70 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long69);
    boolean b71 = range_long70.isNaturalOrdering();
    boolean b72 = range_long70.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long75 = null;
    Range<java.lang.Long> range_long76 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long75);
    boolean b77 = range_long76.isNaturalOrdering();
    boolean b78 = range_long76.isNaturalOrdering();
    Range<java.lang.Long> range_long79 = range_long70.intersectionWith(range_long76);
    java.util.Comparator<java.lang.Long> comparator_long82 = null;
    Range<java.lang.Long> range_long83 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long82);
    boolean b84 = range_long76.containsRange(range_long83);
    boolean b85 = range_long66.isBeforeRange(range_long76);
    boolean b86 = range_long42.isOverlappedBy(range_long66);
    boolean b87 = range_long33.isAfterRange(range_long66);
    boolean b89 = range_long66.contains((java.lang.Long)0L);
    Range<java.lang.Long> range_long90 = null;
    boolean b91 = range_long66.isOverlappedBy(range_long90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L)+ "'", long38.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    java.lang.Long long38 = range_long37.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long41 = null;
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long41);
    java.util.Comparator<java.lang.Long> comparator_long45 = null;
    Range<java.lang.Long> range_long46 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long45);
    boolean b47 = range_long46.isNaturalOrdering();
    boolean b48 = range_long46.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long51 = null;
    Range<java.lang.Long> range_long52 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long51);
    boolean b53 = range_long52.isNaturalOrdering();
    boolean b54 = range_long52.isNaturalOrdering();
    Range<java.lang.Long> range_long55 = range_long46.intersectionWith(range_long52);
    java.util.Comparator<java.lang.Long> comparator_long58 = null;
    Range<java.lang.Long> range_long59 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long58);
    boolean b60 = range_long52.containsRange(range_long59);
    boolean b61 = range_long42.containsRange(range_long52);
    boolean b62 = range_long37.containsRange(range_long42);
    java.util.Comparator<java.lang.Long> comparator_long65 = null;
    Range<java.lang.Long> range_long66 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long65);
    java.util.Comparator<java.lang.Long> comparator_long69 = null;
    Range<java.lang.Long> range_long70 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long69);
    boolean b71 = range_long70.isNaturalOrdering();
    boolean b72 = range_long70.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long75 = null;
    Range<java.lang.Long> range_long76 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long75);
    boolean b77 = range_long76.isNaturalOrdering();
    boolean b78 = range_long76.isNaturalOrdering();
    Range<java.lang.Long> range_long79 = range_long70.intersectionWith(range_long76);
    java.util.Comparator<java.lang.Long> comparator_long82 = null;
    Range<java.lang.Long> range_long83 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long82);
    boolean b84 = range_long76.containsRange(range_long83);
    boolean b85 = range_long66.isBeforeRange(range_long76);
    boolean b86 = range_long42.isOverlappedBy(range_long66);
    boolean b87 = range_long33.isAfterRange(range_long66);
    int i89 = range_long33.elementCompareTo((java.lang.Long)100L);
    boolean b91 = range_long33.isBefore((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L)+ "'", long38.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long43.isNaturalOrdering();
    boolean b45 = range_long43.isNaturalOrdering();
    Range<java.lang.Long> range_long46 = range_long37.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    java.util.Comparator<java.lang.Long> comparator_long53 = null;
    Range<java.lang.Long> range_long54 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long53);
    boolean b55 = range_long54.isNaturalOrdering();
    boolean b56 = range_long54.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long59 = null;
    Range<java.lang.Long> range_long60 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long59);
    boolean b61 = range_long60.isNaturalOrdering();
    boolean b62 = range_long60.isNaturalOrdering();
    Range<java.lang.Long> range_long63 = range_long54.intersectionWith(range_long60);
    java.util.Comparator<java.lang.Long> comparator_long66 = null;
    Range<java.lang.Long> range_long67 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long66);
    boolean b68 = range_long60.containsRange(range_long67);
    boolean b69 = range_long50.isBeforeRange(range_long60);
    java.lang.String str70 = range_long50.toString();
    Range<java.lang.Long> range_long71 = range_long43.intersectionWith(range_long50);
    boolean b73 = range_long43.isBefore((java.lang.Long)1L);
    boolean b74 = range_long27.isOverlappedBy(range_long43);
    java.lang.Long long75 = range_long27.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long78 = null;
    Range<java.lang.Long> range_long79 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long78);
    boolean b80 = range_long79.isNaturalOrdering();
    boolean b81 = range_long79.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long84 = null;
    Range<java.lang.Long> range_long85 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long84);
    boolean b86 = range_long85.isNaturalOrdering();
    boolean b87 = range_long85.isNaturalOrdering();
    Range<java.lang.Long> range_long88 = range_long79.intersectionWith(range_long85);
    boolean b89 = range_long27.isOverlappedBy(range_long88);
    boolean b91 = range_long27.isBefore((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "[-1..0]"+ "'", str70.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L+ "'", long75.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long14 = null;
    Range<java.lang.Long> range_long15 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long14);
    boolean b16 = range_long15.isNaturalOrdering();
    boolean b17 = range_long15.isNaturalOrdering();
    Range<java.lang.Long> range_long18 = range_long9.intersectionWith(range_long15);
    java.util.Comparator<java.lang.Long> comparator_long21 = null;
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long21);
    boolean b23 = range_long15.containsRange(range_long22);
    boolean b24 = range_long5.isBeforeRange(range_long15);
    java.lang.String str25 = range_long5.toString();
    java.util.Comparator<java.lang.Long> comparator_long26 = range_long5.getComparator();
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long26);
    java.util.Comparator<java.lang.Long> comparator_long30 = null;
    Range<java.lang.Long> range_long31 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long30);
    boolean b32 = range_long31.isNaturalOrdering();
    boolean b33 = range_long31.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    Range<java.lang.Long> range_long40 = range_long31.intersectionWith(range_long37);
    java.util.Comparator<java.lang.Long> comparator_long43 = null;
    Range<java.lang.Long> range_long44 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long43);
    boolean b45 = range_long37.containsRange(range_long44);
    boolean b46 = range_long27.containsRange(range_long37);
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    boolean b51 = range_long50.isNaturalOrdering();
    boolean b52 = range_long50.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long55 = null;
    Range<java.lang.Long> range_long56 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long55);
    boolean b57 = range_long56.isNaturalOrdering();
    boolean b58 = range_long56.isNaturalOrdering();
    Range<java.lang.Long> range_long59 = range_long50.intersectionWith(range_long56);
    java.util.Comparator<java.lang.Long> comparator_long62 = null;
    Range<java.lang.Long> range_long63 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long62);
    boolean b64 = range_long56.containsRange(range_long63);
    java.util.Comparator<java.lang.Long> comparator_long67 = null;
    Range<java.lang.Long> range_long68 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long67);
    boolean b69 = range_long68.isNaturalOrdering();
    boolean b70 = range_long63.containsRange(range_long68);
    java.lang.String str72 = range_long63.toString("");
    boolean b73 = range_long27.isAfterRange(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[-1..0]"+ "'", str25.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long26 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long26.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + ""+ "'", str72.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long2);
    java.lang.Long long4 = range_long3.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    boolean b9 = range_long8.isNaturalOrdering();
    boolean b10 = range_long8.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long13 = null;
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long13);
    boolean b15 = range_long14.isNaturalOrdering();
    boolean b16 = range_long14.isNaturalOrdering();
    Range<java.lang.Long> range_long17 = range_long8.intersectionWith(range_long14);
    java.util.Comparator<java.lang.Long> comparator_long18 = range_long17.getComparator();
    java.lang.Long long19 = range_long17.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.lang.Long long24 = range_long23.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    boolean b33 = range_long32.isNaturalOrdering();
    boolean b34 = range_long32.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long37 = null;
    Range<java.lang.Long> range_long38 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long37);
    boolean b39 = range_long38.isNaturalOrdering();
    boolean b40 = range_long38.isNaturalOrdering();
    Range<java.lang.Long> range_long41 = range_long32.intersectionWith(range_long38);
    java.util.Comparator<java.lang.Long> comparator_long44 = null;
    Range<java.lang.Long> range_long45 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long44);
    boolean b46 = range_long38.containsRange(range_long45);
    boolean b47 = range_long28.containsRange(range_long38);
    boolean b48 = range_long23.containsRange(range_long28);
    java.util.Comparator<java.lang.Long> comparator_long51 = null;
    Range<java.lang.Long> range_long52 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long51);
    java.util.Comparator<java.lang.Long> comparator_long55 = null;
    Range<java.lang.Long> range_long56 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long55);
    boolean b57 = range_long56.isNaturalOrdering();
    boolean b58 = range_long56.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long61 = null;
    Range<java.lang.Long> range_long62 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long61);
    boolean b63 = range_long62.isNaturalOrdering();
    boolean b64 = range_long62.isNaturalOrdering();
    Range<java.lang.Long> range_long65 = range_long56.intersectionWith(range_long62);
    java.util.Comparator<java.lang.Long> comparator_long68 = null;
    Range<java.lang.Long> range_long69 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long68);
    boolean b70 = range_long62.containsRange(range_long69);
    boolean b71 = range_long52.isBeforeRange(range_long62);
    Range<java.lang.Long> range_long72 = range_long28.intersectionWith(range_long62);
    Range<java.lang.Long> range_long73 = range_long17.intersectionWith(range_long72);
    java.lang.Long long74 = range_long73.getMaximum();
    boolean b75 = range_long3.containsRange(range_long73);
    java.lang.String str76 = range_long73.toString();
    java.util.Comparator<java.lang.Long> comparator_long79 = null;
    Range<java.lang.Long> range_long80 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long79);
    boolean b81 = range_long80.isNaturalOrdering();
    boolean b82 = range_long80.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long85 = null;
    Range<java.lang.Long> range_long86 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long85);
    boolean b87 = range_long86.isNaturalOrdering();
    boolean b88 = range_long86.isNaturalOrdering();
    Range<java.lang.Long> range_long89 = range_long80.intersectionWith(range_long86);
    java.lang.Long long90 = range_long86.getMinimum();
    boolean b91 = range_long73.equals((java.lang.Object)range_long86);
    boolean b93 = range_long86.isAfter((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L+ "'", long4.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    org.junit.Assert.assertTrue("'" + comparator_long18 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long18.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L+ "'", long19.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L)+ "'", long24.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L+ "'", long74.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "[-1..0]"+ "'", str76.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long90 + "' != '" + (-1L)+ "'", long90.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    java.util.Comparator<java.lang.Long> comparator_long9 = null;
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long9);
    boolean b11 = range_long10.isNaturalOrdering();
    boolean b12 = range_long10.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long16.isNaturalOrdering();
    boolean b18 = range_long16.isNaturalOrdering();
    Range<java.lang.Long> range_long19 = range_long10.intersectionWith(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = range_long19.getComparator();
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long20);
    Range<java.lang.Long> range_long22 = Range.is((java.lang.Long)0L, comparator_long20);
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L), comparator_long20);
    Range<java.lang.Long> range_long24 = Range.between((java.lang.Long)1L, (java.lang.Long)100L, comparator_long20);
    java.lang.Long long25 = range_long24.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    org.junit.Assert.assertTrue("'" + comparator_long20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L+ "'", long25.equals(100L));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.lang.Long long4 = range_long3.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    java.util.Comparator<java.lang.Long> comparator_long11 = null;
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long11);
    boolean b13 = range_long12.isNaturalOrdering();
    boolean b14 = range_long12.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    boolean b19 = range_long18.isNaturalOrdering();
    boolean b20 = range_long18.isNaturalOrdering();
    Range<java.lang.Long> range_long21 = range_long12.intersectionWith(range_long18);
    java.util.Comparator<java.lang.Long> comparator_long24 = null;
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long24);
    boolean b26 = range_long18.containsRange(range_long25);
    boolean b27 = range_long8.containsRange(range_long18);
    boolean b28 = range_long3.containsRange(range_long8);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    boolean b33 = range_long32.isNaturalOrdering();
    boolean b34 = range_long32.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long37 = null;
    Range<java.lang.Long> range_long38 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long37);
    boolean b39 = range_long38.isNaturalOrdering();
    boolean b40 = range_long38.isNaturalOrdering();
    Range<java.lang.Long> range_long41 = range_long32.intersectionWith(range_long38);
    java.util.Comparator<java.lang.Long> comparator_long42 = range_long32.getComparator();
    boolean b43 = range_long3.equals((java.lang.Object)comparator_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L)+ "'", long4.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    org.junit.Assert.assertTrue("'" + comparator_long42 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long42.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long17 = range_long7.getComparator();
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long17);
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)1L, (java.lang.Long)100L, comparator_long17);
    boolean b21 = range_long19.isStartedBy((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    org.junit.Assert.assertTrue("'" + comparator_long17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long13.containsRange(range_long20);
    boolean b22 = range_long3.isBeforeRange(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long23 = range_long3.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    org.junit.Assert.assertTrue("'" + comparator_long23 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long23.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    java.util.Comparator<java.lang.Long> comparator_long5 = null;
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long5);
    java.util.Comparator<java.lang.Long> comparator_long9 = null;
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long9);
    boolean b11 = range_long10.isNaturalOrdering();
    boolean b12 = range_long10.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long16.isNaturalOrdering();
    boolean b18 = range_long16.isNaturalOrdering();
    Range<java.lang.Long> range_long19 = range_long10.intersectionWith(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    boolean b24 = range_long16.containsRange(range_long23);
    boolean b25 = range_long6.isBeforeRange(range_long16);
    java.lang.String str26 = range_long6.toString();
    java.util.Comparator<java.lang.Long> comparator_long27 = range_long6.getComparator();
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long27);
    Range<java.lang.Long> range_long29 = Range.is((java.lang.Long)100L, comparator_long27);
    java.lang.Long long30 = range_long29.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[-1..0]"+ "'", str26.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long27 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long27.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L+ "'", long30.equals(100L));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    java.util.Comparator<java.lang.Long> comparator_long5 = null;
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long5);
    java.util.Comparator<java.lang.Long> comparator_long9 = null;
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long9);
    boolean b11 = range_long10.isNaturalOrdering();
    boolean b12 = range_long10.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long16.isNaturalOrdering();
    boolean b18 = range_long16.isNaturalOrdering();
    Range<java.lang.Long> range_long19 = range_long10.intersectionWith(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    boolean b24 = range_long16.containsRange(range_long23);
    boolean b25 = range_long6.isBeforeRange(range_long16);
    java.lang.String str26 = range_long6.toString();
    java.util.Comparator<java.lang.Long> comparator_long27 = range_long6.getComparator();
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long27);
    Range<java.lang.Long> range_long29 = Range.is((java.lang.Long)(-1L), comparator_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[-1..0]"+ "'", str26.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long27 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long27.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long17 = range_long7.getComparator();
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long17);
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)1L, (java.lang.Long)100L, comparator_long17);
    java.util.Comparator<java.lang.Long> comparator_long20 = range_long19.getComparator();
    java.lang.Long long21 = range_long19.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    org.junit.Assert.assertTrue("'" + comparator_long17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    org.junit.Assert.assertTrue("'" + comparator_long20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L+ "'", long21.equals(100L));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long43.isNaturalOrdering();
    boolean b45 = range_long43.isNaturalOrdering();
    Range<java.lang.Long> range_long46 = range_long37.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    java.util.Comparator<java.lang.Long> comparator_long53 = null;
    Range<java.lang.Long> range_long54 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long53);
    boolean b55 = range_long54.isNaturalOrdering();
    boolean b56 = range_long54.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long59 = null;
    Range<java.lang.Long> range_long60 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long59);
    boolean b61 = range_long60.isNaturalOrdering();
    boolean b62 = range_long60.isNaturalOrdering();
    Range<java.lang.Long> range_long63 = range_long54.intersectionWith(range_long60);
    java.util.Comparator<java.lang.Long> comparator_long66 = null;
    Range<java.lang.Long> range_long67 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long66);
    boolean b68 = range_long60.containsRange(range_long67);
    boolean b69 = range_long50.isBeforeRange(range_long60);
    java.lang.String str70 = range_long50.toString();
    Range<java.lang.Long> range_long71 = range_long43.intersectionWith(range_long50);
    boolean b73 = range_long43.isBefore((java.lang.Long)1L);
    boolean b74 = range_long27.isOverlappedBy(range_long43);
    boolean b76 = range_long27.isEndedBy((java.lang.Long)100L);
    boolean b78 = range_long27.isStartedBy((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "[-1..0]"+ "'", str70.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long13.containsRange(range_long20);
    boolean b22 = range_long3.containsRange(range_long13);
    boolean b24 = range_long3.isEndedBy((java.lang.Long)100L);
    boolean b26 = range_long3.contains((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long14 = null;
    Range<java.lang.Long> range_long15 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long14);
    boolean b16 = range_long15.isNaturalOrdering();
    boolean b17 = range_long15.isNaturalOrdering();
    Range<java.lang.Long> range_long18 = range_long9.intersectionWith(range_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = range_long9.getComparator();
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long19);
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long19);
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)1L, (java.lang.Long)0L, comparator_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    org.junit.Assert.assertTrue("'" + comparator_long19 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long19.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    boolean b6 = range_long5.isNaturalOrdering();
    boolean b7 = range_long5.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    boolean b12 = range_long11.isNaturalOrdering();
    boolean b13 = range_long11.isNaturalOrdering();
    Range<java.lang.Long> range_long14 = range_long5.intersectionWith(range_long11);
    java.util.Comparator<java.lang.Long> comparator_long15 = range_long5.getComparator();
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long15);
    boolean b18 = range_long16.isAfter((java.lang.Long)0L);
    Range<java.lang.Long> range_long19 = null;
    boolean b20 = range_long16.isBeforeRange(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    org.junit.Assert.assertTrue("'" + comparator_long15 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long15.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long13.containsRange(range_long20);
    java.util.Comparator<java.lang.Long> comparator_long24 = null;
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long24);
    boolean b26 = range_long25.isNaturalOrdering();
    boolean b27 = range_long25.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long30 = null;
    Range<java.lang.Long> range_long31 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long30);
    boolean b32 = range_long31.isNaturalOrdering();
    boolean b33 = range_long31.isNaturalOrdering();
    Range<java.lang.Long> range_long34 = range_long25.intersectionWith(range_long31);
    boolean b36 = range_long31.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long37 = range_long13.intersectionWith(range_long31);
    java.util.Comparator<java.lang.Long> comparator_long38 = range_long13.getComparator();
    Range<java.lang.Long> range_long39 = Range.between((java.lang.Long)0L, (java.lang.Long)100L, comparator_long38);
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)1L, comparator_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    org.junit.Assert.assertTrue("'" + comparator_long38 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long38.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long13.containsRange(range_long20);
    boolean b22 = range_long3.containsRange(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long25 = null;
    Range<java.lang.Long> range_long26 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long25);
    java.util.Comparator<java.lang.Long> comparator_long29 = null;
    Range<java.lang.Long> range_long30 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long29);
    boolean b31 = range_long30.isNaturalOrdering();
    boolean b32 = range_long30.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long35 = null;
    Range<java.lang.Long> range_long36 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long35);
    boolean b37 = range_long36.isNaturalOrdering();
    boolean b38 = range_long36.isNaturalOrdering();
    Range<java.lang.Long> range_long39 = range_long30.intersectionWith(range_long36);
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long36.containsRange(range_long43);
    boolean b45 = range_long26.isBeforeRange(range_long36);
    java.lang.String str46 = range_long26.toString();
    boolean b48 = range_long26.isEndedBy((java.lang.Long)10L);
    boolean b49 = range_long3.isOverlappedBy(range_long26);
    java.lang.String str51 = range_long26.toString("hi!");
    java.lang.Long long52 = range_long26.getMinimum();
    boolean b54 = range_long26.isStartedBy((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "[-1..0]"+ "'", str46.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!"+ "'", str51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L)+ "'", long52.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long20.isNaturalOrdering();
    boolean b22 = range_long20.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long25 = null;
    Range<java.lang.Long> range_long26 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long25);
    boolean b27 = range_long26.isNaturalOrdering();
    boolean b28 = range_long26.isNaturalOrdering();
    Range<java.lang.Long> range_long29 = range_long20.intersectionWith(range_long26);
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long26.containsRange(range_long33);
    boolean b35 = range_long16.isBeforeRange(range_long26);
    java.lang.String str36 = range_long16.toString();
    Range<java.lang.Long> range_long37 = range_long9.intersectionWith(range_long16);
    boolean b39 = range_long9.isBefore((java.lang.Long)1L);
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    java.lang.Long long44 = range_long43.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long47 = null;
    Range<java.lang.Long> range_long48 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long47);
    java.util.Comparator<java.lang.Long> comparator_long51 = null;
    Range<java.lang.Long> range_long52 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long51);
    boolean b53 = range_long52.isNaturalOrdering();
    boolean b54 = range_long52.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long57 = null;
    Range<java.lang.Long> range_long58 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long57);
    boolean b59 = range_long58.isNaturalOrdering();
    boolean b60 = range_long58.isNaturalOrdering();
    Range<java.lang.Long> range_long61 = range_long52.intersectionWith(range_long58);
    java.util.Comparator<java.lang.Long> comparator_long64 = null;
    Range<java.lang.Long> range_long65 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long64);
    boolean b66 = range_long58.containsRange(range_long65);
    boolean b67 = range_long48.containsRange(range_long58);
    boolean b68 = range_long43.containsRange(range_long48);
    java.util.Comparator<java.lang.Long> comparator_long71 = null;
    Range<java.lang.Long> range_long72 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long71);
    java.util.Comparator<java.lang.Long> comparator_long75 = null;
    Range<java.lang.Long> range_long76 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long75);
    boolean b77 = range_long76.isNaturalOrdering();
    boolean b78 = range_long76.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long81 = null;
    Range<java.lang.Long> range_long82 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long81);
    boolean b83 = range_long82.isNaturalOrdering();
    boolean b84 = range_long82.isNaturalOrdering();
    Range<java.lang.Long> range_long85 = range_long76.intersectionWith(range_long82);
    java.util.Comparator<java.lang.Long> comparator_long88 = null;
    Range<java.lang.Long> range_long89 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long88);
    boolean b90 = range_long82.containsRange(range_long89);
    boolean b91 = range_long72.isBeforeRange(range_long82);
    Range<java.lang.Long> range_long92 = range_long48.intersectionWith(range_long82);
    int i94 = range_long48.elementCompareTo((java.lang.Long)10L);
    Range<java.lang.Long> range_long95 = range_long9.intersectionWith(range_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[-1..0]"+ "'", str36.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L)+ "'", long44.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long95);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    boolean b7 = range_long3.isStartedBy((java.lang.Long)10L);
    boolean b9 = range_long3.isBefore((java.lang.Long)10L);
    java.util.Comparator<java.lang.Long> comparator_long16 = null;
    Range<java.lang.Long> range_long17 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long16);
    boolean b18 = range_long17.isNaturalOrdering();
    boolean b19 = range_long17.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    boolean b24 = range_long23.isNaturalOrdering();
    boolean b25 = range_long23.isNaturalOrdering();
    Range<java.lang.Long> range_long26 = range_long17.intersectionWith(range_long23);
    java.util.Comparator<java.lang.Long> comparator_long27 = range_long17.getComparator();
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long27);
    Range<java.lang.Long> range_long29 = Range.between((java.lang.Long)1L, (java.lang.Long)100L, comparator_long27);
    java.util.Comparator<java.lang.Long> comparator_long30 = range_long29.getComparator();
    boolean b31 = range_long3.equals((java.lang.Object)comparator_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    org.junit.Assert.assertTrue("'" + comparator_long27 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long27.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    org.junit.Assert.assertTrue("'" + comparator_long30 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long30.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    java.util.Comparator<java.lang.Long> comparator_long9 = null;
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long9);
    boolean b11 = range_long10.isNaturalOrdering();
    boolean b12 = range_long10.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long16.isNaturalOrdering();
    boolean b18 = range_long16.isNaturalOrdering();
    Range<java.lang.Long> range_long19 = range_long10.intersectionWith(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = range_long19.getComparator();
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long20);
    Range<java.lang.Long> range_long22 = Range.is((java.lang.Long)0L, comparator_long20);
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L), comparator_long20);
    Range<java.lang.Long> range_long24 = Range.between((java.lang.Long)10L, (java.lang.Long)1L, comparator_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    org.junit.Assert.assertTrue("'" + comparator_long20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long24);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long13.containsRange(range_long20);
    boolean b22 = range_long3.containsRange(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long29 = null;
    Range<java.lang.Long> range_long30 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long29);
    boolean b31 = range_long30.isNaturalOrdering();
    boolean b32 = range_long30.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long35 = null;
    Range<java.lang.Long> range_long36 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long35);
    boolean b37 = range_long36.isNaturalOrdering();
    boolean b38 = range_long36.isNaturalOrdering();
    Range<java.lang.Long> range_long39 = range_long30.intersectionWith(range_long36);
    java.util.Comparator<java.lang.Long> comparator_long40 = range_long30.getComparator();
    Range<java.lang.Long> range_long41 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long40);
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)1L, (java.lang.Long)100L, comparator_long40);
    java.util.Comparator<java.lang.Long> comparator_long43 = range_long42.getComparator();
    Range<java.lang.Long> range_long44 = null;
    boolean b45 = range_long42.isBeforeRange(range_long44);
    boolean b46 = range_long13.containsRange(range_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long39);
    org.junit.Assert.assertTrue("'" + comparator_long40 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long40.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    org.junit.Assert.assertTrue("'" + comparator_long43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long3.getComparator();
    boolean b15 = range_long3.isBefore((java.lang.Long)10L);
    int i17 = range_long3.elementCompareTo((java.lang.Long)1L);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    java.lang.Long long22 = range_long21.getMinimum();
    boolean b23 = range_long3.isBeforeRange(range_long21);
    java.util.Comparator<java.lang.Long> comparator_long30 = null;
    Range<java.lang.Long> range_long31 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long30);
    boolean b32 = range_long31.isNaturalOrdering();
    boolean b33 = range_long31.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    Range<java.lang.Long> range_long40 = range_long31.intersectionWith(range_long37);
    java.util.Comparator<java.lang.Long> comparator_long41 = range_long31.getComparator();
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long41);
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long41);
    int i45 = range_long43.elementCompareTo((java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Long> comparator_long48 = null;
    Range<java.lang.Long> range_long49 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long48);
    boolean b50 = range_long49.isNaturalOrdering();
    boolean b51 = range_long49.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long54 = null;
    Range<java.lang.Long> range_long55 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long54);
    boolean b56 = range_long55.isNaturalOrdering();
    boolean b57 = range_long55.isNaturalOrdering();
    Range<java.lang.Long> range_long58 = range_long49.intersectionWith(range_long55);
    boolean b60 = range_long55.isEndedBy((java.lang.Long)10L);
    java.lang.String str61 = range_long55.toString();
    java.lang.Long long62 = range_long55.getMaximum();
    boolean b64 = range_long55.isEndedBy((java.lang.Long)1L);
    boolean b65 = range_long43.isOverlappedBy(range_long55);
    Range<java.lang.Long> range_long66 = range_long21.intersectionWith(range_long55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L)+ "'", long22.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    org.junit.Assert.assertTrue("'" + comparator_long41 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long41.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "[-1..0]"+ "'", str61.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L+ "'", long62.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long66);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    boolean b14 = range_long9.isEndedBy((java.lang.Long)10L);
    java.lang.String str15 = range_long9.toString();
    boolean b17 = range_long9.isAfter((java.lang.Long)100L);
    boolean b19 = range_long9.isBefore((java.lang.Long)(-1L));
    java.lang.String str20 = range_long9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[-1..0]"+ "'", str15.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[-1..0]"+ "'", str20.equals("[-1..0]"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long3.getComparator();
    int i15 = range_long3.elementCompareTo((java.lang.Long)100L);
    java.util.Comparator<java.lang.Long> comparator_long18 = null;
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long18);
    boolean b20 = range_long19.isNaturalOrdering();
    boolean b21 = range_long19.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long24 = null;
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long24);
    boolean b26 = range_long25.isNaturalOrdering();
    boolean b27 = range_long25.isNaturalOrdering();
    Range<java.lang.Long> range_long28 = range_long19.intersectionWith(range_long25);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    boolean b33 = range_long25.containsRange(range_long32);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long43.isNaturalOrdering();
    boolean b45 = range_long43.isNaturalOrdering();
    Range<java.lang.Long> range_long46 = range_long37.intersectionWith(range_long43);
    boolean b48 = range_long43.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long49 = range_long25.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long50 = range_long25.getComparator();
    boolean b51 = range_long3.isOverlappedBy(range_long25);
    java.lang.String str52 = range_long3.toString();
    java.util.Comparator<java.lang.Long> comparator_long55 = null;
    Range<java.lang.Long> range_long56 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long55);
    boolean b57 = range_long56.isNaturalOrdering();
    boolean b58 = range_long56.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long61 = null;
    Range<java.lang.Long> range_long62 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long61);
    boolean b63 = range_long62.isNaturalOrdering();
    boolean b64 = range_long62.isNaturalOrdering();
    Range<java.lang.Long> range_long65 = range_long56.intersectionWith(range_long62);
    java.util.Comparator<java.lang.Long> comparator_long66 = range_long56.getComparator();
    boolean b68 = range_long56.isBefore((java.lang.Long)10L);
    boolean b69 = range_long3.isOverlappedBy(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long49);
    org.junit.Assert.assertTrue("'" + comparator_long50 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long50.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[-1..0]"+ "'", str52.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    org.junit.Assert.assertTrue("'" + comparator_long66 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long66.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    boolean b6 = range_long5.isNaturalOrdering();
    boolean b7 = range_long5.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    boolean b12 = range_long11.isNaturalOrdering();
    boolean b13 = range_long11.isNaturalOrdering();
    Range<java.lang.Long> range_long14 = range_long5.intersectionWith(range_long11);
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    boolean b19 = range_long11.containsRange(range_long18);
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    boolean b24 = range_long23.isNaturalOrdering();
    boolean b25 = range_long23.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long28 = null;
    Range<java.lang.Long> range_long29 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long28);
    boolean b30 = range_long29.isNaturalOrdering();
    boolean b31 = range_long29.isNaturalOrdering();
    Range<java.lang.Long> range_long32 = range_long23.intersectionWith(range_long29);
    boolean b34 = range_long29.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long35 = range_long11.intersectionWith(range_long29);
    java.util.Comparator<java.lang.Long> comparator_long36 = range_long11.getComparator();
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)100L, comparator_long36);
    boolean b39 = range_long37.isAfter((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long35);
    org.junit.Assert.assertTrue("'" + comparator_long36 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long36.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    java.util.Comparator<java.lang.Long> comparator_long9 = null;
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long9);
    boolean b11 = range_long10.isNaturalOrdering();
    boolean b12 = range_long10.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long16.isNaturalOrdering();
    boolean b18 = range_long16.isNaturalOrdering();
    Range<java.lang.Long> range_long19 = range_long10.intersectionWith(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = range_long10.getComparator();
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long20);
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    Range<java.lang.Long> range_long23 = Range.is((java.lang.Long)(-1L), comparator_long20);
    Range<java.lang.Long> range_long24 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L), comparator_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    org.junit.Assert.assertTrue("'" + comparator_long20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long24);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long16.containsRange(range_long21);
    java.util.Comparator<java.lang.Long> comparator_long30 = null;
    Range<java.lang.Long> range_long31 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long30);
    java.util.Comparator<java.lang.Long> comparator_long34 = null;
    Range<java.lang.Long> range_long35 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long34);
    boolean b36 = range_long35.isNaturalOrdering();
    boolean b37 = range_long35.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long40 = null;
    Range<java.lang.Long> range_long41 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long40);
    boolean b42 = range_long41.isNaturalOrdering();
    boolean b43 = range_long41.isNaturalOrdering();
    Range<java.lang.Long> range_long44 = range_long35.intersectionWith(range_long41);
    java.util.Comparator<java.lang.Long> comparator_long47 = null;
    Range<java.lang.Long> range_long48 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long47);
    boolean b49 = range_long41.containsRange(range_long48);
    boolean b50 = range_long31.isBeforeRange(range_long41);
    java.lang.String str51 = range_long31.toString();
    java.util.Comparator<java.lang.Long> comparator_long52 = range_long31.getComparator();
    Range<java.lang.Long> range_long53 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long52);
    Range<java.lang.Long> range_long54 = Range.between((java.lang.Long)0L, (java.lang.Long)10L, comparator_long52);
    boolean b55 = range_long21.isBeforeRange(range_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "[-1..0]"+ "'", str51.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long52 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long52.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long43.isNaturalOrdering();
    boolean b45 = range_long43.isNaturalOrdering();
    Range<java.lang.Long> range_long46 = range_long37.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    java.util.Comparator<java.lang.Long> comparator_long53 = null;
    Range<java.lang.Long> range_long54 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long53);
    boolean b55 = range_long54.isNaturalOrdering();
    boolean b56 = range_long54.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long59 = null;
    Range<java.lang.Long> range_long60 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long59);
    boolean b61 = range_long60.isNaturalOrdering();
    boolean b62 = range_long60.isNaturalOrdering();
    Range<java.lang.Long> range_long63 = range_long54.intersectionWith(range_long60);
    java.util.Comparator<java.lang.Long> comparator_long66 = null;
    Range<java.lang.Long> range_long67 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long66);
    boolean b68 = range_long60.containsRange(range_long67);
    boolean b69 = range_long50.isBeforeRange(range_long60);
    java.lang.String str70 = range_long50.toString();
    Range<java.lang.Long> range_long71 = range_long43.intersectionWith(range_long50);
    boolean b73 = range_long43.isBefore((java.lang.Long)1L);
    boolean b74 = range_long27.isOverlappedBy(range_long43);
    boolean b76 = range_long27.isEndedBy((java.lang.Long)100L);
    boolean b78 = range_long27.isAfter((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "[-1..0]"+ "'", str70.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long14 = null;
    Range<java.lang.Long> range_long15 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long14);
    boolean b16 = range_long15.isNaturalOrdering();
    boolean b17 = range_long15.isNaturalOrdering();
    Range<java.lang.Long> range_long18 = range_long9.intersectionWith(range_long15);
    java.util.Comparator<java.lang.Long> comparator_long21 = null;
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long21);
    boolean b23 = range_long15.containsRange(range_long22);
    boolean b24 = range_long5.isBeforeRange(range_long15);
    java.lang.String str25 = range_long5.toString();
    java.util.Comparator<java.lang.Long> comparator_long26 = range_long5.getComparator();
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long26);
    java.util.Comparator<java.lang.Long> comparator_long30 = null;
    Range<java.lang.Long> range_long31 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long30);
    boolean b32 = range_long31.isNaturalOrdering();
    boolean b33 = range_long31.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    Range<java.lang.Long> range_long40 = range_long31.intersectionWith(range_long37);
    java.util.Comparator<java.lang.Long> comparator_long43 = null;
    Range<java.lang.Long> range_long44 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long43);
    boolean b45 = range_long37.containsRange(range_long44);
    boolean b46 = range_long27.containsRange(range_long37);
    java.util.Comparator<java.lang.Long> comparator_long55 = null;
    Range<java.lang.Long> range_long56 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long55);
    boolean b57 = range_long56.isNaturalOrdering();
    boolean b58 = range_long56.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long61 = null;
    Range<java.lang.Long> range_long62 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long61);
    boolean b63 = range_long62.isNaturalOrdering();
    boolean b64 = range_long62.isNaturalOrdering();
    Range<java.lang.Long> range_long65 = range_long56.intersectionWith(range_long62);
    java.util.Comparator<java.lang.Long> comparator_long66 = range_long56.getComparator();
    Range<java.lang.Long> range_long67 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long66);
    Range<java.lang.Long> range_long68 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long66);
    Range<java.lang.Long> range_long69 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long66);
    boolean b70 = range_long27.isBeforeRange(range_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[-1..0]"+ "'", str25.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long26 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long26.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    org.junit.Assert.assertTrue("'" + comparator_long66 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long66.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.lang.Long long4 = range_long3.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    java.util.Comparator<java.lang.Long> comparator_long11 = null;
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long11);
    boolean b13 = range_long12.isNaturalOrdering();
    boolean b14 = range_long12.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    boolean b19 = range_long18.isNaturalOrdering();
    boolean b20 = range_long18.isNaturalOrdering();
    Range<java.lang.Long> range_long21 = range_long12.intersectionWith(range_long18);
    java.util.Comparator<java.lang.Long> comparator_long24 = null;
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long24);
    boolean b26 = range_long18.containsRange(range_long25);
    boolean b27 = range_long8.containsRange(range_long18);
    boolean b28 = range_long3.containsRange(range_long8);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    java.util.Comparator<java.lang.Long> comparator_long35 = null;
    Range<java.lang.Long> range_long36 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long35);
    boolean b37 = range_long36.isNaturalOrdering();
    boolean b38 = range_long36.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long41 = null;
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long41);
    boolean b43 = range_long42.isNaturalOrdering();
    boolean b44 = range_long42.isNaturalOrdering();
    Range<java.lang.Long> range_long45 = range_long36.intersectionWith(range_long42);
    java.util.Comparator<java.lang.Long> comparator_long48 = null;
    Range<java.lang.Long> range_long49 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long48);
    boolean b50 = range_long42.containsRange(range_long49);
    boolean b51 = range_long32.isBeforeRange(range_long42);
    Range<java.lang.Long> range_long52 = range_long8.intersectionWith(range_long42);
    int i54 = range_long8.elementCompareTo((java.lang.Long)10L);
    java.lang.Long long55 = range_long8.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L)+ "'", long4.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L)+ "'", long55.equals((-1L)));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    boolean b6 = range_long5.isNaturalOrdering();
    boolean b7 = range_long5.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    boolean b12 = range_long11.isNaturalOrdering();
    boolean b13 = range_long11.isNaturalOrdering();
    Range<java.lang.Long> range_long14 = range_long5.intersectionWith(range_long11);
    java.util.Comparator<java.lang.Long> comparator_long15 = range_long5.getComparator();
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long15);
    boolean b18 = range_long16.isAfter((java.lang.Long)0L);
    boolean b19 = range_long16.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    org.junit.Assert.assertTrue("'" + comparator_long15 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long15.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long2);
    java.lang.Long long4 = range_long3.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    boolean b9 = range_long8.isNaturalOrdering();
    boolean b10 = range_long8.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long13 = null;
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long13);
    boolean b15 = range_long14.isNaturalOrdering();
    boolean b16 = range_long14.isNaturalOrdering();
    Range<java.lang.Long> range_long17 = range_long8.intersectionWith(range_long14);
    java.util.Comparator<java.lang.Long> comparator_long18 = range_long17.getComparator();
    java.lang.Long long19 = range_long17.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.lang.Long long24 = range_long23.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    boolean b33 = range_long32.isNaturalOrdering();
    boolean b34 = range_long32.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long37 = null;
    Range<java.lang.Long> range_long38 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long37);
    boolean b39 = range_long38.isNaturalOrdering();
    boolean b40 = range_long38.isNaturalOrdering();
    Range<java.lang.Long> range_long41 = range_long32.intersectionWith(range_long38);
    java.util.Comparator<java.lang.Long> comparator_long44 = null;
    Range<java.lang.Long> range_long45 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long44);
    boolean b46 = range_long38.containsRange(range_long45);
    boolean b47 = range_long28.containsRange(range_long38);
    boolean b48 = range_long23.containsRange(range_long28);
    java.util.Comparator<java.lang.Long> comparator_long51 = null;
    Range<java.lang.Long> range_long52 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long51);
    java.util.Comparator<java.lang.Long> comparator_long55 = null;
    Range<java.lang.Long> range_long56 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long55);
    boolean b57 = range_long56.isNaturalOrdering();
    boolean b58 = range_long56.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long61 = null;
    Range<java.lang.Long> range_long62 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long61);
    boolean b63 = range_long62.isNaturalOrdering();
    boolean b64 = range_long62.isNaturalOrdering();
    Range<java.lang.Long> range_long65 = range_long56.intersectionWith(range_long62);
    java.util.Comparator<java.lang.Long> comparator_long68 = null;
    Range<java.lang.Long> range_long69 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long68);
    boolean b70 = range_long62.containsRange(range_long69);
    boolean b71 = range_long52.isBeforeRange(range_long62);
    Range<java.lang.Long> range_long72 = range_long28.intersectionWith(range_long62);
    Range<java.lang.Long> range_long73 = range_long17.intersectionWith(range_long72);
    java.lang.Long long74 = range_long73.getMaximum();
    boolean b75 = range_long3.containsRange(range_long73);
    java.lang.String str76 = range_long73.toString();
    java.util.Comparator<java.lang.Long> comparator_long79 = null;
    Range<java.lang.Long> range_long80 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long79);
    boolean b81 = range_long80.isNaturalOrdering();
    boolean b82 = range_long80.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long85 = null;
    Range<java.lang.Long> range_long86 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long85);
    boolean b87 = range_long86.isNaturalOrdering();
    boolean b88 = range_long86.isNaturalOrdering();
    Range<java.lang.Long> range_long89 = range_long80.intersectionWith(range_long86);
    java.lang.Long long90 = range_long86.getMinimum();
    boolean b91 = range_long73.equals((java.lang.Object)range_long86);
    java.util.Comparator<java.lang.Long> comparator_long92 = range_long86.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L+ "'", long4.equals(1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    org.junit.Assert.assertTrue("'" + comparator_long18 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long18.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L+ "'", long19.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L)+ "'", long24.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L+ "'", long74.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "[-1..0]"+ "'", str76.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long90 + "' != '" + (-1L)+ "'", long90.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    org.junit.Assert.assertTrue("'" + comparator_long92 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long92.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long3.getComparator();
    boolean b15 = range_long3.isBefore((java.lang.Long)10L);
    int i17 = range_long3.elementCompareTo((java.lang.Long)1L);
    java.lang.Long long18 = range_long3.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long21 = null;
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long21);
    boolean b23 = range_long22.isNaturalOrdering();
    boolean b24 = range_long22.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    boolean b29 = range_long28.isNaturalOrdering();
    boolean b30 = range_long28.isNaturalOrdering();
    Range<java.lang.Long> range_long31 = range_long22.intersectionWith(range_long28);
    boolean b33 = range_long31.isAfter((java.lang.Long)(-1L));
    boolean b34 = range_long31.isNaturalOrdering();
    boolean b35 = range_long3.equals((java.lang.Object)b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L+ "'", long18.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    boolean b6 = range_long5.isNaturalOrdering();
    boolean b7 = range_long5.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    boolean b12 = range_long11.isNaturalOrdering();
    boolean b13 = range_long11.isNaturalOrdering();
    Range<java.lang.Long> range_long14 = range_long5.intersectionWith(range_long11);
    java.util.Comparator<java.lang.Long> comparator_long15 = range_long5.getComparator();
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long15);
    boolean b18 = range_long16.isAfter((java.lang.Long)0L);
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    boolean b29 = range_long28.isNaturalOrdering();
    boolean b30 = range_long28.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long33 = null;
    Range<java.lang.Long> range_long34 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long33);
    boolean b35 = range_long34.isNaturalOrdering();
    boolean b36 = range_long34.isNaturalOrdering();
    Range<java.lang.Long> range_long37 = range_long28.intersectionWith(range_long34);
    java.util.Comparator<java.lang.Long> comparator_long38 = range_long28.getComparator();
    Range<java.lang.Long> range_long39 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long38);
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long38);
    Range<java.lang.Long> range_long41 = Range.is((java.lang.Long)10L, comparator_long38);
    Range<java.lang.Long> range_long42 = Range.is((java.lang.Long)(-1L), comparator_long38);
    boolean b43 = range_long16.isOverlappedBy(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    org.junit.Assert.assertTrue("'" + comparator_long15 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long15.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    org.junit.Assert.assertTrue("'" + comparator_long38 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long38.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long16.isNaturalOrdering();
    boolean b18 = range_long16.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long21 = null;
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long21);
    boolean b23 = range_long22.isNaturalOrdering();
    boolean b24 = range_long22.isNaturalOrdering();
    Range<java.lang.Long> range_long25 = range_long16.intersectionWith(range_long22);
    boolean b26 = range_long12.containsRange(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    java.util.Comparator<java.lang.Long> comparator_long9 = null;
    Range<java.lang.Long> range_long10 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long9);
    boolean b11 = range_long10.isNaturalOrdering();
    boolean b12 = range_long10.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long16.isNaturalOrdering();
    boolean b18 = range_long16.isNaturalOrdering();
    Range<java.lang.Long> range_long19 = range_long10.intersectionWith(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = range_long19.getComparator();
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long20);
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)1L, comparator_long20);
    Range<java.lang.Long> range_long23 = Range.is((java.lang.Long)100L, comparator_long20);
    Range<java.lang.Long> range_long24 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    boolean b29 = range_long28.isNaturalOrdering();
    boolean b30 = range_long28.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long33 = null;
    Range<java.lang.Long> range_long34 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long33);
    boolean b35 = range_long34.isNaturalOrdering();
    boolean b36 = range_long34.isNaturalOrdering();
    Range<java.lang.Long> range_long37 = range_long28.intersectionWith(range_long34);
    java.util.Comparator<java.lang.Long> comparator_long40 = null;
    Range<java.lang.Long> range_long41 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long40);
    java.util.Comparator<java.lang.Long> comparator_long44 = null;
    Range<java.lang.Long> range_long45 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long44);
    boolean b46 = range_long45.isNaturalOrdering();
    boolean b47 = range_long45.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long50 = null;
    Range<java.lang.Long> range_long51 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long50);
    boolean b52 = range_long51.isNaturalOrdering();
    boolean b53 = range_long51.isNaturalOrdering();
    Range<java.lang.Long> range_long54 = range_long45.intersectionWith(range_long51);
    java.util.Comparator<java.lang.Long> comparator_long57 = null;
    Range<java.lang.Long> range_long58 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long57);
    boolean b59 = range_long51.containsRange(range_long58);
    boolean b60 = range_long41.isBeforeRange(range_long51);
    java.lang.String str61 = range_long41.toString();
    Range<java.lang.Long> range_long62 = range_long34.intersectionWith(range_long41);
    boolean b64 = range_long34.isEndedBy((java.lang.Long)0L);
    boolean b65 = range_long24.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    org.junit.Assert.assertTrue("'" + comparator_long20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "[-1..0]"+ "'", str61.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long13.containsRange(range_long20);
    boolean b22 = range_long3.isBeforeRange(range_long13);
    boolean b24 = range_long3.isEndedBy((java.lang.Long)0L);
    boolean b26 = range_long3.isStartedBy((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long18 = null;
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long18);
    boolean b20 = range_long19.isNaturalOrdering();
    boolean b21 = range_long19.isNaturalOrdering();
    Range<java.lang.Long> range_long22 = range_long13.intersectionWith(range_long19);
    java.util.Comparator<java.lang.Long> comparator_long23 = range_long13.getComparator();
    Range<java.lang.Long> range_long24 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long23);
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long23);
    int i27 = range_long25.elementCompareTo((java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Long> comparator_long30 = null;
    Range<java.lang.Long> range_long31 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long30);
    boolean b32 = range_long31.isNaturalOrdering();
    boolean b33 = range_long31.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    Range<java.lang.Long> range_long40 = range_long31.intersectionWith(range_long37);
    boolean b42 = range_long37.isEndedBy((java.lang.Long)10L);
    java.lang.String str43 = range_long37.toString();
    java.lang.Long long44 = range_long37.getMaximum();
    boolean b46 = range_long37.isEndedBy((java.lang.Long)1L);
    boolean b47 = range_long25.isOverlappedBy(range_long37);
    boolean b48 = range_long3.isBeforeRange(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    org.junit.Assert.assertTrue("'" + comparator_long23 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long23.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "[-1..0]"+ "'", str43.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L+ "'", long44.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long12.getComparator();
    java.lang.Long long14 = range_long12.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    java.lang.Long long19 = range_long18.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long33.isNaturalOrdering();
    boolean b35 = range_long33.isNaturalOrdering();
    Range<java.lang.Long> range_long36 = range_long27.intersectionWith(range_long33);
    java.util.Comparator<java.lang.Long> comparator_long39 = null;
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long39);
    boolean b41 = range_long33.containsRange(range_long40);
    boolean b42 = range_long23.containsRange(range_long33);
    boolean b43 = range_long18.containsRange(range_long23);
    java.util.Comparator<java.lang.Long> comparator_long46 = null;
    Range<java.lang.Long> range_long47 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long46);
    java.util.Comparator<java.lang.Long> comparator_long50 = null;
    Range<java.lang.Long> range_long51 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long50);
    boolean b52 = range_long51.isNaturalOrdering();
    boolean b53 = range_long51.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long57.isNaturalOrdering();
    boolean b59 = range_long57.isNaturalOrdering();
    Range<java.lang.Long> range_long60 = range_long51.intersectionWith(range_long57);
    java.util.Comparator<java.lang.Long> comparator_long63 = null;
    Range<java.lang.Long> range_long64 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long63);
    boolean b65 = range_long57.containsRange(range_long64);
    boolean b66 = range_long47.isBeforeRange(range_long57);
    Range<java.lang.Long> range_long67 = range_long23.intersectionWith(range_long57);
    Range<java.lang.Long> range_long68 = range_long12.intersectionWith(range_long67);
    java.lang.Long long69 = range_long68.getMaximum();
    java.lang.Long long70 = range_long68.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L+ "'", long14.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L)+ "'", long19.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L+ "'", long69.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L+ "'", long70.equals(0L));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long13.containsRange(range_long20);
    boolean b22 = range_long3.isBeforeRange(range_long13);
    boolean b24 = range_long3.isEndedBy((java.lang.Long)0L);
    int i26 = range_long3.elementCompareTo((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long14 = null;
    Range<java.lang.Long> range_long15 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long14);
    boolean b16 = range_long15.isNaturalOrdering();
    boolean b17 = range_long15.isNaturalOrdering();
    Range<java.lang.Long> range_long18 = range_long9.intersectionWith(range_long15);
    java.util.Comparator<java.lang.Long> comparator_long21 = null;
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long21);
    boolean b23 = range_long15.containsRange(range_long22);
    boolean b24 = range_long5.isBeforeRange(range_long15);
    java.lang.String str25 = range_long5.toString();
    java.util.Comparator<java.lang.Long> comparator_long26 = range_long5.getComparator();
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)10L, (java.lang.Long)(-1L), comparator_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[-1..0]"+ "'", str25.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long26 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long26.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long12.getComparator();
    java.lang.Long long14 = range_long12.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    java.lang.Long long19 = range_long18.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long33.isNaturalOrdering();
    boolean b35 = range_long33.isNaturalOrdering();
    Range<java.lang.Long> range_long36 = range_long27.intersectionWith(range_long33);
    java.util.Comparator<java.lang.Long> comparator_long39 = null;
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long39);
    boolean b41 = range_long33.containsRange(range_long40);
    boolean b42 = range_long23.containsRange(range_long33);
    boolean b43 = range_long18.containsRange(range_long23);
    java.util.Comparator<java.lang.Long> comparator_long46 = null;
    Range<java.lang.Long> range_long47 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long46);
    java.util.Comparator<java.lang.Long> comparator_long50 = null;
    Range<java.lang.Long> range_long51 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long50);
    boolean b52 = range_long51.isNaturalOrdering();
    boolean b53 = range_long51.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long57.isNaturalOrdering();
    boolean b59 = range_long57.isNaturalOrdering();
    Range<java.lang.Long> range_long60 = range_long51.intersectionWith(range_long57);
    java.util.Comparator<java.lang.Long> comparator_long63 = null;
    Range<java.lang.Long> range_long64 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long63);
    boolean b65 = range_long57.containsRange(range_long64);
    boolean b66 = range_long47.isBeforeRange(range_long57);
    Range<java.lang.Long> range_long67 = range_long23.intersectionWith(range_long57);
    Range<java.lang.Long> range_long68 = range_long12.intersectionWith(range_long67);
    java.lang.Long long69 = range_long68.getMaximum();
    boolean b71 = range_long68.contains((java.lang.Long)1L);
    boolean b73 = range_long68.isStartedBy((java.lang.Long)1L);
    boolean b74 = range_long68.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L+ "'", long14.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L)+ "'", long19.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L+ "'", long69.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    boolean b7 = range_long3.isBefore((java.lang.Long)(-1L));
    java.lang.String str9 = range_long3.toString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long12.getComparator();
    java.lang.Long long14 = range_long12.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    java.lang.Long long19 = range_long18.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long33.isNaturalOrdering();
    boolean b35 = range_long33.isNaturalOrdering();
    Range<java.lang.Long> range_long36 = range_long27.intersectionWith(range_long33);
    java.util.Comparator<java.lang.Long> comparator_long39 = null;
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long39);
    boolean b41 = range_long33.containsRange(range_long40);
    boolean b42 = range_long23.containsRange(range_long33);
    boolean b43 = range_long18.containsRange(range_long23);
    java.util.Comparator<java.lang.Long> comparator_long46 = null;
    Range<java.lang.Long> range_long47 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long46);
    java.util.Comparator<java.lang.Long> comparator_long50 = null;
    Range<java.lang.Long> range_long51 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long50);
    boolean b52 = range_long51.isNaturalOrdering();
    boolean b53 = range_long51.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long57.isNaturalOrdering();
    boolean b59 = range_long57.isNaturalOrdering();
    Range<java.lang.Long> range_long60 = range_long51.intersectionWith(range_long57);
    java.util.Comparator<java.lang.Long> comparator_long63 = null;
    Range<java.lang.Long> range_long64 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long63);
    boolean b65 = range_long57.containsRange(range_long64);
    boolean b66 = range_long47.isBeforeRange(range_long57);
    Range<java.lang.Long> range_long67 = range_long23.intersectionWith(range_long57);
    Range<java.lang.Long> range_long68 = range_long12.intersectionWith(range_long67);
    java.lang.Long long69 = range_long68.getMaximum();
    boolean b71 = range_long68.contains((java.lang.Long)1L);
    boolean b73 = range_long68.isStartedBy((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L+ "'", long14.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L)+ "'", long19.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L+ "'", long69.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    boolean b9 = range_long8.isNaturalOrdering();
    boolean b10 = range_long8.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long13 = null;
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long13);
    boolean b15 = range_long14.isNaturalOrdering();
    boolean b16 = range_long14.isNaturalOrdering();
    Range<java.lang.Long> range_long17 = range_long8.intersectionWith(range_long14);
    java.util.Comparator<java.lang.Long> comparator_long18 = range_long17.getComparator();
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long18);
    Range<java.lang.Long> range_long20 = Range.is((java.lang.Long)0L, comparator_long18);
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)1L, (java.lang.Long)(-1L), comparator_long18);
    boolean b23 = range_long21.isBefore((java.lang.Long)1L);
    boolean b25 = range_long21.isEndedBy((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    org.junit.Assert.assertTrue("'" + comparator_long18 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long18.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.lang.Long long4 = range_long3.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    java.util.Comparator<java.lang.Long> comparator_long11 = null;
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long11);
    boolean b13 = range_long12.isNaturalOrdering();
    boolean b14 = range_long12.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    boolean b19 = range_long18.isNaturalOrdering();
    boolean b20 = range_long18.isNaturalOrdering();
    Range<java.lang.Long> range_long21 = range_long12.intersectionWith(range_long18);
    java.util.Comparator<java.lang.Long> comparator_long24 = null;
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long24);
    boolean b26 = range_long18.containsRange(range_long25);
    boolean b27 = range_long8.containsRange(range_long18);
    boolean b28 = range_long3.containsRange(range_long8);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    java.util.Comparator<java.lang.Long> comparator_long35 = null;
    Range<java.lang.Long> range_long36 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long35);
    boolean b37 = range_long36.isNaturalOrdering();
    boolean b38 = range_long36.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long41 = null;
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long41);
    boolean b43 = range_long42.isNaturalOrdering();
    boolean b44 = range_long42.isNaturalOrdering();
    Range<java.lang.Long> range_long45 = range_long36.intersectionWith(range_long42);
    java.util.Comparator<java.lang.Long> comparator_long48 = null;
    Range<java.lang.Long> range_long49 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long48);
    boolean b50 = range_long42.containsRange(range_long49);
    boolean b51 = range_long32.isBeforeRange(range_long42);
    Range<java.lang.Long> range_long52 = range_long8.intersectionWith(range_long42);
    int i54 = range_long8.elementCompareTo((java.lang.Long)10L);
    java.lang.Object obj55 = null;
    boolean b56 = range_long8.equals(obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L)+ "'", long4.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long20.isNaturalOrdering();
    boolean b22 = range_long20.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long25 = null;
    Range<java.lang.Long> range_long26 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long25);
    boolean b27 = range_long26.isNaturalOrdering();
    boolean b28 = range_long26.isNaturalOrdering();
    Range<java.lang.Long> range_long29 = range_long20.intersectionWith(range_long26);
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long26.containsRange(range_long33);
    boolean b35 = range_long16.isBeforeRange(range_long26);
    java.lang.String str36 = range_long16.toString();
    Range<java.lang.Long> range_long37 = range_long9.intersectionWith(range_long16);
    boolean b38 = range_long16.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long41 = null;
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long41);
    boolean b43 = range_long42.isNaturalOrdering();
    boolean b44 = range_long42.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long47 = null;
    Range<java.lang.Long> range_long48 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long47);
    boolean b49 = range_long48.isNaturalOrdering();
    boolean b50 = range_long48.isNaturalOrdering();
    Range<java.lang.Long> range_long51 = range_long42.intersectionWith(range_long48);
    java.util.Comparator<java.lang.Long> comparator_long54 = null;
    Range<java.lang.Long> range_long55 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long54);
    java.util.Comparator<java.lang.Long> comparator_long58 = null;
    Range<java.lang.Long> range_long59 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long58);
    boolean b60 = range_long59.isNaturalOrdering();
    boolean b61 = range_long59.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long64 = null;
    Range<java.lang.Long> range_long65 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long64);
    boolean b66 = range_long65.isNaturalOrdering();
    boolean b67 = range_long65.isNaturalOrdering();
    Range<java.lang.Long> range_long68 = range_long59.intersectionWith(range_long65);
    java.util.Comparator<java.lang.Long> comparator_long71 = null;
    Range<java.lang.Long> range_long72 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long71);
    boolean b73 = range_long65.containsRange(range_long72);
    boolean b74 = range_long55.isBeforeRange(range_long65);
    java.lang.String str75 = range_long55.toString();
    Range<java.lang.Long> range_long76 = range_long48.intersectionWith(range_long55);
    boolean b77 = range_long16.isOverlappedBy(range_long76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[-1..0]"+ "'", str36.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "[-1..0]"+ "'", str75.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long17 = range_long7.getComparator();
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long17);
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    int i21 = range_long19.elementCompareTo((java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Long> comparator_long24 = null;
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long24);
    boolean b26 = range_long25.isNaturalOrdering();
    boolean b27 = range_long25.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long30 = null;
    Range<java.lang.Long> range_long31 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long30);
    boolean b32 = range_long31.isNaturalOrdering();
    boolean b33 = range_long31.isNaturalOrdering();
    Range<java.lang.Long> range_long34 = range_long25.intersectionWith(range_long31);
    java.util.Comparator<java.lang.Long> comparator_long35 = range_long25.getComparator();
    int i37 = range_long25.elementCompareTo((java.lang.Long)100L);
    java.util.Comparator<java.lang.Long> comparator_long40 = null;
    Range<java.lang.Long> range_long41 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long40);
    java.lang.Long long42 = range_long41.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long45 = null;
    Range<java.lang.Long> range_long46 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long45);
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    boolean b51 = range_long50.isNaturalOrdering();
    boolean b52 = range_long50.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long55 = null;
    Range<java.lang.Long> range_long56 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long55);
    boolean b57 = range_long56.isNaturalOrdering();
    boolean b58 = range_long56.isNaturalOrdering();
    Range<java.lang.Long> range_long59 = range_long50.intersectionWith(range_long56);
    java.util.Comparator<java.lang.Long> comparator_long62 = null;
    Range<java.lang.Long> range_long63 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long62);
    boolean b64 = range_long56.containsRange(range_long63);
    boolean b65 = range_long46.containsRange(range_long56);
    boolean b66 = range_long41.containsRange(range_long46);
    java.util.Comparator<java.lang.Long> comparator_long69 = null;
    Range<java.lang.Long> range_long70 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long69);
    java.util.Comparator<java.lang.Long> comparator_long73 = null;
    Range<java.lang.Long> range_long74 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long73);
    boolean b75 = range_long74.isNaturalOrdering();
    boolean b76 = range_long74.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long79 = null;
    Range<java.lang.Long> range_long80 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long79);
    boolean b81 = range_long80.isNaturalOrdering();
    boolean b82 = range_long80.isNaturalOrdering();
    Range<java.lang.Long> range_long83 = range_long74.intersectionWith(range_long80);
    java.util.Comparator<java.lang.Long> comparator_long86 = null;
    Range<java.lang.Long> range_long87 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long86);
    boolean b88 = range_long80.containsRange(range_long87);
    boolean b89 = range_long70.isBeforeRange(range_long80);
    Range<java.lang.Long> range_long90 = range_long46.intersectionWith(range_long80);
    int i92 = range_long80.elementCompareTo((java.lang.Long)1L);
    boolean b94 = range_long80.contains((java.lang.Long)1L);
    Range<java.lang.Long> range_long95 = range_long25.intersectionWith(range_long80);
    boolean b96 = range_long19.isAfterRange(range_long80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    org.junit.Assert.assertTrue("'" + comparator_long17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long34);
    org.junit.Assert.assertTrue("'" + comparator_long35 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long35.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L)+ "'", long42.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b96 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.lang.Long long4 = range_long3.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    java.util.Comparator<java.lang.Long> comparator_long11 = null;
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long11);
    boolean b13 = range_long12.isNaturalOrdering();
    boolean b14 = range_long12.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    boolean b19 = range_long18.isNaturalOrdering();
    boolean b20 = range_long18.isNaturalOrdering();
    Range<java.lang.Long> range_long21 = range_long12.intersectionWith(range_long18);
    java.util.Comparator<java.lang.Long> comparator_long24 = null;
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long24);
    boolean b26 = range_long18.containsRange(range_long25);
    boolean b27 = range_long8.containsRange(range_long18);
    boolean b28 = range_long3.containsRange(range_long8);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    java.util.Comparator<java.lang.Long> comparator_long35 = null;
    Range<java.lang.Long> range_long36 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long35);
    boolean b37 = range_long36.isNaturalOrdering();
    boolean b38 = range_long36.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long41 = null;
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long41);
    boolean b43 = range_long42.isNaturalOrdering();
    boolean b44 = range_long42.isNaturalOrdering();
    Range<java.lang.Long> range_long45 = range_long36.intersectionWith(range_long42);
    java.util.Comparator<java.lang.Long> comparator_long48 = null;
    Range<java.lang.Long> range_long49 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long48);
    boolean b50 = range_long42.containsRange(range_long49);
    boolean b51 = range_long32.isBeforeRange(range_long42);
    Range<java.lang.Long> range_long52 = range_long8.intersectionWith(range_long42);
    int i54 = range_long8.elementCompareTo((java.lang.Long)10L);
    boolean b56 = range_long8.contains((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L)+ "'", long4.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    java.util.Comparator<java.lang.Long> comparator_long6 = null;
    Range<java.lang.Long> range_long7 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long6);
    boolean b8 = range_long7.isNaturalOrdering();
    boolean b9 = range_long7.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long12 = null;
    Range<java.lang.Long> range_long13 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long12);
    boolean b14 = range_long13.isNaturalOrdering();
    boolean b15 = range_long13.isNaturalOrdering();
    Range<java.lang.Long> range_long16 = range_long7.intersectionWith(range_long13);
    java.util.Comparator<java.lang.Long> comparator_long17 = range_long7.getComparator();
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long17);
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long17);
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    java.lang.Long long24 = range_long23.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    boolean b33 = range_long32.isNaturalOrdering();
    boolean b34 = range_long32.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long37 = null;
    Range<java.lang.Long> range_long38 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long37);
    boolean b39 = range_long38.isNaturalOrdering();
    boolean b40 = range_long38.isNaturalOrdering();
    Range<java.lang.Long> range_long41 = range_long32.intersectionWith(range_long38);
    java.util.Comparator<java.lang.Long> comparator_long44 = null;
    Range<java.lang.Long> range_long45 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long44);
    boolean b46 = range_long38.containsRange(range_long45);
    boolean b47 = range_long28.containsRange(range_long38);
    boolean b48 = range_long23.containsRange(range_long28);
    java.util.Comparator<java.lang.Long> comparator_long51 = null;
    Range<java.lang.Long> range_long52 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long51);
    java.util.Comparator<java.lang.Long> comparator_long55 = null;
    Range<java.lang.Long> range_long56 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long55);
    boolean b57 = range_long56.isNaturalOrdering();
    boolean b58 = range_long56.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long61 = null;
    Range<java.lang.Long> range_long62 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long61);
    boolean b63 = range_long62.isNaturalOrdering();
    boolean b64 = range_long62.isNaturalOrdering();
    Range<java.lang.Long> range_long65 = range_long56.intersectionWith(range_long62);
    java.util.Comparator<java.lang.Long> comparator_long68 = null;
    Range<java.lang.Long> range_long69 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long68);
    boolean b70 = range_long62.containsRange(range_long69);
    boolean b71 = range_long52.isBeforeRange(range_long62);
    boolean b72 = range_long28.isOverlappedBy(range_long52);
    boolean b73 = range_long52.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long74 = range_long52.getComparator();
    boolean b75 = range_long19.isOverlappedBy(range_long52);
    java.lang.String str77 = range_long19.toString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    org.junit.Assert.assertTrue("'" + comparator_long17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L)+ "'", long24.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    org.junit.Assert.assertTrue("'" + comparator_long74 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long74.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!"+ "'", str77.equals("hi!"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    boolean b9 = range_long8.isNaturalOrdering();
    boolean b10 = range_long8.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long13 = null;
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long13);
    boolean b15 = range_long14.isNaturalOrdering();
    boolean b16 = range_long14.isNaturalOrdering();
    Range<java.lang.Long> range_long17 = range_long8.intersectionWith(range_long14);
    java.util.Comparator<java.lang.Long> comparator_long18 = range_long17.getComparator();
    Range<java.lang.Long> range_long19 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long18);
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)1L, comparator_long18);
    Range<java.lang.Long> range_long21 = Range.is((java.lang.Long)100L, comparator_long18);
    boolean b23 = range_long21.isEndedBy((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    org.junit.Assert.assertTrue("'" + comparator_long18 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long18.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    java.util.Comparator<java.lang.Long> comparator_long14 = null;
    Range<java.lang.Long> range_long15 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long14);
    boolean b16 = range_long15.isNaturalOrdering();
    boolean b17 = range_long15.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    Range<java.lang.Long> range_long24 = range_long15.intersectionWith(range_long21);
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    boolean b29 = range_long21.containsRange(range_long28);
    boolean b30 = range_long11.isBeforeRange(range_long21);
    java.lang.String str31 = range_long11.toString();
    java.util.Comparator<java.lang.Long> comparator_long32 = range_long11.getComparator();
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long32);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long43.isNaturalOrdering();
    boolean b45 = range_long43.isNaturalOrdering();
    Range<java.lang.Long> range_long46 = range_long37.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    boolean b51 = range_long43.containsRange(range_long50);
    boolean b52 = range_long33.containsRange(range_long43);
    Range<java.lang.Long> range_long53 = range_long3.intersectionWith(range_long43);
    java.lang.String str54 = range_long53.toString();
    boolean b56 = range_long53.isBefore((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[-1..0]"+ "'", str31.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[-1..0]"+ "'", str54.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long20.isNaturalOrdering();
    boolean b22 = range_long20.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long25 = null;
    Range<java.lang.Long> range_long26 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long25);
    boolean b27 = range_long26.isNaturalOrdering();
    boolean b28 = range_long26.isNaturalOrdering();
    Range<java.lang.Long> range_long29 = range_long20.intersectionWith(range_long26);
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long26.containsRange(range_long33);
    boolean b35 = range_long16.isBeforeRange(range_long26);
    java.lang.String str36 = range_long16.toString();
    Range<java.lang.Long> range_long37 = range_long9.intersectionWith(range_long16);
    boolean b39 = range_long9.isBefore((java.lang.Long)1L);
    int i41 = range_long9.elementCompareTo((java.lang.Long)10L);
    java.lang.Long long42 = range_long9.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[-1..0]"+ "'", str36.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L+ "'", long42.equals(0L));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)1L, (java.lang.Long)1L, comparator_long2);
    java.lang.String str4 = range_long3.toString();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    boolean b9 = range_long8.isNaturalOrdering();
    boolean b10 = range_long8.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long13 = null;
    Range<java.lang.Long> range_long14 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long13);
    boolean b15 = range_long14.isNaturalOrdering();
    boolean b16 = range_long14.isNaturalOrdering();
    Range<java.lang.Long> range_long17 = range_long8.intersectionWith(range_long14);
    boolean b19 = range_long14.isEndedBy((java.lang.Long)10L);
    boolean b21 = range_long14.isAfter((java.lang.Long)1L);
    boolean b22 = range_long3.equals((java.lang.Object)b21);
    boolean b24 = range_long3.isEndedBy((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[1..1]"+ "'", str4.equals("[1..1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    boolean b14 = range_long12.isAfter((java.lang.Long)(-1L));
    boolean b15 = range_long12.isNaturalOrdering();
    boolean b17 = range_long12.isEndedBy((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    java.util.Comparator<java.lang.Long> comparator_long4 = null;
    Range<java.lang.Long> range_long5 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long4);
    boolean b6 = range_long5.isNaturalOrdering();
    boolean b7 = range_long5.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    boolean b12 = range_long11.isNaturalOrdering();
    boolean b13 = range_long11.isNaturalOrdering();
    Range<java.lang.Long> range_long14 = range_long5.intersectionWith(range_long11);
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    boolean b19 = range_long11.containsRange(range_long18);
    java.util.Comparator<java.lang.Long> comparator_long22 = null;
    Range<java.lang.Long> range_long23 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long22);
    boolean b24 = range_long23.isNaturalOrdering();
    boolean b25 = range_long23.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long28 = null;
    Range<java.lang.Long> range_long29 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long28);
    boolean b30 = range_long29.isNaturalOrdering();
    boolean b31 = range_long29.isNaturalOrdering();
    Range<java.lang.Long> range_long32 = range_long23.intersectionWith(range_long29);
    boolean b34 = range_long29.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long35 = range_long11.intersectionWith(range_long29);
    java.util.Comparator<java.lang.Long> comparator_long36 = range_long11.getComparator();
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)1L, (java.lang.Long)0L, comparator_long36);
    boolean b39 = range_long37.isAfter((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long35);
    org.junit.Assert.assertTrue("'" + comparator_long36 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long36.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.lang.Long long4 = range_long3.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    java.util.Comparator<java.lang.Long> comparator_long11 = null;
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long11);
    boolean b13 = range_long12.isNaturalOrdering();
    boolean b14 = range_long12.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    boolean b19 = range_long18.isNaturalOrdering();
    boolean b20 = range_long18.isNaturalOrdering();
    Range<java.lang.Long> range_long21 = range_long12.intersectionWith(range_long18);
    java.util.Comparator<java.lang.Long> comparator_long24 = null;
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long24);
    boolean b26 = range_long18.containsRange(range_long25);
    boolean b27 = range_long8.containsRange(range_long18);
    boolean b28 = range_long3.containsRange(range_long8);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    boolean b33 = range_long32.isNaturalOrdering();
    boolean b34 = range_long32.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long37 = null;
    Range<java.lang.Long> range_long38 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long37);
    boolean b39 = range_long38.isNaturalOrdering();
    boolean b40 = range_long38.isNaturalOrdering();
    Range<java.lang.Long> range_long41 = range_long32.intersectionWith(range_long38);
    java.util.Comparator<java.lang.Long> comparator_long42 = range_long32.getComparator();
    boolean b44 = range_long32.isBefore((java.lang.Long)10L);
    boolean b45 = range_long8.isOverlappedBy(range_long32);
    java.util.Comparator<java.lang.Long> comparator_long48 = null;
    Range<java.lang.Long> range_long49 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long48);
    boolean b50 = range_long49.isNaturalOrdering();
    boolean b51 = range_long49.isNaturalOrdering();
    boolean b53 = range_long49.isBefore((java.lang.Long)(-1L));
    java.lang.String str55 = range_long49.toString("");
    boolean b57 = range_long49.isBefore((java.lang.Long)100L);
    java.lang.Long long58 = range_long49.getMaximum();
    boolean b59 = range_long32.isAfterRange(range_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L)+ "'", long4.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long41);
    org.junit.Assert.assertTrue("'" + comparator_long42 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long42.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L+ "'", long58.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long10 = null;
    Range<java.lang.Long> range_long11 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long10);
    java.util.Comparator<java.lang.Long> comparator_long14 = null;
    Range<java.lang.Long> range_long15 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long14);
    boolean b16 = range_long15.isNaturalOrdering();
    boolean b17 = range_long15.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    Range<java.lang.Long> range_long24 = range_long15.intersectionWith(range_long21);
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    boolean b29 = range_long21.containsRange(range_long28);
    boolean b30 = range_long11.isBeforeRange(range_long21);
    java.lang.String str31 = range_long11.toString();
    java.util.Comparator<java.lang.Long> comparator_long32 = range_long11.getComparator();
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)(-1L), (java.lang.Long)(-1L), comparator_long32);
    java.util.Comparator<java.lang.Long> comparator_long36 = null;
    Range<java.lang.Long> range_long37 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long36);
    boolean b38 = range_long37.isNaturalOrdering();
    boolean b39 = range_long37.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long42 = null;
    Range<java.lang.Long> range_long43 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long42);
    boolean b44 = range_long43.isNaturalOrdering();
    boolean b45 = range_long43.isNaturalOrdering();
    Range<java.lang.Long> range_long46 = range_long37.intersectionWith(range_long43);
    java.util.Comparator<java.lang.Long> comparator_long49 = null;
    Range<java.lang.Long> range_long50 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long49);
    boolean b51 = range_long43.containsRange(range_long50);
    boolean b52 = range_long33.containsRange(range_long43);
    Range<java.lang.Long> range_long53 = range_long3.intersectionWith(range_long43);
    java.lang.String str54 = range_long53.toString();
    java.util.Comparator<java.lang.Long> comparator_long59 = null;
    Range<java.lang.Long> range_long60 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long59);
    boolean b61 = range_long60.isNaturalOrdering();
    boolean b62 = range_long60.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long65 = null;
    Range<java.lang.Long> range_long66 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long65);
    boolean b67 = range_long66.isNaturalOrdering();
    boolean b68 = range_long66.isNaturalOrdering();
    Range<java.lang.Long> range_long69 = range_long60.intersectionWith(range_long66);
    java.util.Comparator<java.lang.Long> comparator_long72 = null;
    Range<java.lang.Long> range_long73 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long72);
    boolean b74 = range_long66.containsRange(range_long73);
    java.util.Comparator<java.lang.Long> comparator_long77 = null;
    Range<java.lang.Long> range_long78 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long77);
    boolean b79 = range_long78.isNaturalOrdering();
    boolean b80 = range_long78.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long83 = null;
    Range<java.lang.Long> range_long84 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long83);
    boolean b85 = range_long84.isNaturalOrdering();
    boolean b86 = range_long84.isNaturalOrdering();
    Range<java.lang.Long> range_long87 = range_long78.intersectionWith(range_long84);
    boolean b89 = range_long84.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long90 = range_long66.intersectionWith(range_long84);
    java.util.Comparator<java.lang.Long> comparator_long91 = range_long66.getComparator();
    Range<java.lang.Long> range_long92 = Range.between((java.lang.Long)1L, (java.lang.Long)0L, comparator_long91);
    boolean b93 = range_long53.isAfterRange(range_long92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[-1..0]"+ "'", str31.equals("[-1..0]"));
    org.junit.Assert.assertTrue("'" + comparator_long32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "[-1..0]"+ "'", str54.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long90);
    org.junit.Assert.assertTrue("'" + comparator_long91 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long91.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    java.lang.Long long4 = range_long3.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long7 = null;
    Range<java.lang.Long> range_long8 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long7);
    java.util.Comparator<java.lang.Long> comparator_long11 = null;
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long11);
    boolean b13 = range_long12.isNaturalOrdering();
    boolean b14 = range_long12.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long17 = null;
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long17);
    boolean b19 = range_long18.isNaturalOrdering();
    boolean b20 = range_long18.isNaturalOrdering();
    Range<java.lang.Long> range_long21 = range_long12.intersectionWith(range_long18);
    java.util.Comparator<java.lang.Long> comparator_long24 = null;
    Range<java.lang.Long> range_long25 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long24);
    boolean b26 = range_long18.containsRange(range_long25);
    boolean b27 = range_long8.containsRange(range_long18);
    boolean b28 = range_long3.containsRange(range_long8);
    java.util.Comparator<java.lang.Long> comparator_long31 = null;
    Range<java.lang.Long> range_long32 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long31);
    java.util.Comparator<java.lang.Long> comparator_long35 = null;
    Range<java.lang.Long> range_long36 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long35);
    boolean b37 = range_long36.isNaturalOrdering();
    boolean b38 = range_long36.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long41 = null;
    Range<java.lang.Long> range_long42 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long41);
    boolean b43 = range_long42.isNaturalOrdering();
    boolean b44 = range_long42.isNaturalOrdering();
    Range<java.lang.Long> range_long45 = range_long36.intersectionWith(range_long42);
    java.util.Comparator<java.lang.Long> comparator_long48 = null;
    Range<java.lang.Long> range_long49 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long48);
    boolean b50 = range_long42.containsRange(range_long49);
    boolean b51 = range_long32.isBeforeRange(range_long42);
    boolean b52 = range_long8.isOverlappedBy(range_long32);
    java.lang.Long long53 = range_long8.getMinimum();
    java.util.Comparator<java.lang.Long> comparator_long56 = null;
    Range<java.lang.Long> range_long57 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long56);
    boolean b58 = range_long57.isNaturalOrdering();
    boolean b59 = range_long57.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long62 = null;
    Range<java.lang.Long> range_long63 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long62);
    boolean b64 = range_long63.isNaturalOrdering();
    boolean b65 = range_long63.isNaturalOrdering();
    Range<java.lang.Long> range_long66 = range_long57.intersectionWith(range_long63);
    java.util.Comparator<java.lang.Long> comparator_long67 = range_long57.getComparator();
    boolean b69 = range_long57.isBefore((java.lang.Long)10L);
    int i71 = range_long57.elementCompareTo((java.lang.Long)1L);
    java.lang.Long long72 = range_long57.getMaximum();
    boolean b73 = range_long8.isAfterRange(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L)+ "'", long4.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L)+ "'", long53.equals((-1L)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long66);
    org.junit.Assert.assertTrue("'" + comparator_long67 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long67.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L+ "'", long72.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long13 = range_long12.getComparator();
    java.lang.Long long14 = range_long12.getMaximum();
    java.util.Comparator<java.lang.Long> comparator_long21 = null;
    Range<java.lang.Long> range_long22 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long21);
    boolean b23 = range_long22.isNaturalOrdering();
    boolean b24 = range_long22.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long27 = null;
    Range<java.lang.Long> range_long28 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long27);
    boolean b29 = range_long28.isNaturalOrdering();
    boolean b30 = range_long28.isNaturalOrdering();
    Range<java.lang.Long> range_long31 = range_long22.intersectionWith(range_long28);
    java.util.Comparator<java.lang.Long> comparator_long32 = range_long22.getComparator();
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)(-1L), (java.lang.Long)0L, comparator_long32);
    Range<java.lang.Long> range_long34 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    int i36 = range_long34.elementCompareTo((java.lang.Long)(-1L));
    java.util.Comparator<java.lang.Long> comparator_long39 = null;
    Range<java.lang.Long> range_long40 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long39);
    boolean b41 = range_long40.isNaturalOrdering();
    boolean b42 = range_long40.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long45 = null;
    Range<java.lang.Long> range_long46 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long45);
    boolean b47 = range_long46.isNaturalOrdering();
    boolean b48 = range_long46.isNaturalOrdering();
    Range<java.lang.Long> range_long49 = range_long40.intersectionWith(range_long46);
    boolean b51 = range_long46.isEndedBy((java.lang.Long)10L);
    java.lang.String str52 = range_long46.toString();
    java.lang.Long long53 = range_long46.getMaximum();
    boolean b55 = range_long46.isEndedBy((java.lang.Long)1L);
    boolean b56 = range_long34.isOverlappedBy(range_long46);
    boolean b57 = range_long12.isAfterRange(range_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    org.junit.Assert.assertTrue("'" + comparator_long13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L+ "'", long14.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long31);
    org.junit.Assert.assertTrue("'" + comparator_long32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "[-1..0]"+ "'", str52.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L+ "'", long53.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    java.util.Comparator<java.lang.Long> comparator_long5 = null;
    Range<java.lang.Long> range_long6 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long5);
    boolean b7 = range_long6.isNaturalOrdering();
    boolean b8 = range_long6.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long11 = null;
    Range<java.lang.Long> range_long12 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long11);
    boolean b13 = range_long12.isNaturalOrdering();
    boolean b14 = range_long12.isNaturalOrdering();
    Range<java.lang.Long> range_long15 = range_long6.intersectionWith(range_long12);
    java.util.Comparator<java.lang.Long> comparator_long16 = range_long15.getComparator();
    Range<java.lang.Long> range_long17 = Range.is((java.lang.Long)0L, comparator_long16);
    Range<java.lang.Long> range_long18 = Range.between((java.lang.Long)100L, (java.lang.Long)10L, comparator_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long15);
    org.junit.Assert.assertTrue("'" + comparator_long16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_long16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long18);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    boolean b17 = range_long9.containsRange(range_long16);
    java.util.Comparator<java.lang.Long> comparator_long20 = null;
    Range<java.lang.Long> range_long21 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long20);
    boolean b22 = range_long21.isNaturalOrdering();
    boolean b23 = range_long21.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long26 = null;
    Range<java.lang.Long> range_long27 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long26);
    boolean b28 = range_long27.isNaturalOrdering();
    boolean b29 = range_long27.isNaturalOrdering();
    Range<java.lang.Long> range_long30 = range_long21.intersectionWith(range_long27);
    boolean b32 = range_long27.isEndedBy((java.lang.Long)10L);
    Range<java.lang.Long> range_long33 = range_long9.intersectionWith(range_long27);
    boolean b34 = range_long9.isNaturalOrdering();
    boolean b36 = range_long9.isStartedBy((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    boolean b7 = range_long3.isBefore((java.lang.Long)(-1L));
    boolean b9 = range_long3.isBefore((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    java.util.Comparator<java.lang.Long> comparator_long2 = null;
    Range<java.lang.Long> range_long3 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long2);
    boolean b4 = range_long3.isNaturalOrdering();
    boolean b5 = range_long3.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long8 = null;
    Range<java.lang.Long> range_long9 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long8);
    boolean b10 = range_long9.isNaturalOrdering();
    boolean b11 = range_long9.isNaturalOrdering();
    Range<java.lang.Long> range_long12 = range_long3.intersectionWith(range_long9);
    java.util.Comparator<java.lang.Long> comparator_long15 = null;
    Range<java.lang.Long> range_long16 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long15);
    java.util.Comparator<java.lang.Long> comparator_long19 = null;
    Range<java.lang.Long> range_long20 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long19);
    boolean b21 = range_long20.isNaturalOrdering();
    boolean b22 = range_long20.isNaturalOrdering();
    java.util.Comparator<java.lang.Long> comparator_long25 = null;
    Range<java.lang.Long> range_long26 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long25);
    boolean b27 = range_long26.isNaturalOrdering();
    boolean b28 = range_long26.isNaturalOrdering();
    Range<java.lang.Long> range_long29 = range_long20.intersectionWith(range_long26);
    java.util.Comparator<java.lang.Long> comparator_long32 = null;
    Range<java.lang.Long> range_long33 = Range.between((java.lang.Long)0L, (java.lang.Long)(-1L), comparator_long32);
    boolean b34 = range_long26.containsRange(range_long33);
    boolean b35 = range_long16.isBeforeRange(range_long26);
    java.lang.String str36 = range_long16.toString();
    Range<java.lang.Long> range_long37 = range_long9.intersectionWith(range_long16);
    boolean b39 = range_long9.isBefore((java.lang.Long)1L);
    int i41 = range_long9.elementCompareTo((java.lang.Long)10L);
    int i43 = range_long9.elementCompareTo((java.lang.Long)1L);
    java.lang.String str45 = range_long9.toString("[1..1]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "[-1..0]"+ "'", str36.equals("[-1..0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_long37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "[1..1]"+ "'", str45.equals("[1..1]"));

  }

}
