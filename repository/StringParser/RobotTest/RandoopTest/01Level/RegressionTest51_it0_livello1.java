
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest51 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test001"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44a4aa # 44a44", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test002"); }


    java.lang.String str2 = StringParser.escapeString("###a #a#4 aia 4#a# a###", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a###a #a#4 aia 4#a# a###a"+ "'", str2.equals("a###a #a#4 aia 4#a# a###a"));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test003"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a444 # #4aahi!aa4# # 444a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444 # #4a"+ "'", str2.equals("444 # #4a"));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test004"); }


    java.lang.String str2 = StringParser.escapeString("4aa4 aa44#i#44aa 4aa4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4aa4 aa44#i#44aa 4aa4#"+ "'", str2.equals("#4aa4 aa44#i#44aa 4aa4#"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test005"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##a i a##", 1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test006"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a#a aa4i4aa a#a#", (-1), '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test007"); }


    java.lang.String str2 = StringParser.escapeString("4a #  4#a4  # a4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44a #  4#a4  # a44"+ "'", str2.equals("44a #  4#a4  # a44"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test008"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" ## 44a## ", (int)(byte)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test009"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" aa ##a aaaiaaa a## aa ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa ##a aaaiaaa a## aa "+ "'", str2.equals(" aa ##a aaaiaaa a## aa "));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test010"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaa4##4 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa4##4 "+ "'", str2.equals("aaa4##4 "));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test011"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a aa4i4aa a4a", (int)'4', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test012"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 4a4a#aia#a4a4 4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 4a4a#aia#a4a4 4"+ "'", str2.equals("4 4a4a#aia#a4a4 4"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test013"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a 4aaaiaaa4 a#a", 35, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test014"); }


    java.lang.String str2 = StringParser.escapeString("a   4 #a##aa4#i#4aa##a# 4   a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a   4 #a##aa4#i#4aa##a# 4   a4"+ "'", str2.equals("4a   4 #a##aa4#i#4aa##a# 4   a4"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test015"); }


    java.lang.String str2 = StringParser.escapeString("a#aa##aahi!aa##aa#a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a#aa##aahi!aa##aa#a "+ "'", str2.equals(" a#aa##aahi!aa##aa#a "));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test016"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a44a#a    a#a44a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44a"+ "'", str2.equals("44a"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test017"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#444 #aia# 444#", (int)(short)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test018"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aaa  4aa4#4  aaa ", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test019"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  aa#4#  ahi!a  #4#aa  ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " "+ "'", str2.equals(" "));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test020"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4 a44aahi!aa44a 4 ", (int)(short)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test021"); }


    java.lang.String str2 = StringParser.escapeString("4a  a a#ahi!a#a a  a4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4a  a a#ahi!a#a a  a4#"+ "'", str2.equals("#4a  a a#ahi!a#a a  a4#"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test022"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##4a4a#aia#a4a4##", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test023"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a4#4   i   4#4a ", 52, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test024"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  ##444 # #4aahi!aa4# # 444##  a", (int)'a', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test025"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"## # a## ##", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test026"); }


    java.lang.String str2 = StringParser.escapeString("#444aa4444#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#444aa4444#a"+ "'", str2.equals("a#444aa4444#a"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test027"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# aa aaaaiaaaa aa #", (int)(short)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test028"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4##a##aa4#4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4##a##aa4#4"+ "'", str2.equals("4##a##aa4#4"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test029"); }


    java.lang.String str2 = StringParser.escapeString("  aa# aaaa #aa  ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4  aa# aaaa #aa  4"+ "'", str2.equals("4  aa# aaaa #aa  4"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test030"); }


    java.lang.String str2 = StringParser.escapeString("4  a   i   a  4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4  a   i   a  4a"+ "'", str2.equals("a4  a   i   a  4a"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test031"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4#   # 4#4#4 #   #4a", (int)(short)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test032"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" # # # #a4#i#4a# # # # ", (int)'a', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test033"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aa4#  4#a4  #4aa4", (int)(byte)100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test034"); }


    java.lang.String str2 = StringParser.escapeString("a###4#  ahi!a  #4###a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a###4#  ahi!a  #4###a4"+ "'", str2.equals("4a###4#  ahi!a  #4###a4"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test035"); }


    java.lang.String str2 = StringParser.escapeString(" aa##4aa ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a aa##4aa a"+ "'", str2.equals("a aa##4aa a"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test036"); }


    java.lang.String str2 = StringParser.escapeString("aaa  #a4#ahi!a#4a#  aaa", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aaa  #a4#ahi!a#4a#  aaa#"+ "'", str2.equals("#aaa  #a4#ahi!a#4a#  aaa#"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test037"); }


    java.lang.String str2 = StringParser.escapeString("44 4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 44 4 "+ "'", str2.equals(" 44 4 "));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test038"); }


    java.lang.String str2 = StringParser.escapeString("a 4a#aa44 a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a 4a#aa44 a#"+ "'", str2.equals("#a 4a#aa44 a#"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test039"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aaa4##aa44aaa ", (int)(short)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test040"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4   a a #   4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4   a"+ "'", str2.equals("4   a"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test041"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a   4aa  ahi!a  aa4   a4a", (int)(short)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test042"); }


    java.lang.String str2 = StringParser.escapeString(" a  ##4 #aia# 4##  a ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a  ##4 #aia# 4##  a 4"+ "'", str2.equals("4 a  ##4 #aia# 4##  a 4"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test043"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a a ##4 aia 4## a a4a", 1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test044"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a# #a4##aa4#i#4aa##4a# #a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a# #a4##aa4#i#4aa##4a# #a"+ "'", str2.equals("a# #a4##aa4#i#4aa##4a# #a"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test045"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #a4#4# # a## #4#4a# ", (int)(byte)1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test046"); }


    java.lang.String str2 = StringParser.escapeString(" aa44# ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a aa44# a"+ "'", str2.equals("a aa44# a"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test047"); }


    java.lang.String str2 = StringParser.escapeString("4a  #a4#ahi!a#4a#  a4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44a  #a4#ahi!a#4a#  a44"+ "'", str2.equals("44a  #a4#ahi!a#4a#  a44"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test048"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a4aa a#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4aa a#"+ "'", str2.equals("#a4aa a#"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test049"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #  a", (int)(byte)0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test050"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4a4#aa44##4 aia 4##44aa#4a4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a"+ "'", str2.equals("4a"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test051"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #a4##a #aa4## a##4a# ", (int)(byte)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test052"); }


    java.lang.String str2 = StringParser.escapeString(" # # #a #a# # # ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 # # #a #a# # # 4"+ "'", str2.equals("4 # # #a #a# # # 4"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test053"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" ### 4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " ### 4"+ "'", str2.equals(" ### 4"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test054"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a 4aaaa4 a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a 4aaaa4 a"+ "'", str2.equals("a 4aaaa4 a"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test055"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 a4a# 4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a4a# 4"+ "'", str2.equals("4 a4a# 4"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test056"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  a4# 4#4#4 #4a  ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " "+ "'", str2.equals(" "));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test057"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# 44aa#4aahi!aa4#aa44 #", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# 44aa#4aahi!aa4#aa44 #"+ "'", str2.equals("# 44aa#4aahi!aa4#aa44 #"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test058"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a #a a aaaiaaa a a# a#", (int)(short)1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test059"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a aa #a#4 aia 4#a# aa a", (int)'a', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test060"); }


    java.lang.String str2 = StringParser.escapeString("###a##aa4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a###a##aa4a"+ "'", str2.equals("a###a##aa4a"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test061"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a 4aa#      #aa4 a4", 1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test062"); }


    java.lang.String str2 = StringParser.escapeString("aa#4aaa a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa#4aaa a "+ "'", str2.equals(" aa#4aaa a "));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test063"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  #4", (int)(short)0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test064"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaa4# #4aahi!aa4# #4aaa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test065"); }


    java.lang.String str2 = StringParser.escapeString("aa a4#a#a i a#a#4a aa", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa a4#a#a i a#a#4a aaa"+ "'", str2.equals("aaa a4#a#a i a#a#4a aaa"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test066"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44 a##aa  #aia#  aa##a 44", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test067"); }


    java.lang.String str2 = StringParser.escapeString("#4a4#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##4a4##"+ "'", str2.equals("##4a4##"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test068"); }


    java.lang.String str2 = StringParser.escapeString("a  a #44##a4# a  a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa  a #44##a4# a  aa"+ "'", str2.equals("aa  a #44##a4# a  aa"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test069"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4  #4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4  #"+ "'", str2.equals("4  #"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test070"); }


    java.lang.String str2 = StringParser.escapeString("a#4        4#a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a#4        4#a4"+ "'", str2.equals("4a#4        4#a4"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test071"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# a4a##4a4a #", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4a#"+ "'", str2.equals(" a4a#"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test072"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #44a4 4 aaaiaaa 4 4a44# ", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test073"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# 4a", (int)(byte)10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test074"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4  #i#  4", 10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test075"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4# 4####aa4##4 #4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# 4"+ "'", str2.equals("# 4"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test076"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 444aaaa444 4", 35, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test077"); }


    java.lang.String str2 = StringParser.escapeString("4##4#ahi!a#4##4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4##4#ahi!a#4##4a"+ "'", str2.equals("a4##4#ahi!a#4##4a"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test078"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#   4a #a", 0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test079"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#44444 4#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#44444 4#"+ "'", str2.equals("#44444 4#"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test080"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#4  #4a", 0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test081"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a  i  a ", (int)(byte)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test082"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  aa#a", (int)(short)0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test083"); }


    java.lang.String str2 = StringParser.escapeString("a4#4   i   4#4a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4#4   i   4#4a#"+ "'", str2.equals("#a4#4   i   4#4a#"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test084"); }


    java.lang.String str2 = StringParser.escapeString("#a4 444#i#444 4a#", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#a4 444#i#444 4a#4"+ "'", str2.equals("4#a4 444#i#444 4a#4"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test085"); }


    java.lang.String str2 = StringParser.escapeString("4 a##4#a 4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44 a##4#a 44"+ "'", str2.equals("44 a##4#a 44"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test086"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 a 44", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a 44"+ "'", str2.equals("4 a 44"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test087"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  # 4#4#4 #  ", (int)(short)1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test088"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #  #a ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# "+ "'", str2.equals("# "));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test089"); }


    java.lang.String str2 = StringParser.escapeString(" 44#44hi!44#44 ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 44#44hi!44#44 4"+ "'", str2.equals("4 44#44hi!44#44 4"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test090"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# #4    4i4    4# #", (int)'#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test091"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa# 44 #a4#i#4a# 44 #aa", 100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test092"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# a#a a#ahi!a#a a#a #", (int)(byte)100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test093"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44a ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test094"); }


    java.lang.String str2 = StringParser.escapeString("4###aaa4# a##4aaa###4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4###aaa4# a##4aaa###4#"+ "'", str2.equals("#4###aaa4# a##4aaa###4#"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test095"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a a  a#", 52, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test096"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 aa# 4aaiaa4 #aa 4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa# 4"+ "'", str2.equals(" aa# 4"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test097"); }


    java.lang.String str2 = StringParser.escapeString("4   a  4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44   a  44"+ "'", str2.equals("44   a  44"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test098"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a##4 ", (int)(byte)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test099"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4 aa#4#aa 4#a", 97, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test100"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#4  #4aahi!aa4#  4#4", 35, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test101"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa   #4aaa", (int)' ', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test102"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4aa a#    4i4    #a aa4#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4aa a#"+ "'", str2.equals("4aa a#"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test103"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4 a44aahi!aa44a 4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a"+ "'", str2.equals("4 a"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test104"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" # #aia# # ", (int)(short)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test105"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a #44a##4a44# a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #44a"+ "'", str2.equals(" #44a"));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test106"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4a4aa#i#aa4a4a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4a4aa#i#aa4a4a"+ "'", str2.equals("a4a4aa#i#aa4a4a"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test107"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  # 44aa4a44 #  ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " "+ "'", str2.equals(" "));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test108"); }


    java.lang.String str2 = StringParser.escapeString(" a a aa#aia#aa a a ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a a aa#aia#aa a a 4"+ "'", str2.equals("4 a a aa#aia#aa a a 4"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test109"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a#aaa  a  aaa#a4", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test110"); }


    java.lang.String str2 = StringParser.escapeString("#44#4#ahi!a#4#44#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#44#4#ahi!a#4#44#a"+ "'", str2.equals("a#44#4#ahi!a#4#44#a"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test111"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a #a4##aa4#i#4aa##4a# a ", 35, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test112"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a4   #a#i#a#   4a4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a4   #a#i#a#   4a4"+ "'", str2.equals("4a4   #a#i#a#   4a4"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test113"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aa a#aaiaa#a aa ", 100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test114"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44a4aa # 44a44", 100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test115"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" ##4a#aia#a4## ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##4a#aia#a4##"+ "'", str2.equals("##4a#aia#a4##"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test116"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"##44##aa4#i#4aa##44##", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test117"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a4#a #a#4a ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4#a #a#4a "+ "'", str2.equals(" a4#a #a#4a "));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test118"); }


    java.lang.String str2 = StringParser.escapeString("4 #aa4# 4#4aa# 4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4 #aa4# 4#4aa# 4#"+ "'", str2.equals("#4 #aa4# 4#4aa# 4#"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test119"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa ### #a #a# ### aa", (int)(short)10, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test120"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaa4 444#aa", (int)(byte)0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test121"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##4#a i a#4##", (int)(byte)0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test122"); }


    java.lang.String str2 = StringParser.escapeString(" a #a4#i#4a# a ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a #a4#i#4a# a a"+ "'", str2.equals("a a #a4#i#4a# a a"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test123"); }


    java.lang.String str2 = StringParser.escapeString("4a a#aaiaa#a a4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4a a#aaiaa#a a4#"+ "'", str2.equals("#4a a#aaiaa#a a4#"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test124"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4a# a #a##aa4#i#4aa##a# a #a4 ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a# "+ "'", str2.equals("4a# "));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test125"); }


    java.lang.String str2 = StringParser.escapeString("44## i ##44", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 44## i ##44 "+ "'", str2.equals(" 44## i ##44 "));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test126"); }


    java.lang.String str2 = StringParser.escapeString("## aa   #4aaa ##", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "### aa   #4aaa ###"+ "'", str2.equals("### aa   #4aaa ###"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test127"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4a4#  #4a4#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4a4#  #4a4#"+ "'", str2.equals("#4a4#  #4a4#"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test128"); }


    java.lang.String str2 = StringParser.escapeString("44a4 44", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#44a4 44#"+ "'", str2.equals("#44a4 44#"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test129"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a a a i a a a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a a i a a a"+ "'", str2.equals("a a a i a a a"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test130"); }


    java.lang.String str2 = StringParser.escapeString("a##aa4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa##aa4a"+ "'", str2.equals("aa##aa4a"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test131"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a # #4aahi!aa4# # a ", (int)' ', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test132"); }


    java.lang.String str2 = StringParser.escapeString("4a              a4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4a              a4#"+ "'", str2.equals("#4a              a4#"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test133"); }


    java.lang.String str2 = StringParser.escapeString("# # #aa4#i#4aa# # #", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " # # #aa4#i#4aa# # # "+ "'", str2.equals(" # # #aa4#i#4aa# # # "));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test134"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a #a#i#a# a", (int)(byte)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test135"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #444#4# ", (int)(short)0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test136"); }


    java.lang.String str2 = StringParser.escapeString("a4#44hi!44#4a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4#44hi!44#4a "+ "'", str2.equals(" a4#44hi!44#4a "));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test137"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaa #a#a i a#a# aaa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test138"); }


    java.lang.String str2 = StringParser.escapeString("4 # a## 4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4 # a## 4#"+ "'", str2.equals("#4 # a## 4#"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test139"); }


    java.lang.String str2 = StringParser.escapeString("a# a ##a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa# a ##aa"+ "'", str2.equals("aa# a ##aa"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test140"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 #a4 44aa4#44 4a# 4", (int)'4', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test141"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4aa#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a"+ "'", str2.equals("4a"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test142"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4a4a# ", (int)(byte)100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test143"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#44aaa 4aaahi!aaa4 aaa44#", (int)'a', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test144"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a4##44#i#44##4a4a", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test145"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44a 4 #", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test146"); }


    java.lang.String str2 = StringParser.escapeString("#a ##4#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #a ##4# "+ "'", str2.equals(" #a ##4# "));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test147"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"    4i4    ", (int)(byte)10, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test148"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44#  #44", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test149"); }


    java.lang.String str2 = StringParser.escapeString("4aa44#4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4aa44#4#"+ "'", str2.equals("#4aa44#4#"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test150"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a 44", 52, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test151"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 44a#44  i  44#a44 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 44a#44  i  44#a44 "+ "'", str2.equals(" 44a#44  i  44#a44 "));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test152"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a #a4", (-1), '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test153"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4  # 4#4#4 #  4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  # 4"+ "'", str2.equals("  # 4"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test154"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a##4#a ", 52, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test155"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#  #a#a", (int)(short)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test156"); }


    java.lang.String str2 = StringParser.escapeString("a#aa ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a#aa #"+ "'", str2.equals("#a#aa #"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test157"); }


    java.lang.String str2 = StringParser.escapeString("#a44##a i a##44a#", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#a44##a i a##44a#4"+ "'", str2.equals("4#a44##a i a##44a#4"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test158"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"    ##4     ", (int)(byte)10, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test159"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a## i ##a#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a## i ##a#"+ "'", str2.equals("#a## i ##a#"));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test160"); }


    java.lang.String str2 = StringParser.escapeString("#4   #a#aaiaa#a#   4#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#4   #a#aaiaa#a#   4#a"+ "'", str2.equals("a#4   #a#aaiaa#a#   4#a"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test161"); }


    java.lang.String str2 = StringParser.escapeString("#aa 4aaa#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#aa 4aaa#a"+ "'", str2.equals("a#aa 4aaa#a"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test162"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a 4a#aaiaa#a4 a", 52, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test163"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaaa   4a aaaa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test164"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4#a4 #4a#a i a#a4# 4a#4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4"+ "'", str2.equals("#a4"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test165"); }


    java.lang.String str2 = StringParser.escapeString("#4 a#aaa44#i#44aaa#a 4#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#4 a#aaa44#i#44aaa#a 4#a"+ "'", str2.equals("a#4 a#aaa44#i#44aaa#a 4#a"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test166"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# #a#a##4a#a# #", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #"+ "'", str2.equals(" #"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test167"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# #  # #", (int)(short)10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test168"); }


    java.lang.String str2 = StringParser.escapeString("aa#a4  4a4a#aa", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa#a4  4a4a#aa "+ "'", str2.equals(" aa#a4  4a4a#aa "));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test169"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##44aa a aa#aia#aa a aa44##", (int)(byte)1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test170"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaa#4 ## i ## 4#aaa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa#4 ## i ## 4#aaa"+ "'", str2.equals("aaa#4 ## i ## 4#aaa"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test171"); }


    java.lang.String str2 = StringParser.escapeString(" a  #a#a i a#a#  a ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  a  #a#a i a#a#  a  "+ "'", str2.equals("  a  #a#a i a#a#  a  "));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test172"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 44 # #4aahi!aa4# # 44 4", 52, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test173"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaa# 4aaiaa4 #aaa", 100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test174"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a aa# 4#aa a ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a aa# 4#aa a "+ "'", str2.equals(" a aa# 4#aa a "));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test175"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  4#ahi!a#4  ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4#ahi!a#4  "+ "'", str2.equals("  4#ahi!a#4  "));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test176"); }


    java.lang.String str2 = StringParser.escapeString("##a a i a a##", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " ##a a i a a## "+ "'", str2.equals(" ##a a i a a## "));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test177"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4  # #a4#i#4a# #  4 ", 97, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test178"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4a4 #4 4a4 ", (int)'a', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test179"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#a4a#aaiaa#a4a#a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#a4a#aaiaa#a4a#a"+ "'", str2.equals("a#a4a#aaiaa#a4a#a"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test180"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#a#aaiaa#a#4", (int)(short)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test181"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a #a4 a aa44aaa a 4a# a", 35, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test182"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a4a  ahi!a  a4a ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4a  ahi!a  a4a "+ "'", str2.equals(" a4a  ahi!a  a4a "));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test183"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4aa4#4 ", 1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test184"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  # #a #a# #  a", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test185"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a#  aa4", (int)'#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test186"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa#4aaa", (int)'4', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test187"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a4 #44#i#44# 4a4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4"+ "'", str2.equals("a4"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test188"); }


    java.lang.String str2 = StringParser.escapeString(" #44##a4# ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  #44##a4#  "+ "'", str2.equals("  #44##a4#  "));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test189"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##4# #44  i  44# #4##", (int)'4', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test190"); }


    java.lang.String str2 = StringParser.escapeString("# a#aa4i4aa#a #", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a# a#aa4i4aa#a #a"+ "'", str2.equals("a# a#aa4i4aa#a #a"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test191"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"###44 4#aia#4 44###", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test192"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a  a#aa4i4aa#a  a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a  a#aa4i4aa#a  a"+ "'", str2.equals("a  a#aa4i4aa#a  a"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test193"); }


    java.lang.String str2 = StringParser.escapeString("###4#4 aia 4#4###", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a###4#4 aia 4#4###a"+ "'", str2.equals("a###4#4 aia 4#4###a"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test194"); }


    java.lang.String str2 = StringParser.escapeString("# aa4a # 4#4#4 # a4aa #", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " # aa4a # 4#4#4 # a4aa # "+ "'", str2.equals(" # aa4a # 4#4#4 # a4aa # "));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test195"); }


    java.lang.String str2 = StringParser.escapeString("#a#a##aa4a#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##a#a##aa4a##"+ "'", str2.equals("##a#a##aa4a##"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test196"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa##aa a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa##aa a"+ "'", str2.equals("aa##aa a"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test197"); }


    java.lang.String str2 = StringParser.escapeString("#a# a4aa# 4#aa4a #a#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##a# a4aa# 4#aa4a #a##"+ "'", str2.equals("##a# a4aa# 4#aa4a #a##"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test198"); }


    java.lang.String str2 = StringParser.escapeString("#4aa#i#aa4#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#4aa#i#aa4#a"+ "'", str2.equals("a#4aa#i#aa4#a"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test199"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a#a aa4i4aa a#a#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a#a aa4i4aa a#a#"+ "'", str2.equals("#a#a aa4i4aa a#a#"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test200"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4##4#ahi!a#4##4a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4##4#ahi!a#4##4a"+ "'", str2.equals("a4##4#ahi!a#4##4a"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test201"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4# aa44aaa #4", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test202"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaaa   4", 1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test203"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaaaiaaaa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test204"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaa4# ##4  #4aaa", 100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test205"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" ##a aaaiaaa a## ", (int)'4', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test206"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a#44a4a#4#a4", (int)'#', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test207"); }


    java.lang.String str2 = StringParser.escapeString("#a4 i 4a#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##a4 i 4a##"+ "'", str2.equals("##a4 i 4a##"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test208"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"444a 4aahi!aa4 a444", (int)(byte)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test209"); }


    java.lang.String str2 = StringParser.escapeString("a444 ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a444  "+ "'", str2.equals(" a444  "));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test210"); }


    java.lang.String str2 = StringParser.escapeString("#a#  aaa  #a#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##a#  aaa  #a##"+ "'", str2.equals("##a#  aaa  #a##"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test211"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##4  a4#a#a i a#a#4a  4##", (int)(short)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test212"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a # 44a4#  #4a44 # a4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a # 44a4#  #4a44 # a4"+ "'", str2.equals("4a # 44a4#  #4a44 # a4"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test213"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##a aia a##", (int)'#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test214"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a  4#aa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a  4#aa"+ "'", str2.equals("a  4#aa"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test215"); }


    java.lang.String str2 = StringParser.escapeString("4a4# #a #a# #4a4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4a4# #a #a# #4a4#"+ "'", str2.equals("#4a4# #a #a# #4a4#"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test216"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44##4 44", (int)(byte)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test217"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4#4  ", (int)'#', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test218"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa#a 4a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa#a 4a"+ "'", str2.equals("aa#a 4a"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test219"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4  #a  a a#ahi!a#a a  a#  4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  #a  a a#ahi!a#a a  a#  "+ "'", str2.equals("  #a  a a#ahi!a#a a  a#  "));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test220"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a#a 4a", (int)(short)0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test221"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a 4#4##a#4 a4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a 4#4##a#4 a4"+ "'", str2.equals("4a 4#4##a#4 a4"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test222"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" ####a## ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "####a##"+ "'", str2.equals("####a##"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test223"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a# a#4 #4 4#a #a", 10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test224"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a4 444#4", (int)'4', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test225"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a a #  ahi!a  # a a", (int)(byte)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test226"); }


    java.lang.String str2 = StringParser.escapeString("#a#a#a##aa4a#a#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #a#a#a##aa4a#a# "+ "'", str2.equals(" #a#a#a##aa4a#a# "));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test227"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a    a44##44#i#44##44a    a", (int)(byte)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test228"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"444 a#a4#i#4a#a 444", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test229"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a #4#a i a#4# a", (int)' ', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test230"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#aaa44#i#44aaa#4", 97, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test231"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44#4 444#i#444 4#44", (int)(short)0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test232"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a  #4 ", 35, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test233"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa4# #a #a# #4aa", 35, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test234"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4# 4a4##aa4 #4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4# 4a4##aa4 #4"+ "'", str2.equals("4# 4a4##aa4 #4"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test235"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a a4 #a # #4aahi!aa4# # a# 4a a4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a4"+ "'", str2.equals("a a4"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test236"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" ##44 #a##aa4#i#4aa##a# 44## ", (int)' ', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test237"); }


    java.lang.String str2 = StringParser.escapeString("44#4 ##4#a i a#4## 4#44", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#44#4 ##4#a i a#4## 4#44#"+ "'", str2.equals("#44#4 ##4#a i a#4## 4#44#"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test238"); }


    java.lang.String str2 = StringParser.escapeString("444 a4#  #4a 444", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4444 a4#  #4a 4444"+ "'", str2.equals("4444 a4#  #4a 4444"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test239"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aa#a4  4a4a#aa ", 97, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test240"); }


    java.lang.String str2 = StringParser.escapeString("#a#a  4aa#a#", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#a#a  4aa#a#4"+ "'", str2.equals("4#a#a  4aa#a#4"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test241"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a44##aa4#i#4aa##44a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44##a"+ "'", str2.equals("44##a"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test242"); }


    java.lang.String str2 = StringParser.escapeString(" a  4a a ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# a  4a a #"+ "'", str2.equals("# a  4a a #"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test243"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a4##4##a i a##4##4a ", 35, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test244"); }


    java.lang.String str2 = StringParser.escapeString("  4#a  #aia#  a#4  ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a  4#a  #aia#  a#4  a"+ "'", str2.equals("a  4#a  #aia#  a#4  a"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test245"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #4 444#i#444 4# ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #4 444#i#444 4# "+ "'", str2.equals(" #4 444#i#444 4# "));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test246"); }


    java.lang.String str2 = StringParser.escapeString(" a   #a#aaiaa#a#   a ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# a   #a#aaiaa#a#   a #"+ "'", str2.equals("# a   #a#aaiaa#a#   a #"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test247"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"## #4#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test248"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a a4 #      # 4a a4", (int)(byte)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test249"); }


    java.lang.String str2 = StringParser.escapeString("#444#  4#a4  #444#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #444#  4#a4  #444# "+ "'", str2.equals(" #444#  4#a4  #444# "));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test250"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #a#44a4i4a44#a# ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #a#44a4i4a44#a# "+ "'", str2.equals(" #a#44a4i4a44#a# "));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test251"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4a a4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a"+ "'", str2.equals("4a"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test252"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #44 a", (int)(byte)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test253"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4 ### 4#4#4 ### 4 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4 ### 4#4#4 ### 4 "+ "'", str2.equals(" 4 ### 4#4#4 ### 4 "));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test254"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4##4##a aaiaa a##4##4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##4"+ "'", str2.equals("##4"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test255"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa##4 #aia# 4##aa", 32, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test256"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a a4 4 aaaiaaa 4 4a a", (int)(short)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test257"); }


    java.lang.String str2 = StringParser.escapeString("   4 #a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "    4 #a "+ "'", str2.equals("    4 #a "));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test258"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"### #a# #a4#i#4a# #a# ###", (int)(byte)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test259"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4#", (-1), '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test260"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a#a a#ahi!a#a a#a4a", 32, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test261"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a44a##aa4#i#4aa##a44a4", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test262"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# 4a #4#a i a#4# a4 #", (int)(short)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test263"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a#a#a##aa4#i#4aa##a#a#a4", (int)(byte)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test264"); }


    java.lang.String str2 = StringParser.escapeString("#4aa4#i#4aa4#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##4aa4#i#4aa4##"+ "'", str2.equals("##4aa4#i#4aa4##"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test265"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaa  #a4 4 aaaiaaa 4 4a#  aaa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test266"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# # #aa4#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# # #aa4#"+ "'", str2.equals("# # #aa4#"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test267"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#44a 4 #44#i#44# 4 a44#", (int)(short)0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test268"); }


    java.lang.String str2 = StringParser.escapeString("a 4aaa a#a#i#a#a aaa4 a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a 4aaa a#a#i#a#a aaa4 a#"+ "'", str2.equals("#a 4aaa a#a#i#a#a aaa4 a#"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test269"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a aa4a # ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a aa4a # "+ "'", str2.equals(" a aa4a # "));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test270"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a4 #44  i  44# 4a#", (int)(byte)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test271"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #a aaaiaaa a# ", (int)(byte)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test272"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#44##4 #44#i#44# 4##44#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44#"+ "'", str2.equals("44#"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test273"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 4a#a#i#a#a4 4", 1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test274"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4   a aa444#a   4", (int)(short)100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test275"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa 4a44a ##4 aia 4## a44a4 aa", (int)(byte)10, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test276"); }


    java.lang.String str2 = StringParser.escapeString(" 44hi!44 ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 44hi!44 4"+ "'", str2.equals("4 44hi!44 4"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test277"); }


    java.lang.String str2 = StringParser.escapeString(" a  a# a ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a  a# a a"+ "'", str2.equals("a a  a# a a"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test278"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a4 #", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test279"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 aa444#4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa4"+ "'", str2.equals(" aa4"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test280"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 #a a4a# 4", (int)(short)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test281"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4a444##4 aia 4##444a4 ", 52, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test282"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#  #4#a i a#4#  #", 97, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test283"); }


    java.lang.String str2 = StringParser.escapeString("#4## a#    4#4#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #4## a#    4#4# "+ "'", str2.equals(" #4## a#    4#4# "));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test284"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4##4 #", (int)'4', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test285"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#  ##4 a#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#  ##4 a#"+ "'", str2.equals("#  ##4 a#"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test286"); }


    java.lang.String str2 = StringParser.escapeString("a##a #4a a##a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a##a #4a a##a4"+ "'", str2.equals("4a##a #4a a##a4"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test287"); }


    java.lang.String str2 = StringParser.escapeString(" a44a aa444#a44a ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  a44a aa444#a44a  "+ "'", str2.equals("  a44a aa444#a44a  "));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test288"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a4#a#aaiaa#a#4a ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4#a#aaiaa#a#4a"+ "'", str2.equals("a4#a#aaiaa#a#4a"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test289"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #a#a# ", (int)'a', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test290"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a4  a 4a ", (int)(byte)10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test291"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" ##4  #4a# ", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test292"); }


    java.lang.String str2 = StringParser.escapeString("##44 #a4#i#4a# 44##", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a##44 #a4#i#4a# 44##a"+ "'", str2.equals("a##44 #a4#i#4a# 44##a"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test293"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4  4i4  4#", (int)(byte)1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test294"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4#a   44#", 100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test295"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4 4# a#i#a #4 4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 4# a"+ "'", str2.equals("4 4# a"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test296"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"##aa4a #i# a4aa##", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test297"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #4# ", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test298"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  #a#i#a#  ", (int)'#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test299"); }


    java.lang.String str2 = StringParser.escapeString("4 44 #4a#a i a#a4# 44 4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4 44 #4a#a i a#a4# 44 4 "+ "'", str2.equals(" 4 44 #4a#a i a#a4# 44 4 "));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test300"); }


    java.lang.String str2 = StringParser.escapeString("a a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a a "+ "'", str2.equals(" a a "));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test301"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4 ##", (int)(byte)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test302"); }


    java.lang.String str2 = StringParser.escapeString("## #a#a# ##", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a## #a#a# ##a"+ "'", str2.equals("a## #a#a# ##a"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test303"); }


    java.lang.String str2 = StringParser.escapeString("aaa444##4 aia 4##444aaa", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aaa444##4 aia 4##444aaa#"+ "'", str2.equals("#aaa444##4 aia 4##444aaa#"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test304"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#4##a#a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#4##a#a"+ "'", str2.equals("a#4##a#a"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test305"); }


    java.lang.String str2 = StringParser.escapeString("#4 # 4 #ahi!a# 4 # 4#", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#4 # 4 #ahi!a# 4 # 4#4"+ "'", str2.equals("4#4 # 4 #ahi!a# 4 # 4#4"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test306"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"####aa4#", (-1), 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test307"); }


    java.lang.String str2 = StringParser.escapeString("aaa4# ##4  #4aaa", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaa4# ##4  #4aaaa"+ "'", str2.equals("aaaa4# ##4  #4aaaa"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test308"); }


    java.lang.String str2 = StringParser.escapeString("#a  a# a#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#a  a# a#a"+ "'", str2.equals("a#a  a# a#a"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test309"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4aa#aaiaa#aa4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4aa#aaiaa#aa4"+ "'", str2.equals("4aa#aaiaa#aa4"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test310"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a 4#4##a#4 a", (int)(short)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test311"); }


    java.lang.String str2 = StringParser.escapeString("4aa #a4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4aa #a4 "+ "'", str2.equals(" 4aa #a4 "));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test312"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 a  4aa 4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a  4"+ "'", str2.equals(" a  4"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test313"); }


    java.lang.String str2 = StringParser.escapeString("#aa4 #44#i#44# 4aa#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#aa4 #44#i#44# 4aa#a"+ "'", str2.equals("a#aa4 #44#i#44# 4aa#a"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test314"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a44# a##44a#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a44#"+ "'", str2.equals("a44#"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test315"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a# aaaa #a#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a# aaaa #a#"+ "'", str2.equals("#a# aaaa #a#"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test316"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 44 #4#a i a#4# 44 4", 35, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test317"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a  a  ahi!a  a  a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a  a  ahi!a  a  a"+ "'", str2.equals("a  a  ahi!a  a  a"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test318"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa4# 4aaaiaaa4 #4aa", (int)(byte)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test319"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aa aaaaiaaaa aa ", (int)(byte)1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test320"); }


    java.lang.String str2 = StringParser.escapeString(" 44#aa444 ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  44#aa444  "+ "'", str2.equals("  44#aa444  "));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test321"); }


    java.lang.String str2 = StringParser.escapeString("a4  #a#4 aia 4#a#  4a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4  #a#4 aia 4#a#  4a#"+ "'", str2.equals("#a4  #a#4 aia 4#a#  4a#"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test322"); }


    java.lang.String str2 = StringParser.escapeString("#4a#4 #ahi!a# 4#a4#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #4a#4 #ahi!a# 4#a4# "+ "'", str2.equals(" #4a#4 #ahi!a# 4#a4# "));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test323"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a## 4#4#4 ##a4", (-1), 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test324"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a#a          a#a4", 0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test325"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4 #a4 44aa4#44 4a# 4a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 #a4 44aa4#44 4a# 4a"+ "'", str2.equals("a4 #a4 44aa4#44 4a# 4a"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test326"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  #a a aaaiaaa a a#  ", 100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test327"); }


    java.lang.String str2 = StringParser.escapeString("# #a#4  i  4#a# #", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " # #a#4  i  4#a# # "+ "'", str2.equals(" # #a#4  i  4#a# # "));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test328"); }


    java.lang.String str2 = StringParser.escapeString("a a aia a a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a a aia a a "+ "'", str2.equals(" a a aia a a "));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test329"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a   # 4#4#4 #   a4", 97, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test330"); }


    java.lang.String str2 = StringParser.escapeString("####a aaaiaaa a####", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#####a aaaiaaa a#####"+ "'", str2.equals("#####a aaaiaaa a#####"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test331"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a4  #a#4 aia 4#a#  4a#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4  #"+ "'", str2.equals("a4  #"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test332"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4# a44aahi!aa44a #4", 97, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test333"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4a a# #4aa a4#", 32, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test334"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aaaaa#4#aaaaa ", (int)(byte)10, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test335"); }


    java.lang.String str2 = StringParser.escapeString("#a#a4##aa4#i#4aa##4a#a#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##a#a4##aa4#i#4aa##4a#a##"+ "'", str2.equals("##a#a4##aa4#i#4aa##4a#a##"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test336"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a4#4   i   4#4a#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4#4   i   4#4a#"+ "'", str2.equals("#a4#4   i   4#4a#"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test337"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a#4 # 4#4#4 # 4#a#", 35, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test338"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  aa4a # 4#4#4 # a4aa  ", 100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test339"); }


    java.lang.String str2 = StringParser.escapeString("4  44##a  4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4  44##a  4#"+ "'", str2.equals("#4  44##a  4#"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test340"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 4#4 aia 4#4 4", (int)(short)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test341"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# a #  ahi!a  # a #", (-1), ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test342"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a  4 a  a 4  a ", (int)'4', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test343"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a a # ", (int)(short)10, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test344"); }


    java.lang.String str2 = StringParser.escapeString("4# ###a##aa4#i#4aa##a### #4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4# ###a##aa4#i#4aa##a### #4 "+ "'", str2.equals(" 4# ###a##aa4#i#4aa##a### #4 "));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test345"); }


    java.lang.String str2 = StringParser.escapeString("a4aa44##a i a##44aa4a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4aa44##a i a##44aa4a "+ "'", str2.equals(" a4aa44##a i a##44aa4a "));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test346"); }


    java.lang.String str2 = StringParser.escapeString(" a# a4aa# 4#aa4a #a ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a# a4aa# 4#aa4a #a 4"+ "'", str2.equals("4 a# a4aa# 4#aa4a #a 4"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test347"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4#a4aa #aia# aa4a#4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#a4aa #aia# aa4a#4"+ "'", str2.equals("4#a4aa #aia# aa4a#4"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test348"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4   a#aaiaa#a   4", 97, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test349"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a ", 35, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test350"); }


    java.lang.String str2 = StringParser.escapeString("#a 4aaa a#a#i#a#a aaa4 a#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#a 4aaa a#a#i#a#a aaa4 a#a"+ "'", str2.equals("a#a 4aaa a#a#i#a#a aaa4 a#a"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test351"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaaahi!aaaa", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test352"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aa #4aahi!aa4# aa ", 1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test353"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4 a#4#a   4a a#4#a 4#", (int)(short)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test354"); }


    java.lang.String str2 = StringParser.escapeString(" # #aa44#i#44aa# # ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 # #aa44#i#44aa# # 4"+ "'", str2.equals("4 # #aa44#i#44aa# # 4"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test355"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4# 4 a", (int)(short)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test356"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a##a ##a", (int)(short)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test357"); }


    java.lang.String str2 = StringParser.escapeString("4#a a  a a#4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44#a a  a a#44"+ "'", str2.equals("44#a a  a a#44"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test358"); }


    java.lang.String str2 = StringParser.escapeString(" a4aa ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a4aa 4"+ "'", str2.equals("4 a4aa 4"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test359"); }


    java.lang.String str2 = StringParser.escapeString("4 4aaiaa4 4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 4aaiaa4 4a"+ "'", str2.equals("a4 4aaiaa4 4a"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test360"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa # #4aaa", (int)(byte)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test361"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#a a#aaiaa#a a#4", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test362"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4a4   ahi!a   4a4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a"+ "'", str2.equals("4a"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test363"); }


    java.lang.String str2 = StringParser.escapeString(" aa444#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# aa444##"+ "'", str2.equals("# aa444##"));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test364"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a  #a", (int)(byte)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test365"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa  4aaiaa4  aa", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test366"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4a444  i  444a4 ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a444 "+ "'", str2.equals("4a444 "));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test367"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a  a# a ", (int)(byte)10, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test368"); }


    java.lang.String str2 = StringParser.escapeString("4 # #4a 4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44 # #4a 44"+ "'", str2.equals("44 # #4a 44"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test369"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44##a i a##44", 0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test370"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a      a#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a      a"+ "'", str2.equals("a      a"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test371"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"## 4 #a a#ahi!a#a a# 4 ##", (int)(byte)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test372"); }


    java.lang.String str2 = StringParser.escapeString("a#4####aa4##4#a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a#4####aa4##4#a "+ "'", str2.equals(" a#4####aa4##4#a "));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test373"); }


    java.lang.String str2 = StringParser.escapeString(" # 44a4#  #4a44 # ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 # 44a4#  #4a44 # 4"+ "'", str2.equals("4 # 44a4#  #4a44 # 4"));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test374"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 4 a 4#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4"+ "'", str2.equals(" 4"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test375"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4##4a4a#aia#a4a4##4", (int)(short)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test376"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a4 #a4#i#4a# 4a4", (int)(byte)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test377"); }


    java.lang.String str2 = StringParser.escapeString("4              4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44              44"+ "'", str2.equals("44              44"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test378"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a ##4a", 52, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test379"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaa4", 10, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test380"); }


    java.lang.String str2 = StringParser.escapeString("aaa44aaaa", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aaa44aaaa#"+ "'", str2.equals("#aaa44aaaa#"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test381"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a#4# #4aahi!aa4# #4#a ", (int)(byte)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test382"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4 #a4a # a#i#a # a4a# 4a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 #a4a # a#i#a # a4a# 4a"+ "'", str2.equals("a4 #a4a # a#i#a # a4a# 4a"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test383"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a a#44aa 4a44#a a", 100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test384"); }


    java.lang.String str2 = StringParser.escapeString("4a #44#aia#44# a4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4a #44#aia#44# a4#"+ "'", str2.equals("#4a #44#aia#44# a4#"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test385"); }


    java.lang.String str2 = StringParser.escapeString("#aa#a ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#aa#a 4"+ "'", str2.equals("4#aa#a 4"));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test386"); }


    java.lang.String str2 = StringParser.escapeString("# a#aaiaa#a #", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a# a#aaiaa#a #a"+ "'", str2.equals("a# a#aaiaa#a #a"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test387"); }


    java.lang.String str2 = StringParser.escapeString("  # #44 aaaiaaa 44# #  ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   # #44 aaaiaaa 44# #   "+ "'", str2.equals("   # #44 aaaiaaa 44# #   "));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test388"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  aa4 a##a 4aa  ", 52, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test389"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4 44aaahi!aaa44 4a", (int)(short)10, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test390"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#  aia  #", (int)(byte)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test391"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"###4#a i a#4###", 32, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test392"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4444444", 10, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test393"); }


    java.lang.String str2 = StringParser.escapeString(" 44#44a4i4a44#44 ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# 44#44a4i4a44#44 #"+ "'", str2.equals("# 44#44a4i4a44#44 #"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test394"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a 4#44 # #4aahi!aa4# # 44#4 a ", (int)(byte)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test395"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa# 4#aa", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test396"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"444#aa4##444", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444#aa4##444"+ "'", str2.equals("444#aa4##444"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test397"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4###aa4#4#a", (-1), '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test398"); }


    java.lang.String str2 = StringParser.escapeString("  a  4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4  a  44"+ "'", str2.equals("4  a  44"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test399"); }


    java.lang.String str2 = StringParser.escapeString("4 4 a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4 4 a#"+ "'", str2.equals("#4 4 a#"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test400"); }


    java.lang.String str2 = StringParser.escapeString("a4aaa4a4a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4aaa4a4a "+ "'", str2.equals(" a4aaa4a4a "));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test401"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaa#aa#  #a#i#a#  #aa#aaa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa#aa#  #a#i#a#  #aa#aaa"+ "'", str2.equals("aaa#aa#  #a#i#a#  #aa#aaa"));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test402"); }


    java.lang.String str2 = StringParser.escapeString(" 44###a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 44###a4"+ "'", str2.equals("4 44###a4"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test403"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4a44a4i4a44a4 ", (int)(byte)0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test404"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 a#a#i#a#a 4", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test405"); }


    java.lang.String str2 = StringParser.escapeString(" a444 ahi!a 444a ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a444 ahi!a 444a a"+ "'", str2.equals("a a444 ahi!a 444a a"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test406"); }


    java.lang.String str2 = StringParser.escapeString("#44 #a##aa4#i#4aa##a# 44#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#44 #a##aa4#i#4aa##a# 44#a"+ "'", str2.equals("a#44 #a##aa4#i#4aa##a# 44#a"));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test407"); }


    java.lang.String str2 = StringParser.escapeString("aa## a44aahi!aa44a ##aa", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4aa## a44aahi!aa44a ##aa4"+ "'", str2.equals("4aa## a44aahi!aa44a ##aa4"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test408"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#a 444#aia#444 a#4", (int)(byte)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test409"); }


    java.lang.String str2 = StringParser.escapeString("a #4aahi!aa4# a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a #4aahi!aa4# a "+ "'", str2.equals(" a #4aahi!aa4# a "));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test410"); }


    java.lang.String str2 = StringParser.escapeString("4 aa#  #aa 4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 aa#  #aa 4a"+ "'", str2.equals("a4 aa#  #aa 4a"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test411"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aa#a 4aahi!aa4 a#aa4", (int)(short)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test412"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a ##4aa#i#aa4## a", (int)(short)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test413"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4 # 4 #ahi!a# 4 # 4#", (int)(byte)1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test414"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a#4#4 aia 4#4#a4", (int)(short)0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test415"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" aa4#ahi!a#4aa ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa4#ahi!a#4aa "+ "'", str2.equals(" aa4#ahi!a#4aa "));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test416"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4a4 # # #a4#i#4a# # # 4a4#", (int)(byte)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test417"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 44a ", (int)(short)0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test418"); }


    java.lang.String str2 = StringParser.escapeString("a#4  #4#a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a#4  #4#a "+ "'", str2.equals(" a#4  #4#a "));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test419"); }


    java.lang.String str2 = StringParser.escapeString(" 4a 4 a4#aa ##4 aia 4## aa#4a 4 a4 ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 4a 4 a4#aa ##4 aia 4## aa#4a 4 a4 4"+ "'", str2.equals("4 4a 4 a4#aa ##4 aia 4## aa#4a 4 a4 4"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test420"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" ## ", (int)(short)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test421"); }


    java.lang.String str2 = StringParser.escapeString(" aa#4#aa ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# aa#4#aa #"+ "'", str2.equals("# aa#4#aa #"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test422"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 444###aa4#444 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 444###aa4#444 "+ "'", str2.equals(" 444###aa4#444 "));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test423"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44  4aa  ahi!a  aa4  44", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44  4aa  ahi!a  aa4  44"+ "'", str2.equals("44  4aa  ahi!a  aa4  44"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test424"); }


    java.lang.String str2 = StringParser.escapeString(" ### #4a## ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# ### #4a## #"+ "'", str2.equals("# ### #4a## #"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test425"); }


    java.lang.String str2 = StringParser.escapeString("a aa44aahi!aa44aa a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa aa44aahi!aa44aa aa"+ "'", str2.equals("aa aa44aahi!aa44aa aa"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test426"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4###a  a###4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4###a  a###4"+ "'", str2.equals("4###a  a###4"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test427"); }


    java.lang.String str2 = StringParser.escapeString(" # #44 aaaiaaa 44# # ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a # #44 aaaiaaa 44# # a"+ "'", str2.equals("a # #44 aaaiaaa 44# # a"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test428"); }


    java.lang.String str2 = StringParser.escapeString(" ##aaaaahi!aaaaa## ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 ##aaaaahi!aaaaa## 4"+ "'", str2.equals("4 ##aaaaahi!aaaaa## 4"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test429"); }


    java.lang.String str2 = StringParser.escapeString("a #4    4i4    4# a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa #4    4i4    4# aa"+ "'", str2.equals("aa #4    4i4    4# aa"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test430"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a #a#4", (int)(short)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test431"); }


    java.lang.String str2 = StringParser.escapeString("a4aa44##a i a##44aa4a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa4aa44##a i a##44aa4aa"+ "'", str2.equals("aa4aa44##a i a##44aa4aa"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test432"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a# a a i a a #a", (int)(short)10, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test433"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4 #a4#i#4a# 4 ", 32, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test434"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #4###4 a", (int)(short)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test435"); }


    java.lang.String str2 = StringParser.escapeString(" 4aa4 a  a  a 4aa4 ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a 4aa4 a  a  a 4aa4 a"+ "'", str2.equals("a 4aa4 a  a  a 4aa4 a"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test436"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa4a44aa4aa", (int)' ', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test437"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a## # #      # # ##a", (int)'4', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test438"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4#aaa44#i#44aaa#4 ", 32, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test439"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4#a#a  ahi!a  a#a#4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#a#a  ahi!a  a#a#4"+ "'", str2.equals("4#a#a  ahi!a  a#a#4"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test440"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#aa#aa #4aahi!aa4# aa#aa#", 97, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test441"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  4 aa444#4  ", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test442"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 44#a  #aia#  a#44 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 44#a  #aia#  a#44 "+ "'", str2.equals(" 44#a  #aia#  a#44 "));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test443"); }


    java.lang.String str2 = StringParser.escapeString("4 4a#4   i   4#a4 4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 4a#4   i   4#a4 4a"+ "'", str2.equals("a4 4a#4   i   4#a4 4a"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test444"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4a444##4 aia 4##444a4 ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a444##4 "+ "'", str2.equals("4a444##4 "));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test445"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #a4a44aa4a# ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #a4a44aa4a# "+ "'", str2.equals(" #a4a44aa4a# "));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test446"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 a   # 44", (int)(byte)10, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test447"); }


    java.lang.String str2 = StringParser.escapeString(" ###aa4# ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# ###aa4# #"+ "'", str2.equals("# ###aa4# #"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test448"); }


    java.lang.String str2 = StringParser.escapeString("4 #a4#i#4a# 4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4 #a4#i#4a# 4#"+ "'", str2.equals("#4 #a4#i#4a# 4#"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test449"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  a  #a4#ahi!a#4a#  a  ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " "+ "'", str2.equals(" "));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test450"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#  4", (int)' ', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test451"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#  4 aa444#4  #", (int)(short)0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test452"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa 4##4 4 aa", 100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test453"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4 aa4a4a #aa 4 ", (int)(short)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test454"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##aa  ###", (int)(short)10, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test455"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  #  #44#i#44#  #  ", 35, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test456"); }


    java.lang.String str2 = StringParser.escapeString("a###a aaiaa a###a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a###a aaiaa a###a "+ "'", str2.equals(" a###a aaiaa a###a "));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test457"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aa4a #i# a4aa4", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test458"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  a4aa #aia# aa4a  ", (int)(byte)0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test459"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #a #a# ", (int)(short)1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test460"); }


    java.lang.String str2 = StringParser.escapeString(" #  #44  44#  # ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  #  #44  44#  #  "+ "'", str2.equals("  #  #44  44#  #  "));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test461"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a  4#", (int)(byte)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test462"); }


    java.lang.String str2 = StringParser.escapeString("a444aaa 444a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a444aaa 444a4"+ "'", str2.equals("4a444aaa 444a4"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test463"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a a#a i a#a a#", 97, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test464"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#aa##4 aia 4##aa#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aa##4 aia 4##aa#"+ "'", str2.equals("#aa##4 aia 4##aa#"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test465"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"444 ##a  444", (int)'4', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test466"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 # #4aahi!aa4# # 4", 97, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test467"); }


    java.lang.String str2 = StringParser.escapeString("a a#aia#a a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa a#aia#a aa"+ "'", str2.equals("aa a#aia#a aa"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test468"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  a44aahi!aa44a  a", (int)'#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test469"); }


    java.lang.String str2 = StringParser.escapeString("4# a##  ##a #4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4# a##  ##a #4 "+ "'", str2.equals(" 4# a##  ##a #4 "));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test470"); }


    java.lang.String str2 = StringParser.escapeString(" 44a4i4a44 ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 44a4i4a44 4"+ "'", str2.equals("4 44a4i4a44 4"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test471"); }


    java.lang.String str2 = StringParser.escapeString("aaa4   i   4aaa", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aaa4   i   4aaa "+ "'", str2.equals(" aaa4   i   4aaa "));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test472"); }


    java.lang.String str2 = StringParser.escapeString("#a#aa ##4a#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #a#aa ##4a# "+ "'", str2.equals(" #a#aa ##4a# "));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test473"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  aa 4 #44#i#44# 4 aa  ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " "+ "'", str2.equals(" "));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test474"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa#4aaa 4#aa", (int)' ', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test475"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4##4", 1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test476"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #a#a4a ##4 aia 4## a4a#a# ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #a#a4a ##4 aia 4## a4a#a# "+ "'", str2.equals(" #a#a4a ##4 aia 4## a4a#a# "));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test477"); }


    java.lang.String str2 = StringParser.escapeString(" aa##aa a ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 aa##aa a 4"+ "'", str2.equals("4 aa##aa a 4"));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test478"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"444##aa4#i#4aa##444", (int)' ', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test479"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a#4a4i4a4#a4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a#4a4i4a4#a4"+ "'", str2.equals("4a#4a4i4a4#a4"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test480"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4##aa    #  a i a  #    aa##4#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#"+ "'", str2.equals("4#"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test481"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44 ## i ## 44", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test482"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa#4#  ahi!a  #4#aa", (int)' ', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test483"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  a#ahi!a#a  a", (-1), 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test484"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# ##a aaaiaaa a## #", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# ##a aaaiaaa a## #"+ "'", str2.equals("# ##a aaaiaaa a## #"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test485"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#aa4 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aa4 "+ "'", str2.equals("#aa4 "));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test486"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4#a ", 1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test487"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4#4a44aa4#4#", (int)(byte)0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test488"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a4aa44a#", (int)'4', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test489"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a #a#a 4aaahi!aaa4 a#a# a", (-1), ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test490"); }


    java.lang.String str2 = StringParser.escapeString("a##4aahi!aa4##a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a##4aahi!aa4##a4"+ "'", str2.equals("4a##4aahi!aa4##a4"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test491"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 a#    4i4    #a 4", (int)(byte)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test492"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a a4#a#a i a#a#4a a#", 52, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test493"); }


    java.lang.String str2 = StringParser.escapeString("4  a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44  a4"+ "'", str2.equals("44  a4"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test494"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa#a ##4 aa#aa", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test495"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"## # # 4aaiaa4 # # ##", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "## # # 4aaiaa4 # # ##"+ "'", str2.equals("## # # 4aaiaa4 # # ##"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test496"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#444  444#", (int)(short)10, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test497"); }


    java.lang.String str2 = StringParser.escapeString("  #a4aaahi!aaa4a#  ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   #a4aaahi!aaa4a#   "+ "'", str2.equals("   #a4aaahi!aaa4a#   "));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test498"); }


    java.lang.String str2 = StringParser.escapeString(" a#4####aa4##4#a ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# a#4####aa4##4#a #"+ "'", str2.equals("# a#4####aa4##4#a #"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test499"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4a4#a # #4aahi!aa4# # a#4a4 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4a4#a # #4aahi!aa4# # a#4a4 "+ "'", str2.equals(" 4a4#a # #4aahi!aa4# # a#4a4 "));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test500"); }


    java.lang.String str2 = StringParser.escapeString("##4aa# 4#aa4##", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a##4aa# 4#aa4##a"+ "'", str2.equals("a##4aa# 4#aa4##a"));

  }

}
