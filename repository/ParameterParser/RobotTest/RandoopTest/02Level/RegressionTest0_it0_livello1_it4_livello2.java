
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }


    ParameterParser parameterParser0 = new ParameterParser();
    ParameterParser parameterParser1 = new ParameterParser();
    ParameterParser parameterParser2 = new ParameterParser();
    char[] char_array8 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map9 = parameterParser2.parse("", char_array8);
    char[] char_array15 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map16 = parameterParser2.parse("", char_array15);
    java.util.Map map20 = parameterParser1.parse(char_array15, 100, 0, '4');
    java.util.Map map22 = parameterParser0.parse(char_array15, '4');
    ParameterParser parameterParser24 = new ParameterParser();
    parameterParser24.setLowerCaseNames(true);
    java.util.Map map29 = parameterParser24.parse("", '4');
    char[] char_array34 = new char[] { '4', '#', ' ' };
    java.util.Map map35 = parameterParser24.parse("", char_array34);
    ParameterParser parameterParser36 = new ParameterParser();
    parameterParser36.setLowerCaseNames(true);
    java.util.Map map41 = parameterParser36.parse("", '4');
    char[] char_array46 = new char[] { '4', '#', ' ' };
    java.util.Map map47 = parameterParser36.parse("", char_array46);
    java.util.Map map49 = parameterParser24.parse(char_array46, '4');
    java.util.Map map50 = parameterParser0.parse("", char_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map50);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    boolean b8 = parameterParser0.isLowerCaseNames();
    boolean b9 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    java.util.Map map5 = parameterParser0.parse("", '4');
    ParameterParser parameterParser6 = new ParameterParser();
    ParameterParser parameterParser7 = new ParameterParser();
    ParameterParser parameterParser8 = new ParameterParser();
    char[] char_array14 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map15 = parameterParser8.parse("", char_array14);
    char[] char_array21 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map22 = parameterParser8.parse("", char_array21);
    java.util.Map map26 = parameterParser7.parse(char_array21, 100, 0, '4');
    java.util.Map map28 = parameterParser6.parse(char_array21, '4');
    java.util.Map map30 = parameterParser0.parse(char_array21, '#');
    ParameterParser parameterParser31 = new ParameterParser();
    char[] char_array37 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map38 = parameterParser31.parse("", char_array37);
    char[] char_array44 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map45 = parameterParser31.parse("", char_array44);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map map49 = parameterParser0.parse(char_array44, (int)(short)0, 100, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map45);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    boolean b8 = parameterParser0.isLowerCaseNames();
    java.util.Map map11 = parameterParser0.parse("hi!", 'a');
    ParameterParser parameterParser13 = new ParameterParser();
    ParameterParser parameterParser14 = new ParameterParser();
    char[] char_array20 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map21 = parameterParser14.parse("", char_array20);
    char[] char_array27 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map28 = parameterParser14.parse("", char_array27);
    java.util.Map map32 = parameterParser13.parse(char_array27, 100, 0, '4');
    java.util.Map map33 = parameterParser0.parse("hi!", char_array27);
    boolean b34 = parameterParser0.isLowerCaseNames();
    parameterParser0.setLowerCaseNames(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    ParameterParser parameterParser0 = new ParameterParser();
    boolean b1 = parameterParser0.isLowerCaseNames();
    boolean b2 = parameterParser0.isLowerCaseNames();
    java.util.Map map5 = parameterParser0.parse("", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map5);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    ParameterParser parameterParser8 = new ParameterParser();
    parameterParser8.setLowerCaseNames(true);
    java.util.Map map13 = parameterParser8.parse("", '4');
    ParameterParser parameterParser14 = new ParameterParser();
    ParameterParser parameterParser15 = new ParameterParser();
    ParameterParser parameterParser16 = new ParameterParser();
    char[] char_array22 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map23 = parameterParser16.parse("", char_array22);
    char[] char_array29 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map30 = parameterParser16.parse("", char_array29);
    java.util.Map map34 = parameterParser15.parse(char_array29, 100, 0, '4');
    java.util.Map map36 = parameterParser14.parse(char_array29, '4');
    java.util.Map map38 = parameterParser8.parse(char_array29, '#');
    java.util.Map map40 = parameterParser0.parse(char_array29, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map40);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    java.util.Map map10 = parameterParser0.parse("", '#');
    boolean b11 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    ParameterParser parameterParser0 = new ParameterParser();
    ParameterParser parameterParser1 = new ParameterParser();
    char[] char_array7 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map8 = parameterParser1.parse("", char_array7);
    char[] char_array14 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map15 = parameterParser1.parse("", char_array14);
    java.util.Map map19 = parameterParser0.parse(char_array14, 100, 0, '4');
    boolean b20 = parameterParser0.isLowerCaseNames();
    parameterParser0.setLowerCaseNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    ParameterParser parameterParser0 = new ParameterParser();
    ParameterParser parameterParser1 = new ParameterParser();
    char[] char_array7 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map8 = parameterParser1.parse("", char_array7);
    char[] char_array14 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map15 = parameterParser1.parse("", char_array14);
    java.util.Map map19 = parameterParser0.parse(char_array14, 100, 0, '4');
    ParameterParser parameterParser20 = new ParameterParser();
    ParameterParser parameterParser21 = new ParameterParser();
    ParameterParser parameterParser22 = new ParameterParser();
    char[] char_array28 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map29 = parameterParser22.parse("", char_array28);
    char[] char_array35 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map36 = parameterParser22.parse("", char_array35);
    java.util.Map map40 = parameterParser21.parse(char_array35, 100, 0, '4');
    java.util.Map map42 = parameterParser20.parse(char_array35, '4');
    java.util.Map map46 = parameterParser0.parse(char_array35, 0, (-1), '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map46);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    java.util.Map map5 = parameterParser0.parse("", '4');
    boolean b6 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser3 = new ParameterParser();
    ParameterParser parameterParser4 = new ParameterParser();
    ParameterParser parameterParser5 = new ParameterParser();
    char[] char_array11 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map12 = parameterParser5.parse("", char_array11);
    char[] char_array18 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map19 = parameterParser5.parse("", char_array18);
    java.util.Map map23 = parameterParser4.parse(char_array18, 100, 0, '4');
    java.util.Map map25 = parameterParser3.parse(char_array18, '4');
    java.util.Map map29 = parameterParser0.parse(char_array18, (int)'4', (int)' ', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map29);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    java.util.Map map5 = parameterParser0.parse("", '4');
    ParameterParser parameterParser6 = new ParameterParser();
    ParameterParser parameterParser7 = new ParameterParser();
    ParameterParser parameterParser8 = new ParameterParser();
    char[] char_array14 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map15 = parameterParser8.parse("", char_array14);
    char[] char_array21 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map22 = parameterParser8.parse("", char_array21);
    java.util.Map map26 = parameterParser7.parse(char_array21, 100, 0, '4');
    java.util.Map map28 = parameterParser6.parse(char_array21, '4');
    java.util.Map map30 = parameterParser0.parse(char_array21, '#');
    parameterParser0.setLowerCaseNames(false);
    ParameterParser parameterParser33 = new ParameterParser();
    char[] char_array39 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map40 = parameterParser33.parse("", char_array39);
    boolean b41 = parameterParser33.isLowerCaseNames();
    java.util.Map map44 = parameterParser33.parse("hi!", 'a');
    ParameterParser parameterParser45 = new ParameterParser();
    ParameterParser parameterParser46 = new ParameterParser();
    ParameterParser parameterParser47 = new ParameterParser();
    char[] char_array53 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map54 = parameterParser47.parse("", char_array53);
    char[] char_array60 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map61 = parameterParser47.parse("", char_array60);
    java.util.Map map65 = parameterParser46.parse(char_array60, 100, 0, '4');
    java.util.Map map67 = parameterParser45.parse(char_array60, '4');
    java.util.Map map69 = parameterParser33.parse(char_array60, ' ');
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map map73 = parameterParser0.parse(char_array60, (int)(short)0, (int)'#', '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map69);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    ParameterParser parameterParser0 = new ParameterParser();
    ParameterParser parameterParser1 = new ParameterParser();
    char[] char_array7 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map8 = parameterParser1.parse("", char_array7);
    char[] char_array14 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map15 = parameterParser1.parse("", char_array14);
    java.util.Map map19 = parameterParser0.parse(char_array14, 100, 0, '4');
    boolean b20 = parameterParser0.isLowerCaseNames();
    ParameterParser parameterParser22 = new ParameterParser();
    char[] char_array28 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map29 = parameterParser22.parse("", char_array28);
    char[] char_array35 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map36 = parameterParser22.parse("", char_array35);
    parameterParser22.setLowerCaseNames(false);
    ParameterParser parameterParser39 = new ParameterParser();
    char[] char_array45 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map46 = parameterParser39.parse("", char_array45);
    boolean b47 = parameterParser39.isLowerCaseNames();
    java.util.Map map50 = parameterParser39.parse("hi!", 'a');
    ParameterParser parameterParser51 = new ParameterParser();
    ParameterParser parameterParser52 = new ParameterParser();
    ParameterParser parameterParser53 = new ParameterParser();
    char[] char_array59 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map60 = parameterParser53.parse("", char_array59);
    char[] char_array66 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map67 = parameterParser53.parse("", char_array66);
    java.util.Map map71 = parameterParser52.parse(char_array66, 100, 0, '4');
    java.util.Map map73 = parameterParser51.parse(char_array66, '4');
    java.util.Map map75 = parameterParser39.parse(char_array66, ' ');
    java.util.Map map79 = parameterParser22.parse(char_array66, (int)'#', (int)(short)1, 'a');
    java.util.Map map80 = parameterParser0.parse("", char_array66);
    java.util.Map map83 = parameterParser0.parse("", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map83);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    ParameterParser parameterParser0 = new ParameterParser();
    java.util.Map map3 = parameterParser0.parse("", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map3);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    java.util.Map map5 = parameterParser0.parse("", '4');
    char[] char_array10 = new char[] { '4', '#', ' ' };
    java.util.Map map11 = parameterParser0.parse("", char_array10);
    boolean b12 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    ParameterParser parameterParser0 = new ParameterParser();
    ParameterParser parameterParser1 = new ParameterParser();
    char[] char_array7 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map8 = parameterParser1.parse("", char_array7);
    char[] char_array14 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map15 = parameterParser1.parse("", char_array14);
    java.util.Map map19 = parameterParser0.parse(char_array14, 100, 0, '4');
    java.util.Map map22 = parameterParser0.parse("hi!", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    char[] char_array13 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map14 = parameterParser0.parse("", char_array13);
    parameterParser0.setLowerCaseNames(false);
    ParameterParser parameterParser17 = new ParameterParser();
    char[] char_array23 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map24 = parameterParser17.parse("", char_array23);
    boolean b25 = parameterParser17.isLowerCaseNames();
    java.util.Map map28 = parameterParser17.parse("hi!", 'a');
    ParameterParser parameterParser29 = new ParameterParser();
    ParameterParser parameterParser30 = new ParameterParser();
    ParameterParser parameterParser31 = new ParameterParser();
    char[] char_array37 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map38 = parameterParser31.parse("", char_array37);
    char[] char_array44 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map45 = parameterParser31.parse("", char_array44);
    java.util.Map map49 = parameterParser30.parse(char_array44, 100, 0, '4');
    java.util.Map map51 = parameterParser29.parse(char_array44, '4');
    java.util.Map map53 = parameterParser17.parse(char_array44, ' ');
    java.util.Map map57 = parameterParser0.parse(char_array44, (int)'#', (int)(short)1, 'a');
    boolean b58 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    boolean b8 = parameterParser0.isLowerCaseNames();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser11 = new ParameterParser();
    parameterParser11.setLowerCaseNames(true);
    java.util.Map map16 = parameterParser11.parse("", '4');
    char[] char_array21 = new char[] { '4', '#', ' ' };
    java.util.Map map22 = parameterParser11.parse("", char_array21);
    ParameterParser parameterParser23 = new ParameterParser();
    parameterParser23.setLowerCaseNames(true);
    java.util.Map map28 = parameterParser23.parse("", '4');
    char[] char_array33 = new char[] { '4', '#', ' ' };
    java.util.Map map34 = parameterParser23.parse("", char_array33);
    java.util.Map map36 = parameterParser11.parse(char_array33, '4');
    java.util.Map map40 = parameterParser0.parse(char_array33, (int)'4', (int)(short)-1, 'a');
    char[] char_array41 = null;
    java.util.Map map43 = parameterParser0.parse(char_array41, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    boolean b8 = parameterParser0.isLowerCaseNames();
    java.util.Map map11 = parameterParser0.parse("hi!", 'a');
    java.util.Map map14 = parameterParser0.parse("", '#');
    boolean b15 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    ParameterParser parameterParser0 = new ParameterParser();
    boolean b1 = parameterParser0.isLowerCaseNames();
    java.util.Map map4 = parameterParser0.parse("hi!", 'a');
    ParameterParser parameterParser5 = new ParameterParser();
    parameterParser5.setLowerCaseNames(true);
    java.util.Map map10 = parameterParser5.parse("", '4');
    char[] char_array15 = new char[] { '4', '#', ' ' };
    java.util.Map map16 = parameterParser5.parse("", char_array15);
    ParameterParser parameterParser17 = new ParameterParser();
    parameterParser17.setLowerCaseNames(true);
    java.util.Map map22 = parameterParser17.parse("", '4');
    char[] char_array27 = new char[] { '4', '#', ' ' };
    java.util.Map map28 = parameterParser17.parse("", char_array27);
    java.util.Map map30 = parameterParser5.parse(char_array27, '4');
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map map34 = parameterParser0.parse(char_array27, (int)'4', (int)'a', '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map30);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    boolean b8 = parameterParser0.isLowerCaseNames();
    java.util.Map map11 = parameterParser0.parse("hi!", 'a');
    ParameterParser parameterParser12 = new ParameterParser();
    ParameterParser parameterParser13 = new ParameterParser();
    ParameterParser parameterParser14 = new ParameterParser();
    char[] char_array20 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map21 = parameterParser14.parse("", char_array20);
    char[] char_array27 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map28 = parameterParser14.parse("", char_array27);
    java.util.Map map32 = parameterParser13.parse(char_array27, 100, 0, '4');
    java.util.Map map34 = parameterParser12.parse(char_array27, '4');
    java.util.Map map36 = parameterParser0.parse(char_array27, ' ');
    ParameterParser parameterParser37 = new ParameterParser();
    parameterParser37.setLowerCaseNames(true);
    java.util.Map map42 = parameterParser37.parse("", '4');
    char[] char_array47 = new char[] { '4', '#', ' ' };
    java.util.Map map48 = parameterParser37.parse("", char_array47);
    java.util.Map map50 = parameterParser0.parse(char_array47, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map50);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser4 = new ParameterParser();
    char[] char_array10 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map11 = parameterParser4.parse("", char_array10);
    boolean b12 = parameterParser4.isLowerCaseNames();
    java.util.Map map15 = parameterParser4.parse("hi!", 'a');
    ParameterParser parameterParser16 = new ParameterParser();
    ParameterParser parameterParser17 = new ParameterParser();
    ParameterParser parameterParser18 = new ParameterParser();
    char[] char_array24 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map25 = parameterParser18.parse("", char_array24);
    char[] char_array31 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map32 = parameterParser18.parse("", char_array31);
    java.util.Map map36 = parameterParser17.parse(char_array31, 100, 0, '4');
    java.util.Map map38 = parameterParser16.parse(char_array31, '4');
    java.util.Map map40 = parameterParser4.parse(char_array31, ' ');
    java.util.Map map41 = parameterParser0.parse("hi!", char_array31);
    ParameterParser parameterParser42 = new ParameterParser();
    ParameterParser parameterParser43 = new ParameterParser();
    ParameterParser parameterParser44 = new ParameterParser();
    char[] char_array50 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map51 = parameterParser44.parse("", char_array50);
    char[] char_array57 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map58 = parameterParser44.parse("", char_array57);
    java.util.Map map62 = parameterParser43.parse(char_array57, 100, 0, '4');
    java.util.Map map64 = parameterParser42.parse(char_array57, '4');
    java.util.Map map66 = parameterParser0.parse(char_array57, '#');
    boolean b67 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    boolean b8 = parameterParser0.isLowerCaseNames();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser11 = new ParameterParser();
    parameterParser11.setLowerCaseNames(true);
    java.util.Map map16 = parameterParser11.parse("", '4');
    char[] char_array21 = new char[] { '4', '#', ' ' };
    java.util.Map map22 = parameterParser11.parse("", char_array21);
    ParameterParser parameterParser23 = new ParameterParser();
    parameterParser23.setLowerCaseNames(true);
    java.util.Map map28 = parameterParser23.parse("", '4');
    char[] char_array33 = new char[] { '4', '#', ' ' };
    java.util.Map map34 = parameterParser23.parse("", char_array33);
    java.util.Map map36 = parameterParser11.parse(char_array33, '4');
    java.util.Map map40 = parameterParser0.parse(char_array33, (int)'4', (int)(short)-1, 'a');
    char[] char_array42 = null;
    java.util.Map map43 = parameterParser0.parse("", char_array42);
    java.util.Map map46 = parameterParser0.parse("hi!", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map46);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    parameterParser0.setLowerCaseNames(true);
    java.util.Map map7 = parameterParser0.parse("hi!", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    ParameterParser parameterParser9 = new ParameterParser();
    char[] char_array15 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map16 = parameterParser9.parse("", char_array15);
    boolean b17 = parameterParser9.isLowerCaseNames();
    java.util.Map map20 = parameterParser9.parse("hi!", 'a');
    ParameterParser parameterParser21 = new ParameterParser();
    ParameterParser parameterParser22 = new ParameterParser();
    ParameterParser parameterParser23 = new ParameterParser();
    char[] char_array29 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map30 = parameterParser23.parse("", char_array29);
    char[] char_array36 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map37 = parameterParser23.parse("", char_array36);
    java.util.Map map41 = parameterParser22.parse(char_array36, 100, 0, '4');
    java.util.Map map43 = parameterParser21.parse(char_array36, '4');
    java.util.Map map45 = parameterParser9.parse(char_array36, ' ');
    java.util.Map map46 = parameterParser0.parse("hi!", char_array36);
    java.util.Map map49 = parameterParser0.parse("", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map49);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    char[] char_array13 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map14 = parameterParser0.parse("", char_array13);
    java.util.Map map17 = parameterParser0.parse("hi!", '#');
    char[] char_array18 = null;
    java.util.Map map20 = parameterParser0.parse(char_array18, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    ParameterParser parameterParser0 = new ParameterParser();
    ParameterParser parameterParser1 = new ParameterParser();
    ParameterParser parameterParser2 = new ParameterParser();
    char[] char_array8 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map9 = parameterParser2.parse("", char_array8);
    char[] char_array15 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map16 = parameterParser2.parse("", char_array15);
    java.util.Map map20 = parameterParser1.parse(char_array15, 100, 0, '4');
    java.util.Map map22 = parameterParser0.parse(char_array15, '4');
    boolean b23 = parameterParser0.isLowerCaseNames();
    ParameterParser parameterParser24 = new ParameterParser();
    parameterParser24.setLowerCaseNames(true);
    java.util.Map map29 = parameterParser24.parse("", '4');
    ParameterParser parameterParser30 = new ParameterParser();
    ParameterParser parameterParser31 = new ParameterParser();
    ParameterParser parameterParser32 = new ParameterParser();
    char[] char_array38 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map39 = parameterParser32.parse("", char_array38);
    char[] char_array45 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map46 = parameterParser32.parse("", char_array45);
    java.util.Map map50 = parameterParser31.parse(char_array45, 100, 0, '4');
    java.util.Map map52 = parameterParser30.parse(char_array45, '4');
    java.util.Map map54 = parameterParser24.parse(char_array45, '#');
    ParameterParser parameterParser56 = new ParameterParser();
    ParameterParser parameterParser57 = new ParameterParser();
    ParameterParser parameterParser58 = new ParameterParser();
    char[] char_array64 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map65 = parameterParser58.parse("", char_array64);
    char[] char_array71 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map72 = parameterParser58.parse("", char_array71);
    java.util.Map map76 = parameterParser57.parse(char_array71, 100, 0, '4');
    java.util.Map map78 = parameterParser56.parse(char_array71, '4');
    java.util.Map map79 = parameterParser24.parse("hi!", char_array71);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map map83 = parameterParser0.parse(char_array71, (int)' ', (int)'#', '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map79);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array6 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map7 = parameterParser0.parse("", char_array6);
    char[] char_array13 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map14 = parameterParser0.parse("", char_array13);
    parameterParser0.setLowerCaseNames(false);
    ParameterParser parameterParser17 = new ParameterParser();
    char[] char_array23 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map24 = parameterParser17.parse("", char_array23);
    boolean b25 = parameterParser17.isLowerCaseNames();
    java.util.Map map28 = parameterParser17.parse("hi!", 'a');
    ParameterParser parameterParser29 = new ParameterParser();
    ParameterParser parameterParser30 = new ParameterParser();
    ParameterParser parameterParser31 = new ParameterParser();
    char[] char_array37 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map38 = parameterParser31.parse("", char_array37);
    char[] char_array44 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map45 = parameterParser31.parse("", char_array44);
    java.util.Map map49 = parameterParser30.parse(char_array44, 100, 0, '4');
    java.util.Map map51 = parameterParser29.parse(char_array44, '4');
    java.util.Map map53 = parameterParser17.parse(char_array44, ' ');
    java.util.Map map57 = parameterParser0.parse(char_array44, (int)'#', (int)(short)1, 'a');
    ParameterParser parameterParser58 = new ParameterParser();
    char[] char_array64 = new char[] { ' ', '#', '4', '4' };
    java.util.Map map65 = parameterParser58.parse("", char_array64);
    char[] char_array71 = new char[] { '#', ' ', 'a', ' ' };
    java.util.Map map72 = parameterParser58.parse("", char_array71);
    java.util.Map map76 = parameterParser0.parse(char_array71, 0, (int)(byte)0, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map76);

  }

}
