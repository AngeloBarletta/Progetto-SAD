
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test001"); }


    java.lang.String str2 = StringParser.escapeString("a4a4a #a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4a4a #a "+ "'", str2.equals(" a4a4a #a "));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test002"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##a4aa # 4#4#4 # aa4a##", (int)(byte)0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test003"); }


    java.lang.String str2 = StringParser.escapeString(" #a a aaaiaaa a a# ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  #a a aaaiaaa a a#  "+ "'", str2.equals("  #a a aaaiaaa a a#  "));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test004"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa i aa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test005"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a### i ###a#a", 97, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test006"); }


    java.lang.String str2 = StringParser.escapeString("a#a#44a  #4#a i a#4#  a44#a#a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a#a#44a  #4#a i a#4#  a44#a#a "+ "'", str2.equals(" a#a#44a  #4#a i a#4#  a44#a#a "));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test007"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  #4aahi!aa4#  ", (int)'#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test008"); }


    java.lang.String str2 = StringParser.escapeString("a#  ahi!a  #a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a#  ahi!a  #a#"+ "'", str2.equals("#a#  ahi!a  #a#"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test009"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a #aia# a4", (int)(short)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test010"); }


    java.lang.String str2 = StringParser.escapeString("a##4#ahi!a#4##a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa##4#ahi!a#4##aa"+ "'", str2.equals("aa##4#ahi!a#4##aa"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test011"); }


    java.lang.String str2 = StringParser.escapeString("4aa4 a  a  a 4aa4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4aa4 a  a  a 4aa4 "+ "'", str2.equals(" 4aa4 a  a  a 4aa4 "));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test012"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a a#aa4i4aa#a a", 97, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test013"); }


    java.lang.String str2 = StringParser.escapeString("44#a  #aia#  a#44", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 44#a  #aia#  a#44 "+ "'", str2.equals(" 44#a  #aia#  a#44 "));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test014"); }


    java.lang.String str2 = StringParser.escapeString(" 4 a44##44#i#44##44a 4 ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4 a44##44#i#44##44a 4  "+ "'", str2.equals("  4 a44##44#i#44##44a 4  "));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test015"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 #4#  #4# 4", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test016"); }


    java.lang.String str2 = StringParser.escapeString("    aa#  #a#i#a#  #aa    ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "     aa#  #a#i#a#  #aa     "+ "'", str2.equals("     aa#  #a#i#a#  #aa     "));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test017"); }


    java.lang.String str2 = StringParser.escapeString("4aa4aa#      #aa4aa4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4aa4aa#      #aa4aa4a"+ "'", str2.equals("a4aa4aa#      #aa4aa4a"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test018"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##a", (int)(byte)-1, 'a');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test019"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"###4 ##4 aia 4## 4###", 1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test020"); }


    java.lang.String str2 = StringParser.escapeString("a4 aa", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a4 aa4"+ "'", str2.equals("4a4 aa4"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test021"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" # a#    4 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " # a#    4 "+ "'", str2.equals(" # a#    4 "));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test022"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a4#   # 4#4#4 #   #4a#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4#   # 4#4#4 #   #4a#"+ "'", str2.equals("#a4#   # 4#4#4 #   #4a#"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test023"); }


    java.lang.String str2 = StringParser.escapeString("   a# ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a   a# a"+ "'", str2.equals("a   a# a"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test024"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44#a4 #a4#i#4a# 4a#44", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44#a4 #a4#i#4a# 4a#44"+ "'", str2.equals("44#a4 #a4#i#4a# 4a#44"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test025"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4#a # #4aahi!aa4# # a#4a", 32, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test026"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"###a#4 aia 4#a###", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "###a#4 aia 4#a###"+ "'", str2.equals("###a#4 aia 4#a###"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test027"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a# #4aa", 1, 'a');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test028"); }


    java.lang.String str2 = StringParser.escapeString("4#a##aa44", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44#a##aa444"+ "'", str2.equals("44#a##aa444"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test029"); }


    java.lang.String str2 = StringParser.escapeString("  a#a i a#a  ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   a#a i a#a   "+ "'", str2.equals("   a#a i a#a   "));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test030"); }


    java.lang.String str2 = StringParser.escapeString("aa4 a##a 4aa", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa4 a##a 4aa "+ "'", str2.equals(" aa4 a##a 4aa "));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test031"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a4a#4aa4a4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4"+ "'", str2.equals("a4"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test032"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a # a## a", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test033"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a a#aa 4aaahi!aaa4 aa#a a", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test034"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# a#44i44#a #", (int)' ', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test035"); }


    java.lang.String str2 = StringParser.escapeString("a  ##4   a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa  ##4   aa"+ "'", str2.equals("aa  ##4   aa"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test036"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# 4a4i4a4 #", (int)(short)0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test037"); }


    java.lang.String str2 = StringParser.escapeString(" a4aaahi!aaa4a ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a4aaahi!aaa4a 4"+ "'", str2.equals("4 a4aaahi!aaa4a 4"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test038"); }


    java.lang.String str2 = StringParser.escapeString("# #a #", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a# #a #a"+ "'", str2.equals("a# #a #a"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test039"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a  4a4  a ", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test040"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4 ##aaiaa## 4a", (int)'a', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test041"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a #a4#", (int)(short)-1, ' ');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test042"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a a#    4i4    #a a", 52, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test043"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#4 #aa444#i#444aa# 4#a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#4 #aa444#i#444aa# 4#a"+ "'", str2.equals("a#4 #aa444#i#444aa# 4#a"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test044"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4# # a## #4", (int)(short)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test045"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a ## #a a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a ## #a a"+ "'", str2.equals("a ## #a a"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test046"); }


    java.lang.String str2 = StringParser.escapeString("#4# a4aa# 4#aa4a #4#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##4# a4aa# 4#aa4a #4##"+ "'", str2.equals("##4# a4aa# 4#aa4a #4##"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test047"); }


    java.lang.String str2 = StringParser.escapeString("4  #4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44  #44"+ "'", str2.equals("44  #44"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test048"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a4a4a #a ", (int)(byte)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test049"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 4#a#aia#a#4 4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 4#a#aia#a#4 4"+ "'", str2.equals("4 4#a#aia#a#4 4"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test050"); }


    java.lang.String str2 = StringParser.escapeString(" a4  a 4a ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a4  a 4a 4"+ "'", str2.equals("4 a4  a 4a 4"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test051"); }


    java.lang.String str2 = StringParser.escapeString("4 4#aia#4 4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 4#aia#4 4a"+ "'", str2.equals("a4 4#aia#4 4a"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test052"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4  #a4 4 aaaiaaa 4 4a#  4", 35, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test053"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa4#  #4aa", (int)(byte)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test054"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a aa ##4 a", (int)(short)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test055"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4 ##4 aia 4## 4a", (int)(short)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test056"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#aa#a aa#", 35, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test057"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##4##a i a##4##", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test058"); }


    java.lang.String str2 = StringParser.escapeString("   #a ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "    #a  "+ "'", str2.equals("    #a  "));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test059"); }


    java.lang.String str2 = StringParser.escapeString("#a4 a aa44aaa a 4a#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#a4 a aa44aaa a 4a#a"+ "'", str2.equals("a#a4 a aa44aaa a 4a#a"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test060"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4aaiaa4 ", (int)'#', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test061"); }


    java.lang.String str2 = StringParser.escapeString(" #4aaaiaaa4# ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# #4aaaiaaa4# #"+ "'", str2.equals("# #4aaaiaaa4# #"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test062"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"## 4##", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "## 4##"+ "'", str2.equals("## 4##"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test063"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a#aa4#i#4aa#a#", (int)'#', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test064"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a a44aa a", 100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test065"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#44i44#a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#44i44#a"+ "'", str2.equals("a#44i44#a"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test066"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#44#aaiaa#44#", (int)(byte)0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test067"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4444 a#i#a 4444", (int)'a', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test068"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  4#4#4  a", (int)(short)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test069"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a#", (int)(byte)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test070"); }


    java.lang.String str2 = StringParser.escapeString(" 4a#aaiaa#a4 ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a 4a#aaiaa#a4 a"+ "'", str2.equals("a 4a#aaiaa#a4 a"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test071"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# a#4  #", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# a#4  #"+ "'", str2.equals("# a#4  #"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test072"); }


    java.lang.String str2 = StringParser.escapeString(" 4 aa a aa#aia#aa a aa 4 ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 4 aa a aa#aia#aa a aa 4 4"+ "'", str2.equals("4 4 aa a aa#aia#aa a aa 4 4"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test073"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4 # aaaaiaaaa # 4#", (int)(byte)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test074"); }


    java.lang.String str2 = StringParser.escapeString("#4 a##a 4#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##4 a##a 4##"+ "'", str2.equals("##4 a##a 4##"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test075"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aaa a#a#i#a#a aaa4", (int)'#', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test076"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a# #a#4  i  4#a# #a", 32, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test077"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a# a#4 ## i ## 4#a #a", (int)(byte)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test078"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# #4a #", 10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test079"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a#4 #4 4#a ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#4 "+ "'", str2.equals("a#4 "));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test080"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 ##a", (int)(byte)1, '4');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test081"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4###aa4##4a", 32, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test082"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#  a#44#aia#44#a  #", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#  a#44#aia#44#a  #"+ "'", str2.equals("#  a#44#aia#44#a  #"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test083"); }


    java.lang.String str2 = StringParser.escapeString("  #   #  a i a  #   #  ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   #   #  a i a  #   #   "+ "'", str2.equals("   #   #  a i a  #   #   "));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test084"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a 4 4 aaaiaaa 4 4 a ", (int)'#', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test085"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #aa #a##4#ahi!a#4##a# aa# ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #aa #a##4#ahi!a#4##a# aa# "+ "'", str2.equals(" #aa #a##4#ahi!a#4##a# aa# "));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test086"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 ##4 aia 4## 4", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test087"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#44a4a#4#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44a4a#"+ "'", str2.equals("44a4a#"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test088"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4#aa ##4#4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#aa ##4#4"+ "'", str2.equals("4#aa ##4#4"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test089"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a ##4 aia 4## a4a", (int)(byte)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test090"); }


    java.lang.String str2 = StringParser.escapeString("4 4#aa 4a#4 4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 4#aa 4a#4 4a"+ "'", str2.equals("a4 4#aa 4a#4 4a"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test091"); }


    java.lang.String str2 = StringParser.escapeString("a#4a4 4 aaaiaaa 4 4a4#a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a#4a4 4 aaaiaaa 4 4a4#a "+ "'", str2.equals(" a#4a4 4 aaaiaaa 4 4a4#a "));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test092"); }


    java.lang.String str2 = StringParser.escapeString("a #4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa #4a"+ "'", str2.equals("aa #4a"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test093"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#aa4#4  #4#4aa#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aa4#4  #4#4aa#"+ "'", str2.equals("#aa4#4  #4#4aa#"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test094"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a ## #a a", (int)'#', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test095"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4##4#", 0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test096"); }


    java.lang.String str2 = StringParser.escapeString("#4a #", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#4a #a"+ "'", str2.equals("a#4a #a"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test097"); }


    java.lang.String str2 = StringParser.escapeString(" 4a4aa#i#aa4a4 ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4a4aa#i#aa4a4  "+ "'", str2.equals("  4a4aa#i#aa4a4  "));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test098"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4a4a # 4#4#4 # a4a4 ", 35, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test099"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# 444#i#444 #", (int)(byte)1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test100"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a444  i  444a", (int)(byte)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test101"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a #a#a i a#a# a ", (int)(short)0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test102"); }


    java.lang.String str2 = StringParser.escapeString(" #44 aa44aahi!aa44aa 44# ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 #44 aa44aahi!aa44aa 44# 4"+ "'", str2.equals("4 #44 aa44aahi!aa44aa 44# 4"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test103"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#aaa  a  aaa#a", (int)(short)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test104"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4a#aa4# 4#4aa#a4 ", (int)' ', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test105"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#aaa#4a#a i a#a4#aaa#", (int)(byte)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test106"); }


    java.lang.String str2 = StringParser.escapeString(" a##  ##a ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# a##  ##a #"+ "'", str2.equals("# a##  ##a #"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test107"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#  #4###4 aia 4###4#  #", (int)(byte)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test108"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  #i#  a", 32, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test109"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 44 #a4 ", 0, '4');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test110"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #a#a 4aaahi!aaa4 a#a# ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a#a "+ "'", str2.equals("#a#a "));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test111"); }


    java.lang.String str2 = StringParser.escapeString("4 a#a #aa4## a#a 4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 a#a #aa4## a#a 4a"+ "'", str2.equals("a4 a#a #aa4## a#a 4a"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test112"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaahi!aaa", (int)(byte)0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test113"); }


    java.lang.String str2 = StringParser.escapeString("#4## a#i#a ##4#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #4## a#i#a ##4# "+ "'", str2.equals(" #4## a#i#a ##4# "));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test114"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44a44aa44", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test115"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaa   4a aaa", 100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test116"); }


    java.lang.String str2 = StringParser.escapeString("4# ##4  #4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44# ##4  #44"+ "'", str2.equals("44# ##4  #44"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test117"); }


    java.lang.String str2 = StringParser.escapeString("4a4   ahi!a   4a4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4a4   ahi!a   4a4#"+ "'", str2.equals("#4a4   ahi!a   4a4#"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test118"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4 ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test119"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a ## #a a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " ## #a"+ "'", str2.equals(" ## #a"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test120"); }


    java.lang.String str2 = StringParser.escapeString("4aaa a#a#i#a#a aaa4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4aaa a#a#i#a#a aaa4 "+ "'", str2.equals(" 4aaa a#a#i#a#a aaa4 "));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test121"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"444# ahi!a #444", (int)(byte)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test122"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa###44##a i a##44###aa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa###44##a i a##44###aa"+ "'", str2.equals("aa###44##a i a##44###aa"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test123"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a#4####aa4##4#a#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#"+ "'", str2.equals("a#"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test124"); }


    java.lang.String str2 = StringParser.escapeString("              ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4              4"+ "'", str2.equals("4              4"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test125"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a44a 44aahi!aa44 a44a", (int)(short)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test126"); }


    java.lang.String str2 = StringParser.escapeString("# #44 #  # 44# #", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "## #44 #  # 44# ##"+ "'", str2.equals("## #44 #  # 44# ##"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test127"); }


    java.lang.String str2 = StringParser.escapeString(" aa#4 #4 4#aa ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  aa#4 #4 4#aa  "+ "'", str2.equals("  aa#4 #4 4#aa  "));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test128"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" # 4 aia 4 # ", (int)(short)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test129"); }


    java.lang.String str2 = StringParser.escapeString(" 44 # #4aahi!aa4# # 44 ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# 44 # #4aahi!aa4# # 44 #"+ "'", str2.equals("# 44 # #4aahi!aa4# # 44 #"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test130"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44 aa#4#aa 44", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test131"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4", 1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test132"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4a#a i a#a4 ", (int)(short)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test133"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4##4 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4##4 "+ "'", str2.equals("4##4 "));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test134"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44  4 44  44", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44  4 44  44"+ "'", str2.equals("44  4 44  44"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test135"); }


    java.lang.String str2 = StringParser.escapeString("a#a##aa4a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a#a##aa4a4"+ "'", str2.equals("4a#a##aa4a4"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test136"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4#a4 ", 100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test137"); }


    java.lang.String str2 = StringParser.escapeString("4 44  ##4 a 44 4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44 44  ##4 a 44 44"+ "'", str2.equals("44 44  ##4 a 44 44"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test138"); }


    java.lang.String str2 = StringParser.escapeString("  ##4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   ##4 "+ "'", str2.equals("   ##4 "));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test139"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa4 444#a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa4 444#a"+ "'", str2.equals("aa4 444#a"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test140"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"## #a #a# ##", (int)(short)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test141"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4  aa4#aia#4aa  4", (int)'4', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test142"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 a", (int)' ', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test143"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4###4 ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#"+ "'", str2.equals("4#"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test144"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4a #4aahi!aa4# a4 ", (int)(short)0, ' ');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test145"); }


    java.lang.String str2 = StringParser.escapeString("444a4#  #4a444", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#444a4#  #4a444#"+ "'", str2.equals("#444a4#  #4a444#"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test146"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a44a  ahi!a  a44a", (int)(byte)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test147"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 4#a i a#4 4", 35, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test148"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4##aa", (int)(byte)0, 'a');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test149"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaa ##4 aia 4## aaa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test150"); }


    java.lang.String str2 = StringParser.escapeString("44a4#4#4a44", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444a4#4#4a444"+ "'", str2.equals("444a4#4#4a444"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test151"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#   ##4 a  #", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test152"); }


    java.lang.String str2 = StringParser.escapeString("4 4##a a#ahi!a#a a##4 4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 4##a a#ahi!a#a a##4 4a"+ "'", str2.equals("a4 4##a a#ahi!a#a a##4 4a"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test153"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #a4aa# ", (int)'a', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test154"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4 #", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 #"+ "'", str2.equals("a4 #"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test155"); }


    java.lang.String str2 = StringParser.escapeString("# 4  # #a4#i#4a# #  4 #", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " # 4  # #a4#i#4a# #  4 # "+ "'", str2.equals(" # 4  # #a4#i#4a# #  4 # "));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test156"); }


    java.lang.String str2 = StringParser.escapeString("###4 ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "####4 #"+ "'", str2.equals("####4 #"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test157"); }


    java.lang.String str2 = StringParser.escapeString("4 # 4a  ahi!a  a4 # 4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4 # 4a  ahi!a  a4 # 4#"+ "'", str2.equals("#4 # 4a  ahi!a  a4 # 4#"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test158"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a a#a##4a#a a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a"+ "'", str2.equals(" a"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test159"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4    4", 100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test160"); }


    java.lang.String str2 = StringParser.escapeString("aaaa## #a #a# ##aaaa", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aaaa## #a #a# ##aaaa#"+ "'", str2.equals("#aaaa## #a #a# ##aaaa#"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test161"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a#a 4aahi!aa4 a#a4", 1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test162"); }


    java.lang.String str2 = StringParser.escapeString("4#4#ahi!a#4#4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44#4#ahi!a#4#44"+ "'", str2.equals("44#4#ahi!a#4#44"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test163"); }


    java.lang.String str2 = StringParser.escapeString("44#a ##4  a#44", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 44#a ##4  a#44 "+ "'", str2.equals(" 44#a ##4  a#44 "));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test164"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4#", (-1), '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test165"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 4a # i # a4 4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4"+ "'", str2.equals(" 4"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test166"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44a4i4a44", (-1), ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test167"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44a4#a#a i a#a#4a44", (int)(short)10, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test168"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"####44#i#44####", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test169"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4  44 a#i#a 44  4", 1, '4');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test170"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# 4a#44#i#44#a4 #", (int)' ', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test171"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4# 4 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4# 4 "+ "'", str2.equals(" 4# 4 "));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test172"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"   ##4 aia 4##   ", 10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test173"); }


    java.lang.String str2 = StringParser.escapeString("aa #  # 4#4#4 #  # aa", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa #  # 4#4#4 #  # aaa"+ "'", str2.equals("aaa #  # 4#4#4 #  # aaa"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test174"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a #4#aa ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a #4#aa "+ "'", str2.equals(" a #4#aa "));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test175"); }


    java.lang.String str2 = StringParser.escapeString("##44  44##", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a##44  44##a"+ "'", str2.equals("a##44  44##a"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test176"); }


    java.lang.String str2 = StringParser.escapeString(" a 4aa a aa#aia#aa a aa4 a ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  a 4aa a aa#aia#aa a aa4 a  "+ "'", str2.equals("  a 4aa a aa#aia#aa a aa4 a  "));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test177"); }


    java.lang.String str2 = StringParser.escapeString("a44444aaiaa44444a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a44444aaiaa44444a#"+ "'", str2.equals("#a44444aaiaa44444a#"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test178"); }


    java.lang.String str2 = StringParser.escapeString("a44# aa", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a44# aa4"+ "'", str2.equals("4a44# aa4"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test179"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a#a# a4aa# 4#aa4a #a#a#", 32, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test180"); }


    java.lang.String str2 = StringParser.escapeString("  4 aa444#4  ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#  4 aa444#4  #"+ "'", str2.equals("#  4 aa444#4  #"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test181"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4a4# a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4a4# a"+ "'", str2.equals("a4a4# a"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test182"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  aa#4#aa  ", 32, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test183"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a a4#a##aa4#i#4aa##a#4a a", (int)(byte)10, 'a');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test184"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44a##a44", (int)(short)1, '#');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test185"); }


    java.lang.String str2 = StringParser.escapeString("#aaa#aaaa#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##aaa#aaaa##"+ "'", str2.equals("##aaa#aaaa##"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test186"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a ##4a4", (int)' ', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test187"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  aaa  ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  aaa  "+ "'", str2.equals("  aaa  "));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test188"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#  aa#  #a#i#a#  #aa  #", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#  aa#  #a#i#a#  #aa  #"+ "'", str2.equals("#  aa#  #a#i#a#  #aa  #"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test189"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4##44#i#44##4a", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test190"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"## 4a##", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test191"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##a4aa#      #aa4a##", 52, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test192"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4##4 a", (int)'4', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test193"); }


    java.lang.String str2 = StringParser.escapeString("#a4a # a#i#a # a4a#", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#a4a # a#i#a # a4a#4"+ "'", str2.equals("4#a4a # a#i#a # a4a#4"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test194"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a # #4aahi!aa4# # a ", (int)'4', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test195"); }


    java.lang.String str2 = StringParser.escapeString(" a  ##4 a a ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# a  ##4 a a #"+ "'", str2.equals("# a  ##4 a a #"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test196"); }


    java.lang.String str2 = StringParser.escapeString(" ##a # a## a## ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  ##a # a## a##  "+ "'", str2.equals("  ##a # a## a##  "));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test197"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4 ##4a4##aa4## 4 ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 "+ "'", str2.equals("4 "));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test198"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a44a4", 32, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test199"); }


    java.lang.String str2 = StringParser.escapeString("#aa   4i4   aa#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#aa   4i4   aa#a"+ "'", str2.equals("a#aa   4i4   aa#a"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test200"); }


    java.lang.String str2 = StringParser.escapeString("4aa hi! aa4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4aa hi! aa4 "+ "'", str2.equals(" 4aa hi! aa4 "));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test201"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4 a4#aa ##4 aia 4## aa#4a 4 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4 a4#aa ##4 aia 4## aa#4a 4 "+ "'", str2.equals(" 4 a4#aa ##4 aia 4## aa#4a 4 "));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test202"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  4#4#  ahi!a  #4#4  a", (int)(byte)1, ' ');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test203"); }


    java.lang.String str2 = StringParser.escapeString("a   4#aa ##4 aia 4## aa#4   a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a   4#aa ##4 aia 4## aa#4   a#"+ "'", str2.equals("#a   4#aa ##4 aia 4## aa#4   a#"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test204"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  4#444##4 aia 4##444#4  ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4#444##4 aia 4##444#4  "+ "'", str2.equals("  4#444##4 aia 4##444#4  "));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test205"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##a#aia#a##", (-1), '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test206"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 aa44#i#44aa 4", 1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test207"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #44 aaaiaaa 44# ", 32, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test208"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a # #aia# # a", 97, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test209"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a aa4i4aa a#", 52, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test210"); }


    java.lang.String str2 = StringParser.escapeString("#4aa a#    4i4    #a aa4#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#4aa a#    4i4    #a aa4#a"+ "'", str2.equals("a#4aa a#    4i4    #a aa4#a"));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test211"); }


    java.lang.String str2 = StringParser.escapeString(" aa a aa#aia#aa a aa ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a aa a aa#aia#aa a aa a"+ "'", str2.equals("a aa a aa#aia#aa a aa a"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test212"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4 444#", (int)(short)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test213"); }


    java.lang.String str2 = StringParser.escapeString("###44##a#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a###44##a#a"+ "'", str2.equals("a###44##a#a"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test214"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  4 44  a", (int)(short)10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test215"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" ###a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " ###a"+ "'", str2.equals(" ###a"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test216"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #  #a4# ", (int)(byte)0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test217"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a  ##444 # #4aahi!aa4# # 444##  a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  ##444 # #4a"+ "'", str2.equals("  ##444 # #4a"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test218"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa#aaa44#i#44aaa#aa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa#aaa44#i#44aaa#aa"+ "'", str2.equals("aa#aaa44#i#44aaa#aa"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test219"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4a#4aaa 4aaahi!aaa4 aaa4#a4 ", 52, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test220"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a #4#a i a#4# a#", (int)(byte)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test221"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#aa4# aa#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aa4# aa#"+ "'", str2.equals("#aa4# aa#"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test222"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##a #a##", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test223"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"####44#i#44####", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test224"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# # # ahi!a # # #", 97, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test225"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#  a4#a#a i a#a#4a  #", (int)(short)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test226"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a###44##a#a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "###44##a"+ "'", str2.equals("###44##a"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test227"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa4# a#a a#ahi!a#a a#a #4aa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa4# a#a a#ahi!a#a a#a #4aa"+ "'", str2.equals("aa4# a#a a#ahi!a#a a#a #4aa"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test228"); }


    java.lang.String str2 = StringParser.escapeString(" #aa ##4 aia 4## aa# ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# #aa ##4 aia 4## aa# #"+ "'", str2.equals("# #aa ##4 aia 4## aa# #"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test229"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4a4##44#i#44##4a4a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4a4##44#i#44##4a4a"+ "'", str2.equals("a4a4##44#i#44##4a4a"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test230"); }


    java.lang.String str2 = StringParser.escapeString("a#4# 44aa#4aahi!aa4#aa44 #4#a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a#4# 44aa#4aahi!aa4#aa44 #4#a4"+ "'", str2.equals("4a#4# 44aa#4aahi!aa4#aa44 #4#a4"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test231"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#44##4 aia 4##44#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44#"+ "'", str2.equals("44#"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test232"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44a4a 4aaiaa4 a4a44", 97, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test233"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4##aa", 52, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test234"); }


    java.lang.String str2 = StringParser.escapeString("aaa4##4 aia 4##4aaa", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aaa4##4 aia 4##4aaa "+ "'", str2.equals(" aaa4##4 aia 4##4aaa "));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test235"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa 4  # aa", (int)'a', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test236"); }


    java.lang.String str2 = StringParser.escapeString("##44 4#aia#4 44##", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "###44 4#aia#4 44###"+ "'", str2.equals("###44 4#aia#4 44###"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test237"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a#  ", (-1), ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test238"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 4a#4   i   4#a4 4", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test239"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  a  ahi!a  a  ", (int)'#', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test240"); }


    java.lang.String str2 = StringParser.escapeString("4 # # #a4#i#4a# # # 4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4 # # #a4#i#4a# # # 4 "+ "'", str2.equals(" 4 # # #a4#i#4a# # # 4 "));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test241"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  # #a #a# #  a", 35, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test242"); }


    java.lang.String str2 = StringParser.escapeString(" aa##4aa ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  aa##4aa  "+ "'", str2.equals("  aa##4aa  "));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test243"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a ##4  a4a", (int)(byte)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test244"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"## 4###", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test245"); }


    java.lang.String str2 = StringParser.escapeString(" aa4a4a #aa ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# aa4a4a #aa #"+ "'", str2.equals("# aa4a4a #aa #"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test246"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 4 aia 4 4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 4 aia 4 4"+ "'", str2.equals("4 4 aia 4 4"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test247"); }


    java.lang.String str2 = StringParser.escapeString("  # #a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4  # #a4"+ "'", str2.equals("4  # #a4"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test248"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#a##aa4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a"+ "'", str2.equals("#a"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test249"); }


    java.lang.String str2 = StringParser.escapeString("aaaa   4a aaaa", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaaaa   4a aaaaa"+ "'", str2.equals("aaaaa   4a aaaaa"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test250"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  #a4##aa4#i#4aa##4a#  ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " "+ "'", str2.equals(" "));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test251"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4a444i444a4#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4a444i444a4#"+ "'", str2.equals("#4a444i444a4#"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test252"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a###a aaaiaaa a###a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a###a aaaiaaa a###a"+ "'", str2.equals("a###a aaaiaaa a###a"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test253"); }


    java.lang.String str2 = StringParser.escapeString("a# 44 #a4#i#4a# 44 #a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a# 44 #a4#i#4a# 44 #a "+ "'", str2.equals(" a# 44 #a4#i#4a# 44 #a "));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test254"); }


    java.lang.String str2 = StringParser.escapeString(" a4##aa4#i#4aa##4a ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  a4##aa4#i#4aa##4a  "+ "'", str2.equals("  a4##aa4#i#4aa##4a  "));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test255"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4#a#aaiaa#a#4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#a"+ "'", str2.equals("4#a"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test256"); }


    java.lang.String str2 = StringParser.escapeString("  ahi!a  ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4  ahi!a  4"+ "'", str2.equals("4  ahi!a  4"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test257"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa 44 #aa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa 44 #aa"+ "'", str2.equals("aa 44 #aa"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test258"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  #4a  ", (int)(short)100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test259"); }


    java.lang.String str2 = StringParser.escapeString("a4i4a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4i4a "+ "'", str2.equals(" a4i4a "));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test260"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa  ##4 aia 4##  aa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa  ##4 aia 4##  aa"+ "'", str2.equals("aa  ##4 aia 4##  aa"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test261"); }


    java.lang.String str2 = StringParser.escapeString("  aa#  #a#i#a#  #aa  ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a  aa#  #a#i#a#  #aa  a"+ "'", str2.equals("a  aa#  #a#i#a#  #aa  a"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test262"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4  4a ", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test263"); }


    java.lang.String str2 = StringParser.escapeString(" 4a#4aaa 4aaahi!aaa4 aaa4#a4 ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 4a#4aaa 4aaahi!aaa4 aaa4#a4 4"+ "'", str2.equals("4 4a#4aaa 4aaahi!aaa4 aaa4#a4 4"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test264"); }


    java.lang.String str2 = StringParser.escapeString("a a  ahi!a  a a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a a  ahi!a  a a "+ "'", str2.equals(" a a  ahi!a  a a "));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test265"); }


    java.lang.String str2 = StringParser.escapeString("a#aa4##a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a#aa4##a#"+ "'", str2.equals("#a#aa4##a#"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test266"); }


    java.lang.String str2 = StringParser.escapeString("4a   44", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44a   444"+ "'", str2.equals("44a   444"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test267"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a ## a#i#a ## a ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a "+ "'", str2.equals("a "));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test268"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aa44aaa4", (int)(short)10, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test269"); }


    java.lang.String str2 = StringParser.escapeString("a#aaa  a  aaa#a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a#aaa  a  aaa#a4"+ "'", str2.equals("4a#aaa  a  aaa#a4"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test270"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaa #  ahi!a  # aaa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa #  ahi!a  # aaa"+ "'", str2.equals("aaa #  ahi!a  # aaa"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test271"); }


    java.lang.String str2 = StringParser.escapeString("44  #4 44", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444  #4 444"+ "'", str2.equals("444  #4 444"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test272"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4 #44#i#44# 4#a", 52, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test273"); }


    java.lang.String str2 = StringParser.escapeString("4a44a a aa#aia#aa a a44a4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4a44a a aa#aia#aa a a44a4a"+ "'", str2.equals("a4a44a a aa#aia#aa a a44a4a"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test274"); }


    java.lang.String str2 = StringParser.escapeString("a4 a 4aa#4#44##a i a##44#4#aa4 a 4a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4 a 4aa#4#44##a i a##44#4#aa4 a 4a "+ "'", str2.equals(" a4 a 4aa#4#44##a i a##44#4#aa4 a 4a "));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test275"); }


    java.lang.String str2 = StringParser.escapeString("#  #a#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #  #a# "+ "'", str2.equals(" #  #a# "));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test276"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a# a", (int)'a', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test277"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4#a##4 aia 4##a#4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a##4"+ "'", str2.equals("#a##4"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test278"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aa4#ahi!a#4aa4", (int)'a', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test279"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a4aa ", (int)(byte)10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test280"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a a#aaiaa#a a ", (int)'4', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test281"); }


    java.lang.String str2 = StringParser.escapeString("#a 444#aia#444 a#", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#a 444#aia#444 a#4"+ "'", str2.equals("4#a 444#aia#444 a#4"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test282"); }


    java.lang.String str2 = StringParser.escapeString("a4a 4aaiaa4 a4a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4a 4aaiaa4 a4a#"+ "'", str2.equals("#a4a 4aaiaa4 a4a#"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test283"); }


    java.lang.String str2 = StringParser.escapeString("a#4# #4aahi!aa4# #4#a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a#4# #4aahi!aa4# #4#a#"+ "'", str2.equals("#a#4# #4aahi!aa4# #4#a#"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test284"); }


    java.lang.String str2 = StringParser.escapeString("aa  ahi!a  aa", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa  ahi!a  aa "+ "'", str2.equals(" aa  ahi!a  aa "));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test285"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"444aa#4aahi!aa4#aa444", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test286"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  44#", 10, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test287"); }


    java.lang.String str2 = StringParser.escapeString(" #a4##aa4#i#4aa##4a# ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a #a4##aa4#i#4aa##4a# a"+ "'", str2.equals("a #a4##aa4#i#4aa##4a# a"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test288"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a4aa4", 100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test289"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44##4#a", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test290"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4#4   i   4#4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#4   i   4#4"+ "'", str2.equals("4#4   i   4#4"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test291"); }


    java.lang.String str2 = StringParser.escapeString("4a4a  ahi!a  a4a4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44a4a  ahi!a  a4a44"+ "'", str2.equals("44a4a  ahi!a  a4a44"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test292"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test293"); }


    java.lang.String str2 = StringParser.escapeString("a a4#a##aa4#i#4aa##a#4a a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a4#a##aa4#i#4aa##a#4a a4"+ "'", str2.equals("4a a4#a##aa4#i#4aa##a#4a a4"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test294"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 #aa4## 4", 0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test295"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4444 ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test296"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44##4 44", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44##4 44"+ "'", str2.equals("44##4 44"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test297"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa#a4 4 aaaiaaa 4 4a#aa", (int)(byte)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test298"); }


    java.lang.String str2 = StringParser.escapeString("  aaa  ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#  aaa  #"+ "'", str2.equals("#  aaa  #"));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test299"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"##4  #4##", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test300"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4##a aaiaa a##4", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test301"); }


    java.lang.String str2 = StringParser.escapeString("4aa#a i a#aa4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44aa#a i a#aa44"+ "'", str2.equals("44aa#a i a#aa44"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test302"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa a#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test303"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#aa a i a aa#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aa a i a aa#"+ "'", str2.equals("#aa a i a aa#"));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test304"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa#4#44##a i a##44#4#aa", (int)'4', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test305"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa#  ahi!a  #aa", (int)(short)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test306"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a a#    4i4    #a a", (int)(byte)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test307"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" aa#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa"+ "'", str2.equals("aa"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test308"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#a# #44 aaaiaaa 44# #a#4", 1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test309"); }


    java.lang.String str2 = StringParser.escapeString("44a##aa4#i#4aa##a44", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#44a##aa4#i#4aa##a44#"+ "'", str2.equals("#44a##aa4#i#4aa##a44#"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test310"); }


    java.lang.String str2 = StringParser.escapeString(" aa4 ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 aa4 4"+ "'", str2.equals("4 aa4 4"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test311"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a aa44aahi!aa44aa a4", (int)(byte)0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test312"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4#aia#4 ", (int)(byte)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test313"); }


    java.lang.String str2 = StringParser.escapeString(" a#aaa44#i#44aaa#a ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a#aaa44#i#44aaa#a a"+ "'", str2.equals("a a#aaa44#i#44aaa#a a"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test314"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"   #4a", 52, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test315"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#444#aa4##444#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#444#aa4##444#"+ "'", str2.equals("#444#aa4##444#"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test316"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4a#a##4 aia 4##a#a4 ", 32, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test317"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4a4aa4#", (int)(short)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test318"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#44##4 ", (int)(byte)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test319"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"444 #aia# 444", (int)(short)100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test320"); }


    java.lang.String str2 = StringParser.escapeString("###aa  #aia#  aa###", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "####aa  #aia#  aa####"+ "'", str2.equals("####aa  #aia#  aa####"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test321"); }


    java.lang.String str2 = StringParser.escapeString("aa aa", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4aa aa4"+ "'", str2.equals("4aa aa4"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test322"); }


    java.lang.String str2 = StringParser.escapeString("#a4aa #aia# aa4a#", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#a4aa #aia# aa4a#4"+ "'", str2.equals("4#a4aa #aia# aa4a#4"));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test323"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" ###4  #4### ", (int)(byte)10, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test324"); }


    java.lang.String str2 = StringParser.escapeString("  4#i#4  ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#  4#i#4  #"+ "'", str2.equals("#  4#i#4  #"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test325"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa 4", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test326"); }


    java.lang.String str2 = StringParser.escapeString("  4# a#i#a #4  ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4  4# a#i#a #4  4"+ "'", str2.equals("4  4# a#i#a #4  4"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test327"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#4a4#i#4a4#4", (int)'#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test328"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a## a#a#i#a#a ##a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "## a"+ "'", str2.equals("## a"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test329"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a aa444#i#444aa a#", (int)(short)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test330"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a  4aa4#", (int)(byte)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test331"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a          a#a", (int)(byte)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test332"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a4#a#ahi!a#a#4a4", 1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test333"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4 ##aaiaa## 4a", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test334"); }


    java.lang.String str2 = StringParser.escapeString("44#aaiaa#44", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444#aaiaa#444"+ "'", str2.equals("444#aaiaa#444"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test335"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44a 4 #44#i#44# 4 a44", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test336"); }


    java.lang.String str2 = StringParser.escapeString("###a aaaiaaa a###", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "####a aaaiaaa a####"+ "'", str2.equals("####a aaaiaaa a####"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test337"); }


    java.lang.String str2 = StringParser.escapeString("4# 4a4 #4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4# 4a4 #4 "+ "'", str2.equals(" 4# 4a4 #4 "));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test338"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4   ahi!a   4a", (int)'4', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test339"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a44#aia#44a", (int)'#', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test340"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aa##a #aa4## a##aa ", (int)(byte)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test341"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a44  44a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a44  44a"+ "'", str2.equals("a44  44a"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test342"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"##4#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##4#"+ "'", str2.equals("##4#"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test343"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a4#44##a  ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4#44##a  "+ "'", str2.equals(" a4#44##a  "));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test344"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa#a4#i#4a#aa", (int)(short)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test345"); }


    java.lang.String str2 = StringParser.escapeString(" # ##4  # ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  # ##4  #  "+ "'", str2.equals("  # ##4  #  "));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test346"); }


    java.lang.String str2 = StringParser.escapeString("a#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa#a"+ "'", str2.equals("aa#a"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test347"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a ## 4 a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a ## 4 a"+ "'", str2.equals("a ## 4 a"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test348"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa4a ##4  a4aa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test349"); }


    java.lang.String str2 = StringParser.escapeString("##4a # a#i#a # a4##", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " ##4a # a#i#a # a4## "+ "'", str2.equals(" ##4a # a#i#a # a4## "));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test350"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4##a", (int)(byte)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test351"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aa#a i a#aa4", (int)(short)100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test352"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#44a#aa4##a44#", (int)(short)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test353"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a 4#aia#4 a", (-1), '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test354"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a##aa4#i#4aa##a#a", 35, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test355"); }


    java.lang.String str2 = StringParser.escapeString("a a#a4a #a4#i#4a# a4a#a a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa a#a4a #a4#i#4a# a4a#a aa"+ "'", str2.equals("aa a#a4a #a4#i#4a# a4a#a aa"));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test356"); }


    java.lang.String str2 = StringParser.escapeString("44hi!44", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 44hi!44 "+ "'", str2.equals(" 44hi!44 "));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test357"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4 aa444#4 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4 aa444#4 "+ "'", str2.equals(" 4 aa444#4 "));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test358"); }


    java.lang.String str2 = StringParser.escapeString("aaa4#  #4aaa", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aaa4#  #4aaa#"+ "'", str2.equals("#aaa4#  #4aaa#"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test359"); }


    java.lang.String str2 = StringParser.escapeString(" #a4#ahi!a#4a# ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# #a4#ahi!a#4a# #"+ "'", str2.equals("# #a4#ahi!a#4a# #"));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test360"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaa aaaahi!aaaa aaa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test361"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"###a aaiaa a###", 97, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test362"); }


    java.lang.String str2 = StringParser.escapeString("4a4#aa44##4 aia 4##44aa#4a4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4a4#aa44##4 aia 4##44aa#4a4#"+ "'", str2.equals("#4a4#aa44##4 aia 4##44aa#4a4#"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test363"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a #4#aa", 10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test364"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"444aaaa444", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test365"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4  4 ", 1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test366"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a4# 4#4#4 #4a ", (int)(short)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test367"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a a#  #a a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a#  #a a"+ "'", str2.equals("a a#  #a a"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test368"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4  a4#aa ##4 aia 4## aa#4a  4", (int)(byte)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test369"); }


    java.lang.String str2 = StringParser.escapeString(" ##a #a## ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 ##a #a## 4"+ "'", str2.equals("4 ##a #a## 4"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test370"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# #aaa  a  aaa# #", 52, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test371"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"444#aaiaa#444", (int)' ', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test372"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  # ##4  #  ", (int)(short)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test373"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##4a # a#i#a # a4##", (int)'a', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test374"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a4a#", (int)' ', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test375"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #4##a i a##4# ", (int)'a', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test376"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44  a#44", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44  a#44"+ "'", str2.equals("44  a#44"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test377"); }


    java.lang.String str2 = StringParser.escapeString("4 # 4 #ahi!a# 4 # 4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44 # 4 #ahi!a# 4 # 44"+ "'", str2.equals("44 # 4 #ahi!a# 4 # 44"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test378"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a  a# a#", (int)(byte)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test379"); }


    java.lang.String str2 = StringParser.escapeString(" ###4#ahi!a#4### ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  ###4#ahi!a#4###  "+ "'", str2.equals("  ###4#ahi!a#4###  "));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test380"); }


    java.lang.String str2 = StringParser.escapeString("4  a4  4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4  a4  4 "+ "'", str2.equals(" 4  a4  4 "));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test381"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#  4a #", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4a "+ "'", str2.equals("  4a "));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test382"); }


    java.lang.String str2 = StringParser.escapeString("44 #4#a i a#4# 44", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#44 #4#a i a#4# 44#"+ "'", str2.equals("#44 #4#a i a#4# 44#"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test383"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a # #4###4 aia 4###4# # a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " # #4###4 a"+ "'", str2.equals(" # #4###4 a"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test384"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a# #44 aaaiaaa 44# #a#a", (int)(byte)10, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test385"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a a aaaiaaa a a#a", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test386"); }


    java.lang.String str2 = StringParser.escapeString("a#44a#aa4##a44#a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a#44a#aa4##a44#a "+ "'", str2.equals(" a#44a#aa4##a44#a "));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test387"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" aa 4aahi!aa4 aa ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa 4aahi!aa4 aa "+ "'", str2.equals(" aa 4aahi!aa4 aa "));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test388"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  # #a4", (int)(short)10, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test389"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  ##4 aia 4##  ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  ##4 aia 4##  "+ "'", str2.equals("  ##4 aia 4##  "));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test390"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#44##", (int)(short)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test391"); }


    java.lang.String str2 = StringParser.escapeString("4#4a#44  i  44#a4#4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44#4a#44  i  44#a4#44"+ "'", str2.equals("44#4a#44  i  44#a4#44"));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test392"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a44 #4#a i a#4# 44a", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test393"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #a# 44 #a4#i#4a# 44 #a# ", (int)(short)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test394"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4#4  #4a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#4  #4a"+ "'", str2.equals("4#4  #4a"));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test395"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4", 1, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test396"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44 4a #a#4 aia 4#a# a4 44", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test397"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #a4a##4a4a# ", (int)(byte)0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test398"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4  # #a4#i#4a# #  4a", 0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test399"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#a#aa#a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a"+ "'", str2.equals("#a"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test400"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#aaa44#i#44aaa#4", (int)(short)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test401"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a4a## a#a4a ", 32, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test402"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##a4aa # 4#4#4 # aa4a##", 32, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test403"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44a#44  i  44#a44", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44a#44  i  44#a44"+ "'", str2.equals("44a#44  i  44#a44"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test404"); }


    java.lang.String str2 = StringParser.escapeString(" a4  a 4a ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# a4  a 4a #"+ "'", str2.equals("# a4  a 4a #"));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test405"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a a44a a", (int)'a', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test406"); }


    java.lang.String str2 = StringParser.escapeString("4#aa44##4 aia 4##44aa#4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4#aa44##4 aia 4##44aa#4 "+ "'", str2.equals(" 4#aa44##4 aia 4##44aa#4 "));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test407"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a4##aa4", (int)'#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test408"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a   4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   "+ "'", str2.equals("   "));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test409"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a# #aa#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#"+ "'", str2.equals("a#"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test410"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a #ahi!a# a", 32, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test411"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#44 #  # 44#", (int)(byte)100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test412"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  a#a i a#a  ", (int)(byte)100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test413"); }


    java.lang.String str2 = StringParser.escapeString("a ## i ## a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a ## i ## a4"+ "'", str2.equals("4a ## i ## a4"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test414"); }


    java.lang.String str2 = StringParser.escapeString("##4a aaaahi!aaaa a4##", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a##4a aaaahi!aaaa a4##a"+ "'", str2.equals("a##4a aaaahi!aaaa a4##a"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test415"); }


    java.lang.String str2 = StringParser.escapeString("a  #4#  #4#  a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa  #4#  #4#  aa"+ "'", str2.equals("aa  #4#  #4#  aa"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test416"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4  # ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4  # "+ "'", str2.equals(" 4  # "));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test417"); }


    java.lang.String str2 = StringParser.escapeString("aa#aaa", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa#aaa "+ "'", str2.equals(" aa#aaa "));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test418"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#44#a ##4  a#44#a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#44#a ##4  a#44#a"+ "'", str2.equals("a#44#a ##4  a#44#a"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test419"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"####a#4 aia 4#a####", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test420"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4 a# ", (int)(short)0, ' ');
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

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test421"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44a#a 4", (int)(byte)0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test422"); }


    java.lang.String str2 = StringParser.escapeString("  #4####aa4##4#  ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a  #4####aa4##4#  a"+ "'", str2.equals("a  #4####aa4##4#  a"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test423"); }


    java.lang.String str2 = StringParser.escapeString("  aa4i4aa  ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#  aa4i4aa  #"+ "'", str2.equals("#  aa4i4aa  #"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test424"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# 4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " "+ "'", str2.equals(" "));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test425"); }


    java.lang.String str2 = StringParser.escapeString("aa#a aa4i4aa a#aa", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa#a aa4i4aa a#aaa"+ "'", str2.equals("aaa#a aa4i4aa a#aaa"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test426"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"   a#ahi!a#a   ", (int)(short)0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test427"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a## #a4#i#4a# ##a#", 32, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test428"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa44aaa44aa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test429"); }


    java.lang.String str2 = StringParser.escapeString(" 4a#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4a# "+ "'", str2.equals("  4a# "));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test430"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"##a##a a##", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test431"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a44a4i4a44a4", (int)(byte)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test432"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44a4   ahi!a   4a44", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test433"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" ## a#44i44#a ## ", (int)'a', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test434"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#  4#a4  #a", 97, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test435"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#aaa#4a#a i a#a4#aaa#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa#"+ "'", str2.equals("aaa#"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test436"); }


    java.lang.String str2 = StringParser.escapeString("4a4 #  # 4#4#4 #  # 4a4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4a4 #  # 4#4#4 #  # 4a4a"+ "'", str2.equals("a4a4 #  # 4#4#4 #  # 4a4a"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test437"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a4 4 aaaiaaa 4 4a#a", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test438"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#aa#  #a#i#a#  #aa#4", (int)(byte)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test439"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"###4#ahi!a#4###", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test440"); }


    java.lang.String str2 = StringParser.escapeString(" aaa aaaiaaa aaa ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  aaa aaaiaaa aaa  "+ "'", str2.equals("  aaa aaaiaaa aaa  "));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test441"); }


    java.lang.String str2 = StringParser.escapeString("  #aa4#  ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#  #aa4#  #"+ "'", str2.equals("#  #aa4#  #"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test442"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a a#a#i#a#a a ", 100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test443"); }


    java.lang.String str2 = StringParser.escapeString("4444#4# # a## #4#4444", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4444#4# # a## #4#4444#"+ "'", str2.equals("#4444#4# # a## #4#4444#"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test444"); }


    java.lang.String str2 = StringParser.escapeString("  4##a a#ahi!a#a a##4  ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a  4##a a#ahi!a#a a##4  a"+ "'", str2.equals("a  4##a a#ahi!a#a a##4  a"));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test445"); }


    java.lang.String str2 = StringParser.escapeString("#  4#4##a#4  #", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #  4#4##a#4  # "+ "'", str2.equals(" #  4#4##a#4  # "));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test446"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# a#4 ## i ## 4#a #", 52, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test447"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4#4 #ahi!a# 4#4#a", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test448"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  # #a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " "+ "'", str2.equals(" "));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test449"); }


    java.lang.String str2 = StringParser.escapeString(" a# a 4aaaiaaa4 a #a ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  a# a 4aaaiaaa4 a #a  "+ "'", str2.equals("  a# a 4aaaiaaa4 a #a  "));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test450"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4aa# 4#aa4a", 100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test451"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a aaa4#aa a", (-1), '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test452"); }


    java.lang.String str2 = StringParser.escapeString("          ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#          #"+ "'", str2.equals("#          #"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test453"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a #i# a", (int)(byte)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test454"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4##aa", (-1), ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test455"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4 44 a #  ahi!a  # a 44 4a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 44 a #  ahi!a  # a 44 4a"+ "'", str2.equals("a4 44 a #  ahi!a  # a 44 4a"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test456"); }


    java.lang.String str2 = StringParser.escapeString("444aa#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 444aa# "+ "'", str2.equals(" 444aa# "));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test457"); }


    java.lang.String str2 = StringParser.escapeString(" a#a  a#a ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  a#a  a#a  "+ "'", str2.equals("  a#a  a#a  "));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test458"); }


    java.lang.String str2 = StringParser.escapeString("a#aa ##4a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a#aa ##4a#"+ "'", str2.equals("#a#aa ##4a#"));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test459"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#aaa4# a##4aaa#", 97, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test460"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a ## a#i#a ## a#", 52, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test461"); }


    java.lang.String str2 = StringParser.escapeString("a4a a  a a4a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a4a a  a a4a4"+ "'", str2.equals("4a4a a  a a4a4"));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test462"); }


    java.lang.String str2 = StringParser.escapeString(" 44  ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a 44  a"+ "'", str2.equals("a 44  a"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test463"); }


    java.lang.String str2 = StringParser.escapeString("##aa# 44aahi!aa44 #aa##", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " ##aa# 44aahi!aa44 #aa## "+ "'", str2.equals(" ##aa# 44aahi!aa44 #aa## "));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test464"); }


    java.lang.String str2 = StringParser.escapeString(" a#a4#i#4a#a ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a#a4#i#4a#a a"+ "'", str2.equals("a a#a4#i#4a#a a"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test465"); }


    java.lang.String str2 = StringParser.escapeString(" a4a4# a ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a4a4# a a"+ "'", str2.equals("a a4a4# a a"));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test466"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a a ##4 aia 4## a a ", (int)(byte)0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test467"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" # 44aahi!aa44 # ", 100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test468"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# aa#4aahi!aa4#aa #", 32, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test469"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a44aa ", 97, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test470"); }


    java.lang.String str2 = StringParser.escapeString("##a  #a4#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " ##a  #a4# "+ "'", str2.equals(" ##a  #a4# "));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test471"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# hi! #", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# hi! #"+ "'", str2.equals("# hi! #"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test472"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aaa4a ##4 aia 4## a4aaa ", (int)(byte)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test473"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4 a  #4aahi!aa4#  a 4#", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test474"); }


    java.lang.String str2 = StringParser.escapeString("  #a#ahi!a#a#  ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#  #a#ahi!a#a#  #"+ "'", str2.equals("#  #a#ahi!a#a#  #"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test475"); }


    java.lang.String str2 = StringParser.escapeString(" 44hi!44 ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a 44hi!44 a"+ "'", str2.equals("a 44hi!44 a"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test476"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##a 4 a  a 4 a##", 35, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test477"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4#aaiaa#4 ", (-1), ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test478"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#aa 4aaahi!aaa4 aa#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa 4aaahi!aaa4 aa"+ "'", str2.equals("aa 4aaahi!aaa4 aa"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test479"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" # #a4#i#4a# # ", (int)'4', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test480"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4aa", (int)' ', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test481"); }


    java.lang.String str2 = StringParser.escapeString("a#a  #aia#  a#a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa#a  #aia#  a#aa"+ "'", str2.equals("aa#a  #aia#  a#aa"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test482"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" # a#    4 ", 97, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test483"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4#aa44##4 aia 4##44aa#4 ", (int)(byte)10, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test484"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"## a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "## a"+ "'", str2.equals("## a"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test485"); }


    java.lang.String str2 = StringParser.escapeString("4444  4444", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44444  44444"+ "'", str2.equals("44444  44444"));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test486"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a4 44aa4#44 4a4", (int)'#', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test487"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#  ##4#a i a#4##  #", (int)(short)100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test488"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# hi! #", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test489"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##a  a##", (int)'4', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test490"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4444 ", 10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test491"); }


    java.lang.String str2 = StringParser.escapeString("  aa#  #a#i#a#  #aa  ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4  aa#  #a#i#a#  #aa  4"+ "'", str2.equals("4  aa#  #a#i#a#  #aa  4"));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test492"); }


    java.lang.String str2 = StringParser.escapeString("##4aa4##", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " ##4aa4## "+ "'", str2.equals(" ##4aa4## "));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test493"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaa ##aaiaa## aaa", (int)'a', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test494"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a# ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a# "+ "'", str2.equals("a# "));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test495"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4444  4444", (int)(byte)0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test496"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  ##a # a## a##  ", (-1), 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test497"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44 # 4 #ahi!a# 4 # 44", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test498"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4a 44#", (int)' ', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test499"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a a44a a#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a44a a"+ "'", str2.equals("a a44a a"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest33.test500"); }


    java.lang.String str2 = StringParser.escapeString("4a# a #a##aa4#i#4aa##a# a #a4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4a# a #a##aa4#i#4aa##a# a #a4 "+ "'", str2.equals(" 4a# a #a##aa4#i#4aa##a# a #a4 "));

  }

}
