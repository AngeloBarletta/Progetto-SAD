
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    java.lang.String str1 = Inflection.singularize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    java.lang.String str1 = Inflection.pluralize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!s"+ "'", str1.equals("hi!s"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    java.lang.String str1 = Inflection.singularize("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!"+ "'", str1.equals("hi!"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    Inflection inflection1 = new Inflection("hi!");

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    boolean b1 = Inflection.isUncountable("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    boolean b1 = Inflection.isUncountable("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    java.lang.String str1 = Inflection.pluralize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "s"+ "'", str1.equals("s"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    java.lang.String str1 = Inflection.singularize("s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    java.lang.String str1 = Inflection.pluralize("s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "s"+ "'", str1.equals("s"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    java.lang.String str1 = Inflection.singularize("hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!"+ "'", str1.equals("hi!shi!"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    Inflection inflection2 = new Inflection("hi!s", "s");
    boolean b4 = inflection2.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    java.lang.String str1 = Inflection.pluralize("hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!s"+ "'", str1.equals("hi!shi!s"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    boolean b1 = Inflection.isUncountable("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    java.lang.String str1 = Inflection.pluralize("hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!s"+ "'", str1.equals("hi!shi!s"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    boolean b1 = Inflection.isUncountable("s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!", true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    Inflection inflection2 = new Inflection("", "hi!s");
    java.lang.String str4 = inflection2.replace("hi!shi!");
    boolean b6 = inflection2.match("hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str4.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    Inflection inflection3 = new Inflection("hi!shi!", "hi!", true);
    boolean b5 = inflection3.match("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    java.lang.String str1 = Inflection.singularize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!"+ "'", str1.equals("hi!"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    Inflection inflection2 = new Inflection("", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    Inflection inflection3 = new Inflection("hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    Inflection inflection3 = new Inflection("hi!s", "", false);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    Inflection inflection2 = new Inflection("hi!shi!s", "hi!hhi!ihi!!hi!hi!");

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!s");
    java.lang.String str8 = inflection2.replace("hi!s");
    boolean b10 = inflection2.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str8.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    Inflection inflection1 = new Inflection("hi!s");
    boolean b3 = inflection1.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    boolean b1 = Inflection.isUncountable("hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    Inflection inflection3 = new Inflection("hi!shi!", "hi!", true);
    java.lang.String str5 = inflection3.replace("s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "s"+ "'", str5.equals("s"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    Inflection inflection2 = new Inflection("hi!", "hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    Inflection inflection3 = new Inflection("s", "s", false);
    boolean b5 = inflection3.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    Inflection inflection2 = new Inflection("s", "hi!hhi!ihi!!hi!shi!s");
    java.lang.String str4 = inflection2.replace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    Inflection inflection2 = new Inflection("", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!s");
    java.lang.String str8 = inflection2.replace("hi!s");
    java.lang.String str10 = inflection2.replace("");
    java.lang.String str12 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str8.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"+ "'", str12.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    Inflection inflection2 = new Inflection("hi!shi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    Inflection inflection2 = new Inflection("hi!shi!s", "");

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    Inflection inflection2 = new Inflection("hi!s", "hi!s");

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!s");
    java.lang.String str8 = inflection2.replace("hi!s");
    boolean b10 = inflection2.match("hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str8.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    Inflection inflection2 = new Inflection("hi!shi!", "hi!");

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    Inflection inflection3 = new Inflection("hi!shi!", "hi!shi!s", false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!s"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!s");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!s", true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "", false);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    Inflection inflection2 = new Inflection("s", "hi!hhi!ihi!!hi!shi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hi!"+ "'", str4.equals("hi!hhi!ihi!!hi!hi!"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    Inflection inflection1 = new Inflection("s");

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!", "", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    java.lang.String str1 = Inflection.singularize("hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!"+ "'", str1.equals("hi!shi!"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    Inflection inflection3 = new Inflection("", "", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!hi!"+ "'", str5.equals("hi!hhi!ihi!!hi!hi!"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    Inflection inflection1 = new Inflection("hi!shi!s");
    java.lang.String str3 = inflection1.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str3.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    Inflection inflection2 = new Inflection("s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!s", "hi!shi!s");

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    Inflection inflection3 = new Inflection("hi!", "hi!hhi!ihi!!hi!hi!s", false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!shi!s", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", "", true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!s", "");

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str4 = inflection2.replace("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    Inflection inflection2 = new Inflection("hi!s", "hi!hhi!ihi!!hi!");

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    Inflection inflection3 = new Inflection("hi!shi!", "hi!hhi!ihi!!hi!shi!s", true);
    boolean b5 = inflection3.match("hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!s", false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    Inflection inflection2 = new Inflection("", "");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    java.lang.String str6 = inflection2.replace("hi!hhi!ihi!!hi!hi!");
    boolean b8 = inflection2.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str4.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!hi!"+ "'", str6.equals("hi!hhi!ihi!!hi!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    boolean b1 = Inflection.isUncountable("hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", "");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    Inflection inflection2 = new Inflection("hi!shi!", "hi!hhi!ihi!!hi!hi!");

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    Inflection inflection3 = new Inflection("hi!shi!s", "hi!shi!", true);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    Inflection inflection3 = new Inflection("s", "s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!shi!s");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str7.equals("hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    Inflection inflection3 = new Inflection("", "hi!s", false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    Inflection inflection3 = new Inflection("hi!shi!", "hi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!s"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    Inflection inflection2 = new Inflection("hi!s", "");

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    Inflection inflection3 = new Inflection("hi!shi!", "hi!", true);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str5.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str7.equals("hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    Inflection inflection2 = new Inflection("hi!shi!", "hi!shi!");

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str4 = inflection2.replace("hi!s");
    boolean b6 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    java.lang.String str8 = inflection2.replace("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!s"+ "'", str4.equals("hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!shi!s", false);
    boolean b5 = inflection3.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    Inflection inflection1 = new Inflection("hi!shi!");
    boolean b3 = inflection1.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str5 = inflection1.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"+ "'", str5.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str3 = inflection1.replace("s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "s"+ "'", str3.equals("s"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!", "hi!s");

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!shi!", false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    Inflection inflection3 = new Inflection("", "", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!shi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!"+ "'", str4.equals("hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!shi!s");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!s", "hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    Inflection inflection3 = new Inflection("hi!shi!s", "", true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    Inflection inflection3 = new Inflection("", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str4 = inflection2.replace("hi!s");
    java.lang.String str6 = inflection2.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!s"+ "'", str4.equals("hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str6.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    java.lang.String str1 = Inflection.pluralize("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!s"+ "'", str1.equals("hi!s"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!s");
    java.lang.String str8 = inflection2.replace("hi!s");
    java.lang.String str10 = inflection2.replace("");
    java.lang.String str12 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str8.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"+ "'", str12.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hi!", false);
    java.lang.String str5 = inflection3.replace("hi!shi!s");
    boolean b7 = inflection3.match("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shi!s"+ "'", str5.equals("hi!shi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    boolean b4 = inflection2.match("hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!");
    java.lang.String str4 = inflection2.replace("");
    boolean b6 = inflection2.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!");

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", true);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    Inflection inflection3 = new Inflection("hi!shi!", "hi!hhi!ihi!!hi!hi!", true);
    boolean b5 = inflection3.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss", false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!s", true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!shi!s", false);
    boolean b5 = inflection3.match("hi!shi!s");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!s");
    boolean b9 = inflection3.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str7.equals("hi!hhi!ihi!!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    Inflection inflection2 = new Inflection("hi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    Inflection inflection3 = new Inflection("", "hi!", false);
    boolean b5 = inflection3.match("hi!shi!");
    boolean b7 = inflection3.match("s");
    boolean b9 = inflection3.match("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!", "hi!", false);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!s", "hi!", true);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", false);
    boolean b5 = inflection3.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    Inflection inflection2 = new Inflection("", "");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str6 = inflection2.replace("hi!");
    java.lang.String str8 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    boolean b10 = inflection2.match("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str8.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!shi!s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    Inflection inflection3 = new Inflection("hi!shi!s", "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", true);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    java.lang.String str1 = Inflection.singularize("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "shsis!shshsis!sishsis!s!"+ "'", str1.equals("shsis!shshsis!sishsis!s!"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!s");
    java.lang.String str8 = inflection2.replace("hi!s");
    java.lang.String str10 = inflection2.replace("s");
    java.lang.String str12 = inflection2.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str8.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!shi!"+ "'", str10.equals("hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"+ "'", str12.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    Inflection inflection2 = new Inflection("hi!shi!", "hi!s");

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!hi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!hi!s"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", "hi!shi!s");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!shi!s", false);
    boolean b5 = inflection3.match("hi!shi!s");
    boolean b7 = inflection3.match("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!hhi!ihi!!hi!shi!", true);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str4 = inflection2.replace("hi!s");
    boolean b6 = inflection2.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!s"+ "'", str4.equals("hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!shi!");
    boolean b4 = inflection2.match("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", true);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!shi!", false);
    boolean b5 = inflection3.match("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!");
    java.lang.String str3 = inflection1.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"+ "'", str3.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!");
    boolean b3 = inflection1.match("s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hi!", false);
    java.lang.String str5 = inflection3.replace("hi!shi!s");
    boolean b7 = inflection3.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shi!s"+ "'", str5.equals("hi!shi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!shi!", true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!");
    boolean b4 = inflection2.match("s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", false);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    Inflection inflection3 = new Inflection("s", "s", false);
    java.lang.String str5 = inflection3.replace("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "shsis!shshsis!sishsis!s!"+ "'", str5.equals("shsis!shshsis!sishsis!s!"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    Inflection inflection3 = new Inflection("hi!shi!", "hi!", true);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b7 = inflection3.match("hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str5.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!s", true);
    boolean b5 = inflection3.match("hi!s");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!hi!s");
    java.lang.String str9 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!hi!s"+ "'", str7.equals("hi!hhi!ihi!!hi!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s"+ "'", str9.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    Inflection inflection3 = new Inflection("hi!shi!", "hi!", true);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str7 = inflection3.replace("");
    boolean b9 = inflection3.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str5.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    Inflection inflection3 = new Inflection("shsis!shshsis!sishsis!s!", "hi!hhi!ihi!!hi!shi!", false);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!", "hi!shi!", true);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    Inflection inflection3 = new Inflection("hi!shi!", "hi!hhi!ihi!!hi!shi!s", false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    Inflection inflection1 = new Inflection("shsis!shshsis!sishsis!s!");

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", true);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"+ "'", str5.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!", true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    Inflection inflection3 = new Inflection("s", "", true);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!"+ "'", str5.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    Inflection inflection3 = new Inflection("", "hi!", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    boolean b1 = Inflection.isUncountable("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hi!", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!shi!");
    java.lang.String str7 = inflection3.replace("");
    boolean b9 = inflection3.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    boolean b11 = inflection3.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!s", "hi!hhi!ihi!!hi!hi!s");

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!shi!", true);
    boolean b5 = inflection3.match("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!hi!");

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    Inflection inflection3 = new Inflection("", "hi!hhi!ihi!!hi!shi!", true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!hi!");

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!hhi!ihi!!hi!", false);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    Inflection inflection2 = new Inflection("hi!s", "s");
    java.lang.String str4 = inflection2.replace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    Inflection inflection1 = new Inflection("hi!shi!");
    boolean b3 = inflection1.match("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    Inflection inflection3 = new Inflection("hi!shi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", true);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!hi!"+ "'", str5.equals("hi!hhi!ihi!!hi!hi!"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    Inflection inflection3 = new Inflection("shsis!shshsis!sishsis!s!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", true);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!shi!");
    java.lang.String str4 = inflection2.replace("s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "s"+ "'", str4.equals("s"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!s");
    java.lang.String str8 = inflection2.replace("hi!s");
    boolean b10 = inflection2.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str8.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!");
    java.lang.String str3 = inflection1.replace("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!s"+ "'", str3.equals("hi!s"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", true);
    java.lang.String str5 = inflection3.replace("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "shsis!shshsis!sishsis!s!"+ "'", str5.equals("shsis!shshsis!sishsis!s!"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses", "hi!");

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!s");
    boolean b7 = inflection3.match("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!hhi!ihi!!hi!s", true);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!shi!s", true);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    Inflection inflection2 = new Inflection("s", "hi!hhi!ihi!!hi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s"+ "'", str4.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    Inflection inflection2 = new Inflection("hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", "hi!shi!", false);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    Inflection inflection2 = new Inflection("", "");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    java.lang.String str6 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str4.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"+ "'", str6.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    Inflection inflection3 = new Inflection("shsis!shshsis!sishsis!s!", "hi!hhi!ihi!!hi!hi!s", true);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!", true);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", true);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    Inflection inflection3 = new Inflection("hi!s", "hi!hhi!ihi!!hi!shi!", true);
    boolean b5 = inflection3.match("shsis!shshsis!sishsis!s!");
    boolean b7 = inflection3.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s", true);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!shi!s");
    boolean b6 = inflection2.match("s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    Inflection inflection3 = new Inflection("", "", false);
    boolean b5 = inflection3.match("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss", false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s", true);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    Inflection inflection2 = new Inflection("hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses");

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses", false);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    Inflection inflection3 = new Inflection("", "hi!hhi!ihi!!hi!shi!s", false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    Inflection inflection3 = new Inflection("s", "s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!shi!s");
    boolean b7 = inflection3.match("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses", "", false);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    Inflection inflection2 = new Inflection("hi!shi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    Inflection inflection3 = new Inflection("", "hi!shi!s", true);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s"+ "'", str5.equals("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", "hi!shi!s");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str4.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!s", "hi!s", true);
    java.lang.String str5 = inflection3.replace("");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!hi!"+ "'", str7.equals("hi!hhi!ihi!!hi!hi!"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    Inflection inflection3 = new Inflection("hi!s", "s", true);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!hi!s");
    java.lang.String str7 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");
    java.lang.String str9 = inflection3.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "shsis!shshsis!sishsis!s!"+ "'", str7.equals("shsis!shshsis!sishsis!s!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!"+ "'", str9.equals("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    java.lang.String str4 = inflection2.replace("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    Inflection inflection3 = new Inflection("", "", true);
    java.lang.String str5 = inflection3.replace("");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"+ "'", str7.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    Inflection inflection2 = new Inflection("hi!", "hi!");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    Inflection inflection2 = new Inflection("", "");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    boolean b6 = inflection2.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    java.lang.String str8 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str4.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str8.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", "", false);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!shi!");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    java.lang.String str6 = inflection2.replace("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s"+ "'", str6.equals("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    Inflection inflection2 = new Inflection("s", "hi!hhi!ihi!!hi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");
    java.lang.String str6 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"+ "'", str4.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!"+ "'", str6.equals("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    Inflection inflection3 = new Inflection("s", "s", false);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str5.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str7.equals("hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!shi!", false);
    java.lang.String str5 = inflection3.replace("hi!shi!s");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shi!s"+ "'", str5.equals("hi!shi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!shi!s"+ "'", str7.equals("hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", "hi!s");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s"+ "'", str4.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    java.lang.String str1 = Inflection.pluralize("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s"+ "'", str1.equals("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");
    java.lang.String str4 = inflection2.replace("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    Inflection inflection3 = new Inflection("hi!s", "hi!hhi!ihi!!hi!", true);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!");

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    Inflection inflection2 = new Inflection("", "");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    boolean b6 = inflection2.match("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str4.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!", "hi!s", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss"+ "'", str5.equals("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!shi!ss"+ "'", str7.equals("hi!shi!ss"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    Inflection inflection2 = new Inflection("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", "hi!shi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    boolean b6 = inflection2.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");
    boolean b8 = inflection2.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"+ "'", str4.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    Inflection inflection3 = new Inflection("", "hi!", false);
    boolean b5 = inflection3.match("hi!shi!");
    java.lang.String str7 = inflection3.replace("");
    boolean b9 = inflection3.match("hi!shi!");
    boolean b11 = inflection3.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str13 = inflection3.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!"+ "'", str13.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    java.lang.String str1 = Inflection.singularize("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!"+ "'", str1.equals("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    java.lang.String str1 = Inflection.pluralize("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses"+ "'", str1.equals("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    boolean b3 = inflection1.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"+ "'", str4.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    Inflection inflection2 = new Inflection("", "hi!shi!");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    Inflection inflection1 = new Inflection("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s");

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");
    boolean b3 = inflection1.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", true);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    java.lang.String str1 = Inflection.singularize("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!"+ "'", str1.equals("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", true);
    java.lang.String str5 = inflection3.replace("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "shsis!shshsis!sishsis!s!"+ "'", str5.equals("shsis!shshsis!sishsis!s!"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shi!", false);
    boolean b5 = inflection3.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    Inflection inflection1 = new Inflection("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s");

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", false);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    Inflection inflection2 = new Inflection("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!", "hi!hhi!ihi!!hi!");

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    Inflection inflection2 = new Inflection("hi!s", "s");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!");
    java.lang.String str6 = inflection2.replace("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "s"+ "'", str6.equals("s"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!");

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    Inflection inflection2 = new Inflection("hi!", "");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    Inflection inflection3 = new Inflection("", "hi!", false);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str7 = inflection3.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"+ "'", str5.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"+ "'", str7.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str4 = inflection2.replace("hi!shi!");
    boolean b6 = inflection2.match("hi!hhi!ihi!!hi!s");
    java.lang.String str8 = inflection2.replace("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shi!"+ "'", str4.equals("hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "shsis!shshsis!sishsis!s!"+ "'", str8.equals("shsis!shshsis!sishsis!s!"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!");
    java.lang.String str3 = inflection1.replace("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!"+ "'", str3.equals("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!hhi!ihi!!hi!shi!");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"+ "'", str4.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"+ "'", str1.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    java.lang.String str1 = Inflection.singularize("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!"+ "'", str1.equals("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", false);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!"+ "'", str5.equals("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    Inflection inflection3 = new Inflection("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!", "hi!s", false);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!shi!", true);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!"+ "'", str5.equals("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str5.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    Inflection inflection3 = new Inflection("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", true);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    Inflection inflection3 = new Inflection("", "hi!", false);
    boolean b5 = inflection3.match("hi!shi!");
    java.lang.String str7 = inflection3.replace("");
    boolean b9 = inflection3.match("hi!shi!");
    boolean b11 = inflection3.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str13 = inflection3.replace("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!"+ "'", str13.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    Inflection inflection2 = new Inflection("", "");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses", true);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!", true);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!hhi!ihi!!hi!shi!");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!shi!ses"+ "'", str4.equals("hi!hhi!ihi!!hi!shi!ses"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!s", true);
    boolean b5 = inflection3.match("hi!s");
    boolean b7 = inflection3.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", false);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str5.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s"+ "'", str7.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s");
    java.lang.String str3 = inflection1.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str3.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    Inflection inflection3 = new Inflection("", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss", true);
    boolean b5 = inflection3.match("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    Inflection inflection3 = new Inflection("s", "shsis!shshsis!sishsis!s!", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");
    boolean b7 = inflection3.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    Inflection inflection3 = new Inflection("hi!", "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    Inflection inflection3 = new Inflection("hi!s", "hi!shi!ss", true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "s");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b6 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"+ "'", str4.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!s", "hi!s", false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", true);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    boolean b1 = Inflection.isUncountable("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    java.lang.String str4 = inflection2.replace("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    Inflection inflection2 = new Inflection("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!", "hi!shi!");

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    Inflection inflection2 = new Inflection("hi!", "");
    java.lang.String str4 = inflection2.replace("");
    boolean b6 = inflection2.match("hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!shi!s");
    java.lang.String str4 = inflection2.replace("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses");
    boolean b6 = inflection2.match("hi!hhi!ihi!!hi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses"+ "'", str4.equals("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"+ "'", str4.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    Inflection inflection3 = new Inflection("", "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", false);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!", "s", false);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    Inflection inflection3 = new Inflection("", "hi!hhi!ihi!!hi!hi!", false);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", false);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    Inflection inflection3 = new Inflection("s", "shsis!shshsis!sishsis!s!", true);
    java.lang.String str5 = inflection3.replace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    Inflection inflection2 = new Inflection("", "");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str6 = inflection2.replace("hi!");
    java.lang.String str8 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"+ "'", str8.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!ses", "hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!");
    java.lang.String str4 = inflection2.replace("hi!shi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shi!ss"+ "'", str4.equals("hi!shi!ss"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!shi!", true);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");
    boolean b7 = inflection3.match("hi!shi!s");
    java.lang.String str9 = inflection3.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"+ "'", str5.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s"+ "'", str9.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!ses");

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"+ "'", str4.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!s");
    boolean b8 = inflection2.match("");
    java.lang.String str10 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!"+ "'", str10.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", "hi!hhi!ihi!!hi!shi!");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!"+ "'", str4.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    Inflection inflection3 = new Inflection("hi!", "", false);
    java.lang.String str5 = inflection3.replace("s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "s"+ "'", str5.equals("s"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    java.lang.String str1 = Inflection.pluralize("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s"+ "'", str1.equals("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    boolean b6 = inflection2.match("hi!hhi!ihi!!hi!s");
    boolean b8 = inflection2.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!", false);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s", true);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    Inflection inflection3 = new Inflection("hi!shi!", "s", true);
    java.lang.String str5 = inflection3.replace("hi!shi!");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "s"+ "'", str5.equals("s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!ss"+ "'", str7.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!ss"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!hi!");

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!");
    java.lang.String str4 = inflection2.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"+ "'", str4.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss"));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    Inflection inflection3 = new Inflection("hi!", "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!", true);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    Inflection inflection2 = new Inflection("hi!shi!", "hi!hhi!ihi!!hi!hi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!ss"+ "'", str4.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!ss"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    Inflection inflection2 = new Inflection("", "");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b6 = inflection2.match("");
    java.lang.String str8 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"+ "'", str8.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", "hi!shi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    boolean b6 = inflection2.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");
    java.lang.String str8 = inflection2.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"+ "'", str4.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str8.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", false);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!ses", "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!", false);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!s");
    boolean b8 = inflection2.match("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!"+ "'", str5.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    Inflection inflection3 = new Inflection("s", "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses", false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    java.lang.String str4 = inflection2.replace("hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!hhi!ihi!!hi!s"+ "'", str4.equals("hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!");

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!s", true);
    boolean b5 = inflection3.match("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    Inflection inflection1 = new Inflection("hi!shi!ss");

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    java.lang.String str1 = Inflection.pluralize("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s"+ "'", str1.equals("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    Inflection inflection2 = new Inflection("s", "s");

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!");
    java.lang.String str6 = inflection2.replace("hi!shi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!shi!ss"+ "'", str6.equals("hi!shi!ss"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    java.lang.String str1 = Inflection.pluralize("shsis!shshsis!sishsis!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "shsis!shshsis!sishsis!s!s"+ "'", str1.equals("shsis!shshsis!sishsis!s!s"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!", true);
    boolean b5 = inflection3.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s"+ "'", str7.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s");
    boolean b3 = inflection1.match("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!", "hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s");

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!ss");

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    Inflection inflection2 = new Inflection("shsis!shshsis!sishsis!s!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!s");
    java.lang.String str3 = inflection1.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str3.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses", false);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    Inflection inflection3 = new Inflection("", "shsis!shshsis!sishsis!s!", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    boolean b1 = Inflection.isUncountable("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s", "hi!hhi!ihi!!hi!shi!s", false);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!", "hi!hhi!ihi!!hi!shi!ses");

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
    boolean b5 = inflection3.match("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!shi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hi!hhi!ihi!!hi!", true);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!");

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    Inflection inflection2 = new Inflection("", "hi!");
    boolean b4 = inflection2.match("");
    java.lang.String str6 = inflection2.replace("hi!s");
    java.lang.String str8 = inflection2.replace("hi!s");
    java.lang.String str10 = inflection2.replace("");
    java.lang.String str12 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!hhi!ihi!!hi!shi!"+ "'", str8.equals("hi!hhi!ihi!!hi!shi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!"+ "'", str12.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!"));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


    Inflection inflection2 = new Inflection("s", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s", true);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    Inflection inflection3 = new Inflection("", "hi!hhi!ihi!!hi!s", false);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!s", "", false);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str5.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!", true);
    java.lang.String str5 = inflection3.replace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!");

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s", "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!shhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!sihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!s"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s"));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    java.lang.String str3 = inflection1.replace("hi!hhi!ihi!!hi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!s"+ "'", str3.equals("hi!hhi!ihi!!hi!hi!s"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", true);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!shi!s", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss");
    boolean b6 = inflection2.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");
    boolean b8 = inflection2.match("hi!hhi!ihi!!hi!shi!ses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!s", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!s");
    java.lang.String str7 = inflection3.replace("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!"+ "'", str7.equals("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    boolean b1 = Inflection.isUncountable("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    java.lang.String str1 = Inflection.singularize("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s"+ "'", str1.equals("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!s"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!", false);
    java.lang.String str5 = inflection3.replace("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str5.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!hhi!ihi!!hi!shi!ses", true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!s", "s");

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


    Inflection inflection3 = new Inflection("", "", true);
    java.lang.String str5 = inflection3.replace("");
    java.lang.String str7 = inflection3.replace("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!ses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!ses"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!ses"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    java.lang.String str3 = inflection1.replace("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s"+ "'", str3.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    Inflection inflection2 = new Inflection("s", "");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!shi!s");
    boolean b6 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b8 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");
    boolean b10 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


    java.lang.String str1 = Inflection.pluralize("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses"+ "'", str1.equals("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses"));

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


    Inflection inflection2 = new Inflection("s", "hi!hhi!ihi!!hi!s");
    boolean b4 = inflection2.match("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!");
    boolean b4 = inflection2.match("s");
    boolean b6 = inflection2.match("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s");
    boolean b8 = inflection2.match("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!s", true);
    boolean b5 = inflection3.match("hi!s");
    java.lang.String str7 = inflection3.replace("hi!hhi!ihi!!hi!hi!s");
    boolean b9 = inflection3.match("shsis!shshsis!sishsis!s!");
    java.lang.String str11 = inflection3.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!hhi!ihi!!hi!hi!s"+ "'", str7.equals("hi!hhi!ihi!!hi!hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"+ "'", str11.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!", "hi!shi!s", true);
    boolean b5 = inflection3.match("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!sshi!hhi!ihi!!shi!hhi!hhi!ihi!!shi!ihi!hhi!ihi!!shi!!hi!hhi!ihi!!shi!", "s", true);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses"+ "'", str1.equals("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!shhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!sses"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    java.lang.String str1 = Inflection.pluralize("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!s"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    Inflection inflection2 = new Inflection("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!sses", "hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!s");

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    Inflection inflection1 = new Inflection("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!s");

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!", "hi!");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!s");
    java.lang.String str6 = inflection2.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!"+ "'", str6.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!shi!shi!"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


    boolean b1 = Inflection.isUncountable("hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


    java.lang.String str1 = Inflection.pluralize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!hhi!ihi!!hi!shi!s");
    boolean b4 = inflection2.match("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


    java.lang.String str1 = Inflection.singularize("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"+ "'", str1.equals("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    Inflection inflection2 = new Inflection("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    Inflection inflection3 = new Inflection("hi!s", "hi!hhi!ihi!!hi!shi!", true);
    boolean b5 = inflection3.match("shsis!shshsis!sishsis!s!");
    boolean b7 = inflection3.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "hi!shi!", false);
    java.lang.String str5 = inflection3.replace("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s");
    boolean b7 = inflection3.match("hi!hhi!ihi!!hi!hi!");
    boolean b9 = inflection3.match("hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!shhi!hi!hhi!ihi!!hi!sihi!hi!hhi!ihi!!hi!s!hi!hi!hhi!ihi!!hi!s!s");
    boolean b11 = inflection3.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s"+ "'", str5.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    Inflection inflection3 = new Inflection("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!s", "hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", true);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!ss", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s");
    boolean b4 = inflection2.match("hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!");
    java.lang.String str6 = inflection2.replace("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss"+ "'", str6.equals("hi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!shi!sshi!shi!shi!sshi!hhi!shi!shi!sshi!ihi!shi!shi!sshi!!hi!shi!shi!sshi!hi!ss"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }


    Inflection inflection2 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!shi!s");

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }


    Inflection inflection1 = new Inflection("hi!shhi!sihi!s!hi!shhi!shhi!sihi!s!hi!sihi!shhi!sihi!s!hi!s!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!");

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }


    Inflection inflection3 = new Inflection("hi!shi!", "", true);
    java.lang.String str5 = inflection3.replace("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }


    Inflection inflection3 = new Inflection("hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sshi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!shhi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!sihi!shi!shhi!shi!sihi!shi!s!hi!shi!sshi!shi!s!hi!shi!shhi!shi!sihi!shi!s!hi!shi!", "hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!shi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!hhi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!ihi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!!hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!", false);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!shi!s");

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }


    Inflection inflection3 = new Inflection("hi!", "hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!shhi!shhi!sihi!s!hi!sshi!sihi!shhi!sihi!s!hi!sshi!s!hi!shhi!sihi!s!hi!sshi!s!hi!sshi!", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }


    Inflection inflection2 = new Inflection("", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!ses");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!se"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!se"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!shi!hhi!ihi!!hi!hi!shi!hhi!hhi!ihi!!hi!hi!shi!ihi!hhi!ihi!!hi!hi!shi!!hi!hhi!ihi!!hi!hi!shi!hi!s", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!");

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }


    java.lang.String str1 = Inflection.singularize("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!"+ "'", str1.equals("hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!shi!hhi!ihi!!hi!"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }


    Inflection inflection3 = new Inflection("hi!shhi!sihi!s!hi!sshi!shhi!sihi!s!hi!s", "", true);
    boolean b5 = inflection3.match("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }


    Inflection inflection2 = new Inflection("hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hhi!hhi!ihi!!hi!hi!ihi!hhi!ihi!!hi!hi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!shi!hi!hhi!ihi!!hi!shi!hhi!hhi!ihi!!hi!shi!ihi!hhi!ihi!!hi!shi!!hi!hhi!ihi!!hi!");

  }

}
