package mypackage;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0_it4_livello4_it6_livello5 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    java.util.Comparator<java.lang.Boolean> comparator_b1 = null;
    Range<java.lang.Boolean> range_b2 = Range.is((java.lang.Boolean)false, comparator_b1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isStartedBy("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)100, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)100, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    Range<java.lang.String> range_str11 = null;
    // The following exception was thrown during execution in test generation
    try {
    Range<java.lang.String> range_str12 = range_str9.intersectionWith(range_str11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.toString();
    java.lang.String str7 = range_str3.toString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!..hi!]"+ "'", str5.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)100, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)0, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str3.isStartedBy("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    boolean b12 = range_str7.isAfterRange(range_str11);
    boolean b13 = range_str7.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    boolean b12 = range_str7.isAfterRange(range_str11);
    Range<java.lang.String> range_str13 = null;
    boolean b14 = range_str7.isAfterRange(range_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str9.isBefore("");
    boolean b14 = range_str9.isEndedBy("");
    java.util.Comparator<java.lang.String> comparator_str19 = null;
    Range<java.lang.String> range_str20 = Range.between("hi!", "hi!", comparator_str19);
    java.util.Comparator<java.lang.String> comparator_str21 = range_str20.getComparator();
    Range<java.lang.String> range_str22 = Range.between("hi!", "[hi!..hi!]", comparator_str21);
    boolean b23 = range_str9.isBeforeRange(range_str22);
    java.util.Comparator<java.lang.String> comparator_str26 = null;
    Range<java.lang.String> range_str27 = Range.between("hi!", "hi!", comparator_str26);
    java.util.Comparator<java.lang.String> comparator_str28 = range_str27.getComparator();
    java.lang.String str29 = range_str27.getMinimum();
    int i31 = range_str27.elementCompareTo("");
    boolean b32 = range_str22.isBeforeRange(range_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str20);
    org.junit.Assert.assertTrue("'" + comparator_str21 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str21.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str27);
    org.junit.Assert.assertTrue("'" + comparator_str28 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str28.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    java.util.Comparator<java.lang.Boolean> comparator_b1 = null;
    Range<java.lang.Boolean> range_b2 = Range.is((java.lang.Boolean)true, comparator_b1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_b2);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str10.isBefore("hi!");
    java.lang.String str13 = range_str10.toString();
    int i15 = range_str10.elementCompareTo("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[hi!..hi!]"+ "'", str13.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    boolean b12 = range_str7.isAfterRange(range_str11);
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    java.lang.String str25 = range_str16.toString("hi!");
    boolean b27 = range_str16.contains("[hi!..hi!]");
    boolean b28 = range_str7.isOverlappedBy(range_str16);
    boolean b30 = range_str16.isEndedBy("[hi!..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)0, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    boolean b20 = range_str3.isNaturalOrdering();
    java.lang.String str21 = range_str3.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.util.Comparator<java.lang.String> comparator_str11 = range_str9.getComparator();
    int i13 = range_str9.elementCompareTo("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    org.junit.Assert.assertTrue("'" + comparator_str11 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str11.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    int i12 = range_str10.elementCompareTo("");
    boolean b14 = range_str10.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.toString();
    boolean b6 = range_str3.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[hi!..hi!]"+ "'", str5.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str9.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    int i20 = range_str16.elementCompareTo("");
    boolean b21 = range_str9.isOverlappedBy(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.lang.String str12 = range_str3.toString("hi!");
    java.lang.String str13 = range_str3.toString();
    java.lang.String str15 = range_str3.toString("hi!");
    java.util.Comparator<java.lang.String> comparator_str18 = null;
    Range<java.lang.String> range_str19 = Range.between("hi!", "hi!", comparator_str18);
    boolean b21 = range_str19.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str24 = null;
    Range<java.lang.String> range_str25 = Range.between("hi!", "hi!", comparator_str24);
    java.util.Comparator<java.lang.String> comparator_str26 = range_str25.getComparator();
    java.lang.String str27 = range_str25.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str30 = null;
    Range<java.lang.String> range_str31 = Range.between("hi!", "hi!", comparator_str30);
    Range<java.lang.String> range_str32 = range_str25.intersectionWith(range_str31);
    boolean b34 = range_str32.isBefore("hi!");
    Range<java.lang.String> range_str35 = range_str19.intersectionWith(range_str32);
    java.lang.String str36 = range_str35.getMinimum();
    Range<java.lang.String> range_str37 = range_str3.intersectionWith(range_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[hi!..hi!]"+ "'", str13.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str25);
    org.junit.Assert.assertTrue("'" + comparator_str26 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str26.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str37);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str9.isBefore("");
    boolean b14 = range_str9.isEndedBy("");
    java.util.Comparator<java.lang.String> comparator_str19 = null;
    Range<java.lang.String> range_str20 = Range.between("hi!", "hi!", comparator_str19);
    java.util.Comparator<java.lang.String> comparator_str21 = range_str20.getComparator();
    Range<java.lang.String> range_str22 = Range.between("hi!", "[hi!..hi!]", comparator_str21);
    boolean b23 = range_str9.isBeforeRange(range_str22);
    java.lang.String str24 = range_str9.getMaximum();
    Range<java.lang.String> range_str25 = null;
    boolean b26 = range_str9.isOverlappedBy(range_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str20);
    org.junit.Assert.assertTrue("'" + comparator_str21 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str21.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    java.util.Comparator<java.lang.String> comparator_str6 = null;
    Range<java.lang.String> range_str7 = Range.between("hi!", "hi!", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str8 = range_str7.getComparator();
    Range<java.lang.String> range_str9 = Range.between("hi!", "", comparator_str8);
    Range<java.lang.String> range_str10 = Range.between("hi!", "[hi!..hi!]", comparator_str8);
    boolean b12 = range_str10.isBefore("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    org.junit.Assert.assertTrue("'" + comparator_str8 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str8.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "[hi!..hi!]", comparator_str6);
    boolean b8 = range_str7.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    int i7 = range_str3.elementCompareTo("");
    java.lang.String str9 = range_str3.toString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str3.isAfter("");
    boolean b13 = range_str3.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    boolean b12 = range_str7.isAfterRange(range_str11);
    java.lang.String str13 = range_str11.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("[hi!..hi!]", "hi!", comparator_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)0, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)10, (java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.util.Comparator<java.lang.String> comparator_str22 = null;
    Range<java.lang.String> range_str23 = Range.between("hi!", "hi!", comparator_str22);
    java.util.Comparator<java.lang.String> comparator_str24 = range_str23.getComparator();
    java.lang.String str25 = range_str23.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str28 = null;
    Range<java.lang.String> range_str29 = Range.between("hi!", "hi!", comparator_str28);
    Range<java.lang.String> range_str30 = range_str23.intersectionWith(range_str29);
    boolean b31 = range_str3.isBeforeRange(range_str30);
    java.lang.String str32 = range_str30.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    org.junit.Assert.assertTrue("'" + comparator_str24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str3.isAfter("[hi!..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.lang.String str20 = range_str16.getMinimum();
    boolean b21 = range_str16.isNaturalOrdering();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str3.isAfter("");
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    boolean b19 = range_str3.isOverlappedBy(range_str16);
    java.util.Comparator<java.lang.String> comparator_str22 = null;
    Range<java.lang.String> range_str23 = Range.between("hi!", "hi!", comparator_str22);
    java.util.Comparator<java.lang.String> comparator_str24 = range_str23.getComparator();
    java.lang.String str25 = range_str23.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str28 = null;
    Range<java.lang.String> range_str29 = Range.between("hi!", "hi!", comparator_str28);
    Range<java.lang.String> range_str30 = range_str23.intersectionWith(range_str29);
    boolean b32 = range_str29.isBefore("");
    boolean b34 = range_str29.isAfter("[hi!..hi!]");
    boolean b35 = range_str3.containsRange(range_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    org.junit.Assert.assertTrue("'" + comparator_str24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.util.Comparator<java.lang.String> comparator_str22 = null;
    Range<java.lang.String> range_str23 = Range.between("hi!", "hi!", comparator_str22);
    java.util.Comparator<java.lang.String> comparator_str24 = range_str23.getComparator();
    java.lang.String str25 = range_str23.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str28 = null;
    Range<java.lang.String> range_str29 = Range.between("hi!", "hi!", comparator_str28);
    Range<java.lang.String> range_str30 = range_str23.intersectionWith(range_str29);
    boolean b31 = range_str3.isBeforeRange(range_str30);
    java.util.Comparator<java.lang.String> comparator_str34 = null;
    Range<java.lang.String> range_str35 = Range.between("hi!", "hi!", comparator_str34);
    java.util.Comparator<java.lang.String> comparator_str36 = range_str35.getComparator();
    java.lang.String str37 = range_str35.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str40 = null;
    Range<java.lang.String> range_str41 = Range.between("hi!", "hi!", comparator_str40);
    Range<java.lang.String> range_str42 = range_str35.intersectionWith(range_str41);
    boolean b44 = range_str35.isStartedBy("");
    boolean b45 = range_str3.isBeforeRange(range_str35);
    boolean b47 = range_str35.isAfter("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    org.junit.Assert.assertTrue("'" + comparator_str24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str35);
    org.junit.Assert.assertTrue("'" + comparator_str36 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str36.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.lang.String str12 = range_str3.toString("hi!");
    boolean b14 = range_str3.isStartedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str17 = null;
    Range<java.lang.String> range_str18 = Range.between("hi!", "hi!", comparator_str17);
    java.util.Comparator<java.lang.String> comparator_str19 = range_str18.getComparator();
    java.lang.String str20 = range_str18.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    Range<java.lang.String> range_str24 = Range.between("hi!", "hi!", comparator_str23);
    Range<java.lang.String> range_str25 = range_str18.intersectionWith(range_str24);
    int i27 = range_str25.elementCompareTo("");
    java.util.Comparator<java.lang.String> comparator_str30 = null;
    Range<java.lang.String> range_str31 = Range.between("hi!", "hi!", comparator_str30);
    java.util.Comparator<java.lang.String> comparator_str32 = range_str31.getComparator();
    java.lang.String str33 = range_str31.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str36 = null;
    Range<java.lang.String> range_str37 = Range.between("hi!", "hi!", comparator_str36);
    Range<java.lang.String> range_str38 = range_str31.intersectionWith(range_str37);
    java.lang.String str40 = range_str31.toString("hi!");
    boolean b42 = range_str31.isEndedBy("hi!");
    boolean b43 = range_str25.isOverlappedBy(range_str31);
    java.lang.String str44 = range_str25.toString();
    boolean b45 = range_str3.isOverlappedBy(range_str25);
    java.util.Comparator<java.lang.String> comparator_str48 = null;
    Range<java.lang.String> range_str49 = Range.between("hi!", "hi!", comparator_str48);
    boolean b51 = range_str49.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str54 = null;
    Range<java.lang.String> range_str55 = Range.between("hi!", "hi!", comparator_str54);
    java.util.Comparator<java.lang.String> comparator_str56 = range_str55.getComparator();
    java.lang.String str57 = range_str55.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str60 = null;
    Range<java.lang.String> range_str61 = Range.between("hi!", "hi!", comparator_str60);
    Range<java.lang.String> range_str62 = range_str55.intersectionWith(range_str61);
    boolean b64 = range_str62.isBefore("hi!");
    Range<java.lang.String> range_str65 = range_str49.intersectionWith(range_str62);
    java.lang.String str66 = range_str65.getMinimum();
    Range<java.lang.String> range_str67 = range_str25.intersectionWith(range_str65);
    boolean b69 = range_str25.isStartedBy("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str18);
    org.junit.Assert.assertTrue("'" + comparator_str19 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str19.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    org.junit.Assert.assertTrue("'" + comparator_str32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[hi!..hi!]"+ "'", str44.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str55);
    org.junit.Assert.assertTrue("'" + comparator_str56 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str56.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!"+ "'", str57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    int i12 = range_str10.elementCompareTo("");
    java.lang.String str13 = range_str10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[hi!..hi!]"+ "'", str13.equals("[hi!..hi!]"));

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    boolean b7 = range_str3.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    java.util.Comparator<java.lang.String> comparator_str6 = null;
    Range<java.lang.String> range_str7 = Range.between("hi!", "hi!", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str8 = range_str7.getComparator();
    Range<java.lang.String> range_str9 = Range.between("hi!", "", comparator_str8);
    Range<java.lang.String> range_str10 = Range.between("hi!", "[hi!..hi!]", comparator_str8);
    java.lang.String str12 = range_str10.toString("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    org.junit.Assert.assertTrue("'" + comparator_str8 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str8.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.lang.String str12 = range_str3.toString("hi!");
    boolean b14 = range_str3.isStartedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str17 = null;
    Range<java.lang.String> range_str18 = Range.between("hi!", "hi!", comparator_str17);
    java.util.Comparator<java.lang.String> comparator_str19 = range_str18.getComparator();
    java.lang.String str20 = range_str18.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    Range<java.lang.String> range_str24 = Range.between("hi!", "hi!", comparator_str23);
    Range<java.lang.String> range_str25 = range_str18.intersectionWith(range_str24);
    int i27 = range_str25.elementCompareTo("");
    java.util.Comparator<java.lang.String> comparator_str30 = null;
    Range<java.lang.String> range_str31 = Range.between("hi!", "hi!", comparator_str30);
    java.util.Comparator<java.lang.String> comparator_str32 = range_str31.getComparator();
    java.lang.String str33 = range_str31.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str36 = null;
    Range<java.lang.String> range_str37 = Range.between("hi!", "hi!", comparator_str36);
    Range<java.lang.String> range_str38 = range_str31.intersectionWith(range_str37);
    java.lang.String str40 = range_str31.toString("hi!");
    boolean b42 = range_str31.isEndedBy("hi!");
    boolean b43 = range_str25.isOverlappedBy(range_str31);
    java.lang.String str44 = range_str25.toString();
    boolean b45 = range_str3.isOverlappedBy(range_str25);
    boolean b47 = range_str25.isBefore("hi!");
    java.lang.String str48 = range_str25.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str18);
    org.junit.Assert.assertTrue("'" + comparator_str19 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str19.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    org.junit.Assert.assertTrue("'" + comparator_str32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[hi!..hi!]"+ "'", str44.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "[hi!..hi!]"+ "'", str48.equals("[hi!..hi!]"));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.lang.String str12 = range_str3.toString("hi!");
    boolean b14 = range_str3.contains("[hi!..hi!]");
    java.lang.String str15 = range_str3.toString();
    boolean b17 = range_str3.contains("");
    boolean b19 = range_str3.equals((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[hi!..hi!]"+ "'", str15.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.util.Comparator<java.lang.String> comparator_str22 = null;
    Range<java.lang.String> range_str23 = Range.between("hi!", "hi!", comparator_str22);
    java.util.Comparator<java.lang.String> comparator_str24 = range_str23.getComparator();
    java.lang.String str25 = range_str23.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str28 = null;
    Range<java.lang.String> range_str29 = Range.between("hi!", "hi!", comparator_str28);
    Range<java.lang.String> range_str30 = range_str23.intersectionWith(range_str29);
    boolean b31 = range_str3.isBeforeRange(range_str30);
    int i33 = range_str30.elementCompareTo("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    org.junit.Assert.assertTrue("'" + comparator_str24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str3.isEndedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    java.lang.String str25 = range_str16.toString("hi!");
    boolean b27 = range_str16.contains("[hi!..hi!]");
    java.lang.String str28 = range_str16.toString();
    boolean b30 = range_str16.contains("");
    boolean b31 = range_str3.containsRange(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "[hi!..hi!]"+ "'", str28.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.lang.String str20 = range_str16.getMinimum();
    boolean b22 = range_str16.isBefore("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    Range<java.lang.Integer> range_i1 = Range.is((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i1);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)0, (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.lang.String str20 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    Range<java.lang.String> range_str24 = Range.between("hi!", "hi!", comparator_str23);
    java.util.Comparator<java.lang.String> comparator_str25 = range_str24.getComparator();
    java.lang.String str26 = range_str24.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str29 = null;
    Range<java.lang.String> range_str30 = Range.between("hi!", "hi!", comparator_str29);
    Range<java.lang.String> range_str31 = range_str24.intersectionWith(range_str30);
    boolean b32 = range_str16.equals((java.lang.Object)range_str31);
    boolean b34 = range_str16.isEndedBy("hi!");
    boolean b36 = range_str16.contains("[hi!..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str24);
    org.junit.Assert.assertTrue("'" + comparator_str25 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str25.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str9.isBefore("");
    boolean b14 = range_str9.isEndedBy("");
    java.util.Comparator<java.lang.String> comparator_str19 = null;
    Range<java.lang.String> range_str20 = Range.between("hi!", "hi!", comparator_str19);
    java.util.Comparator<java.lang.String> comparator_str21 = range_str20.getComparator();
    Range<java.lang.String> range_str22 = Range.between("hi!", "[hi!..hi!]", comparator_str21);
    boolean b23 = range_str9.isBeforeRange(range_str22);
    java.lang.String str24 = range_str9.getMaximum();
    boolean b26 = range_str9.isEndedBy("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str20);
    org.junit.Assert.assertTrue("'" + comparator_str21 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str21.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.util.Comparator<java.lang.String> comparator_str22 = null;
    Range<java.lang.String> range_str23 = Range.between("hi!", "hi!", comparator_str22);
    java.util.Comparator<java.lang.String> comparator_str24 = range_str23.getComparator();
    java.lang.String str25 = range_str23.toString();
    boolean b26 = range_str19.equals((java.lang.Object)str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    org.junit.Assert.assertTrue("'" + comparator_str24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[hi!..hi!]"+ "'", str25.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    int i12 = range_str10.elementCompareTo("");
    int i14 = range_str10.elementCompareTo("hi!");
    boolean b16 = range_str10.isAfter("[hi!..hi!]");
    java.lang.String str17 = range_str10.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.lang.String str20 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    Range<java.lang.String> range_str24 = Range.between("hi!", "hi!", comparator_str23);
    java.util.Comparator<java.lang.String> comparator_str25 = range_str24.getComparator();
    java.lang.String str26 = range_str24.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str29 = null;
    Range<java.lang.String> range_str30 = Range.between("hi!", "hi!", comparator_str29);
    Range<java.lang.String> range_str31 = range_str24.intersectionWith(range_str30);
    boolean b32 = range_str16.equals((java.lang.Object)range_str31);
    java.util.Comparator<java.lang.String> comparator_str35 = null;
    Range<java.lang.String> range_str36 = Range.between("hi!", "hi!", comparator_str35);
    boolean b38 = range_str36.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str41 = null;
    Range<java.lang.String> range_str42 = Range.between("hi!", "hi!", comparator_str41);
    java.util.Comparator<java.lang.String> comparator_str43 = range_str42.getComparator();
    java.lang.String str44 = range_str42.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str47 = null;
    Range<java.lang.String> range_str48 = Range.between("hi!", "hi!", comparator_str47);
    Range<java.lang.String> range_str49 = range_str42.intersectionWith(range_str48);
    boolean b51 = range_str49.isBefore("hi!");
    Range<java.lang.String> range_str52 = range_str36.intersectionWith(range_str49);
    java.util.Comparator<java.lang.String> comparator_str55 = null;
    Range<java.lang.String> range_str56 = Range.between("hi!", "hi!", comparator_str55);
    java.util.Comparator<java.lang.String> comparator_str57 = range_str56.getComparator();
    java.lang.String str58 = range_str56.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str61 = null;
    Range<java.lang.String> range_str62 = Range.between("hi!", "hi!", comparator_str61);
    Range<java.lang.String> range_str63 = range_str56.intersectionWith(range_str62);
    boolean b64 = range_str36.isBeforeRange(range_str63);
    boolean b65 = range_str16.equals((java.lang.Object)range_str63);
    java.util.Comparator<java.lang.String> comparator_str70 = null;
    Range<java.lang.String> range_str71 = Range.between("hi!", "hi!", comparator_str70);
    java.util.Comparator<java.lang.String> comparator_str72 = range_str71.getComparator();
    Range<java.lang.String> range_str73 = Range.between("hi!", "", comparator_str72);
    boolean b75 = range_str73.isBefore("");
    Range<java.lang.String> range_str76 = range_str16.intersectionWith(range_str73);
    java.lang.String str77 = range_str73.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str24);
    org.junit.Assert.assertTrue("'" + comparator_str25 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str25.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str42);
    org.junit.Assert.assertTrue("'" + comparator_str43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str56);
    org.junit.Assert.assertTrue("'" + comparator_str57 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str57.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!"+ "'", str58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str71);
    org.junit.Assert.assertTrue("'" + comparator_str72 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str72.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "[..hi!]"+ "'", str77.equals("[..hi!]"));

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)10, (java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    java.lang.String str7 = range_str5.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    Range<java.lang.String> range_str12 = range_str5.intersectionWith(range_str11);
    java.util.Comparator<java.lang.String> comparator_str13 = range_str11.getComparator();
    Range<java.lang.String> range_str14 = Range.between("hi!", "hi!", comparator_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str12);
    org.junit.Assert.assertTrue("'" + comparator_str13 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str13.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str14);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)10, (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.lang.String str12 = range_str3.toString("hi!");
    boolean b14 = range_str3.isStartedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str17 = null;
    Range<java.lang.String> range_str18 = Range.between("hi!", "hi!", comparator_str17);
    java.util.Comparator<java.lang.String> comparator_str19 = range_str18.getComparator();
    java.lang.String str20 = range_str18.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    Range<java.lang.String> range_str24 = Range.between("hi!", "hi!", comparator_str23);
    Range<java.lang.String> range_str25 = range_str18.intersectionWith(range_str24);
    int i27 = range_str25.elementCompareTo("");
    java.util.Comparator<java.lang.String> comparator_str30 = null;
    Range<java.lang.String> range_str31 = Range.between("hi!", "hi!", comparator_str30);
    java.util.Comparator<java.lang.String> comparator_str32 = range_str31.getComparator();
    java.lang.String str33 = range_str31.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str36 = null;
    Range<java.lang.String> range_str37 = Range.between("hi!", "hi!", comparator_str36);
    Range<java.lang.String> range_str38 = range_str31.intersectionWith(range_str37);
    java.lang.String str40 = range_str31.toString("hi!");
    boolean b42 = range_str31.isEndedBy("hi!");
    boolean b43 = range_str25.isOverlappedBy(range_str31);
    java.lang.String str44 = range_str25.toString();
    boolean b45 = range_str3.isOverlappedBy(range_str25);
    java.util.Comparator<java.lang.String> comparator_str48 = null;
    Range<java.lang.String> range_str49 = Range.between("hi!", "hi!", comparator_str48);
    boolean b51 = range_str49.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str54 = null;
    Range<java.lang.String> range_str55 = Range.between("hi!", "hi!", comparator_str54);
    java.util.Comparator<java.lang.String> comparator_str56 = range_str55.getComparator();
    java.lang.String str57 = range_str55.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str60 = null;
    Range<java.lang.String> range_str61 = Range.between("hi!", "hi!", comparator_str60);
    Range<java.lang.String> range_str62 = range_str55.intersectionWith(range_str61);
    boolean b64 = range_str62.isBefore("hi!");
    Range<java.lang.String> range_str65 = range_str49.intersectionWith(range_str62);
    java.lang.String str66 = range_str65.getMinimum();
    Range<java.lang.String> range_str67 = range_str25.intersectionWith(range_str65);
    java.util.Comparator<java.lang.String> comparator_str70 = null;
    Range<java.lang.String> range_str71 = Range.between("hi!", "hi!", comparator_str70);
    java.util.Comparator<java.lang.String> comparator_str72 = range_str71.getComparator();
    java.lang.String str73 = range_str71.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str76 = null;
    Range<java.lang.String> range_str77 = Range.between("hi!", "hi!", comparator_str76);
    Range<java.lang.String> range_str78 = range_str71.intersectionWith(range_str77);
    java.lang.String str80 = range_str71.toString("hi!");
    boolean b82 = range_str71.contains("[hi!..hi!]");
    java.lang.String str83 = range_str71.toString();
    boolean b85 = range_str71.contains("");
    Range<java.lang.String> range_str86 = range_str67.intersectionWith(range_str71);
    boolean b88 = range_str67.isBefore("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str18);
    org.junit.Assert.assertTrue("'" + comparator_str19 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str19.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    org.junit.Assert.assertTrue("'" + comparator_str32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[hi!..hi!]"+ "'", str44.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str55);
    org.junit.Assert.assertTrue("'" + comparator_str56 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str56.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!"+ "'", str57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str71);
    org.junit.Assert.assertTrue("'" + comparator_str72 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str72.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!"+ "'", str73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!"+ "'", str80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "[hi!..hi!]"+ "'", str83.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.lang.String str12 = range_str3.toString("hi!");
    boolean b14 = range_str3.isStartedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str17 = null;
    Range<java.lang.String> range_str18 = Range.between("hi!", "hi!", comparator_str17);
    java.util.Comparator<java.lang.String> comparator_str19 = range_str18.getComparator();
    java.lang.String str20 = range_str18.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    Range<java.lang.String> range_str24 = Range.between("hi!", "hi!", comparator_str23);
    Range<java.lang.String> range_str25 = range_str18.intersectionWith(range_str24);
    int i27 = range_str25.elementCompareTo("");
    java.util.Comparator<java.lang.String> comparator_str30 = null;
    Range<java.lang.String> range_str31 = Range.between("hi!", "hi!", comparator_str30);
    java.util.Comparator<java.lang.String> comparator_str32 = range_str31.getComparator();
    java.lang.String str33 = range_str31.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str36 = null;
    Range<java.lang.String> range_str37 = Range.between("hi!", "hi!", comparator_str36);
    Range<java.lang.String> range_str38 = range_str31.intersectionWith(range_str37);
    java.lang.String str40 = range_str31.toString("hi!");
    boolean b42 = range_str31.isEndedBy("hi!");
    boolean b43 = range_str25.isOverlappedBy(range_str31);
    java.lang.String str44 = range_str25.toString();
    boolean b45 = range_str3.isOverlappedBy(range_str25);
    java.lang.String str47 = range_str3.toString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str18);
    org.junit.Assert.assertTrue("'" + comparator_str19 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str19.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    org.junit.Assert.assertTrue("'" + comparator_str32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[hi!..hi!]"+ "'", str44.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!"+ "'", str47.equals("hi!"));

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }


    java.util.Comparator<java.lang.String> comparator_str6 = null;
    Range<java.lang.String> range_str7 = Range.between("hi!", "hi!", comparator_str6);
    boolean b9 = range_str7.isBefore("");
    int i11 = range_str7.elementCompareTo("hi!");
    java.util.Comparator<java.lang.String> comparator_str12 = range_str7.getComparator();
    Range<java.lang.String> range_str13 = Range.between("hi!", "[hi!..hi!]", comparator_str12);
    Range<java.lang.String> range_str14 = Range.between("[..hi!]", "", comparator_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    org.junit.Assert.assertTrue("'" + comparator_str12 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str12.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str14);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.lang.String str11 = range_str10.getMaximum();
    boolean b13 = range_str10.isAfter("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    boolean b12 = range_str7.isAfterRange(range_str11);
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    java.lang.String str25 = range_str16.toString("hi!");
    boolean b27 = range_str16.contains("[hi!..hi!]");
    boolean b28 = range_str7.isOverlappedBy(range_str16);
    java.util.Comparator<java.lang.String> comparator_str31 = null;
    Range<java.lang.String> range_str32 = Range.between("hi!", "hi!", comparator_str31);
    boolean b34 = range_str32.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str37 = null;
    Range<java.lang.String> range_str38 = Range.between("hi!", "hi!", comparator_str37);
    java.util.Comparator<java.lang.String> comparator_str39 = range_str38.getComparator();
    java.lang.String str40 = range_str38.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str43 = null;
    Range<java.lang.String> range_str44 = Range.between("hi!", "hi!", comparator_str43);
    Range<java.lang.String> range_str45 = range_str38.intersectionWith(range_str44);
    boolean b47 = range_str45.isBefore("hi!");
    Range<java.lang.String> range_str48 = range_str32.intersectionWith(range_str45);
    Range<java.lang.String> range_str49 = range_str7.intersectionWith(range_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    org.junit.Assert.assertTrue("'" + comparator_str39 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str39.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str49);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "[hi!..hi!]", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str12 = null;
    Range<java.lang.String> range_str13 = Range.between("hi!", "hi!", comparator_str12);
    java.util.Comparator<java.lang.String> comparator_str14 = range_str13.getComparator();
    Range<java.lang.String> range_str15 = Range.between("hi!", "", comparator_str14);
    java.util.Comparator<java.lang.String> comparator_str18 = null;
    Range<java.lang.String> range_str19 = Range.between("hi!", "hi!", comparator_str18);
    boolean b20 = range_str15.isAfterRange(range_str19);
    boolean b22 = range_str15.isEndedBy("");
    Range<java.lang.String> range_str23 = range_str7.intersectionWith(range_str15);
    java.util.Comparator<java.lang.String> comparator_str26 = null;
    Range<java.lang.String> range_str27 = Range.between("hi!", "hi!", comparator_str26);
    boolean b29 = range_str27.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str32 = null;
    Range<java.lang.String> range_str33 = Range.between("hi!", "hi!", comparator_str32);
    java.util.Comparator<java.lang.String> comparator_str34 = range_str33.getComparator();
    java.lang.String str35 = range_str33.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str38 = null;
    Range<java.lang.String> range_str39 = Range.between("hi!", "hi!", comparator_str38);
    Range<java.lang.String> range_str40 = range_str33.intersectionWith(range_str39);
    boolean b42 = range_str40.isBefore("hi!");
    Range<java.lang.String> range_str43 = range_str27.intersectionWith(range_str40);
    java.util.Comparator<java.lang.String> comparator_str46 = null;
    Range<java.lang.String> range_str47 = Range.between("hi!", "hi!", comparator_str46);
    java.util.Comparator<java.lang.String> comparator_str48 = range_str47.getComparator();
    java.lang.String str49 = range_str47.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str52 = null;
    Range<java.lang.String> range_str53 = Range.between("hi!", "hi!", comparator_str52);
    Range<java.lang.String> range_str54 = range_str47.intersectionWith(range_str53);
    boolean b55 = range_str27.isBeforeRange(range_str54);
    java.util.Comparator<java.lang.String> comparator_str58 = null;
    Range<java.lang.String> range_str59 = Range.between("hi!", "hi!", comparator_str58);
    java.util.Comparator<java.lang.String> comparator_str60 = range_str59.getComparator();
    java.lang.String str61 = range_str59.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str64 = null;
    Range<java.lang.String> range_str65 = Range.between("hi!", "hi!", comparator_str64);
    Range<java.lang.String> range_str66 = range_str59.intersectionWith(range_str65);
    java.lang.String str68 = range_str59.toString("hi!");
    boolean b70 = range_str59.contains("[hi!..hi!]");
    java.lang.String str71 = range_str59.toString();
    boolean b73 = range_str59.contains("");
    boolean b74 = range_str54.isAfterRange(range_str59);
    boolean b75 = range_str23.containsRange(range_str54);
    boolean b77 = range_str23.equals((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str13);
    org.junit.Assert.assertTrue("'" + comparator_str14 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str14.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str33);
    org.junit.Assert.assertTrue("'" + comparator_str34 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str34.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str47);
    org.junit.Assert.assertTrue("'" + comparator_str48 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str48.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str59);
    org.junit.Assert.assertTrue("'" + comparator_str60 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str60.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!"+ "'", str61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!"+ "'", str68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "[hi!..hi!]"+ "'", str71.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.lang.String str12 = range_str3.toString("hi!");
    boolean b14 = range_str3.isEndedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str17 = null;
    Range<java.lang.String> range_str18 = Range.between("hi!", "hi!", comparator_str17);
    boolean b20 = range_str18.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    Range<java.lang.String> range_str24 = Range.between("hi!", "hi!", comparator_str23);
    java.util.Comparator<java.lang.String> comparator_str25 = range_str24.getComparator();
    java.lang.String str26 = range_str24.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str29 = null;
    Range<java.lang.String> range_str30 = Range.between("hi!", "hi!", comparator_str29);
    Range<java.lang.String> range_str31 = range_str24.intersectionWith(range_str30);
    boolean b33 = range_str31.isBefore("hi!");
    Range<java.lang.String> range_str34 = range_str18.intersectionWith(range_str31);
    java.util.Comparator<java.lang.String> comparator_str37 = null;
    Range<java.lang.String> range_str38 = Range.between("hi!", "hi!", comparator_str37);
    java.util.Comparator<java.lang.String> comparator_str39 = range_str38.getComparator();
    java.lang.String str40 = range_str38.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str43 = null;
    Range<java.lang.String> range_str44 = Range.between("hi!", "hi!", comparator_str43);
    Range<java.lang.String> range_str45 = range_str38.intersectionWith(range_str44);
    boolean b46 = range_str18.isBeforeRange(range_str45);
    java.util.Comparator<java.lang.String> comparator_str49 = null;
    Range<java.lang.String> range_str50 = Range.between("hi!", "hi!", comparator_str49);
    java.util.Comparator<java.lang.String> comparator_str51 = range_str50.getComparator();
    java.lang.String str52 = range_str50.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str55 = null;
    Range<java.lang.String> range_str56 = Range.between("hi!", "hi!", comparator_str55);
    Range<java.lang.String> range_str57 = range_str50.intersectionWith(range_str56);
    boolean b59 = range_str50.isStartedBy("");
    boolean b60 = range_str18.isBeforeRange(range_str50);
    boolean b61 = range_str3.isBeforeRange(range_str18);
    java.lang.String str62 = range_str3.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str24);
    org.junit.Assert.assertTrue("'" + comparator_str25 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str25.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    org.junit.Assert.assertTrue("'" + comparator_str39 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str39.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str50);
    org.junit.Assert.assertTrue("'" + comparator_str51 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str51.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!"+ "'", str52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!"+ "'", str62.equals("hi!"));

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.lang.String str12 = range_str3.toString("hi!");
    boolean b14 = range_str3.contains("[hi!..hi!]");
    java.lang.String str15 = range_str3.toString();
    java.util.Comparator<java.lang.String> comparator_str18 = null;
    Range<java.lang.String> range_str19 = Range.between("hi!", "hi!", comparator_str18);
    java.util.Comparator<java.lang.String> comparator_str20 = range_str19.getComparator();
    java.lang.String str21 = range_str19.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str24 = null;
    Range<java.lang.String> range_str25 = Range.between("hi!", "hi!", comparator_str24);
    Range<java.lang.String> range_str26 = range_str19.intersectionWith(range_str25);
    java.lang.String str28 = range_str19.toString("hi!");
    boolean b30 = range_str19.contains("[hi!..hi!]");
    java.lang.String str31 = range_str19.toString();
    boolean b33 = range_str19.contains("");
    java.util.Comparator<java.lang.String> comparator_str36 = null;
    Range<java.lang.String> range_str37 = Range.between("hi!", "hi!", comparator_str36);
    boolean b39 = range_str37.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str42 = null;
    Range<java.lang.String> range_str43 = Range.between("hi!", "hi!", comparator_str42);
    java.util.Comparator<java.lang.String> comparator_str44 = range_str43.getComparator();
    java.lang.String str45 = range_str43.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str48 = null;
    Range<java.lang.String> range_str49 = Range.between("hi!", "hi!", comparator_str48);
    Range<java.lang.String> range_str50 = range_str43.intersectionWith(range_str49);
    boolean b52 = range_str50.isBefore("hi!");
    Range<java.lang.String> range_str53 = range_str37.intersectionWith(range_str50);
    java.util.Comparator<java.lang.String> comparator_str56 = null;
    Range<java.lang.String> range_str57 = Range.between("hi!", "hi!", comparator_str56);
    java.util.Comparator<java.lang.String> comparator_str58 = range_str57.getComparator();
    java.lang.String str59 = range_str57.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str62 = null;
    Range<java.lang.String> range_str63 = Range.between("hi!", "hi!", comparator_str62);
    Range<java.lang.String> range_str64 = range_str57.intersectionWith(range_str63);
    boolean b65 = range_str37.isBeforeRange(range_str64);
    boolean b66 = range_str19.containsRange(range_str37);
    java.lang.String str68 = range_str37.toString("hi!");
    boolean b69 = range_str3.isOverlappedBy(range_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[hi!..hi!]"+ "'", str15.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    org.junit.Assert.assertTrue("'" + comparator_str20 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str20.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[hi!..hi!]"+ "'", str31.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str43);
    org.junit.Assert.assertTrue("'" + comparator_str44 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str44.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str57);
    org.junit.Assert.assertTrue("'" + comparator_str58 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str58.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!"+ "'", str59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!"+ "'", str68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.lang.String str20 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    Range<java.lang.String> range_str24 = Range.between("hi!", "hi!", comparator_str23);
    java.util.Comparator<java.lang.String> comparator_str25 = range_str24.getComparator();
    java.lang.String str26 = range_str24.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str29 = null;
    Range<java.lang.String> range_str30 = Range.between("hi!", "hi!", comparator_str29);
    Range<java.lang.String> range_str31 = range_str24.intersectionWith(range_str30);
    boolean b32 = range_str16.equals((java.lang.Object)range_str31);
    java.util.Comparator<java.lang.String> comparator_str35 = null;
    Range<java.lang.String> range_str36 = Range.between("hi!", "hi!", comparator_str35);
    boolean b38 = range_str36.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str41 = null;
    Range<java.lang.String> range_str42 = Range.between("hi!", "hi!", comparator_str41);
    java.util.Comparator<java.lang.String> comparator_str43 = range_str42.getComparator();
    java.lang.String str44 = range_str42.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str47 = null;
    Range<java.lang.String> range_str48 = Range.between("hi!", "hi!", comparator_str47);
    Range<java.lang.String> range_str49 = range_str42.intersectionWith(range_str48);
    boolean b51 = range_str49.isBefore("hi!");
    Range<java.lang.String> range_str52 = range_str36.intersectionWith(range_str49);
    java.util.Comparator<java.lang.String> comparator_str55 = null;
    Range<java.lang.String> range_str56 = Range.between("hi!", "hi!", comparator_str55);
    java.util.Comparator<java.lang.String> comparator_str57 = range_str56.getComparator();
    java.lang.String str58 = range_str56.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str61 = null;
    Range<java.lang.String> range_str62 = Range.between("hi!", "hi!", comparator_str61);
    Range<java.lang.String> range_str63 = range_str56.intersectionWith(range_str62);
    boolean b64 = range_str36.isBeforeRange(range_str63);
    boolean b65 = range_str16.equals((java.lang.Object)range_str63);
    java.util.Comparator<java.lang.String> comparator_str70 = null;
    Range<java.lang.String> range_str71 = Range.between("hi!", "hi!", comparator_str70);
    java.util.Comparator<java.lang.String> comparator_str72 = range_str71.getComparator();
    Range<java.lang.String> range_str73 = Range.between("hi!", "", comparator_str72);
    boolean b75 = range_str73.isBefore("");
    Range<java.lang.String> range_str76 = range_str16.intersectionWith(range_str73);
    boolean b78 = range_str76.isBefore("");
    boolean b80 = range_str76.isAfter("[[hi!..hi!]..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str24);
    org.junit.Assert.assertTrue("'" + comparator_str25 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str25.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str42);
    org.junit.Assert.assertTrue("'" + comparator_str43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str56);
    org.junit.Assert.assertTrue("'" + comparator_str57 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str57.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!"+ "'", str58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str71);
    org.junit.Assert.assertTrue("'" + comparator_str72 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str72.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str9.isBefore("");
    boolean b14 = range_str9.isEndedBy("");
    java.util.Comparator<java.lang.String> comparator_str19 = null;
    Range<java.lang.String> range_str20 = Range.between("hi!", "hi!", comparator_str19);
    java.util.Comparator<java.lang.String> comparator_str21 = range_str20.getComparator();
    Range<java.lang.String> range_str22 = Range.between("hi!", "[hi!..hi!]", comparator_str21);
    boolean b23 = range_str9.isBeforeRange(range_str22);
    boolean b25 = range_str22.isAfter("[..hi!]");
    java.lang.String str26 = range_str22.toString();
    java.util.Comparator<java.lang.String> comparator_str29 = null;
    Range<java.lang.String> range_str30 = Range.between("hi!", "hi!", comparator_str29);
    java.util.Comparator<java.lang.String> comparator_str31 = range_str30.getComparator();
    java.lang.String str32 = range_str30.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str35 = null;
    Range<java.lang.String> range_str36 = Range.between("hi!", "hi!", comparator_str35);
    Range<java.lang.String> range_str37 = range_str30.intersectionWith(range_str36);
    boolean b39 = range_str30.isStartedBy("");
    boolean b41 = range_str30.isStartedBy("hi!");
    int i43 = range_str30.elementCompareTo("");
    boolean b44 = range_str22.isOverlappedBy(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str20);
    org.junit.Assert.assertTrue("'" + comparator_str21 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str21.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[[hi!..hi!]..hi!]"+ "'", str26.equals("[[hi!..hi!]..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    org.junit.Assert.assertTrue("'" + comparator_str31 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str31.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str10.isBefore("hi!");
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    boolean b25 = range_str22.isBefore("");
    boolean b27 = range_str22.isEndedBy("");
    java.util.Comparator<java.lang.String> comparator_str30 = null;
    Range<java.lang.String> range_str31 = Range.between("hi!", "hi!", comparator_str30);
    java.util.Comparator<java.lang.String> comparator_str32 = range_str31.getComparator();
    java.lang.String str33 = range_str31.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str36 = null;
    Range<java.lang.String> range_str37 = Range.between("hi!", "hi!", comparator_str36);
    Range<java.lang.String> range_str38 = range_str31.intersectionWith(range_str37);
    boolean b40 = range_str37.isBefore("");
    boolean b42 = range_str37.isAfter("[hi!..hi!]");
    boolean b43 = range_str22.containsRange(range_str37);
    boolean b44 = range_str10.isAfterRange(range_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    org.junit.Assert.assertTrue("'" + comparator_str32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    int i12 = range_str10.elementCompareTo("");
    java.lang.String str14 = range_str10.toString("");
    java.lang.String str16 = range_str10.toString("[..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[..hi!]"+ "'", str16.equals("[..hi!]"));

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    boolean b21 = range_str3.isStartedBy("[hi!..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    boolean b12 = range_str7.isAfterRange(range_str11);
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    java.lang.String str25 = range_str16.toString("hi!");
    boolean b27 = range_str16.contains("[hi!..hi!]");
    boolean b28 = range_str7.isOverlappedBy(range_str16);
    java.util.Comparator<java.lang.String> comparator_str31 = null;
    Range<java.lang.String> range_str32 = Range.between("hi!", "hi!", comparator_str31);
    java.util.Comparator<java.lang.String> comparator_str33 = range_str32.getComparator();
    java.lang.String str34 = range_str32.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str37 = null;
    Range<java.lang.String> range_str38 = Range.between("hi!", "hi!", comparator_str37);
    Range<java.lang.String> range_str39 = range_str32.intersectionWith(range_str38);
    java.lang.String str41 = range_str32.toString("hi!");
    boolean b43 = range_str32.contains("[hi!..hi!]");
    boolean b44 = range_str16.isBeforeRange(range_str32);
    boolean b46 = range_str32.isStartedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str49 = null;
    Range<java.lang.String> range_str50 = Range.between("hi!", "hi!", comparator_str49);
    java.util.Comparator<java.lang.String> comparator_str51 = range_str50.getComparator();
    java.lang.String str52 = range_str50.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str55 = null;
    Range<java.lang.String> range_str56 = Range.between("hi!", "hi!", comparator_str55);
    Range<java.lang.String> range_str57 = range_str50.intersectionWith(range_str56);
    int i59 = range_str57.elementCompareTo("");
    int i61 = range_str57.elementCompareTo("[hi!..hi!]");
    boolean b62 = range_str32.isAfterRange(range_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str32);
    org.junit.Assert.assertTrue("'" + comparator_str33 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str33.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str50);
    org.junit.Assert.assertTrue("'" + comparator_str51 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str51.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!"+ "'", str52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    boolean b12 = range_str7.isAfterRange(range_str11);
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    java.lang.String str25 = range_str16.toString("hi!");
    boolean b27 = range_str16.contains("[hi!..hi!]");
    boolean b28 = range_str7.isOverlappedBy(range_str16);
    java.util.Comparator<java.lang.String> comparator_str31 = null;
    Range<java.lang.String> range_str32 = Range.between("hi!", "hi!", comparator_str31);
    java.util.Comparator<java.lang.String> comparator_str33 = range_str32.getComparator();
    java.lang.String str34 = range_str32.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str37 = null;
    Range<java.lang.String> range_str38 = Range.between("hi!", "hi!", comparator_str37);
    Range<java.lang.String> range_str39 = range_str32.intersectionWith(range_str38);
    java.lang.String str41 = range_str32.toString("hi!");
    boolean b43 = range_str32.contains("[hi!..hi!]");
    boolean b44 = range_str16.isBeforeRange(range_str32);
    java.util.Comparator<java.lang.String> comparator_str45 = range_str32.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str32);
    org.junit.Assert.assertTrue("'" + comparator_str33 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str33.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    org.junit.Assert.assertTrue("'" + comparator_str45 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str45.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    boolean b12 = range_str7.isAfterRange(range_str11);
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    java.lang.String str25 = range_str16.toString("hi!");
    boolean b27 = range_str16.isStartedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str30 = null;
    Range<java.lang.String> range_str31 = Range.between("hi!", "hi!", comparator_str30);
    java.util.Comparator<java.lang.String> comparator_str32 = range_str31.getComparator();
    java.lang.String str33 = range_str31.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str36 = null;
    Range<java.lang.String> range_str37 = Range.between("hi!", "hi!", comparator_str36);
    Range<java.lang.String> range_str38 = range_str31.intersectionWith(range_str37);
    int i40 = range_str38.elementCompareTo("");
    java.util.Comparator<java.lang.String> comparator_str43 = null;
    Range<java.lang.String> range_str44 = Range.between("hi!", "hi!", comparator_str43);
    java.util.Comparator<java.lang.String> comparator_str45 = range_str44.getComparator();
    java.lang.String str46 = range_str44.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str49 = null;
    Range<java.lang.String> range_str50 = Range.between("hi!", "hi!", comparator_str49);
    Range<java.lang.String> range_str51 = range_str44.intersectionWith(range_str50);
    java.lang.String str53 = range_str44.toString("hi!");
    boolean b55 = range_str44.isEndedBy("hi!");
    boolean b56 = range_str38.isOverlappedBy(range_str44);
    java.lang.String str57 = range_str38.toString();
    boolean b58 = range_str16.isOverlappedBy(range_str38);
    java.util.Comparator<java.lang.String> comparator_str61 = null;
    Range<java.lang.String> range_str62 = Range.between("hi!", "hi!", comparator_str61);
    boolean b64 = range_str62.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str67 = null;
    Range<java.lang.String> range_str68 = Range.between("hi!", "hi!", comparator_str67);
    java.util.Comparator<java.lang.String> comparator_str69 = range_str68.getComparator();
    java.lang.String str70 = range_str68.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str73 = null;
    Range<java.lang.String> range_str74 = Range.between("hi!", "hi!", comparator_str73);
    Range<java.lang.String> range_str75 = range_str68.intersectionWith(range_str74);
    boolean b77 = range_str75.isBefore("hi!");
    Range<java.lang.String> range_str78 = range_str62.intersectionWith(range_str75);
    java.lang.String str79 = range_str78.getMinimum();
    Range<java.lang.String> range_str80 = range_str38.intersectionWith(range_str78);
    boolean b81 = range_str7.isAfterRange(range_str80);
    java.lang.String str82 = range_str80.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    org.junit.Assert.assertTrue("'" + comparator_str32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str44);
    org.junit.Assert.assertTrue("'" + comparator_str45 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str45.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!"+ "'", str46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "[hi!..hi!]"+ "'", str57.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str68);
    org.junit.Assert.assertTrue("'" + comparator_str69 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str69.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!"+ "'", str70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "hi!"+ "'", str79.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str82 + "' != '" + "[hi!..hi!]"+ "'", str82.equals("[hi!..hi!]"));

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }


    java.util.Comparator<java.lang.String> comparator_str6 = null;
    Range<java.lang.String> range_str7 = Range.between("hi!", "hi!", comparator_str6);
    boolean b9 = range_str7.isBefore("");
    int i11 = range_str7.elementCompareTo("hi!");
    java.util.Comparator<java.lang.String> comparator_str12 = range_str7.getComparator();
    Range<java.lang.String> range_str13 = Range.between("hi!", "[hi!..hi!]", comparator_str12);
    Range<java.lang.String> range_str14 = Range.between("hi!", "hi!", comparator_str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    org.junit.Assert.assertTrue("'" + comparator_str12 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str12.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str14);

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str9.isBefore("");
    boolean b14 = range_str9.isEndedBy("");
    java.util.Comparator<java.lang.String> comparator_str19 = null;
    Range<java.lang.String> range_str20 = Range.between("hi!", "hi!", comparator_str19);
    java.util.Comparator<java.lang.String> comparator_str21 = range_str20.getComparator();
    Range<java.lang.String> range_str22 = Range.between("hi!", "[hi!..hi!]", comparator_str21);
    boolean b23 = range_str9.isBeforeRange(range_str22);
    java.lang.String str24 = range_str22.toString();
    boolean b26 = range_str22.isAfter("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str20);
    org.junit.Assert.assertTrue("'" + comparator_str21 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str21.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[[hi!..hi!]..hi!]"+ "'", str24.equals("[[hi!..hi!]..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    int i12 = range_str10.elementCompareTo("");
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    java.lang.String str25 = range_str16.toString("hi!");
    boolean b27 = range_str16.isEndedBy("hi!");
    boolean b28 = range_str10.isOverlappedBy(range_str16);
    java.util.Comparator<java.lang.String> comparator_str31 = null;
    Range<java.lang.String> range_str32 = Range.between("hi!", "hi!", comparator_str31);
    java.util.Comparator<java.lang.String> comparator_str33 = range_str32.getComparator();
    java.lang.String str34 = range_str32.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str37 = null;
    Range<java.lang.String> range_str38 = Range.between("hi!", "hi!", comparator_str37);
    Range<java.lang.String> range_str39 = range_str32.intersectionWith(range_str38);
    java.lang.String str41 = range_str32.toString("hi!");
    boolean b43 = range_str32.contains("[hi!..hi!]");
    java.lang.String str44 = range_str32.toString();
    boolean b45 = range_str10.isBeforeRange(range_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str32);
    org.junit.Assert.assertTrue("'" + comparator_str33 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str33.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[hi!..hi!]"+ "'", str44.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }


    Range<java.lang.Integer> range_i2 = Range.between((java.lang.Integer)(-1), (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_i2);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str9.isStartedBy("");
    boolean b20 = range_str9.isStartedBy("hi!");
    boolean b21 = range_str3.isOverlappedBy(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str3.isEndedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    boolean b25 = range_str16.isAfter("");
    java.util.Comparator<java.lang.String> comparator_str28 = null;
    Range<java.lang.String> range_str29 = Range.between("hi!", "hi!", comparator_str28);
    java.util.Comparator<java.lang.String> comparator_str30 = range_str29.getComparator();
    java.lang.String str31 = range_str29.getMinimum();
    boolean b32 = range_str16.isOverlappedBy(range_str29);
    boolean b33 = range_str3.isAfterRange(range_str16);
    boolean b35 = range_str3.contains("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str29);
    org.junit.Assert.assertTrue("'" + comparator_str30 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str30.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test80"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    boolean b9 = range_str7.isStartedBy("[hi!..hi!]");
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    java.util.Comparator<java.lang.String> comparator_str16 = range_str15.getComparator();
    Range<java.lang.String> range_str17 = Range.between("hi!", "", comparator_str16);
    java.util.Comparator<java.lang.String> comparator_str20 = null;
    Range<java.lang.String> range_str21 = Range.between("hi!", "hi!", comparator_str20);
    boolean b22 = range_str17.isAfterRange(range_str21);
    java.util.Comparator<java.lang.String> comparator_str25 = null;
    Range<java.lang.String> range_str26 = Range.between("hi!", "hi!", comparator_str25);
    java.util.Comparator<java.lang.String> comparator_str27 = range_str26.getComparator();
    java.lang.String str28 = range_str26.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str31 = null;
    Range<java.lang.String> range_str32 = Range.between("hi!", "hi!", comparator_str31);
    Range<java.lang.String> range_str33 = range_str26.intersectionWith(range_str32);
    java.lang.String str35 = range_str26.toString("hi!");
    boolean b37 = range_str26.contains("[hi!..hi!]");
    boolean b38 = range_str17.isOverlappedBy(range_str26);
    java.util.Comparator<java.lang.String> comparator_str41 = null;
    Range<java.lang.String> range_str42 = Range.between("hi!", "hi!", comparator_str41);
    java.util.Comparator<java.lang.String> comparator_str43 = range_str42.getComparator();
    java.lang.String str44 = range_str42.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str47 = null;
    Range<java.lang.String> range_str48 = Range.between("hi!", "hi!", comparator_str47);
    Range<java.lang.String> range_str49 = range_str42.intersectionWith(range_str48);
    java.lang.String str51 = range_str42.toString("hi!");
    boolean b53 = range_str42.contains("[hi!..hi!]");
    boolean b54 = range_str26.isBeforeRange(range_str42);
    boolean b56 = range_str42.isStartedBy("hi!");
    boolean b57 = range_str7.isAfterRange(range_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    org.junit.Assert.assertTrue("'" + comparator_str16 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str16.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str26);
    org.junit.Assert.assertTrue("'" + comparator_str27 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str27.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str42);
    org.junit.Assert.assertTrue("'" + comparator_str43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!"+ "'", str51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test81"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    boolean b12 = range_str7.isAfterRange(range_str11);
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    java.lang.String str25 = range_str16.toString("hi!");
    boolean b27 = range_str16.contains("[hi!..hi!]");
    boolean b28 = range_str7.isOverlappedBy(range_str16);
    java.util.Comparator<java.lang.String> comparator_str31 = null;
    Range<java.lang.String> range_str32 = Range.between("hi!", "hi!", comparator_str31);
    java.util.Comparator<java.lang.String> comparator_str33 = range_str32.getComparator();
    java.lang.String str34 = range_str32.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str37 = null;
    Range<java.lang.String> range_str38 = Range.between("hi!", "hi!", comparator_str37);
    Range<java.lang.String> range_str39 = range_str32.intersectionWith(range_str38);
    java.lang.String str41 = range_str32.toString("hi!");
    boolean b43 = range_str32.contains("[hi!..hi!]");
    boolean b44 = range_str16.isBeforeRange(range_str32);
    java.lang.String str45 = range_str32.getMinimum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str32);
    org.junit.Assert.assertTrue("'" + comparator_str33 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str33.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test82"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str3.isStartedBy("");
    boolean b14 = range_str3.isStartedBy("hi!");
    int i16 = range_str3.elementCompareTo("");
    java.util.Comparator<java.lang.String> comparator_str19 = null;
    Range<java.lang.String> range_str20 = Range.between("hi!", "hi!", comparator_str19);
    boolean b22 = range_str20.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str25 = null;
    Range<java.lang.String> range_str26 = Range.between("hi!", "hi!", comparator_str25);
    java.util.Comparator<java.lang.String> comparator_str27 = range_str26.getComparator();
    java.lang.String str28 = range_str26.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str31 = null;
    Range<java.lang.String> range_str32 = Range.between("hi!", "hi!", comparator_str31);
    Range<java.lang.String> range_str33 = range_str26.intersectionWith(range_str32);
    boolean b35 = range_str33.isBefore("hi!");
    Range<java.lang.String> range_str36 = range_str20.intersectionWith(range_str33);
    java.util.Comparator<java.lang.String> comparator_str39 = null;
    Range<java.lang.String> range_str40 = Range.between("hi!", "hi!", comparator_str39);
    java.util.Comparator<java.lang.String> comparator_str41 = range_str40.getComparator();
    java.lang.String str42 = range_str40.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str45 = null;
    Range<java.lang.String> range_str46 = Range.between("hi!", "hi!", comparator_str45);
    Range<java.lang.String> range_str47 = range_str40.intersectionWith(range_str46);
    boolean b48 = range_str20.isBeforeRange(range_str47);
    boolean b49 = range_str3.containsRange(range_str47);
    java.lang.String str50 = range_str47.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str26);
    org.junit.Assert.assertTrue("'" + comparator_str27 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str27.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str40);
    org.junit.Assert.assertTrue("'" + comparator_str41 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str41.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!"+ "'", str42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test83"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    boolean b9 = range_str7.isStartedBy("[hi!..hi!]");
    boolean b11 = range_str7.isBefore("[..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test84"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    int i12 = range_str3.elementCompareTo("[..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test85"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.util.Comparator<java.lang.String> comparator_str22 = null;
    Range<java.lang.String> range_str23 = Range.between("hi!", "hi!", comparator_str22);
    java.util.Comparator<java.lang.String> comparator_str24 = range_str23.getComparator();
    java.lang.String str25 = range_str23.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str28 = null;
    Range<java.lang.String> range_str29 = Range.between("hi!", "hi!", comparator_str28);
    Range<java.lang.String> range_str30 = range_str23.intersectionWith(range_str29);
    java.lang.String str32 = range_str23.toString("hi!");
    boolean b34 = range_str23.isStartedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str37 = null;
    Range<java.lang.String> range_str38 = Range.between("hi!", "hi!", comparator_str37);
    java.util.Comparator<java.lang.String> comparator_str39 = range_str38.getComparator();
    java.lang.String str40 = range_str38.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str43 = null;
    Range<java.lang.String> range_str44 = Range.between("hi!", "hi!", comparator_str43);
    Range<java.lang.String> range_str45 = range_str38.intersectionWith(range_str44);
    int i47 = range_str45.elementCompareTo("");
    java.util.Comparator<java.lang.String> comparator_str50 = null;
    Range<java.lang.String> range_str51 = Range.between("hi!", "hi!", comparator_str50);
    java.util.Comparator<java.lang.String> comparator_str52 = range_str51.getComparator();
    java.lang.String str53 = range_str51.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str56 = null;
    Range<java.lang.String> range_str57 = Range.between("hi!", "hi!", comparator_str56);
    Range<java.lang.String> range_str58 = range_str51.intersectionWith(range_str57);
    java.lang.String str60 = range_str51.toString("hi!");
    boolean b62 = range_str51.isEndedBy("hi!");
    boolean b63 = range_str45.isOverlappedBy(range_str51);
    java.lang.String str64 = range_str45.toString();
    boolean b65 = range_str23.isOverlappedBy(range_str45);
    boolean b66 = range_str19.containsRange(range_str23);
    java.util.Comparator<java.lang.String> comparator_str67 = range_str23.getComparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    org.junit.Assert.assertTrue("'" + comparator_str24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    org.junit.Assert.assertTrue("'" + comparator_str39 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str39.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str51);
    org.junit.Assert.assertTrue("'" + comparator_str52 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str52.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!"+ "'", str60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "[hi!..hi!]"+ "'", str64.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    org.junit.Assert.assertTrue("'" + comparator_str67 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str67.equals(Range.ComparableComparator.INSTANCE));

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test86"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.lang.String str12 = range_str3.toString("hi!");
    boolean b14 = range_str3.isEndedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str17 = null;
    Range<java.lang.String> range_str18 = Range.between("hi!", "hi!", comparator_str17);
    boolean b20 = range_str18.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    Range<java.lang.String> range_str24 = Range.between("hi!", "hi!", comparator_str23);
    java.util.Comparator<java.lang.String> comparator_str25 = range_str24.getComparator();
    java.lang.String str26 = range_str24.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str29 = null;
    Range<java.lang.String> range_str30 = Range.between("hi!", "hi!", comparator_str29);
    Range<java.lang.String> range_str31 = range_str24.intersectionWith(range_str30);
    boolean b33 = range_str31.isBefore("hi!");
    Range<java.lang.String> range_str34 = range_str18.intersectionWith(range_str31);
    java.util.Comparator<java.lang.String> comparator_str37 = null;
    Range<java.lang.String> range_str38 = Range.between("hi!", "hi!", comparator_str37);
    java.util.Comparator<java.lang.String> comparator_str39 = range_str38.getComparator();
    java.lang.String str40 = range_str38.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str43 = null;
    Range<java.lang.String> range_str44 = Range.between("hi!", "hi!", comparator_str43);
    Range<java.lang.String> range_str45 = range_str38.intersectionWith(range_str44);
    boolean b46 = range_str18.isBeforeRange(range_str45);
    java.util.Comparator<java.lang.String> comparator_str49 = null;
    Range<java.lang.String> range_str50 = Range.between("hi!", "hi!", comparator_str49);
    java.util.Comparator<java.lang.String> comparator_str51 = range_str50.getComparator();
    java.lang.String str52 = range_str50.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str55 = null;
    Range<java.lang.String> range_str56 = Range.between("hi!", "hi!", comparator_str55);
    Range<java.lang.String> range_str57 = range_str50.intersectionWith(range_str56);
    boolean b59 = range_str50.isStartedBy("");
    boolean b60 = range_str18.isBeforeRange(range_str50);
    boolean b61 = range_str3.isBeforeRange(range_str18);
    boolean b63 = range_str3.isBefore("[hi!..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str24);
    org.junit.Assert.assertTrue("'" + comparator_str25 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str25.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    org.junit.Assert.assertTrue("'" + comparator_str39 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str39.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str50);
    org.junit.Assert.assertTrue("'" + comparator_str51 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str51.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!"+ "'", str52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test87"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    boolean b12 = range_str7.isAfterRange(range_str11);
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    java.lang.String str25 = range_str16.toString("hi!");
    boolean b27 = range_str16.contains("[hi!..hi!]");
    boolean b28 = range_str7.isOverlappedBy(range_str16);
    java.util.Comparator<java.lang.String> comparator_str31 = null;
    Range<java.lang.String> range_str32 = Range.between("hi!", "hi!", comparator_str31);
    java.util.Comparator<java.lang.String> comparator_str33 = range_str32.getComparator();
    java.lang.String str34 = range_str32.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str37 = null;
    Range<java.lang.String> range_str38 = Range.between("hi!", "hi!", comparator_str37);
    Range<java.lang.String> range_str39 = range_str32.intersectionWith(range_str38);
    boolean b41 = range_str38.isBefore("");
    boolean b43 = range_str38.isEndedBy("");
    java.util.Comparator<java.lang.String> comparator_str48 = null;
    Range<java.lang.String> range_str49 = Range.between("hi!", "hi!", comparator_str48);
    java.util.Comparator<java.lang.String> comparator_str50 = range_str49.getComparator();
    Range<java.lang.String> range_str51 = Range.between("hi!", "[hi!..hi!]", comparator_str50);
    boolean b52 = range_str38.isBeforeRange(range_str51);
    java.lang.String str53 = range_str51.getMinimum();
    boolean b54 = range_str7.isOverlappedBy(range_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str32);
    org.junit.Assert.assertTrue("'" + comparator_str33 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str33.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str49);
    org.junit.Assert.assertTrue("'" + comparator_str50 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str50.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "[hi!..hi!]"+ "'", str53.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test88"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    boolean b12 = range_str9.isBefore("");
    boolean b14 = range_str9.isAfter("[hi!..hi!]");
    java.lang.String str15 = range_str9.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test89"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    java.util.Comparator<java.lang.String> comparator_str4 = range_str3.getComparator();
    java.lang.String str5 = range_str3.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    Range<java.lang.String> range_str10 = range_str3.intersectionWith(range_str9);
    java.lang.String str12 = range_str3.toString("hi!");
    boolean b14 = range_str3.isStartedBy("hi!");
    java.util.Comparator<java.lang.String> comparator_str17 = null;
    Range<java.lang.String> range_str18 = Range.between("hi!", "hi!", comparator_str17);
    java.util.Comparator<java.lang.String> comparator_str19 = range_str18.getComparator();
    java.lang.String str20 = range_str18.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    Range<java.lang.String> range_str24 = Range.between("hi!", "hi!", comparator_str23);
    Range<java.lang.String> range_str25 = range_str18.intersectionWith(range_str24);
    int i27 = range_str25.elementCompareTo("");
    java.util.Comparator<java.lang.String> comparator_str30 = null;
    Range<java.lang.String> range_str31 = Range.between("hi!", "hi!", comparator_str30);
    java.util.Comparator<java.lang.String> comparator_str32 = range_str31.getComparator();
    java.lang.String str33 = range_str31.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str36 = null;
    Range<java.lang.String> range_str37 = Range.between("hi!", "hi!", comparator_str36);
    Range<java.lang.String> range_str38 = range_str31.intersectionWith(range_str37);
    java.lang.String str40 = range_str31.toString("hi!");
    boolean b42 = range_str31.isEndedBy("hi!");
    boolean b43 = range_str25.isOverlappedBy(range_str31);
    java.lang.String str44 = range_str25.toString();
    boolean b45 = range_str3.isOverlappedBy(range_str25);
    boolean b47 = range_str25.isEndedBy("[hi!..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    org.junit.Assert.assertTrue("'" + comparator_str4 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str4.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str18);
    org.junit.Assert.assertTrue("'" + comparator_str19 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str19.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    org.junit.Assert.assertTrue("'" + comparator_str32 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str32.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "[hi!..hi!]"+ "'", str44.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test90"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    boolean b21 = range_str3.isEndedBy("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test91"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.lang.String str20 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str23 = null;
    Range<java.lang.String> range_str24 = Range.between("hi!", "hi!", comparator_str23);
    java.util.Comparator<java.lang.String> comparator_str25 = range_str24.getComparator();
    java.lang.String str26 = range_str24.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str29 = null;
    Range<java.lang.String> range_str30 = Range.between("hi!", "hi!", comparator_str29);
    Range<java.lang.String> range_str31 = range_str24.intersectionWith(range_str30);
    boolean b32 = range_str16.equals((java.lang.Object)range_str31);
    java.util.Comparator<java.lang.String> comparator_str35 = null;
    Range<java.lang.String> range_str36 = Range.between("hi!", "hi!", comparator_str35);
    boolean b38 = range_str36.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str41 = null;
    Range<java.lang.String> range_str42 = Range.between("hi!", "hi!", comparator_str41);
    java.util.Comparator<java.lang.String> comparator_str43 = range_str42.getComparator();
    java.lang.String str44 = range_str42.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str47 = null;
    Range<java.lang.String> range_str48 = Range.between("hi!", "hi!", comparator_str47);
    Range<java.lang.String> range_str49 = range_str42.intersectionWith(range_str48);
    boolean b51 = range_str49.isBefore("hi!");
    Range<java.lang.String> range_str52 = range_str36.intersectionWith(range_str49);
    java.util.Comparator<java.lang.String> comparator_str55 = null;
    Range<java.lang.String> range_str56 = Range.between("hi!", "hi!", comparator_str55);
    java.util.Comparator<java.lang.String> comparator_str57 = range_str56.getComparator();
    java.lang.String str58 = range_str56.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str61 = null;
    Range<java.lang.String> range_str62 = Range.between("hi!", "hi!", comparator_str61);
    Range<java.lang.String> range_str63 = range_str56.intersectionWith(range_str62);
    boolean b64 = range_str36.isBeforeRange(range_str63);
    boolean b65 = range_str16.equals((java.lang.Object)range_str63);
    java.util.Comparator<java.lang.String> comparator_str70 = null;
    Range<java.lang.String> range_str71 = Range.between("hi!", "hi!", comparator_str70);
    java.util.Comparator<java.lang.String> comparator_str72 = range_str71.getComparator();
    Range<java.lang.String> range_str73 = Range.between("hi!", "", comparator_str72);
    boolean b75 = range_str73.isBefore("");
    Range<java.lang.String> range_str76 = range_str16.intersectionWith(range_str73);
    boolean b78 = range_str73.isStartedBy("[..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str24);
    org.junit.Assert.assertTrue("'" + comparator_str25 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str25.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str42);
    org.junit.Assert.assertTrue("'" + comparator_str43 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str43.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str56);
    org.junit.Assert.assertTrue("'" + comparator_str57 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str57.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!"+ "'", str58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str71);
    org.junit.Assert.assertTrue("'" + comparator_str72 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str72.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test92"); }


    java.util.Comparator<java.lang.String> comparator_str4 = null;
    Range<java.lang.String> range_str5 = Range.between("hi!", "hi!", comparator_str4);
    java.util.Comparator<java.lang.String> comparator_str6 = range_str5.getComparator();
    Range<java.lang.String> range_str7 = Range.between("hi!", "", comparator_str6);
    java.util.Comparator<java.lang.String> comparator_str10 = null;
    Range<java.lang.String> range_str11 = Range.between("hi!", "hi!", comparator_str10);
    boolean b12 = range_str7.isAfterRange(range_str11);
    java.util.Comparator<java.lang.String> comparator_str15 = null;
    Range<java.lang.String> range_str16 = Range.between("hi!", "hi!", comparator_str15);
    java.util.Comparator<java.lang.String> comparator_str17 = range_str16.getComparator();
    java.lang.String str18 = range_str16.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str21 = null;
    Range<java.lang.String> range_str22 = Range.between("hi!", "hi!", comparator_str21);
    Range<java.lang.String> range_str23 = range_str16.intersectionWith(range_str22);
    java.lang.String str25 = range_str16.toString("hi!");
    boolean b27 = range_str16.contains("[hi!..hi!]");
    boolean b28 = range_str7.isOverlappedBy(range_str16);
    boolean b30 = range_str7.contains("hi!");
    java.lang.String str32 = range_str7.toString("[hi!..hi!]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str5);
    org.junit.Assert.assertTrue("'" + comparator_str6 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str6.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    org.junit.Assert.assertTrue("'" + comparator_str17 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str17.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[hi!..hi!]"+ "'", str32.equals("[hi!..hi!]"));

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test93"); }


    java.util.Comparator<java.lang.String> comparator_str2 = null;
    Range<java.lang.String> range_str3 = Range.between("hi!", "hi!", comparator_str2);
    boolean b5 = range_str3.isBefore("");
    java.util.Comparator<java.lang.String> comparator_str8 = null;
    Range<java.lang.String> range_str9 = Range.between("hi!", "hi!", comparator_str8);
    java.util.Comparator<java.lang.String> comparator_str10 = range_str9.getComparator();
    java.lang.String str11 = range_str9.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str14 = null;
    Range<java.lang.String> range_str15 = Range.between("hi!", "hi!", comparator_str14);
    Range<java.lang.String> range_str16 = range_str9.intersectionWith(range_str15);
    boolean b18 = range_str16.isBefore("hi!");
    Range<java.lang.String> range_str19 = range_str3.intersectionWith(range_str16);
    java.util.Comparator<java.lang.String> comparator_str22 = null;
    Range<java.lang.String> range_str23 = Range.between("hi!", "hi!", comparator_str22);
    java.util.Comparator<java.lang.String> comparator_str24 = range_str23.getComparator();
    java.lang.String str25 = range_str23.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str28 = null;
    Range<java.lang.String> range_str29 = Range.between("hi!", "hi!", comparator_str28);
    Range<java.lang.String> range_str30 = range_str23.intersectionWith(range_str29);
    boolean b31 = range_str3.isBeforeRange(range_str30);
    java.util.Comparator<java.lang.String> comparator_str34 = null;
    Range<java.lang.String> range_str35 = Range.between("hi!", "hi!", comparator_str34);
    java.util.Comparator<java.lang.String> comparator_str36 = range_str35.getComparator();
    java.lang.String str37 = range_str35.getMinimum();
    java.util.Comparator<java.lang.String> comparator_str40 = null;
    Range<java.lang.String> range_str41 = Range.between("hi!", "hi!", comparator_str40);
    Range<java.lang.String> range_str42 = range_str35.intersectionWith(range_str41);
    java.lang.String str44 = range_str35.toString("hi!");
    boolean b46 = range_str35.contains("[hi!..hi!]");
    java.lang.String str47 = range_str35.toString();
    boolean b49 = range_str35.contains("");
    boolean b50 = range_str30.isAfterRange(range_str35);
    java.lang.String str51 = range_str30.getMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str9);
    org.junit.Assert.assertTrue("'" + comparator_str10 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str10.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str23);
    org.junit.Assert.assertTrue("'" + comparator_str24 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str24.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str35);
    org.junit.Assert.assertTrue("'" + comparator_str36 + "' != '" + Range.ComparableComparator.INSTANCE + "'", comparator_str36.equals(Range.ComparableComparator.INSTANCE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(range_str42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "[hi!..hi!]"+ "'", str47.equals("[hi!..hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!"+ "'", str51.equals("hi!"));

  }

}
