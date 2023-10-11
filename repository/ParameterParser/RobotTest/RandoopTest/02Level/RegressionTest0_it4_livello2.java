
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
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser8 = new ParameterParser();
    parameterParser8.setLowerCaseNames(true);
    char[] char_array12 = new char[] { '4' };
    java.util.Map map14 = parameterParser8.parse(char_array12, '4');
    java.util.Map map15 = parameterParser0.parse("hi!", char_array12);
    java.util.Map map18 = parameterParser0.parse("", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map18);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser8 = new ParameterParser();
    parameterParser8.setLowerCaseNames(true);
    char[] char_array12 = new char[] { '4' };
    java.util.Map map14 = parameterParser8.parse(char_array12, '4');
    java.util.Map map15 = parameterParser0.parse("hi!", char_array12);
    parameterParser0.setLowerCaseNames(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser3 = new ParameterParser();
    parameterParser3.setLowerCaseNames(true);
    char[] char_array7 = new char[] { '4' };
    java.util.Map map9 = parameterParser3.parse(char_array7, '4');
    java.util.Map map13 = parameterParser0.parse(char_array7, (int)(short)1, (int)(byte)0, '4');
    char[] char_array16 = new char[] { ' ' };
    java.util.Map map17 = parameterParser0.parse("hi!", char_array16);
    java.util.Map map20 = parameterParser0.parse("", '4');
    char[] char_array21 = new char[] {  };
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map map25 = parameterParser0.parse(char_array21, 10, (int)'4', '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array21);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser8 = new ParameterParser();
    parameterParser8.setLowerCaseNames(true);
    boolean b11 = parameterParser8.isLowerCaseNames();
    java.util.Map map14 = parameterParser8.parse("", ' ');
    ParameterParser parameterParser16 = new ParameterParser();
    parameterParser16.setLowerCaseNames(true);
    char[] char_array20 = new char[] { '4' };
    java.util.Map map22 = parameterParser16.parse(char_array20, '4');
    java.util.Map map23 = parameterParser8.parse("hi!", char_array20);
    java.util.Map map24 = parameterParser0.parse("", char_array20);
    boolean b25 = parameterParser0.isLowerCaseNames();
    java.util.Map map28 = parameterParser0.parse("hi!", '#');
    java.util.Map map31 = parameterParser0.parse("hi!", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map31);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    ParameterParser parameterParser29 = new ParameterParser();
    parameterParser29.setLowerCaseNames(true);
    char[] char_array33 = new char[] { '4' };
    java.util.Map map35 = parameterParser29.parse(char_array33, '4');
    ParameterParser parameterParser36 = new ParameterParser();
    parameterParser36.setLowerCaseNames(true);
    ParameterParser parameterParser39 = new ParameterParser();
    parameterParser39.setLowerCaseNames(true);
    char[] char_array43 = new char[] { '4' };
    java.util.Map map45 = parameterParser39.parse(char_array43, '4');
    java.util.Map map49 = parameterParser36.parse(char_array43, (int)(short)1, (int)(byte)0, '4');
    char[] char_array52 = new char[] { ' ' };
    java.util.Map map53 = parameterParser36.parse("hi!", char_array52);
    java.util.Map map57 = parameterParser29.parse(char_array52, 100, (int)(byte)100, '#');
    ParameterParser parameterParser59 = new ParameterParser();
    parameterParser59.setLowerCaseNames(true);
    ParameterParser parameterParser62 = new ParameterParser();
    parameterParser62.setLowerCaseNames(true);
    char[] char_array66 = new char[] { '4' };
    java.util.Map map68 = parameterParser62.parse(char_array66, '4');
    java.util.Map map72 = parameterParser59.parse(char_array66, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map73 = parameterParser29.parse("", char_array66);
    ParameterParser parameterParser74 = new ParameterParser();
    parameterParser74.setLowerCaseNames(true);
    ParameterParser parameterParser77 = new ParameterParser();
    parameterParser77.setLowerCaseNames(true);
    char[] char_array81 = new char[] { '4' };
    java.util.Map map83 = parameterParser77.parse(char_array81, '4');
    java.util.Map map87 = parameterParser74.parse(char_array81, (int)(short)1, (int)(byte)0, '4');
    char[] char_array90 = new char[] { ' ' };
    java.util.Map map91 = parameterParser74.parse("hi!", char_array90);
    java.util.Map map93 = parameterParser29.parse(char_array90, '4');
    java.util.Map map95 = parameterParser0.parse(char_array90, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map95);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }


    ParameterParser parameterParser0 = new ParameterParser();
    java.util.Map map3 = parameterParser0.parse("", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map3);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array2 = null;
    java.util.Map map3 = parameterParser0.parse("", char_array2);
    boolean b4 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    ParameterParser parameterParser29 = new ParameterParser();
    parameterParser29.setLowerCaseNames(true);
    char[] char_array33 = new char[] { '4' };
    java.util.Map map35 = parameterParser29.parse(char_array33, '4');
    ParameterParser parameterParser36 = new ParameterParser();
    parameterParser36.setLowerCaseNames(true);
    ParameterParser parameterParser39 = new ParameterParser();
    parameterParser39.setLowerCaseNames(true);
    char[] char_array43 = new char[] { '4' };
    java.util.Map map45 = parameterParser39.parse(char_array43, '4');
    java.util.Map map49 = parameterParser36.parse(char_array43, (int)(short)1, (int)(byte)0, '4');
    char[] char_array52 = new char[] { ' ' };
    java.util.Map map53 = parameterParser36.parse("hi!", char_array52);
    java.util.Map map57 = parameterParser29.parse(char_array52, 100, (int)(byte)100, '#');
    ParameterParser parameterParser59 = new ParameterParser();
    parameterParser59.setLowerCaseNames(true);
    ParameterParser parameterParser62 = new ParameterParser();
    parameterParser62.setLowerCaseNames(true);
    char[] char_array66 = new char[] { '4' };
    java.util.Map map68 = parameterParser62.parse(char_array66, '4');
    java.util.Map map72 = parameterParser59.parse(char_array66, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map73 = parameterParser29.parse("", char_array66);
    java.util.Map map75 = parameterParser0.parse(char_array66, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map75);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("hi!", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    ParameterParser parameterParser30 = new ParameterParser();
    parameterParser30.setLowerCaseNames(true);
    ParameterParser parameterParser33 = new ParameterParser();
    parameterParser33.setLowerCaseNames(true);
    char[] char_array37 = new char[] { '4' };
    java.util.Map map39 = parameterParser33.parse(char_array37, '4');
    java.util.Map map43 = parameterParser30.parse(char_array37, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map44 = parameterParser0.parse("", char_array37);
    ParameterParser parameterParser45 = new ParameterParser();
    parameterParser45.setLowerCaseNames(true);
    char[] char_array49 = new char[] { '4' };
    java.util.Map map51 = parameterParser45.parse(char_array49, '4');
    ParameterParser parameterParser52 = new ParameterParser();
    parameterParser52.setLowerCaseNames(true);
    ParameterParser parameterParser55 = new ParameterParser();
    parameterParser55.setLowerCaseNames(true);
    char[] char_array59 = new char[] { '4' };
    java.util.Map map61 = parameterParser55.parse(char_array59, '4');
    java.util.Map map65 = parameterParser52.parse(char_array59, (int)(short)1, (int)(byte)0, '4');
    char[] char_array68 = new char[] { ' ' };
    java.util.Map map69 = parameterParser52.parse("hi!", char_array68);
    java.util.Map map73 = parameterParser45.parse(char_array68, 100, (int)(byte)100, '#');
    ParameterParser parameterParser75 = new ParameterParser();
    parameterParser75.setLowerCaseNames(true);
    char[] char_array79 = new char[] { '4' };
    java.util.Map map81 = parameterParser75.parse(char_array79, '4');
    boolean b82 = parameterParser75.isLowerCaseNames();
    char[] char_array83 = new char[] {  };
    java.util.Map map85 = parameterParser75.parse(char_array83, ' ');
    java.util.Map map86 = parameterParser45.parse("", char_array83);
    java.util.Map map90 = parameterParser0.parse(char_array83, (int)(short)10, (-1), 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map90);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    ParameterParser parameterParser30 = new ParameterParser();
    parameterParser30.setLowerCaseNames(true);
    ParameterParser parameterParser33 = new ParameterParser();
    parameterParser33.setLowerCaseNames(true);
    char[] char_array37 = new char[] { '4' };
    java.util.Map map39 = parameterParser33.parse(char_array37, '4');
    java.util.Map map43 = parameterParser30.parse(char_array37, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map44 = parameterParser0.parse("", char_array37);
    parameterParser0.setLowerCaseNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    ParameterParser parameterParser30 = new ParameterParser();
    parameterParser30.setLowerCaseNames(true);
    ParameterParser parameterParser33 = new ParameterParser();
    parameterParser33.setLowerCaseNames(true);
    char[] char_array37 = new char[] { '4' };
    java.util.Map map39 = parameterParser33.parse(char_array37, '4');
    java.util.Map map43 = parameterParser30.parse(char_array37, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map44 = parameterParser0.parse("", char_array37);
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser48 = new ParameterParser();
    ParameterParser parameterParser50 = new ParameterParser();
    parameterParser50.setLowerCaseNames(true);
    char[] char_array54 = new char[] { '4' };
    java.util.Map map56 = parameterParser50.parse(char_array54, '4');
    java.util.Map map57 = parameterParser48.parse("", char_array54);
    java.util.Map map58 = parameterParser0.parse("hi!", char_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map58);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser8 = new ParameterParser();
    parameterParser8.setLowerCaseNames(true);
    boolean b11 = parameterParser8.isLowerCaseNames();
    java.util.Map map14 = parameterParser8.parse("", ' ');
    ParameterParser parameterParser16 = new ParameterParser();
    parameterParser16.setLowerCaseNames(true);
    char[] char_array20 = new char[] { '4' };
    java.util.Map map22 = parameterParser16.parse(char_array20, '4');
    java.util.Map map23 = parameterParser8.parse("hi!", char_array20);
    java.util.Map map24 = parameterParser0.parse("", char_array20);
    parameterParser0.setLowerCaseNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    boolean b7 = parameterParser0.isLowerCaseNames();
    java.util.Map map10 = parameterParser0.parse("", '4');
    java.util.Map map13 = parameterParser0.parse("", 'a');
    boolean b14 = parameterParser0.isLowerCaseNames();
    parameterParser0.setLowerCaseNames(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    char[] char_array7 = null;
    java.util.Map map11 = parameterParser0.parse(char_array7, (int)(byte)10, 1, ' ');
    ParameterParser parameterParser12 = new ParameterParser();
    parameterParser12.setLowerCaseNames(true);
    char[] char_array16 = new char[] { '4' };
    java.util.Map map18 = parameterParser12.parse(char_array16, '4');
    ParameterParser parameterParser20 = new ParameterParser();
    parameterParser20.setLowerCaseNames(true);
    char[] char_array24 = new char[] { '4' };
    java.util.Map map26 = parameterParser20.parse(char_array24, '4');
    java.util.Map map27 = parameterParser12.parse("hi!", char_array24);
    ParameterParser parameterParser29 = new ParameterParser();
    parameterParser29.setLowerCaseNames(true);
    boolean b32 = parameterParser29.isLowerCaseNames();
    java.util.Map map35 = parameterParser29.parse("", ' ');
    boolean b36 = parameterParser29.isLowerCaseNames();
    ParameterParser parameterParser38 = new ParameterParser();
    parameterParser38.setLowerCaseNames(true);
    char[] char_array42 = new char[] { '4' };
    java.util.Map map44 = parameterParser38.parse(char_array42, '4');
    java.util.Map map45 = parameterParser29.parse("", char_array42);
    java.util.Map map46 = parameterParser12.parse("hi!", char_array42);
    java.util.Map map48 = parameterParser0.parse(char_array42, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map48);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    char[] char_array29 = null;
    java.util.Map map31 = parameterParser0.parse(char_array29, '#');
    parameterParser0.setLowerCaseNames(false);
    boolean b34 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    ParameterParser parameterParser30 = new ParameterParser();
    parameterParser30.setLowerCaseNames(true);
    ParameterParser parameterParser33 = new ParameterParser();
    parameterParser33.setLowerCaseNames(true);
    char[] char_array37 = new char[] { '4' };
    java.util.Map map39 = parameterParser33.parse(char_array37, '4');
    java.util.Map map43 = parameterParser30.parse(char_array37, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map44 = parameterParser0.parse("", char_array37);
    java.util.Map map47 = parameterParser0.parse("", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map47);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser3 = new ParameterParser();
    parameterParser3.setLowerCaseNames(true);
    char[] char_array7 = new char[] { '4' };
    java.util.Map map9 = parameterParser3.parse(char_array7, '4');
    java.util.Map map13 = parameterParser0.parse(char_array7, (int)(short)1, (int)(byte)0, '4');
    char[] char_array16 = new char[] { ' ' };
    java.util.Map map17 = parameterParser0.parse("hi!", char_array16);
    java.util.Map map20 = parameterParser0.parse("", '4');
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser24 = new ParameterParser();
    parameterParser24.setLowerCaseNames(true);
    boolean b27 = parameterParser24.isLowerCaseNames();
    java.util.Map map30 = parameterParser24.parse("", ' ');
    boolean b31 = parameterParser24.isLowerCaseNames();
    java.util.Map map34 = parameterParser24.parse("", '4');
    ParameterParser parameterParser36 = new ParameterParser();
    parameterParser36.setLowerCaseNames(true);
    char[] char_array40 = new char[] { '4' };
    java.util.Map map42 = parameterParser36.parse(char_array40, '4');
    ParameterParser parameterParser43 = new ParameterParser();
    parameterParser43.setLowerCaseNames(true);
    ParameterParser parameterParser46 = new ParameterParser();
    parameterParser46.setLowerCaseNames(true);
    char[] char_array50 = new char[] { '4' };
    java.util.Map map52 = parameterParser46.parse(char_array50, '4');
    java.util.Map map56 = parameterParser43.parse(char_array50, (int)(short)1, (int)(byte)0, '4');
    char[] char_array59 = new char[] { ' ' };
    java.util.Map map60 = parameterParser43.parse("hi!", char_array59);
    java.util.Map map64 = parameterParser36.parse(char_array59, 100, (int)(byte)100, '#');
    java.util.Map map65 = parameterParser24.parse("", char_array59);
    java.util.Map map66 = parameterParser0.parse("hi!", char_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map66);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    boolean b7 = parameterParser0.isLowerCaseNames();
    boolean b8 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }


    ParameterParser parameterParser0 = new ParameterParser();
    ParameterParser parameterParser2 = new ParameterParser();
    parameterParser2.setLowerCaseNames(true);
    char[] char_array6 = new char[] { '4' };
    java.util.Map map8 = parameterParser2.parse(char_array6, '4');
    java.util.Map map9 = parameterParser0.parse("", char_array6);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    boolean b13 = parameterParser10.isLowerCaseNames();
    java.util.Map map16 = parameterParser10.parse("", ' ');
    boolean b17 = parameterParser10.isLowerCaseNames();
    java.util.Map map20 = parameterParser10.parse("", '4');
    ParameterParser parameterParser22 = new ParameterParser();
    parameterParser22.setLowerCaseNames(true);
    char[] char_array26 = new char[] { '4' };
    java.util.Map map28 = parameterParser22.parse(char_array26, '4');
    ParameterParser parameterParser29 = new ParameterParser();
    parameterParser29.setLowerCaseNames(true);
    ParameterParser parameterParser32 = new ParameterParser();
    parameterParser32.setLowerCaseNames(true);
    char[] char_array36 = new char[] { '4' };
    java.util.Map map38 = parameterParser32.parse(char_array36, '4');
    java.util.Map map42 = parameterParser29.parse(char_array36, (int)(short)1, (int)(byte)0, '4');
    char[] char_array45 = new char[] { ' ' };
    java.util.Map map46 = parameterParser29.parse("hi!", char_array45);
    java.util.Map map50 = parameterParser22.parse(char_array45, 100, (int)(byte)100, '#');
    java.util.Map map51 = parameterParser10.parse("", char_array45);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map map55 = parameterParser0.parse(char_array45, (int)(short)1, (int)'4', '#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map51);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    char[] char_array29 = null;
    java.util.Map map31 = parameterParser0.parse(char_array29, '#');
    parameterParser0.setLowerCaseNames(false);
    ParameterParser parameterParser34 = new ParameterParser();
    char[] char_array36 = null;
    java.util.Map map37 = parameterParser34.parse("", char_array36);
    ParameterParser parameterParser39 = new ParameterParser();
    parameterParser39.setLowerCaseNames(true);
    boolean b42 = parameterParser39.isLowerCaseNames();
    java.util.Map map45 = parameterParser39.parse("", ' ');
    boolean b46 = parameterParser39.isLowerCaseNames();
    ParameterParser parameterParser48 = new ParameterParser();
    parameterParser48.setLowerCaseNames(true);
    char[] char_array52 = new char[] { '4' };
    java.util.Map map54 = parameterParser48.parse(char_array52, '4');
    ParameterParser parameterParser56 = new ParameterParser();
    parameterParser56.setLowerCaseNames(true);
    char[] char_array60 = new char[] { '4' };
    java.util.Map map62 = parameterParser56.parse(char_array60, '4');
    java.util.Map map63 = parameterParser48.parse("hi!", char_array60);
    java.util.Map map64 = parameterParser39.parse("hi!", char_array60);
    java.util.Map map65 = parameterParser34.parse("", char_array60);
    java.util.Map map69 = parameterParser0.parse(char_array60, (int)'4', (int)(byte)-1, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map69);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array2 = null;
    java.util.Map map3 = parameterParser0.parse("", char_array2);
    ParameterParser parameterParser5 = new ParameterParser();
    parameterParser5.setLowerCaseNames(true);
    boolean b8 = parameterParser5.isLowerCaseNames();
    java.util.Map map11 = parameterParser5.parse("", ' ');
    boolean b12 = parameterParser5.isLowerCaseNames();
    ParameterParser parameterParser14 = new ParameterParser();
    parameterParser14.setLowerCaseNames(true);
    char[] char_array18 = new char[] { '4' };
    java.util.Map map20 = parameterParser14.parse(char_array18, '4');
    ParameterParser parameterParser22 = new ParameterParser();
    parameterParser22.setLowerCaseNames(true);
    char[] char_array26 = new char[] { '4' };
    java.util.Map map28 = parameterParser22.parse(char_array26, '4');
    java.util.Map map29 = parameterParser14.parse("hi!", char_array26);
    java.util.Map map30 = parameterParser5.parse("hi!", char_array26);
    java.util.Map map31 = parameterParser0.parse("", char_array26);
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser34 = new ParameterParser();
    parameterParser34.setLowerCaseNames(true);
    ParameterParser parameterParser37 = new ParameterParser();
    parameterParser37.setLowerCaseNames(true);
    char[] char_array41 = new char[] { '4' };
    java.util.Map map43 = parameterParser37.parse(char_array41, '4');
    java.util.Map map47 = parameterParser34.parse(char_array41, (int)(short)1, (int)(byte)0, '4');
    char[] char_array50 = new char[] { ' ' };
    java.util.Map map51 = parameterParser34.parse("hi!", char_array50);
    java.util.Map map54 = parameterParser34.parse("", '4');
    parameterParser34.setLowerCaseNames(true);
    ParameterParser parameterParser57 = new ParameterParser();
    parameterParser57.setLowerCaseNames(true);
    char[] char_array61 = new char[] { '4' };
    java.util.Map map63 = parameterParser57.parse(char_array61, '4');
    boolean b64 = parameterParser57.isLowerCaseNames();
    char[] char_array65 = new char[] {  };
    java.util.Map map67 = parameterParser57.parse(char_array65, ' ');
    java.util.Map map69 = parameterParser34.parse(char_array65, 'a');
    java.util.Map map71 = parameterParser0.parse(char_array65, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map71);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    ParameterParser parameterParser30 = new ParameterParser();
    parameterParser30.setLowerCaseNames(true);
    ParameterParser parameterParser33 = new ParameterParser();
    parameterParser33.setLowerCaseNames(true);
    char[] char_array37 = new char[] { '4' };
    java.util.Map map39 = parameterParser33.parse(char_array37, '4');
    java.util.Map map43 = parameterParser30.parse(char_array37, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map44 = parameterParser0.parse("", char_array37);
    ParameterParser parameterParser46 = new ParameterParser();
    char[] char_array48 = null;
    java.util.Map map49 = parameterParser46.parse("", char_array48);
    ParameterParser parameterParser51 = new ParameterParser();
    parameterParser51.setLowerCaseNames(true);
    boolean b54 = parameterParser51.isLowerCaseNames();
    java.util.Map map57 = parameterParser51.parse("", ' ');
    boolean b58 = parameterParser51.isLowerCaseNames();
    ParameterParser parameterParser60 = new ParameterParser();
    parameterParser60.setLowerCaseNames(true);
    char[] char_array64 = new char[] { '4' };
    java.util.Map map66 = parameterParser60.parse(char_array64, '4');
    ParameterParser parameterParser68 = new ParameterParser();
    parameterParser68.setLowerCaseNames(true);
    char[] char_array72 = new char[] { '4' };
    java.util.Map map74 = parameterParser68.parse(char_array72, '4');
    java.util.Map map75 = parameterParser60.parse("hi!", char_array72);
    java.util.Map map76 = parameterParser51.parse("hi!", char_array72);
    java.util.Map map77 = parameterParser46.parse("", char_array72);
    java.util.Map map78 = parameterParser0.parse("", char_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map78);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    boolean b7 = parameterParser0.isLowerCaseNames();
    ParameterParser parameterParser8 = new ParameterParser();
    parameterParser8.setLowerCaseNames(true);
    ParameterParser parameterParser11 = new ParameterParser();
    parameterParser11.setLowerCaseNames(true);
    char[] char_array15 = new char[] { '4' };
    java.util.Map map17 = parameterParser11.parse(char_array15, '4');
    java.util.Map map21 = parameterParser8.parse(char_array15, (int)(short)1, (int)(byte)0, '4');
    char[] char_array24 = new char[] { ' ' };
    java.util.Map map25 = parameterParser8.parse("hi!", char_array24);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map map29 = parameterParser0.parse(char_array24, (int)(short)1, (int)(short)10, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map25);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    boolean b4 = parameterParser0.isLowerCaseNames();
    boolean b5 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }


    ParameterParser parameterParser0 = new ParameterParser();
    ParameterParser parameterParser2 = new ParameterParser();
    parameterParser2.setLowerCaseNames(true);
    char[] char_array6 = new char[] { '4' };
    java.util.Map map8 = parameterParser2.parse(char_array6, '4');
    java.util.Map map9 = parameterParser0.parse("", char_array6);
    java.util.Map map12 = parameterParser0.parse("", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map12);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    boolean b7 = parameterParser0.isLowerCaseNames();
    java.util.Map map10 = parameterParser0.parse("", '4');
    ParameterParser parameterParser12 = new ParameterParser();
    parameterParser12.setLowerCaseNames(true);
    char[] char_array16 = new char[] { '4' };
    java.util.Map map18 = parameterParser12.parse(char_array16, '4');
    ParameterParser parameterParser19 = new ParameterParser();
    parameterParser19.setLowerCaseNames(true);
    ParameterParser parameterParser22 = new ParameterParser();
    parameterParser22.setLowerCaseNames(true);
    char[] char_array26 = new char[] { '4' };
    java.util.Map map28 = parameterParser22.parse(char_array26, '4');
    java.util.Map map32 = parameterParser19.parse(char_array26, (int)(short)1, (int)(byte)0, '4');
    char[] char_array35 = new char[] { ' ' };
    java.util.Map map36 = parameterParser19.parse("hi!", char_array35);
    java.util.Map map40 = parameterParser12.parse(char_array35, 100, (int)(byte)100, '#');
    java.util.Map map41 = parameterParser0.parse("", char_array35);
    parameterParser0.setLowerCaseNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map41);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser8 = new ParameterParser();
    parameterParser8.setLowerCaseNames(true);
    boolean b11 = parameterParser8.isLowerCaseNames();
    java.util.Map map14 = parameterParser8.parse("", ' ');
    ParameterParser parameterParser16 = new ParameterParser();
    parameterParser16.setLowerCaseNames(true);
    char[] char_array20 = new char[] { '4' };
    java.util.Map map22 = parameterParser16.parse(char_array20, '4');
    java.util.Map map23 = parameterParser8.parse("hi!", char_array20);
    java.util.Map map24 = parameterParser0.parse("", char_array20);
    boolean b25 = parameterParser0.isLowerCaseNames();
    java.util.Map map28 = parameterParser0.parse("hi!", '#');
    java.util.Map map31 = parameterParser0.parse("", '#');
    boolean b32 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    boolean b7 = parameterParser0.isLowerCaseNames();
    ParameterParser parameterParser8 = new ParameterParser();
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map17 = parameterParser8.parse("", char_array14);
    java.util.Map map19 = parameterParser0.parse(char_array14, '4');
    ParameterParser parameterParser21 = new ParameterParser();
    parameterParser21.setLowerCaseNames(true);
    boolean b24 = parameterParser21.isLowerCaseNames();
    java.util.Map map27 = parameterParser21.parse("", ' ');
    boolean b28 = parameterParser21.isLowerCaseNames();
    java.util.Map map31 = parameterParser21.parse("", '4');
    ParameterParser parameterParser33 = new ParameterParser();
    parameterParser33.setLowerCaseNames(true);
    char[] char_array37 = new char[] { '4' };
    java.util.Map map39 = parameterParser33.parse(char_array37, '4');
    ParameterParser parameterParser40 = new ParameterParser();
    parameterParser40.setLowerCaseNames(true);
    ParameterParser parameterParser43 = new ParameterParser();
    parameterParser43.setLowerCaseNames(true);
    char[] char_array47 = new char[] { '4' };
    java.util.Map map49 = parameterParser43.parse(char_array47, '4');
    java.util.Map map53 = parameterParser40.parse(char_array47, (int)(short)1, (int)(byte)0, '4');
    char[] char_array56 = new char[] { ' ' };
    java.util.Map map57 = parameterParser40.parse("hi!", char_array56);
    java.util.Map map61 = parameterParser33.parse(char_array56, 100, (int)(byte)100, '#');
    java.util.Map map62 = parameterParser21.parse("", char_array56);
    java.util.Map map63 = parameterParser0.parse("", char_array56);
    ParameterParser parameterParser65 = new ParameterParser();
    parameterParser65.setLowerCaseNames(true);
    boolean b68 = parameterParser65.isLowerCaseNames();
    java.util.Map map71 = parameterParser65.parse("", ' ');
    boolean b72 = parameterParser65.isLowerCaseNames();
    java.util.Map map75 = parameterParser65.parse("", '4');
    char[] char_array79 = new char[] { '4', '4', 'a' };
    java.util.Map map83 = parameterParser65.parse(char_array79, (int)'a', (int)'a', '#');
    java.util.Map map84 = parameterParser0.parse("", char_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map84);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser3 = new ParameterParser();
    parameterParser3.setLowerCaseNames(true);
    char[] char_array7 = new char[] { '4' };
    java.util.Map map9 = parameterParser3.parse(char_array7, '4');
    java.util.Map map13 = parameterParser0.parse(char_array7, (int)(short)1, (int)(byte)0, '4');
    char[] char_array16 = new char[] { ' ' };
    java.util.Map map17 = parameterParser0.parse("hi!", char_array16);
    java.util.Map map20 = parameterParser0.parse("", '4');
    parameterParser0.setLowerCaseNames(true);
    boolean b23 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array2 = null;
    java.util.Map map3 = parameterParser0.parse("", char_array2);
    ParameterParser parameterParser5 = new ParameterParser();
    parameterParser5.setLowerCaseNames(true);
    boolean b8 = parameterParser5.isLowerCaseNames();
    java.util.Map map11 = parameterParser5.parse("", ' ');
    boolean b12 = parameterParser5.isLowerCaseNames();
    ParameterParser parameterParser14 = new ParameterParser();
    parameterParser14.setLowerCaseNames(true);
    char[] char_array18 = new char[] { '4' };
    java.util.Map map20 = parameterParser14.parse(char_array18, '4');
    ParameterParser parameterParser22 = new ParameterParser();
    parameterParser22.setLowerCaseNames(true);
    char[] char_array26 = new char[] { '4' };
    java.util.Map map28 = parameterParser22.parse(char_array26, '4');
    java.util.Map map29 = parameterParser14.parse("hi!", char_array26);
    java.util.Map map30 = parameterParser5.parse("hi!", char_array26);
    java.util.Map map31 = parameterParser0.parse("", char_array26);
    parameterParser0.setLowerCaseNames(true);
    boolean b34 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    ParameterParser parameterParser30 = new ParameterParser();
    parameterParser30.setLowerCaseNames(true);
    ParameterParser parameterParser33 = new ParameterParser();
    parameterParser33.setLowerCaseNames(true);
    char[] char_array37 = new char[] { '4' };
    java.util.Map map39 = parameterParser33.parse(char_array37, '4');
    java.util.Map map43 = parameterParser30.parse(char_array37, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map44 = parameterParser0.parse("", char_array37);
    ParameterParser parameterParser45 = new ParameterParser();
    parameterParser45.setLowerCaseNames(true);
    ParameterParser parameterParser48 = new ParameterParser();
    parameterParser48.setLowerCaseNames(true);
    char[] char_array52 = new char[] { '4' };
    java.util.Map map54 = parameterParser48.parse(char_array52, '4');
    java.util.Map map58 = parameterParser45.parse(char_array52, (int)(short)1, (int)(byte)0, '4');
    char[] char_array61 = new char[] { ' ' };
    java.util.Map map62 = parameterParser45.parse("hi!", char_array61);
    java.util.Map map64 = parameterParser0.parse(char_array61, '4');
    java.util.Map map67 = parameterParser0.parse("hi!", 'a');
    parameterParser0.setLowerCaseNames(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map67);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser3 = new ParameterParser();
    parameterParser3.setLowerCaseNames(true);
    char[] char_array7 = new char[] { '4' };
    java.util.Map map9 = parameterParser3.parse(char_array7, '4');
    java.util.Map map13 = parameterParser0.parse(char_array7, (int)(short)1, (int)(byte)0, '4');
    char[] char_array16 = new char[] { ' ' };
    java.util.Map map17 = parameterParser0.parse("hi!", char_array16);
    java.util.Map map20 = parameterParser0.parse("", '4');
    parameterParser0.setLowerCaseNames(true);
    parameterParser0.setLowerCaseNames(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    boolean b7 = parameterParser0.isLowerCaseNames();
    java.util.Map map10 = parameterParser0.parse("", '4');
    java.util.Map map13 = parameterParser0.parse("", 'a');
    boolean b14 = parameterParser0.isLowerCaseNames();
    java.util.Map map17 = parameterParser0.parse("hi!", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    boolean b7 = parameterParser0.isLowerCaseNames();
    ParameterParser parameterParser9 = new ParameterParser();
    parameterParser9.setLowerCaseNames(true);
    char[] char_array13 = new char[] { '4' };
    java.util.Map map15 = parameterParser9.parse(char_array13, '4');
    java.util.Map map16 = parameterParser0.parse("", char_array13);
    ParameterParser parameterParser17 = new ParameterParser();
    parameterParser17.setLowerCaseNames(true);
    boolean b20 = parameterParser17.isLowerCaseNames();
    java.util.Map map23 = parameterParser17.parse("", ' ');
    boolean b24 = parameterParser17.isLowerCaseNames();
    ParameterParser parameterParser26 = new ParameterParser();
    parameterParser26.setLowerCaseNames(true);
    char[] char_array30 = new char[] { '4' };
    java.util.Map map32 = parameterParser26.parse(char_array30, '4');
    java.util.Map map33 = parameterParser17.parse("", char_array30);
    java.util.Map map37 = parameterParser0.parse(char_array30, (int)(byte)-1, (int)(byte)-1, 'a');
    java.util.Map map40 = parameterParser0.parse("hi!", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map40);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    ParameterParser parameterParser8 = new ParameterParser();
    parameterParser8.setLowerCaseNames(true);
    char[] char_array12 = new char[] { '4' };
    java.util.Map map14 = parameterParser8.parse(char_array12, '4');
    java.util.Map map15 = parameterParser0.parse("hi!", char_array12);
    ParameterParser parameterParser16 = new ParameterParser();
    parameterParser16.setLowerCaseNames(true);
    ParameterParser parameterParser19 = new ParameterParser();
    parameterParser19.setLowerCaseNames(true);
    char[] char_array23 = new char[] { '4' };
    java.util.Map map25 = parameterParser19.parse(char_array23, '4');
    java.util.Map map29 = parameterParser16.parse(char_array23, (int)(short)1, (int)(byte)0, '4');
    char[] char_array32 = new char[] { ' ' };
    java.util.Map map33 = parameterParser16.parse("hi!", char_array32);
    ParameterParser parameterParser35 = new ParameterParser();
    parameterParser35.setLowerCaseNames(true);
    ParameterParser parameterParser38 = new ParameterParser();
    parameterParser38.setLowerCaseNames(true);
    char[] char_array42 = new char[] { '4' };
    java.util.Map map44 = parameterParser38.parse(char_array42, '4');
    java.util.Map map48 = parameterParser35.parse(char_array42, (int)(short)1, (int)(byte)0, '4');
    char[] char_array51 = new char[] { ' ' };
    java.util.Map map52 = parameterParser35.parse("hi!", char_array51);
    java.util.Map map55 = parameterParser35.parse("", '4');
    parameterParser35.setLowerCaseNames(true);
    ParameterParser parameterParser58 = new ParameterParser();
    parameterParser58.setLowerCaseNames(true);
    char[] char_array62 = new char[] { '4' };
    java.util.Map map64 = parameterParser58.parse(char_array62, '4');
    boolean b65 = parameterParser58.isLowerCaseNames();
    char[] char_array66 = new char[] {  };
    java.util.Map map68 = parameterParser58.parse(char_array66, ' ');
    java.util.Map map70 = parameterParser35.parse(char_array66, 'a');
    java.util.Map map71 = parameterParser16.parse("hi!", char_array66);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map map75 = parameterParser0.parse(char_array66, (int)' ', (int)'#', '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map71);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    boolean b7 = parameterParser0.isLowerCaseNames();
    ParameterParser parameterParser8 = new ParameterParser();
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map17 = parameterParser8.parse("", char_array14);
    java.util.Map map19 = parameterParser0.parse(char_array14, '4');
    boolean b20 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser3 = new ParameterParser();
    parameterParser3.setLowerCaseNames(true);
    char[] char_array7 = new char[] { '4' };
    java.util.Map map9 = parameterParser3.parse(char_array7, '4');
    java.util.Map map13 = parameterParser0.parse(char_array7, (int)(short)1, (int)(byte)0, '4');
    char[] char_array16 = new char[] { ' ' };
    java.util.Map map17 = parameterParser0.parse("hi!", char_array16);
    ParameterParser parameterParser19 = new ParameterParser();
    parameterParser19.setLowerCaseNames(true);
    char[] char_array23 = new char[] { '4' };
    java.util.Map map25 = parameterParser19.parse(char_array23, '4');
    ParameterParser parameterParser27 = new ParameterParser();
    parameterParser27.setLowerCaseNames(true);
    char[] char_array31 = new char[] { '4' };
    java.util.Map map33 = parameterParser27.parse(char_array31, '4');
    java.util.Map map34 = parameterParser19.parse("hi!", char_array31);
    java.util.Map map35 = parameterParser0.parse("hi!", char_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map35);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    boolean b7 = parameterParser0.isLowerCaseNames();
    ParameterParser parameterParser8 = new ParameterParser();
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map17 = parameterParser8.parse("", char_array14);
    java.util.Map map19 = parameterParser0.parse(char_array14, '4');
    ParameterParser parameterParser21 = new ParameterParser();
    parameterParser21.setLowerCaseNames(true);
    boolean b24 = parameterParser21.isLowerCaseNames();
    java.util.Map map27 = parameterParser21.parse("", ' ');
    boolean b28 = parameterParser21.isLowerCaseNames();
    java.util.Map map31 = parameterParser21.parse("", '4');
    ParameterParser parameterParser33 = new ParameterParser();
    parameterParser33.setLowerCaseNames(true);
    char[] char_array37 = new char[] { '4' };
    java.util.Map map39 = parameterParser33.parse(char_array37, '4');
    ParameterParser parameterParser40 = new ParameterParser();
    parameterParser40.setLowerCaseNames(true);
    ParameterParser parameterParser43 = new ParameterParser();
    parameterParser43.setLowerCaseNames(true);
    char[] char_array47 = new char[] { '4' };
    java.util.Map map49 = parameterParser43.parse(char_array47, '4');
    java.util.Map map53 = parameterParser40.parse(char_array47, (int)(short)1, (int)(byte)0, '4');
    char[] char_array56 = new char[] { ' ' };
    java.util.Map map57 = parameterParser40.parse("hi!", char_array56);
    java.util.Map map61 = parameterParser33.parse(char_array56, 100, (int)(byte)100, '#');
    java.util.Map map62 = parameterParser21.parse("", char_array56);
    java.util.Map map63 = parameterParser0.parse("", char_array56);
    parameterParser0.setLowerCaseNames(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map63);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    boolean b7 = parameterParser0.isLowerCaseNames();
    java.util.Map map10 = parameterParser0.parse("hi!", '4');
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser14 = new ParameterParser();
    parameterParser14.setLowerCaseNames(true);
    char[] char_array18 = new char[] { '4' };
    java.util.Map map20 = parameterParser14.parse(char_array18, '4');
    boolean b21 = parameterParser14.isLowerCaseNames();
    char[] char_array22 = new char[] {  };
    java.util.Map map24 = parameterParser14.parse(char_array22, ' ');
    java.util.Map map25 = parameterParser0.parse("", char_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map25);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    ParameterParser parameterParser30 = new ParameterParser();
    parameterParser30.setLowerCaseNames(true);
    ParameterParser parameterParser33 = new ParameterParser();
    parameterParser33.setLowerCaseNames(true);
    char[] char_array37 = new char[] { '4' };
    java.util.Map map39 = parameterParser33.parse(char_array37, '4');
    java.util.Map map43 = parameterParser30.parse(char_array37, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map44 = parameterParser0.parse("", char_array37);
    ParameterParser parameterParser45 = new ParameterParser();
    parameterParser45.setLowerCaseNames(true);
    ParameterParser parameterParser48 = new ParameterParser();
    parameterParser48.setLowerCaseNames(true);
    char[] char_array52 = new char[] { '4' };
    java.util.Map map54 = parameterParser48.parse(char_array52, '4');
    java.util.Map map58 = parameterParser45.parse(char_array52, (int)(short)1, (int)(byte)0, '4');
    char[] char_array61 = new char[] { ' ' };
    java.util.Map map62 = parameterParser45.parse("hi!", char_array61);
    java.util.Map map64 = parameterParser0.parse(char_array61, '4');
    java.util.Map map67 = parameterParser0.parse("hi!", 'a');
    boolean b68 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    boolean b7 = parameterParser0.isLowerCaseNames();
    char[] char_array8 = new char[] {  };
    java.util.Map map10 = parameterParser0.parse(char_array8, ' ');
    parameterParser0.setLowerCaseNames(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map10);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    boolean b7 = parameterParser0.isLowerCaseNames();
    ParameterParser parameterParser9 = new ParameterParser();
    parameterParser9.setLowerCaseNames(true);
    char[] char_array13 = new char[] { '4' };
    java.util.Map map15 = parameterParser9.parse(char_array13, '4');
    java.util.Map map16 = parameterParser0.parse("", char_array13);
    parameterParser0.setLowerCaseNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }


    ParameterParser parameterParser0 = new ParameterParser();
    char[] char_array2 = null;
    java.util.Map map3 = parameterParser0.parse("", char_array2);
    parameterParser0.setLowerCaseNames(false);
    ParameterParser parameterParser6 = new ParameterParser();
    parameterParser6.setLowerCaseNames(true);
    boolean b9 = parameterParser6.isLowerCaseNames();
    java.util.Map map12 = parameterParser6.parse("", ' ');
    ParameterParser parameterParser14 = new ParameterParser();
    parameterParser14.setLowerCaseNames(true);
    char[] char_array18 = new char[] { '4' };
    java.util.Map map20 = parameterParser14.parse(char_array18, '4');
    java.util.Map map21 = parameterParser6.parse("hi!", char_array18);
    ParameterParser parameterParser22 = new ParameterParser();
    parameterParser22.setLowerCaseNames(true);
    boolean b25 = parameterParser22.isLowerCaseNames();
    java.util.Map map28 = parameterParser22.parse("hi!", 'a');
    ParameterParser parameterParser29 = new ParameterParser();
    parameterParser29.setLowerCaseNames(true);
    boolean b32 = parameterParser29.isLowerCaseNames();
    java.util.Map map35 = parameterParser29.parse("", ' ');
    boolean b36 = parameterParser29.isLowerCaseNames();
    ParameterParser parameterParser38 = new ParameterParser();
    parameterParser38.setLowerCaseNames(true);
    char[] char_array42 = new char[] { '4' };
    java.util.Map map44 = parameterParser38.parse(char_array42, '4');
    ParameterParser parameterParser46 = new ParameterParser();
    parameterParser46.setLowerCaseNames(true);
    char[] char_array50 = new char[] { '4' };
    java.util.Map map52 = parameterParser46.parse(char_array50, '4');
    java.util.Map map53 = parameterParser38.parse("hi!", char_array50);
    java.util.Map map54 = parameterParser29.parse("hi!", char_array50);
    java.util.Map map56 = parameterParser22.parse(char_array50, '4');
    java.util.Map map60 = parameterParser6.parse(char_array50, (int)(byte)100, (int)(short)100, ' ');
    java.util.Map map62 = parameterParser0.parse(char_array50, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map62);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser4 = new ParameterParser();
    parameterParser4.setLowerCaseNames(true);
    boolean b7 = parameterParser4.isLowerCaseNames();
    java.util.Map map10 = parameterParser4.parse("", ' ');
    boolean b11 = parameterParser4.isLowerCaseNames();
    java.util.Map map14 = parameterParser4.parse("", '4');
    ParameterParser parameterParser16 = new ParameterParser();
    parameterParser16.setLowerCaseNames(true);
    char[] char_array20 = new char[] { '4' };
    java.util.Map map22 = parameterParser16.parse(char_array20, '4');
    ParameterParser parameterParser23 = new ParameterParser();
    parameterParser23.setLowerCaseNames(true);
    ParameterParser parameterParser26 = new ParameterParser();
    parameterParser26.setLowerCaseNames(true);
    char[] char_array30 = new char[] { '4' };
    java.util.Map map32 = parameterParser26.parse(char_array30, '4');
    java.util.Map map36 = parameterParser23.parse(char_array30, (int)(short)1, (int)(byte)0, '4');
    char[] char_array39 = new char[] { ' ' };
    java.util.Map map40 = parameterParser23.parse("hi!", char_array39);
    java.util.Map map44 = parameterParser16.parse(char_array39, 100, (int)(byte)100, '#');
    java.util.Map map45 = parameterParser4.parse("", char_array39);
    java.util.Map map46 = parameterParser0.parse("hi!", char_array39);
    parameterParser0.setLowerCaseNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map46);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("hi!", 'a');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    boolean b10 = parameterParser7.isLowerCaseNames();
    java.util.Map map13 = parameterParser7.parse("", ' ');
    boolean b14 = parameterParser7.isLowerCaseNames();
    ParameterParser parameterParser16 = new ParameterParser();
    parameterParser16.setLowerCaseNames(true);
    char[] char_array20 = new char[] { '4' };
    java.util.Map map22 = parameterParser16.parse(char_array20, '4');
    ParameterParser parameterParser24 = new ParameterParser();
    parameterParser24.setLowerCaseNames(true);
    char[] char_array28 = new char[] { '4' };
    java.util.Map map30 = parameterParser24.parse(char_array28, '4');
    java.util.Map map31 = parameterParser16.parse("hi!", char_array28);
    java.util.Map map32 = parameterParser7.parse("hi!", char_array28);
    java.util.Map map34 = parameterParser0.parse(char_array28, '4');
    char[] char_array38 = new char[] { '#', '4', '4' };
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map map42 = parameterParser0.parse(char_array38, (int)(byte)10, (int)(short)100, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array38);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    ParameterParser parameterParser30 = new ParameterParser();
    parameterParser30.setLowerCaseNames(true);
    ParameterParser parameterParser33 = new ParameterParser();
    parameterParser33.setLowerCaseNames(true);
    char[] char_array37 = new char[] { '4' };
    java.util.Map map39 = parameterParser33.parse(char_array37, '4');
    java.util.Map map43 = parameterParser30.parse(char_array37, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map44 = parameterParser0.parse("", char_array37);
    ParameterParser parameterParser45 = new ParameterParser();
    parameterParser45.setLowerCaseNames(true);
    ParameterParser parameterParser48 = new ParameterParser();
    parameterParser48.setLowerCaseNames(true);
    char[] char_array52 = new char[] { '4' };
    java.util.Map map54 = parameterParser48.parse(char_array52, '4');
    java.util.Map map58 = parameterParser45.parse(char_array52, (int)(short)1, (int)(byte)0, '4');
    char[] char_array61 = new char[] { ' ' };
    java.util.Map map62 = parameterParser45.parse("hi!", char_array61);
    java.util.Map map64 = parameterParser0.parse(char_array61, '4');
    char[] char_array67 = new char[] { '4', ' ' };
    java.util.Map map69 = parameterParser0.parse(char_array67, '#');
    boolean b70 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    parameterParser0.setLowerCaseNames(false);
    char[] char_array9 = new char[] {  };
    java.util.Map map11 = parameterParser0.parse(char_array9, ' ');
    boolean b12 = parameterParser0.isLowerCaseNames();
    boolean b13 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    ParameterParser parameterParser8 = new ParameterParser();
    parameterParser8.setLowerCaseNames(true);
    char[] char_array12 = new char[] { '4' };
    java.util.Map map14 = parameterParser8.parse(char_array12, '4');
    java.util.Map map15 = parameterParser0.parse("hi!", char_array12);
    ParameterParser parameterParser16 = new ParameterParser();
    parameterParser16.setLowerCaseNames(true);
    boolean b19 = parameterParser16.isLowerCaseNames();
    java.util.Map map22 = parameterParser16.parse("hi!", 'a');
    ParameterParser parameterParser23 = new ParameterParser();
    parameterParser23.setLowerCaseNames(true);
    boolean b26 = parameterParser23.isLowerCaseNames();
    java.util.Map map29 = parameterParser23.parse("", ' ');
    boolean b30 = parameterParser23.isLowerCaseNames();
    ParameterParser parameterParser32 = new ParameterParser();
    parameterParser32.setLowerCaseNames(true);
    char[] char_array36 = new char[] { '4' };
    java.util.Map map38 = parameterParser32.parse(char_array36, '4');
    ParameterParser parameterParser40 = new ParameterParser();
    parameterParser40.setLowerCaseNames(true);
    char[] char_array44 = new char[] { '4' };
    java.util.Map map46 = parameterParser40.parse(char_array44, '4');
    java.util.Map map47 = parameterParser32.parse("hi!", char_array44);
    java.util.Map map48 = parameterParser23.parse("hi!", char_array44);
    java.util.Map map50 = parameterParser16.parse(char_array44, '4');
    java.util.Map map54 = parameterParser0.parse(char_array44, (int)(byte)100, (int)(short)100, ' ');
    boolean b55 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser8 = new ParameterParser();
    parameterParser8.setLowerCaseNames(true);
    boolean b11 = parameterParser8.isLowerCaseNames();
    java.util.Map map14 = parameterParser8.parse("", ' ');
    ParameterParser parameterParser16 = new ParameterParser();
    parameterParser16.setLowerCaseNames(true);
    char[] char_array20 = new char[] { '4' };
    java.util.Map map22 = parameterParser16.parse(char_array20, '4');
    java.util.Map map23 = parameterParser8.parse("hi!", char_array20);
    java.util.Map map24 = parameterParser0.parse("", char_array20);
    boolean b25 = parameterParser0.isLowerCaseNames();
    parameterParser0.setLowerCaseNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    ParameterParser parameterParser30 = new ParameterParser();
    parameterParser30.setLowerCaseNames(true);
    ParameterParser parameterParser33 = new ParameterParser();
    parameterParser33.setLowerCaseNames(true);
    char[] char_array37 = new char[] { '4' };
    java.util.Map map39 = parameterParser33.parse(char_array37, '4');
    java.util.Map map43 = parameterParser30.parse(char_array37, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map44 = parameterParser0.parse("", char_array37);
    ParameterParser parameterParser45 = new ParameterParser();
    parameterParser45.setLowerCaseNames(true);
    ParameterParser parameterParser48 = new ParameterParser();
    parameterParser48.setLowerCaseNames(true);
    char[] char_array52 = new char[] { '4' };
    java.util.Map map54 = parameterParser48.parse(char_array52, '4');
    java.util.Map map58 = parameterParser45.parse(char_array52, (int)(short)1, (int)(byte)0, '4');
    char[] char_array61 = new char[] { ' ' };
    java.util.Map map62 = parameterParser45.parse("hi!", char_array61);
    java.util.Map map64 = parameterParser0.parse(char_array61, '4');
    java.util.Map map67 = parameterParser0.parse("hi!", 'a');
    parameterParser0.setLowerCaseNames(false);
    boolean b70 = parameterParser0.isLowerCaseNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    boolean b7 = parameterParser0.isLowerCaseNames();
    java.util.Map map10 = parameterParser0.parse("hi!", '4');
    java.util.Map map13 = parameterParser0.parse("hi!", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    char[] char_array4 = new char[] { '4' };
    java.util.Map map6 = parameterParser0.parse(char_array4, '4');
    ParameterParser parameterParser7 = new ParameterParser();
    parameterParser7.setLowerCaseNames(true);
    ParameterParser parameterParser10 = new ParameterParser();
    parameterParser10.setLowerCaseNames(true);
    char[] char_array14 = new char[] { '4' };
    java.util.Map map16 = parameterParser10.parse(char_array14, '4');
    java.util.Map map20 = parameterParser7.parse(char_array14, (int)(short)1, (int)(byte)0, '4');
    char[] char_array23 = new char[] { ' ' };
    java.util.Map map24 = parameterParser7.parse("hi!", char_array23);
    java.util.Map map28 = parameterParser0.parse(char_array23, 100, (int)(byte)100, '#');
    boolean b29 = parameterParser0.isLowerCaseNames();
    ParameterParser parameterParser31 = new ParameterParser();
    parameterParser31.setLowerCaseNames(true);
    char[] char_array35 = new char[] { '4' };
    java.util.Map map37 = parameterParser31.parse(char_array35, '4');
    boolean b38 = parameterParser31.isLowerCaseNames();
    char[] char_array39 = new char[] {  };
    java.util.Map map41 = parameterParser31.parse(char_array39, ' ');
    java.util.Map map42 = parameterParser0.parse("", char_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map42);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser3 = new ParameterParser();
    parameterParser3.setLowerCaseNames(true);
    char[] char_array7 = new char[] { '4' };
    java.util.Map map9 = parameterParser3.parse(char_array7, '4');
    java.util.Map map13 = parameterParser0.parse(char_array7, (int)(short)1, (int)(byte)0, '4');
    char[] char_array16 = new char[] { ' ' };
    java.util.Map map17 = parameterParser0.parse("hi!", char_array16);
    parameterParser0.setLowerCaseNames(true);
    parameterParser0.setLowerCaseNames(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    boolean b3 = parameterParser0.isLowerCaseNames();
    java.util.Map map6 = parameterParser0.parse("", ' ');
    parameterParser0.setLowerCaseNames(false);
    char[] char_array9 = new char[] {  };
    java.util.Map map11 = parameterParser0.parse(char_array9, ' ');
    boolean b12 = parameterParser0.isLowerCaseNames();
    parameterParser0.setLowerCaseNames(true);
    parameterParser0.setLowerCaseNames(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    parameterParser0.setLowerCaseNames(false);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }


    ParameterParser parameterParser0 = new ParameterParser();
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser3 = new ParameterParser();
    parameterParser3.setLowerCaseNames(true);
    char[] char_array7 = new char[] { '4' };
    java.util.Map map9 = parameterParser3.parse(char_array7, '4');
    java.util.Map map13 = parameterParser0.parse(char_array7, (int)(short)1, (int)(byte)0, '4');
    char[] char_array16 = new char[] { ' ' };
    java.util.Map map17 = parameterParser0.parse("hi!", char_array16);
    java.util.Map map20 = parameterParser0.parse("", '4');
    parameterParser0.setLowerCaseNames(true);
    ParameterParser parameterParser23 = new ParameterParser();
    parameterParser23.setLowerCaseNames(true);
    char[] char_array27 = new char[] { '4' };
    java.util.Map map29 = parameterParser23.parse(char_array27, '4');
    boolean b30 = parameterParser23.isLowerCaseNames();
    char[] char_array31 = new char[] {  };
    java.util.Map map33 = parameterParser23.parse(char_array31, ' ');
    java.util.Map map35 = parameterParser0.parse(char_array31, 'a');
    boolean b36 = parameterParser0.isLowerCaseNames();
    ParameterParser parameterParser38 = new ParameterParser();
    parameterParser38.setLowerCaseNames(true);
    ParameterParser parameterParser41 = new ParameterParser();
    parameterParser41.setLowerCaseNames(true);
    char[] char_array45 = new char[] { '4' };
    java.util.Map map47 = parameterParser41.parse(char_array45, '4');
    java.util.Map map51 = parameterParser38.parse(char_array45, (int)(short)1, (int)(byte)0, '4');
    java.util.Map map52 = parameterParser0.parse("", char_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map52);

  }

}
