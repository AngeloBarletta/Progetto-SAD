
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!shi!", true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!shi!ses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


    Inflection inflection3 = new Inflection("", "", false);
    boolean b5 = inflection3.match("hi!shi!");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!s");
    java.lang.String str9 = inflection3.replace("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str7.equals("hi!hhi!ihi!!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!"+ "'", str9.equals("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    Inflection inflection3 = new Inflection("", "hi!shi!ss", false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b3 = inflection1.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b5 = inflection1.match("hi!hhi!ihi!!hi!shi!");
    boolean b7 = inflection1.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");
    boolean b9 = inflection1.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!ss", false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!s"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


    Inflection inflection2 = new Inflection("", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s", "hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    Inflection inflection3 = new Inflection("hi!s", "s", true);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!hi!s");
    boolean b7 = inflection3.match("shsis!shshsis!sishsis!s!");
    boolean b9 = inflection3.match("hi!shi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!", "s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s");

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!", "shsis!shshsis!sishsis!s!s");

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hi!", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!shi!");
    java.lang.String str7 = inflection3.replace("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s");
    boolean b9 = inflection3.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s"+ "'", str7.equals("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s", true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s");

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    Inflection inflection3 = new Inflection("hi!s", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!ss", false);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str6 = inflection2.replace("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str4.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str6.equals("hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", false);
    java.lang.String str5 = inflection3.replace("");
    java.lang.String str7 = inflection3.replace("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");
    java.lang.String str9 = inflection3.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss"+ "'", str7.equals("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"+ "'", str9.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"+ "'", str4.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!ss", false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    Inflection inflection3 = new Inflection("hi!shi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", true);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!");
    java.lang.String str7 = inflection3.replace("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!"+ "'", str5.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    java.lang.String str1 = Inflection.singularize("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!"+ "'", str1.equals("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    boolean b1 = Inflection.isUncountable("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    java.lang.String str1 = Inflection.pluralize("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s"+ "'", str1.equals("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!se");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!se"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!se"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses", false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", "hi!hhi!ihi!!hi!hi!", true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!", true);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


    Inflection inflection3 = new Inflection("", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!ss");
    java.lang.String str3 = inflection1.replace("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s"+ "'", str3.equals("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s", "hi!shi!ss");

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    Inflection inflection3 = new Inflection("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss", "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    Inflection inflection3 = new Inflection("", "", true);
    java.lang.String str5 = inflection3.replace("");
    boolean b7 = inflection3.match("hi!s");
    boolean b9 = inflection3.match("s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    boolean b6 = inflection2.match("hi!hhi!ihi!!hi!s");
    boolean b8 = inflection2.match("s");
    java.lang.String str10 = inflection2.replace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!hhi!ihi!!hi!"+ "'", str10.equals("hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    java.lang.String str4 = inflection2.replace("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss"+ "'", str4.equals("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str4.equals("hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


    Inflection inflection2 = new Inflection("hi!", "hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", "", true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses", true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    Inflection inflection3 = new Inflection("hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    Inflection inflection3 = new Inflection("hi!shi!ss", "hi!shi!", true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    Inflection inflection1 = new Inflection("");
    boolean b3 = inflection1.match("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!");

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss", "hi!shi!ss");

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", "hi!shi!", true);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!"+ "'", str5.equals("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


    Inflection inflection2 = new Inflection("hi!", "hi!hhi!ihi!!hi!shi!se");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    Inflection inflection2 = new Inflection("hi!shi!s", "hi!");

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    Inflection inflection3 = new Inflection("hi!shi!", "hi!hhi!ihi!!hi!shi!s", true);
    boolean b5 = inflection3.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s"+ "'", str7.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!");

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s");

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses");

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!");

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");
    java.lang.String str3 = inflection1.replace("hi!shi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!shi!ss"+ "'", str3.equals("hi!shi!ss"));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s", false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    Inflection inflection1 = new Inflection("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!");

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!", true);
    boolean b5 = inflection3.match("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    Inflection inflection2 = new Inflection("hi!", "hi!hhi!ihi!!hi!shi!");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!s");
    boolean b7 = inflection3.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses");
    boolean b9 = inflection3.match("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses", false);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!ss", "hi!shi!s");

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!ss", "");

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!");

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!", true);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    Inflection inflection2 = new Inflection("hi!s", "s");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!");
    java.lang.String str6 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "shsis!shshsis!sishsis!s!sses"+ "'", str6.equals("shsis!shshsis!sishsis!s!sses"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    Inflection inflection2 = new Inflection("hi!shi!ss", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    Inflection inflection3 = new Inflection("", "hi!", false);
    boolean b5 = inflection3.match("hi!shi!");
    java.lang.String str7 = inflection3.replace("");
    boolean b9 = inflection3.match("hi!shi!");
    boolean b11 = inflection3.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b13 = inflection3.match("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!");
    boolean b15 = inflection3.match("shsis!shshsis!sishsis!s!");
    boolean b17 = inflection3.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s", "", true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!shi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!s");
    java.lang.String str6 = inflection2.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");
    boolean b8 = inflection2.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str4.equals("hi!hhi!ihi!!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s"+ "'", str6.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", "hi!shi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s"+ "'", str4.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!ss");

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!", false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    java.lang.String str1 = Inflection.singularize("hi!shi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!s"+ "'", str1.equals("hi!shi!s"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", false);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses"+ "'", str5.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    Inflection inflection3 = new Inflection("hi!shi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    Inflection inflection3 = new Inflection("s", "", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!shi!");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    boolean b9 = inflection3.match("hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!hi!"+ "'", str5.equals("hi!hhi!ihi!!hi!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!"+ "'", str7.equals("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    Inflection inflection3 = new Inflection("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!");

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    Inflection inflection2 = new Inflection("shsis!shshsis!sishsis!s!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    boolean b1 = Inflection.isUncountable("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    java.lang.String str1 = Inflection.singularize("shsis!shshsis!sishsis!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "shsis!shshsis!sishsis!s!"+ "'", str1.equals("shsis!shshsis!sishsis!s!"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!");
    java.lang.String str4 = inflection2.replace("");
    java.lang.String str6 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    Inflection inflection3 = new Inflection("", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!");

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!", "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses");

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!s", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    boolean b1 = Inflection.isUncountable("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!ss", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s", "shsis!shshsis!sishsis!s!");

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    Inflection inflection3 = new Inflection("s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!se");

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!s"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!shi!ses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    Inflection inflection1 = new Inflection("hi!shi!");
    boolean b3 = inflection1.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b5 = inflection1.match("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b3 = inflection1.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b5 = inflection1.match("hi!hhi!ihi!!hi!shi!");
    boolean b7 = inflection1.match("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!");
    boolean b9 = inflection1.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hi!", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!shi!");
    java.lang.String str7 = inflection3.replace("");
    boolean b9 = inflection3.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    java.lang.String str11 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str11.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses", "shsis!shshsis!sishsis!s!sses");

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    boolean b1 = Inflection.isUncountable("shsis!shshsis!sishsis!s!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    Inflection inflection3 = new Inflection("", "hi!", false);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str7 = inflection3.replace("shsis!shshsis!sishsis!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"+ "'", str5.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!shi!hhi!shi!ihi!shi!!hi!shi!hhi!shi!hhi!shi!ihi!shi!!hi!shi!ihi!shi!hhi!shi!ihi!shi!!hi!shi!!hi!shi!"+ "'", str7.equals("hi!shi!hhi!shi!ihi!shi!!hi!shi!hhi!shi!hhi!shi!ihi!shi!!hi!shi!ihi!shi!hhi!shi!ihi!shi!!hi!shi!!hi!shi!"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    Inflection inflection2 = new Inflection("", "hi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!shi!");
    java.lang.String str6 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    boolean b8 = inflection2.match("");
    java.lang.String str10 = inflection2.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses");
    java.lang.String str12 = inflection2.replace("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str4.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s"+ "'", str6.equals("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!s"+ "'", str12.equals("hi!s"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!se");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!ses"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!ses"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!ss"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!ss"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!hi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!s");
    java.lang.String str6 = inflection2.replace("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str4.equals("hi!hhi!ihi!!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s"+ "'", str6.equals("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s", false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    java.lang.String str4 = inflection2.replace("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!"+ "'", str4.equals("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    Inflection inflection1 = new Inflection("hi!shi!s");
    java.lang.String str3 = inflection1.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!"+ "'", str3.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!shi!se");

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!", "hi!hhi!ihi!!hi!");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"+ "'", str4.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    Inflection inflection3 = new Inflection("s", "shsis!shshsis!sishsis!s!", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!hi!shsis!shshsis!sishsis!s!"+ "'", str7.equals("hi!hhi!ihi!!hi!hi!shsis!shshsis!sishsis!s!"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");
    boolean b7 = inflection3.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    Inflection inflection3 = new Inflection("hi!shi!ss", "hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!s", false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    Inflection inflection2 = new Inflection("shsis!shshsis!sishsis!s!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    Inflection inflection2 = new Inflection("", "");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b6 = inflection2.match("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!");

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    Inflection inflection3 = new Inflection("", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!", true);
    boolean b5 = inflection3.match("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s");
    java.lang.String str6 = inflection2.replace("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!s"+ "'", str6.equals("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!"+ "'", str1.equals("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss", "hi!shi!s", true);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!s");
    java.lang.String str8 = inflection2.replace("hi!s");
    java.lang.String str10 = inflection2.replace("s");
    boolean b12 = inflection2.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str8.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!shi!"+ "'", str10.equals("hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    java.lang.String str4 = inflection2.replace("hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shi!s"+ "'", str4.equals("hi!shi!s"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!");

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", "hi!s");

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s"+ "'", str4.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hi!s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    Inflection inflection2 = new Inflection("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s", "shsis!shshsis!sishsis!s!sses");

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!se", "hi!hhi!ihi!!hi!shi!ses", false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    Inflection inflection3 = new Inflection("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss", "hi!shi!s", true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    java.lang.String str6 = inflection2.replace("hi!hhi!ihi!!hi!shi!se");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str4.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!se"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!se"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!hhi!ihi!!hi!hi!", false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    Inflection inflection2 = new Inflection("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!shi!ses");

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!s", "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s");

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!shi!s");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!", "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s", true);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s", true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    Inflection inflection3 = new Inflection("", "hi!", false);
    java.lang.String str5 = inflection3.replace("s");
    java.lang.String str7 = inflection3.replace("hi!");
    boolean b9 = inflection3.match("");
    boolean b11 = inflection3.match("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shi!"+ "'", str5.equals("hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!"+ "'", str7.equals("hi!hhi!ihi!!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!s", "hi!s");
    java.lang.String str4 = inflection2.replace("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!"+ "'", str4.equals("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


    Inflection inflection3 = new Inflection("hi!", "hi!hhi!ihi!!hi!", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!", "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s", true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    java.lang.String str3 = inflection1.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!"+ "'", str3.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    Inflection inflection3 = new Inflection("shsis!shshsis!sishsis!s!", "hi!hhi!ihi!!hi!shi!se", true);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!s");
    java.lang.String str8 = inflection2.replace("hi!s");
    java.lang.String str10 = inflection2.replace("");
    java.lang.String str12 = inflection2.replace("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!");
    java.lang.String str14 = inflection2.replace("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!");
    boolean b16 = inflection2.match("shsis!shshsis!sishsis!s!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str8.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!"+ "'", str12.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"+ "'", str14.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }


    boolean b1 = Inflection.isUncountable("hi!shi!hhi!shi!ihi!shi!!hi!shi!hhi!shi!hhi!shi!ihi!shi!!hi!shi!ihi!shi!hhi!shi!ihi!shi!!hi!shi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!ses", "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss", true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s", false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }


    Inflection inflection2 = new Inflection("hi!shi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    boolean b6 = inflection2.match("hi!shi!");
    boolean b8 = inflection2.match("hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"+ "'", str4.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", true);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", "hi!shi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    boolean b6 = inflection2.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");
    boolean b8 = inflection2.match("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"+ "'", str4.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!shsis!shshsis!sishsis!s!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!shsis!shshsis!sishsis!s!s"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!");

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!", false);
    java.lang.String str5 = inflection3.replace("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "shsis!shshsis!sishsis!s!"+ "'", str5.equals("shsis!shshsis!sishsis!s!"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s");

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }


    Inflection inflection3 = new Inflection("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", false);
    boolean b5 = inflection3.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }


    Inflection inflection3 = new Inflection("", "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!", true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s", true);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!s", true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!", false);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }


    Inflection inflection3 = new Inflection("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses", false);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }


    Inflection inflection3 = new Inflection("hi!shi!hhi!shi!ihi!shi!!hi!shi!hhi!shi!hhi!shi!ihi!shi!!hi!shi!ihi!shi!hhi!shi!ihi!shi!!hi!shi!!hi!shi!", "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss", false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }


    Inflection inflection3 = new Inflection("s", "hi!s", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");
    java.lang.String str7 = inflection3.replace("hi!shi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hi!shi!hi!shi!s"+ "'", str7.equals("hi!hi!shi!hi!shi!s"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!", "hi!hhi!ihi!!hi!hi!shsis!shshsis!sishsis!s!s");

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }


    Inflection inflection3 = new Inflection("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!", "shsis!shshsis!sishsis!s!", false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }


    Inflection inflection1 = new Inflection("hi!shi!hhi!shi!ihi!shi!!hi!shi!hhi!shi!hhi!shi!ihi!shi!!hi!shi!ihi!shi!hhi!shi!ihi!shi!!hi!shi!!hi!shi!");

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!shi!se");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!", false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }


    Inflection inflection2 = new Inflection("s", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hi!hhi!hi!ihi!hi!!hi!hi!hhi!hi!hhi!hi!ihi!hi!!hi!hi!ihi!hi!hhi!hi!ihi!hi!!hi!hi!!hi!hi!"+ "'", str6.equals("hi!hi!hhi!hi!ihi!hi!!hi!hi!hhi!hi!hhi!hi!ihi!hi!!hi!hi!ihi!hi!hhi!hi!ihi!hi!!hi!hi!!hi!hi!"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!shsis!shshsis!sishsis!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }


    Inflection inflection2 = new Inflection("hi!shi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b4 = inflection2.match("hi!shi!s");
    java.lang.String str6 = inflection2.replace("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!s", "hi!shi!hhi!shi!ihi!shi!!hi!shi!hhi!shi!hhi!shi!ihi!shi!!hi!shi!ihi!shi!hhi!shi!ihi!shi!!hi!shi!!hi!shi!");

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"+ "'", str4.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!");
    java.lang.String str4 = inflection2.replace("");
    boolean b6 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }


    Inflection inflection3 = new Inflection("s", "hi!s", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");
    boolean b7 = inflection3.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }


    Inflection inflection2 = new Inflection("hi!s", "hi!shi!");

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    boolean b3 = inflection1.match("shsis!shshsis!sishsis!s!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!shi!se");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }


    Inflection inflection2 = new Inflection("shsis!shshsis!sishsis!s!sses", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!");

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }


    java.lang.String str1 = Inflection.pluralize("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s"+ "'", str1.equals("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!ss", "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!", false);

  }

}
