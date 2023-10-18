package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it1_livello2_it3_livello3_it4_livello4_it6_livello5 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    java.lang.Boolean b9 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b3.getComparator();
    java.util.Comparator<java.lang.Boolean> comparator_b13 = null;
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b17 = null;
    Range<java.lang.Boolean> range_b18 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b17);
    java.util.Comparator<java.lang.Boolean> comparator_b21 = null;
    Range<java.lang.Boolean> range_b22 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b21);
    boolean b23 = range_b18.isOverlappedBy(range_b22);
    boolean b25 = range_b18.isStartedBy((java.lang.Boolean)false);
    boolean b27 = range_b18.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b30 = null;
    Range<java.lang.Boolean> range_b31 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b30);
    java.util.Comparator<java.lang.Boolean> comparator_b34 = null;
    Range<java.lang.Boolean> range_b35 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b34);
    boolean b36 = range_b31.isOverlappedBy(range_b35);
    boolean b37 = range_b18.isAfterRange(range_b31);
    boolean b38 = range_b14.isAfterRange(range_b18);
    boolean b40 = range_b18.isStartedBy((java.lang.Boolean)true);
    java.lang.String str41 = range_b18.toString();
    boolean b42 = range_b3.containsRange(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "[false..true]"+ "'", str41.equals("[false..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.String str4 = range_b3.toString();
    boolean b6 = range_b3.isStartedBy((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[false..true]"+ "'", str4.equals("[false..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b10);
    boolean b12 = range_b7.isOverlappedBy(range_b11);
    boolean b14 = range_b7.isStartedBy((java.lang.Boolean)false);
    boolean b16 = range_b7.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b23);
    boolean b25 = range_b20.isOverlappedBy(range_b24);
    boolean b26 = range_b7.isAfterRange(range_b20);
    boolean b27 = range_b3.isAfterRange(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b30 = null;
    Range<java.lang.Boolean> range_b31 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b30);
    java.util.Comparator<java.lang.Boolean> comparator_b34 = null;
    Range<java.lang.Boolean> range_b35 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b34);
    boolean b36 = range_b31.isOverlappedBy(range_b35);
    boolean b38 = range_b31.isStartedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b41 = null;
    Range<java.lang.Boolean> range_b42 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b41);
    java.util.Comparator<java.lang.Boolean> comparator_b45 = null;
    Range<java.lang.Boolean> range_b46 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b45);
    boolean b47 = range_b42.isOverlappedBy(range_b46);
    java.util.Comparator<java.lang.Boolean> comparator_b50 = null;
    Range<java.lang.Boolean> range_b51 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b50);
    boolean b52 = range_b46.containsRange(range_b51);
    boolean b53 = range_b31.containsRange(range_b51);
    boolean b54 = range_b3.isBeforeRange(range_b31);
    java.lang.Boolean b55 = range_b31.getMaximum();
    java.lang.Boolean b56 = range_b31.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b55 + "' != '" + true+ "'", b55.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b56 + "' != '" + true+ "'", b56.equals(true));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    Range<java.lang.Boolean> range_b1 = Range.is((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    boolean b10 = range_b3.isStartedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b13 = null;
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b17 = null;
    Range<java.lang.Boolean> range_b18 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b17);
    boolean b19 = range_b14.isOverlappedBy(range_b18);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b22);
    boolean b24 = range_b18.containsRange(range_b23);
    boolean b25 = range_b3.containsRange(range_b23);
    boolean b27 = range_b23.isStartedBy((java.lang.Boolean)true);
    boolean b29 = range_b23.isBefore((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b32 = null;
    Range<java.lang.Boolean> range_b33 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b32);
    java.util.Comparator<java.lang.Boolean> comparator_b36 = null;
    Range<java.lang.Boolean> range_b37 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b36);
    boolean b38 = range_b33.isOverlappedBy(range_b37);
    java.util.Comparator<java.lang.Boolean> comparator_b41 = null;
    Range<java.lang.Boolean> range_b42 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b41);
    boolean b43 = range_b37.containsRange(range_b42);
    boolean b44 = range_b23.containsRange(range_b42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b10);
    boolean b12 = range_b7.isOverlappedBy(range_b11);
    boolean b14 = range_b7.isStartedBy((java.lang.Boolean)false);
    boolean b16 = range_b7.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b23);
    boolean b25 = range_b20.isOverlappedBy(range_b24);
    boolean b26 = range_b7.isAfterRange(range_b20);
    boolean b27 = range_b3.isAfterRange(range_b7);
    boolean b29 = range_b7.isStartedBy((java.lang.Boolean)true);
    java.lang.String str30 = range_b7.toString();
    java.lang.Boolean b31 = range_b7.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b34 = null;
    Range<java.lang.Boolean> range_b35 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b34);
    java.util.Comparator<java.lang.Boolean> comparator_b38 = null;
    Range<java.lang.Boolean> range_b39 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b38);
    boolean b40 = range_b35.isOverlappedBy(range_b39);
    boolean b42 = range_b35.isStartedBy((java.lang.Boolean)false);
    boolean b44 = range_b35.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b47 = null;
    Range<java.lang.Boolean> range_b48 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b47);
    java.util.Comparator<java.lang.Boolean> comparator_b51 = null;
    Range<java.lang.Boolean> range_b52 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b51);
    boolean b53 = range_b48.isOverlappedBy(range_b52);
    boolean b54 = range_b35.isAfterRange(range_b48);
    java.util.Comparator<java.lang.Boolean> comparator_b57 = null;
    Range<java.lang.Boolean> range_b58 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b57);
    java.util.Comparator<java.lang.Boolean> comparator_b61 = null;
    Range<java.lang.Boolean> range_b62 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b61);
    boolean b63 = range_b58.isOverlappedBy(range_b62);
    java.lang.Boolean b64 = range_b58.getMinimum();
    boolean b65 = range_b35.equals((java.lang.Object)range_b58);
    boolean b66 = range_b7.equals((java.lang.Object)range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[false..true]"+ "'", str30.equals("[false..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b31 + "' != '" + false+ "'", b31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b64 + "' != '" + false+ "'", b64.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    java.lang.Boolean b9 = range_b7.getMaximum();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b12);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = null;
    Range<java.lang.Boolean> range_b17 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b16);
    java.util.Comparator<java.lang.Boolean> comparator_b20 = null;
    Range<java.lang.Boolean> range_b21 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b20);
    boolean b22 = range_b17.isOverlappedBy(range_b21);
    boolean b24 = range_b17.isStartedBy((java.lang.Boolean)false);
    boolean b26 = range_b17.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b29 = null;
    Range<java.lang.Boolean> range_b30 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b29);
    java.util.Comparator<java.lang.Boolean> comparator_b33 = null;
    Range<java.lang.Boolean> range_b34 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b33);
    boolean b35 = range_b30.isOverlappedBy(range_b34);
    boolean b36 = range_b17.isAfterRange(range_b30);
    boolean b37 = range_b13.isAfterRange(range_b17);
    boolean b38 = range_b7.isBeforeRange(range_b17);
    boolean b40 = range_b7.isBefore((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + true+ "'", b9.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    java.lang.Boolean b9 = range_b3.getMinimum();
    boolean b11 = range_b3.contains((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)10, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b10);
    boolean b12 = range_b7.isOverlappedBy(range_b11);
    boolean b14 = range_b7.isStartedBy((java.lang.Boolean)false);
    boolean b16 = range_b7.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b23);
    boolean b25 = range_b20.isOverlappedBy(range_b24);
    boolean b26 = range_b7.isAfterRange(range_b20);
    boolean b27 = range_b3.isAfterRange(range_b7);
    boolean b29 = range_b3.isStartedBy((java.lang.Boolean)true);
    boolean b31 = range_b3.isBefore((java.lang.Boolean)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b10);
    boolean b12 = range_b7.isOverlappedBy(range_b11);
    boolean b14 = range_b7.isStartedBy((java.lang.Boolean)false);
    boolean b16 = range_b7.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b23);
    boolean b25 = range_b20.isOverlappedBy(range_b24);
    boolean b26 = range_b7.isAfterRange(range_b20);
    boolean b27 = range_b3.isAfterRange(range_b7);
    boolean b29 = range_b3.isStartedBy((java.lang.Boolean)true);
    java.lang.String str31 = range_b3.toString("[false..true]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[false..true]"+ "'", str31.equals("[false..true]"));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b11 = null;
    Range<java.lang.Boolean> range_b12 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b11);
    java.util.Comparator<java.lang.Boolean> comparator_b15 = null;
    Range<java.lang.Boolean> range_b16 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b15);
    boolean b17 = range_b12.isOverlappedBy(range_b16);
    boolean b19 = range_b12.isStartedBy((java.lang.Boolean)false);
    boolean b21 = range_b12.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b24 = null;
    Range<java.lang.Boolean> range_b25 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b24);
    java.util.Comparator<java.lang.Boolean> comparator_b28 = null;
    Range<java.lang.Boolean> range_b29 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b28);
    boolean b30 = range_b25.isOverlappedBy(range_b29);
    boolean b31 = range_b12.isAfterRange(range_b25);
    java.util.Comparator<java.lang.Boolean> comparator_b34 = null;
    Range<java.lang.Boolean> range_b35 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b34);
    java.util.Comparator<java.lang.Boolean> comparator_b38 = null;
    Range<java.lang.Boolean> range_b39 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b38);
    boolean b40 = range_b35.isOverlappedBy(range_b39);
    java.lang.Boolean b41 = range_b35.getMinimum();
    boolean b42 = range_b12.equals((java.lang.Object)range_b35);
    boolean b44 = range_b35.isBefore((java.lang.Boolean)false);
    boolean b45 = range_b3.isAfterRange(range_b35);
    java.util.Comparator<java.lang.Boolean> comparator_b46 = range_b35.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b41 + "' != '" + false+ "'", b41.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    org.junit.Assert.assertTrue("'" + comparator_b46 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b46.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b10);
    boolean b12 = range_b7.isOverlappedBy(range_b11);
    boolean b14 = range_b7.isStartedBy((java.lang.Boolean)false);
    boolean b16 = range_b7.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b23);
    boolean b25 = range_b20.isOverlappedBy(range_b24);
    boolean b26 = range_b7.isAfterRange(range_b20);
    boolean b27 = range_b3.isAfterRange(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b28 = range_b7.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    org.junit.Assert.assertTrue("'" + comparator_b28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b28.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b10);
    boolean b12 = range_b7.isOverlappedBy(range_b11);
    boolean b14 = range_b7.isStartedBy((java.lang.Boolean)false);
    boolean b16 = range_b7.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b23);
    boolean b25 = range_b20.isOverlappedBy(range_b24);
    boolean b26 = range_b7.isAfterRange(range_b20);
    boolean b27 = range_b3.isAfterRange(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b30 = null;
    Range<java.lang.Boolean> range_b31 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b30);
    java.util.Comparator<java.lang.Boolean> comparator_b34 = null;
    Range<java.lang.Boolean> range_b35 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b34);
    boolean b36 = range_b31.isOverlappedBy(range_b35);
    boolean b38 = range_b31.isStartedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b41 = null;
    Range<java.lang.Boolean> range_b42 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b41);
    java.util.Comparator<java.lang.Boolean> comparator_b45 = null;
    Range<java.lang.Boolean> range_b46 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b45);
    boolean b47 = range_b42.isOverlappedBy(range_b46);
    java.util.Comparator<java.lang.Boolean> comparator_b50 = null;
    Range<java.lang.Boolean> range_b51 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b50);
    boolean b52 = range_b46.containsRange(range_b51);
    boolean b53 = range_b31.containsRange(range_b51);
    boolean b54 = range_b3.isBeforeRange(range_b31);
    java.lang.Boolean b55 = range_b31.getMaximum();
    boolean b56 = range_b31.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b55 + "' != '" + true+ "'", b55.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    boolean b10 = range_b3.isStartedBy((java.lang.Boolean)false);
    boolean b12 = range_b3.equals((java.lang.Object)"");
    java.util.Comparator<java.lang.Boolean> comparator_b15 = null;
    Range<java.lang.Boolean> range_b16 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b15);
    boolean b17 = range_b3.isAfterRange(range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b10);
    boolean b12 = range_b7.isOverlappedBy(range_b11);
    boolean b14 = range_b7.isStartedBy((java.lang.Boolean)false);
    boolean b16 = range_b7.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b23);
    boolean b25 = range_b20.isOverlappedBy(range_b24);
    boolean b26 = range_b7.isAfterRange(range_b20);
    boolean b27 = range_b3.isAfterRange(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b30 = null;
    Range<java.lang.Boolean> range_b31 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b30);
    java.util.Comparator<java.lang.Boolean> comparator_b34 = null;
    Range<java.lang.Boolean> range_b35 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b34);
    boolean b36 = range_b31.isOverlappedBy(range_b35);
    boolean b38 = range_b31.isStartedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b41 = null;
    Range<java.lang.Boolean> range_b42 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b41);
    java.util.Comparator<java.lang.Boolean> comparator_b45 = null;
    Range<java.lang.Boolean> range_b46 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b45);
    boolean b47 = range_b42.isOverlappedBy(range_b46);
    java.util.Comparator<java.lang.Boolean> comparator_b50 = null;
    Range<java.lang.Boolean> range_b51 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b50);
    boolean b52 = range_b46.containsRange(range_b51);
    boolean b53 = range_b31.containsRange(range_b51);
    boolean b54 = range_b3.isBeforeRange(range_b31);
    boolean b56 = range_b3.isBefore((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b57 = range_b3.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    org.junit.Assert.assertTrue("'" + comparator_b57 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b57.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b4);
    java.util.Comparator<java.lang.Boolean> comparator_b8 = null;
    Range<java.lang.Boolean> range_b9 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b8);
    boolean b10 = range_b5.isOverlappedBy(range_b9);
    boolean b12 = range_b5.isStartedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b15 = null;
    Range<java.lang.Boolean> range_b16 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b15);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    boolean b21 = range_b16.isOverlappedBy(range_b20);
    java.util.Comparator<java.lang.Boolean> comparator_b24 = null;
    Range<java.lang.Boolean> range_b25 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b24);
    boolean b26 = range_b20.containsRange(range_b25);
    boolean b27 = range_b5.containsRange(range_b25);
    boolean b29 = range_b25.isStartedBy((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b30 = range_b25.getComparator();
    Range<java.lang.Boolean> range_b31 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b30);
    java.util.Comparator<java.lang.Boolean> comparator_b34 = null;
    Range<java.lang.Boolean> range_b35 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b34);
    java.util.Comparator<java.lang.Boolean> comparator_b38 = null;
    Range<java.lang.Boolean> range_b39 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b38);
    boolean b40 = range_b35.isOverlappedBy(range_b39);
    boolean b42 = range_b35.isStartedBy((java.lang.Boolean)false);
    boolean b44 = range_b35.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b47 = null;
    Range<java.lang.Boolean> range_b48 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b47);
    java.util.Comparator<java.lang.Boolean> comparator_b51 = null;
    Range<java.lang.Boolean> range_b52 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b51);
    boolean b53 = range_b48.isOverlappedBy(range_b52);
    boolean b54 = range_b35.isAfterRange(range_b48);
    boolean b56 = range_b35.isStartedBy((java.lang.Boolean)false);
    boolean b57 = range_b31.equals((java.lang.Object)b56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    org.junit.Assert.assertTrue("'" + comparator_b30 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b30.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    java.lang.Boolean b9 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b3.getComparator();
    java.util.Comparator<java.lang.Boolean> comparator_b11 = range_b3.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));
    org.junit.Assert.assertTrue("'" + comparator_b11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b11.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    Range<java.lang.Integer> range_i11 = Range.between((java.lang.Integer)100, (java.lang.Integer)0);
    boolean b12 = range_b7.equals((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    boolean b10 = range_b3.isStartedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b13 = null;
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b17 = null;
    Range<java.lang.Boolean> range_b18 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b17);
    boolean b19 = range_b14.isOverlappedBy(range_b18);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b22);
    boolean b24 = range_b18.containsRange(range_b23);
    boolean b25 = range_b3.containsRange(range_b23);
    java.lang.String str26 = range_b23.toString();
    java.util.Comparator<java.lang.Boolean> comparator_b29 = null;
    Range<java.lang.Boolean> range_b30 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b29);
    java.util.Comparator<java.lang.Boolean> comparator_b33 = null;
    Range<java.lang.Boolean> range_b34 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b33);
    boolean b35 = range_b30.isOverlappedBy(range_b34);
    boolean b37 = range_b30.isStartedBy((java.lang.Boolean)false);
    boolean b39 = range_b30.equals((java.lang.Object)"");
    Range<java.lang.Boolean> range_b40 = range_b23.intersectionWith(range_b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[false..true]"+ "'", str26.equals("[false..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b40);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b8 = null;
    Range<java.lang.Boolean> range_b9 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b8);
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b12);
    boolean b14 = range_b9.isOverlappedBy(range_b13);
    boolean b16 = range_b9.isStartedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b23);
    boolean b25 = range_b20.isOverlappedBy(range_b24);
    java.util.Comparator<java.lang.Boolean> comparator_b28 = null;
    Range<java.lang.Boolean> range_b29 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b28);
    boolean b30 = range_b24.containsRange(range_b29);
    boolean b31 = range_b9.containsRange(range_b29);
    boolean b33 = range_b29.isStartedBy((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b34 = range_b29.getComparator();
    Range<java.lang.Boolean> range_b35 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b34);
    boolean b36 = range_b3.isOverlappedBy(range_b35);
    boolean b38 = range_b35.isAfter((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    org.junit.Assert.assertTrue("'" + comparator_b34 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b34.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    java.lang.Boolean b9 = range_b3.getMinimum();
    java.util.Comparator<java.lang.Boolean> comparator_b10 = range_b3.getComparator();
    boolean b12 = range_b3.isEndedBy((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + false+ "'", b9.equals(false));
    org.junit.Assert.assertTrue("'" + comparator_b10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    java.util.Comparator<java.lang.Boolean> comparator_b4 = null;
    Range<java.lang.Boolean> range_b5 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b4);
    java.util.Comparator<java.lang.Boolean> comparator_b8 = null;
    Range<java.lang.Boolean> range_b9 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b8);
    boolean b10 = range_b5.isOverlappedBy(range_b9);
    boolean b12 = range_b5.isStartedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b15 = null;
    Range<java.lang.Boolean> range_b16 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b15);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    boolean b21 = range_b16.isOverlappedBy(range_b20);
    java.util.Comparator<java.lang.Boolean> comparator_b24 = null;
    Range<java.lang.Boolean> range_b25 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b24);
    boolean b26 = range_b20.containsRange(range_b25);
    boolean b27 = range_b5.containsRange(range_b25);
    boolean b29 = range_b25.isStartedBy((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b30 = range_b25.getComparator();
    Range<java.lang.Boolean> range_b31 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b30);
    java.lang.String str33 = range_b31.toString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    org.junit.Assert.assertTrue("'" + comparator_b30 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b30.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b10);
    boolean b12 = range_b7.isOverlappedBy(range_b11);
    boolean b14 = range_b7.isStartedBy((java.lang.Boolean)false);
    boolean b16 = range_b7.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b23);
    boolean b25 = range_b20.isOverlappedBy(range_b24);
    boolean b26 = range_b7.isAfterRange(range_b20);
    boolean b27 = range_b3.isAfterRange(range_b7);
    boolean b29 = range_b7.isStartedBy((java.lang.Boolean)true);
    java.lang.String str30 = range_b7.toString();
    java.lang.String str32 = range_b7.toString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[false..true]"+ "'", str30.equals("[false..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)0, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b10);
    boolean b12 = range_b7.isOverlappedBy(range_b11);
    boolean b14 = range_b7.isStartedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b17 = null;
    Range<java.lang.Boolean> range_b18 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b17);
    java.util.Comparator<java.lang.Boolean> comparator_b21 = null;
    Range<java.lang.Boolean> range_b22 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b21);
    boolean b23 = range_b18.isOverlappedBy(range_b22);
    java.util.Comparator<java.lang.Boolean> comparator_b26 = null;
    Range<java.lang.Boolean> range_b27 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b26);
    boolean b28 = range_b22.containsRange(range_b27);
    boolean b29 = range_b7.containsRange(range_b27);
    boolean b31 = range_b27.isStartedBy((java.lang.Boolean)true);
    java.util.Comparator<java.lang.Boolean> comparator_b32 = range_b27.getComparator();
    Range<java.lang.Boolean> range_b33 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b32);
    Range<java.lang.Boolean> range_b34 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)false, comparator_b32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    org.junit.Assert.assertTrue("'" + comparator_b32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b34);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    boolean b10 = range_b3.isStartedBy((java.lang.Boolean)false);
    boolean b12 = range_b3.isAfter((java.lang.Boolean)false);
    java.lang.String str14 = range_b3.toString("[false..true]");
    java.util.Comparator<java.lang.Boolean> comparator_b15 = range_b3.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[false..true]"+ "'", str14.equals("[false..true]"));
    org.junit.Assert.assertTrue("'" + comparator_b15 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_b15.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b10);
    boolean b12 = range_b7.isOverlappedBy(range_b11);
    boolean b14 = range_b7.isStartedBy((java.lang.Boolean)false);
    boolean b16 = range_b7.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b23);
    boolean b25 = range_b20.isOverlappedBy(range_b24);
    boolean b26 = range_b7.isAfterRange(range_b20);
    java.util.Comparator<java.lang.Boolean> comparator_b29 = null;
    Range<java.lang.Boolean> range_b30 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b29);
    java.util.Comparator<java.lang.Boolean> comparator_b33 = null;
    Range<java.lang.Boolean> range_b34 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b33);
    boolean b35 = range_b30.isOverlappedBy(range_b34);
    java.lang.Boolean b36 = range_b30.getMinimum();
    boolean b37 = range_b7.equals((java.lang.Object)range_b30);
    boolean b39 = range_b7.isAfter((java.lang.Boolean)false);
    boolean b40 = range_b3.isAfterRange(range_b7);
    boolean b42 = range_b7.isAfter((java.lang.Boolean)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b36 + "' != '" + false+ "'", b36.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b2);
    java.lang.String str4 = range_b3.toString();
    boolean b5 = range_b3.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[false..true]"+ "'", str4.equals("[false..true]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    boolean b10 = range_b3.isStartedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b13 = null;
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b17 = null;
    Range<java.lang.Boolean> range_b18 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b17);
    boolean b19 = range_b14.isOverlappedBy(range_b18);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b22);
    boolean b24 = range_b18.containsRange(range_b23);
    boolean b25 = range_b3.containsRange(range_b23);
    boolean b27 = range_b23.isStartedBy((java.lang.Boolean)true);
    java.lang.String str29 = range_b23.toString("[false..true]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "[false..true]"+ "'", str29.equals("[false..true]"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    java.util.Comparator<java.lang.Boolean> comparator_b10 = null;
    Range<java.lang.Boolean> range_b11 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b10);
    boolean b12 = range_b7.isOverlappedBy(range_b11);
    boolean b14 = range_b7.isStartedBy((java.lang.Boolean)false);
    boolean b16 = range_b7.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b19 = null;
    Range<java.lang.Boolean> range_b20 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b19);
    java.util.Comparator<java.lang.Boolean> comparator_b23 = null;
    Range<java.lang.Boolean> range_b24 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b23);
    boolean b25 = range_b20.isOverlappedBy(range_b24);
    boolean b26 = range_b7.isAfterRange(range_b20);
    boolean b27 = range_b3.isAfterRange(range_b7);
    java.util.Comparator<java.lang.Boolean> comparator_b30 = null;
    Range<java.lang.Boolean> range_b31 = Range.between((java.lang.Boolean)true, (java.lang.Boolean)false, comparator_b30);
    java.util.Comparator<java.lang.Boolean> comparator_b34 = null;
    Range<java.lang.Boolean> range_b35 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b34);
    java.util.Comparator<java.lang.Boolean> comparator_b38 = null;
    Range<java.lang.Boolean> range_b39 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b38);
    boolean b40 = range_b35.isOverlappedBy(range_b39);
    boolean b42 = range_b35.isStartedBy((java.lang.Boolean)false);
    boolean b44 = range_b35.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b47 = null;
    Range<java.lang.Boolean> range_b48 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b47);
    java.util.Comparator<java.lang.Boolean> comparator_b51 = null;
    Range<java.lang.Boolean> range_b52 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b51);
    boolean b53 = range_b48.isOverlappedBy(range_b52);
    boolean b54 = range_b35.isAfterRange(range_b48);
    java.util.Comparator<java.lang.Boolean> comparator_b57 = null;
    Range<java.lang.Boolean> range_b58 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b57);
    java.util.Comparator<java.lang.Boolean> comparator_b61 = null;
    Range<java.lang.Boolean> range_b62 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b61);
    boolean b63 = range_b58.isOverlappedBy(range_b62);
    java.lang.Boolean b64 = range_b58.getMinimum();
    boolean b65 = range_b35.equals((java.lang.Object)range_b58);
    boolean b67 = range_b35.isAfter((java.lang.Boolean)false);
    boolean b68 = range_b31.isAfterRange(range_b35);
    boolean b69 = range_b7.containsRange(range_b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b64 + "' != '" + false+ "'", b64.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    boolean b10 = range_b3.isStartedBy((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b13 = null;
    Range<java.lang.Boolean> range_b14 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b13);
    java.util.Comparator<java.lang.Boolean> comparator_b17 = null;
    Range<java.lang.Boolean> range_b18 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b17);
    boolean b19 = range_b14.isOverlappedBy(range_b18);
    java.util.Comparator<java.lang.Boolean> comparator_b22 = null;
    Range<java.lang.Boolean> range_b23 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b22);
    boolean b24 = range_b18.containsRange(range_b23);
    boolean b25 = range_b3.containsRange(range_b23);
    java.util.Comparator<java.lang.Boolean> comparator_b28 = null;
    Range<java.lang.Boolean> range_b29 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b28);
    java.util.Comparator<java.lang.Boolean> comparator_b32 = null;
    Range<java.lang.Boolean> range_b33 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b32);
    boolean b34 = range_b29.isOverlappedBy(range_b33);
    boolean b36 = range_b29.isStartedBy((java.lang.Boolean)false);
    boolean b38 = range_b29.equals((java.lang.Object)"");
    boolean b39 = range_b23.equals((java.lang.Object)b38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    java.util.Comparator<java.lang.Boolean> comparator_b2 = null;
    Range<java.lang.Boolean> range_b3 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b2);
    java.util.Comparator<java.lang.Boolean> comparator_b6 = null;
    Range<java.lang.Boolean> range_b7 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b6);
    boolean b8 = range_b3.isOverlappedBy(range_b7);
    java.lang.Boolean b9 = range_b7.getMaximum();
    java.util.Comparator<java.lang.Boolean> comparator_b12 = null;
    Range<java.lang.Boolean> range_b13 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b12);
    java.util.Comparator<java.lang.Boolean> comparator_b16 = null;
    Range<java.lang.Boolean> range_b17 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b16);
    java.util.Comparator<java.lang.Boolean> comparator_b20 = null;
    Range<java.lang.Boolean> range_b21 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b20);
    boolean b22 = range_b17.isOverlappedBy(range_b21);
    boolean b24 = range_b17.isStartedBy((java.lang.Boolean)false);
    boolean b26 = range_b17.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b29 = null;
    Range<java.lang.Boolean> range_b30 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b29);
    java.util.Comparator<java.lang.Boolean> comparator_b33 = null;
    Range<java.lang.Boolean> range_b34 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b33);
    boolean b35 = range_b30.isOverlappedBy(range_b34);
    boolean b36 = range_b17.isAfterRange(range_b30);
    boolean b37 = range_b13.isAfterRange(range_b17);
    boolean b38 = range_b7.isBeforeRange(range_b17);
    java.util.Comparator<java.lang.Boolean> comparator_b41 = null;
    Range<java.lang.Boolean> range_b42 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b41);
    java.util.Comparator<java.lang.Boolean> comparator_b45 = null;
    Range<java.lang.Boolean> range_b46 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b45);
    boolean b47 = range_b42.isOverlappedBy(range_b46);
    boolean b49 = range_b42.isStartedBy((java.lang.Boolean)false);
    boolean b51 = range_b42.isAfter((java.lang.Boolean)false);
    java.util.Comparator<java.lang.Boolean> comparator_b54 = null;
    Range<java.lang.Boolean> range_b55 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b54);
    java.util.Comparator<java.lang.Boolean> comparator_b58 = null;
    Range<java.lang.Boolean> range_b59 = Range.between((java.lang.Boolean)false, (java.lang.Boolean)true, comparator_b58);
    boolean b60 = range_b55.isOverlappedBy(range_b59);
    boolean b61 = range_b42.isAfterRange(range_b55);
    boolean b62 = range_b17.containsRange(range_b55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + b9 + "' != '" + true+ "'", b9.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

}
